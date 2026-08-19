package java_console_supermarket;

import java.util.Scanner;

public class SuperMarket {
	static double total=0;
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		
     System.out.println("Welcome to Radha's Super Market");
     
     System.out.println("Enter Customer Name");
     String name=sc.nextLine();
     System.out.println("Enter Customer Mobile Number");
     String number=sc.nextLine();
     System.out.println("Enter Membership(true -> Yes / false -> No):");
     boolean memberShip=sc.nextBoolean();
     String cSpg;
     do {
    	 System.out.println("----------------------------------------------");
     System.out.println("Choose Category:\n 1. Vegetables \n 2. Fruits\n 3. Dairy\n 4. Billing \n 5. Exit");
     System.out.println("----------------------------------------------");
     
    int catg=sc.nextInt();
     switch(catg) {
     case 1->{
    	 
    	 System.out.println("Items are:\n 1. Tomato - ₹50/kg\r\n 2. Potato- ₹40/kg\r\n 3. Onion- ₹30/kg\r\n 4. Carrot- ₹25/kg\n");
    	 System.out.println("Enter Item code:");
    	 int itm=sc.nextInt();
    	 switch(itm) {
    	 case 1->{
    		 System.out.println("1. Tomato - ₹50/kg");
    		 total+=calcPrice(50);
    	    }
    	 case 2->{
    		 System.out.println("2. Potato- ₹40/kg");
    		 total+=calcPrice(40);
    	    }
    	 case 3->{
    		 System.out.println("3. Onion- ₹30/kg");
    		 total+=calcPrice(30);
    	    }
    	 case 4->{
    		 System.out.println("4. Carrot- ₹25/kg");
    		 total+=calcPrice(25);
    	    }
    	 default->{
    		 System.out.println("No Such item available");
    	 }
    	 
    	 }	 
     }
     case 2->{
    	 System.out.println(" Items are \n 1. Apple- ₹180/kg \n 2. Banana - ₹60/dozen \n 3. Orange - ₹120/kg \n 4. Mango- ₹150/kg \n");
    	 System.out.println("Enter Item code:");
    	 int itm=sc.nextInt();
    	 switch(itm) {
    	 case 1->{
    		 System.out.println("1. Apple- ₹180/kg ");
    		 total+=calcPrice(180);
    	    }
    	 case 2->{
    		 System.out.println(" 2. Banana - ₹60/dozen ");
    		 total+=calcPrice(60);
    	    }
    	 case 3->{
    		 System.out.println("3. Orange - ₹120/kg");
    		 total+=calcPrice(30);
    	    }
    	 case 4->{
    		 System.out.println("4. Mango- ₹150/kg");
    		 total+=calcPrice(150);
    	    }
    	 default->{
    		 System.out.println("No Such item available");
    		 
    	 }
     }
     }
     case 3->{
    	 System.out.println(" Itemes are : \n 1. Milk- ₹60/litre\n 2. Curd- ₹80/kg\n 3. Butter- ₹250/kg\n 4. Cheese- ₹450/kg");
    	 System.out.println("Enter Item code:");
    	 int itm=sc.nextInt();
    	 switch(itm) {
    	 case 1->{
    		 System.out.println("1. Milk- ₹60/litre");
    		 total+=calcPrice(60);
    	    }
    	 case 2->{
    		 System.out.println("2. Curd- ₹80/kg");
    		 total+=calcPrice(80);
    	    }
    	 case 3->{
    		 System.out.println("3. Butter- ₹250/kg");
    		 total+=calcPrice(250);
    	    }
    	 case 4->{
    		 System.out.println("4. Cheese- ₹450/kg");
    		 total+=calcPrice(450);
    	    }
    	 default->{
    		 System.out.println("No Such item available");
    	 }
     }
     }
     case 4->{
    	 System.out.println("-------------------- Your Bill ---------------");
    	 System.out.println("Customer Name = " + name);
    	 System.out.println("Customer Mobile no = " + number );
    	 System.out.println("MemberShip Status = " + memberShip );
    	 System.out.println("Your total Purchases = ₹"+ total);
    	 if(memberShip) {
    		 double discount=10;
    		 System.out.println("Membership Discount Applied " + discount + "%");
    		 double dis= (total*(discount/100.0));
    		 System.out.println("Discount amount= ₹" + dis);
    		 total = total-dis;
    	 }else {
    		 System.out.println("No membership discount Applied");
    	 }
    	 
    	 System.out.println("Total Amount To Pay = ₹" + total);
    	 System.out.println("----------------------------------------------");
    	 System.out.println("Thank you for choosing us . Visit Again !!");
    	 return;
    
     }
     case 5->{
    	 System.out.println("Thank you for choosing us . Visit Again !!");
    	 return;
     }
     default ->{
    	 System.out.println("No such item available");
     }
     
     }
     System.out.println("Do you want to add another item (Y/N)");
     cSpg=sc.next().toLowerCase();
     }while(cSpg.equals("y"));
     
     System.out.println("Main method ended");
     
     
	}
	
	static double calcPrice(int price){
		System.out.println("Enter Quantity:");
		double qty=sc.nextDouble();
		while(qty <= 0) {
			System.out.println("Quantity must be greater than 0");
			System.out.println("Enter again:");
			 qty=sc.nextDouble();
		}
		double total=qty*price;
		return total;
	}
}
