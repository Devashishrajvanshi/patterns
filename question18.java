package patterns;

import java.util.Scanner;

public class question18 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the length");
		int l=sc.nextInt();
		for(int i=1;i<=l;i++)
		{
			for(int j=1;j<=l;j++)
			{
				if(j%2==0)
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