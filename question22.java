package patterns;

import java.util.Scanner;

public class question22 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the length");
	int n=sc.nextInt();
	for(int i=1;i<=n;i++)
	{
		for(int j=1;j<=n;j++)
		{
			if(i%2==0)
			{
				if(j%2==0)
				{
					System.out.print("1");
				}
				else {
					System.out.print("0");
				}
			}
			else if(j%2==0)
			{
				System.out.print("0");
			}
			else {
				System.out.print("1");
			}
		}
		System.out.println();
		System.out.println();
	}
}
}
