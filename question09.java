package patterns;

import java.util.Scanner;

public class question09 {
	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		System.out.println("enter the length ");
		int l=sc.nextInt();
		int space=l-1;
		int charCount=1;
		
		for(char i=1; i<=l;i++)
		{
			char ch='a';
			for(int j=1;j<=space;j++)
			{
				System.out.print(" ");
			}
			for(int k=1;k<=charCount;k++)
			{
				System.out.print(ch++);
				
			}
			System.out.println();
			System.out.println();
			space--;
		    charCount+=2;
		}
		
	}
	}

