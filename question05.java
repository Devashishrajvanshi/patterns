package patterns;

import java.util.Scanner;

public class question05 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the length");
	int l=sc.nextInt();
	int space=l-1;
	int zero=1;
	int one=1;
	for(int i=1;i<=l;i++)
	{
		
		for(int k=1;k<=space;k++)
		{
			System.out.print(" ");
		}
		for(int j=1;j<=one;j++)
		{
			
			if(i%2==1)
			{
				System.out.print("1");
			}
			
		}
			for(int m=1;m<=zero;m++)
			{
				if(i%2==0)
				{
					System.out.print("0");
				}
				
			}
		System.out.println();
		System.out.println();
		space--;
		one+=2;
		zero+=2;
			
			
		}
		
	}
}


