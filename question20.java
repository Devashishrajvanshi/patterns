package patterns;

import java.util.Scanner;

public class question20 {
	public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
	System.out.println("enter the length");
	int l=sc.nextInt();
	for(int i=1;i<=l;i++)
	{
		for(int j=1;j<=i;j++)
		{
			if(j==1)
			{
				System.out.print(i+" ");
			}
			else if(j==2)
			{
				System.out.print(l+i-1+" ");
			}
			else if(j==3)
			{
				System.out.print(i+7+" ");
			}
			else if(j==4)
			{
				System.out.print(i+9+" ");
			}
			else if(j==5)
			{
				System.out.print(i+10+" ");
			}
		}
		System.out.println();
	}
	}
}
