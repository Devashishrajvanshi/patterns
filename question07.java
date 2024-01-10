package patterns;

import java.util.Scanner;

public class question07 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the length");
	int l=sc.nextInt();
	int space=l-1;
	for(int i=1;i<=l;i++)
	{
		for(int j=1;j<=space;j++)
		{
			System.out.print(" ");
		}
		for(int m=i;m>1;m--)
		{
			System.out.print(m);
		}
		for(int k=1;k<=i;k++)
		{
			System.out.print(k);
		}
		
		
		
		System.out.println();
		System.out.println();
		space--;
	}
	
}
}
