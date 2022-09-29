//正の値を読み込んで３で割れる数と余りを表示する(入れ子となったif文)

package kensyuu3;

import java.util.Scanner;

public class ensyuu3_7 {
	
	public static void main (String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("整数値：");
		int n = stdIn.nextInt();
		
		if (n > 0) {
			if((n % 3) == 0) {
				System.out.println("その値は3で割り切れます。");
			} else if((n % 3) == 1){
				System.out.println("その値を3で割った余りは１です。");
			} else {
				System.out.println("その値を3で割った余りは２です。");
			}
		} else {
			System.out.println("正でない値が入力されました。");
		}
	}		
}
