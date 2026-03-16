import java.util.Scanner;

public class Program01 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);

		System.out.println("Enter Size Of String Array :");
		int n=sc.nextInt();
		
		String[] s1=new String[n];
		String[] s2=new String[n];
		
		System.out.println("Enter Values In 1st String :");
		for(int i=0;i<n;i++) {
	     	s1[i]=new String();
			s1[i]=sc.nextLine();
		}
		
		System.out.println("Enter Values In 2st String :");
		for(int i=0;i<n;i++) {
			s2[i]=new String();
			s2[i]=sc.nextLine();
		}
		
		System.out.println(" Duplicate Values In Array: ");
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if(s1[i].equals(s2[j])) {
					System.out.println(s1[i]);
				}
			}
		}
		
		sc.close();
		
	}
}
