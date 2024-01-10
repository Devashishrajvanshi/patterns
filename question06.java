package patterns;

import java.util.Scanner;

public class question06 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the length");
	int l=sc.nextInt();
	for(int i=1;i<=l;i++)
	{
		for(int j=1;j<=l;j++)
		{
			
		   if(i==2 && j==3)
			{
				System.out.print(" ");
			}
		   else if(i==3 && j==2 || i==3 && j==3)
			{
				System.out.print(" ");
			}
		   else {
			   System.out.print(j);
		   }
			
		}
		for(int k=2;k>=1;k--)
		{
			
			if(i==3 && k==2)
			{
				System.out.print(" ");
			}
			else
				{
				System.out.print(k);
				}
				
		}
		System.out.println();
		System.out.println();
	}
}

}
