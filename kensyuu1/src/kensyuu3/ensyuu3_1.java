package kensyuu3;

import java.util.Scanner;

public class ensyuu3_1 {
	
	public static void main (String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("整数値：");
		int n = stdIn.nextInt();
		
		if (n < 0) {
			n = -n;
		}
		System.out.println("その絶対値は" + n + "です。");
	}
}
