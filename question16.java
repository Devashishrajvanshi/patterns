package patterns;

import java.util.Scanner;

public class question16 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the length");
	int l=sc.nextInt();
	for(int i=1;i<=l;i++)
	{ char ch='A';
		for(int j=1;j<=l;j++)
		{
			System.out.print(ch++);
		}
		System.out.println();
		System.out.println();
		
	}
}
}
