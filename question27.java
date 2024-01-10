package patterns;

import java.util.Scanner;

public class question27 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the length");
	int n=sc.nextInt();
	int mid =(n/2)+1;
	int space=0;
	int number=n-1;
	
	for(int i=1;i<=n;i++)
	{
		char ch='A';
		for(int j=1;j<=space;j++)
		{
			System.out.print(" ");
		}
		
		for(int k=i;k<=n-1;k++)
		{
			
			System.out.print(ch++);
			
		}
	
		
		System.out.println();
		System.out.println();
		space++;
		
	}
}
}
