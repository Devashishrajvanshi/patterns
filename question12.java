package patterns;

import java.util.Scanner;

public class question12 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the length");
		int l=sc.nextInt();
		int space=0;
		
		for(int i=l;i>=1;i--)
		{
			int a=1;
			for(int j=1;j<=space;j++)
			{
				System.out.print(" ");
			}
			for(int k=i;k>=1;k--)
			{
				System.out.print(k);
				
				
				
			}
			
			System.out.println();
			System.out.println();
			space++;
			
			
		}
	}
}
