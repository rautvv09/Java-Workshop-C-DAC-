package Assigment_01;
import java.util.*;

public class prgram01 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);

		System.out.println( "Enter The Integer Number:");
		int num=sc.nextInt();
		
		String Binary=Integer.toBinaryString(num);
		System.out.println("Binary Equivalent:"+Binary);
		
		String octal=Integer.toOctalString(num);
		System.out.println("Octal Equivalent:"+octal);
		
		String hexa=Integer.toHexString(num);
		System.out.println("Hexadecimal Equivalent:"+hexa);

		sc.close();
		}

}
