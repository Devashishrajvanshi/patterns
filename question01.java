package patterns;

import java.util.Scanner;

public class question01 {
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
          
			for(int j=1;j<=i;j++)
			{
				System.out.print("1");
				if(j<i)
				{
					System.out.print("0");
				}
				
			
		}
			System.out.println();
			System.out.println();
			space--;
		}
	}

}
