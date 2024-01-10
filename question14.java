package patterns;

import java.util.Scanner;

public class question14 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the length");
	int l=sc.nextInt();
	int space=l-1;
	char ch='a';
	for(int i=1;i<=l;i++)
	{ 
		
		for(int j=1;j<=space;j++)
		{
			System.out.print(" ");
		}
		for(int k=i-1;k>=1;k--)
		{
			
			 System.out.print((char)('a' + k));
		}
		
		 for (int m = 0; m <= i-1; m++) {
             System.out.print((char)('a' + m));
         }
		System.out.println();
		System.out.println();
		space--;
		
	}
}
}
