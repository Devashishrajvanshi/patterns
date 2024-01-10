package patterns;

import java.util.Scanner;

public class question24 {
public static void main(String[] args) {
	System.out.println("enter the length");
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int a=1;
	for(int i=1;i<=n;i++)
	{
		for(int j=1;j<=i;j++)
		{
			System.out.print(a++);
			if(a>9)
			{
				a=1;
			}
		}
		System.out.println();
		System.out.println();
	}
}
}
