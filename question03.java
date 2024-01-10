package patterns;

import java.util.Scanner;

public class question03 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a length");
		int l=sc.nextInt();
		int space=l-1;
		for(int i=1;i<=l;i++)
		{
			int n=1;
			for(int j=1;j<=space;j++)
			{
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++)
			{
				System.out.print(k);
				if(i>k) {
				System.out.print("*");
				
				}
				
			}
			
			System.out.println();
			System.out.println();
			space--;
		}
	}

}
