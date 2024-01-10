package patterns;

import java.util.Scanner;

public class question04 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter a length");
	int l=sc.nextInt();
	int space=l-1;
	for(int i=1;i<=l;i++)
	{
		for(int k=1;k<=space;k++)
		{
			System.out.print(" ");
		}
		for(int j=i;j>=1;j--)
		{
			System.out.print(j);
		}
		System.out.println();
		System.out.println();
		space--;
	}
}
}
