package patterns;

import java.util.Scanner;

public class question11 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the length");
	int l=sc.nextInt();
	int space=0;
	for(int i=1;i<=l;i++)
	{
		
		for(int j=1;j<=space;j++)
		{
			System.out.print(" ");
		}
		for(int k=i;k<=l;k++)
		{
			System.out.print(k);
		}
		System.out.println();
		System.out.println();
		space++;
	}
}
}

