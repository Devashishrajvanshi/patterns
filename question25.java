package patterns;

import java.util.Scanner;

public class question25 {
	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		System.out.println("enter the length");
		int n=sc.nextInt();
		int mid=(n/2)+1;
		int space=mid-1;
		int star=1;
		
		for(int i=1;i<=n;i++)
		{
			char ch='A';
		    char ch1='A';
			for(int j=1;j<=space;j++)
			{
				System.out.print(" ");
			}
			for(int k=1;k<=star;k++)
			{
				System.out.print(ch++ );
			}
			for(int l=star;l>=2;l--)
			{
				System.out.print(ch1++ );
			}
			if(mid>i)
			{
				star++;
				space--;
			}
			else {
				star--;
				space++;
			}
			System.out.println();
			System.out.println();
		}
	}
}
		