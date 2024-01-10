package patterns;

import java.util.Scanner;

public class question02 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the length");
	int l=sc.nextInt();
	int space=l-1;
	 for (int i = 1; i <= l; i++) {
         for(int s=1;s<=space;s++)
         {
        	 System.out.print(" ");
         }
         for (int j = 1; j <= i; j++) {
             System.out.print(j);
         }

         
         for (int j = i - 1; j >= 1; j--) {
             System.out.print(j);
         }
         System.out.println();
         System.out.println();
         space--;
		
		
		
		
	}
	
	
}
}
