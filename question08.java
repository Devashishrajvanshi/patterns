package patterns;

import java.util.Scanner;

public class question08 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the length");
		int n = sc.nextInt();
		int space = n - 1;
		int zero = 1;
		int one = 1;
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= space; j++) {
				System.out.print(" ");
			}
			for (int k = 1; k <= zero; k++) {
				if (i % 2 == 0) {
					if (k % 2 == 0) {
						System.out.print("1");
					} else {
						System.out.print("0");
					}
				} else if (k % 2 == 0) {
					System.out.print("0");
				} else {
					System.out.print("1");
				}

			}

			System.out.println();
			System.out.println();
			space--;
			zero += 2;
			
		}

	}
}
