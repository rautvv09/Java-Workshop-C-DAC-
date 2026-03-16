package com.app.fruits;

import java.util.Scanner;

public class FruitBasket {

	public static int menu(Scanner sc) {
		
		System.out.println("-----------------------------");
		System.out.println(" 0 : Exit ");
		System.out.println(" 1: Add Mango ");
		System.out.println(" 2: Add Orange ");
		System.out.println(" 3: Add Apple ");
		System.out.println(" 4: Display Names:  All fruits in the basket.");
		System.out.println(" 5: Display Names: Name,Color,Weight,Taste Of All Fresh Fruits ");
		System.out.println(" 6:Mark a fruit as stale");
		System.out.println(" 7: Display tastes of all stale(not fresh) fruits in the basket.");
		System.out.println("-----------------------------");
		
		System.out.println("\n Enter Your Choice:\n");
		int ch=sc.nextInt();
		
		return ch;
	}
		
	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		int choice;
		int i=0;
		Fruit[] basket=new Fruit[5];
		
		System.out.println("Enter The Size Of Basket");
		int n=sc.nextInt();
		
		while((choice=menu(sc))!=0) {
			switch(choice) {
			
			case 1:  System.out.println("\n Adding Mango");
			         Mango m=new Mango("Yellow",500,"Mango",true);
			         if(i<n) {
			        	 basket[i++]=m;
				         m.toString();
			         }
			        System.out.println("\n Added Mango\n");
			         break;
	
			case 2:  System.out.println("Adding Orange");
			         Orange o=new Orange("Orange",600,"Orange",true);
			         if(i<n) {
	                 basket[i++]=o;
	                 o.toString();
			         }
			         System.out.println("\n Added Orange\n");
	                 break;

	           
			case 3:  System.out.println("Adding Apple");
			         Apple a=new Apple("Red",400,"Apple",true);  
					 if(i<n) {
                     basket[i++]=a;
                     a.toString();
					 }
					 System.out.println("\n Added Apple\n");
                     break;
	           
	           
			case 4:   System.out.println("Displaying All fruits in the basket");
						for(int j=0;j<basket.length;j++) {
							if(basket[j]!=null) {
								basket[j].displayFruit();
							}
						}
				         break;
			
	           
	           //error 
			case 5:  System.out.println("Displaying Name,Color,Weight,Taste Of All Fresh Fruits");
			         for(int j=0;j<basket.length;j++) {
			        	 if(basket[j]!=null &&basket[j].isFresh()) {
			        		 System.out.println("\n  Name: "+basket[j].getName());
			        		 System.out.println("\n  Color: "+basket[j].getColor());
			        		 System.out.println("\n  Weight: "+basket[j].getWeight());
			        		 System.out.println("\n  Taste: "+basket[j].taste());
			        	 }
			        	 
			         }
			         break;
	           
	           
			case 6: System.out.println("Enter The Stale Fruit Name: "); 
					String nm=sc.next();
					for(int j=0;j<basket.length;j++) {
						if(basket[j]!=null && basket[j].name==nm) {
							basket[j].setFresh(false);
						}
					}
			         break;
	           
			case 7:  System.out.println("Displaying tastes of all stale(not fresh) fruits in the basket");  
			         for(int j=0;j<basket.length;j++) {
				            if( (basket[j].isFresh()==false)&& basket[j]!=null ) {
				            	System.out.println(basket[j].taste());
				                    }	
				          }
			         
		    default : System.out.println("Enter The Valid Choice....!");
						break;	
						
						
				
			         }
	                  
	          
			}
		}
			
			
}
		
	


