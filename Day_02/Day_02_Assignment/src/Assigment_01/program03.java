package Assigment_01;
import java.util.*;

public class program03 {

	public static void main(String[] args) {
		
		System.out.println("Enter The N:");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
	  
	    for(int i=0;i<=n;i++){
	       
	     for(int j=i;j<=n;j++){
	              System.out.print(" ");
	            
	         }
	    
	    for(int k=1;k<=i;k++) {
	    	System.out.print(" *");
	    }
	    
	    System.out.println();
	    }
	    sc.close();
	}

}
