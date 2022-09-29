//キーボードから読み込んだ値を表記するプログラム

package kensyuu2;

import java.util.Scanner;

public class ensyuu2_3 {

	public static void main (String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("整数値：");
		int integerValue = stdIn.nextInt();	//integerValueに整数値を読み込む
		
		System.out.println(integerValue + "と入力しましたね。");
	}
}
