package patterns;

import java.util.Scanner;

public class question15 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the length");
	int l=sc.nextInt();
	for(int i=1;i<=l;i++) {
	 for (int j = l; j >= 1; j--) {
         System.out.print(j);
     }
	 System.out.println();
	 System.out.println();
	}
}
}
