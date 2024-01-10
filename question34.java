package patterns;

import java.util.Scanner;

public class question34 {
	public static void main(String args[])
	{
		
 		Scanner sc = new Scanner(System.in);
    		System.out.println("Enter the no of lines");
 		    int n=sc.nextInt();
 		    int space=0;
 		    int mid=(n/2)+1;
 		    int star=1;
 		    
    		for(int i=1;i<=n;i++)
    		{
    			for(int j=1;j<=space;j++)
    			{
    				System.out.print(" ");
    			}
        		for(int j=i;j<=n-1;j++)
        		{ 		
            			System.out.print((char)(j+64));
        		} 
        		for(int k=star;k>=1;k--)
        		{
        			System.out.print((char)(k+64));
        		}
        		if(mid>i)
        		{
        			star-=2;
        			space++;
        		}
        		else {
        			star+=2;
        			space--;
        		}
        		System.out.println();
        		System.out.println();
    		}
	}
}
