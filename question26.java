package patterns;

import java.util.Scanner;

public class question26 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the length");
	int n=sc.nextInt();
	int mid=(n/2)+1;
	int space=mid-1;
	int number=1;
	for(int i=1;i<=n;i++)
	{
		for(int j=1;j<=space;j++)
		{
			System.out.print(" ");
		}
		for(int k=1;k<=number;k++)
		{
			if(k%2==0)
			{
				System.out.print("0");
			}
			else
			{
				System.out.print("1");
			}
		}
		if(mid>i)
		{
			number+=2;
			space--;
		}
		else {
			number-=2;
			space++;
		}
		System.out.println();
		System.out.println();
	}
	
}
}
