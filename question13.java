package patterns;

import java.util.Scanner;

public class question13 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the length");
	int l=sc.nextInt();
	int space=0;
	for(int i=l;i>=1;i--)
	{
		for(int j=1;j<=space;j++)
		{
			System.out.print(" ");
		}
		for(int k=i;k>=1;k--)
		{
			System.out.print(k);
		}
		for(int m=2;m<=i;m++)
		{
			System.out.print(m);
		}
		System.out.println();
		System.out.println();
		
		space++;
	}
}
}
