package patterns;

import java.util.Scanner;

public class question33 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the length");
	int n=sc.nextInt();
	int mid=(n/2)+1;
	int space=0;
	int star=n;
	for(int i=1;i<=n;i++)
	{
		for(int j=1;j<=star;j++)
		{
			System.out.print(" ");
		}
		for(int k=1;k<=star;k++)
		{
			System.out.print(k);
		}
		System.out.println();
		star--;
	}
}
}
