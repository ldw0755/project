package project;

import java.util.Scanner;

public class Collatz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner stdIn = new Scanner(System.in);
		long num = stdIn.nextInt();
		
		stdIn.clode();
		
		while (true) {
			System.out.print(num + " ");
			
			if (num == 1) {
		            break;
			}

			if (num % 2 == 0) {
				num /= 2;
			} else {
				num = num * 3 + 1;
			}
		}
		
		System.out.println();
	}
}
