//変数a,bを読み込んで大小関係を表示する

package kensyuu3;

import java.util.Scanner;

public class ensyuu3_4 {
	
	public static void main (String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("整数値a：");
		int a = stdIn.nextInt();
		System.out.print("整数値b：");
		int b = stdIn.nextInt();
		
		if (a > b) {
			System.out.println("aの方が大きいです。");
		} else if (a < b){
			System.out.println("bの方が大きいです。");
		} else {
			System.out.println("aとbは同じ値です。");
		}
	}
}
