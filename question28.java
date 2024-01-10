package patterns;

import java.util.Scanner;

public class question28 {
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
				System.out.print(k);
			}
			for(int l=number-1;l>=1;l--)
			{
				System.out.print(l);
			}
			if(mid>i)
			{
				number++;
				space--;
			}
			else
			{
				number--;
				space++;
			}
			System.out.println();
			System.out.println();
		}
	}

}
