//キーボードから読み込んだ値に10を加えた値と10を減じた値を表記するプログラム

package kensyuu2;

import java.util.Scanner;

public class ensyuu2_4 {

	public static void main (String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("整数値：");
		int integerValue = stdIn.nextInt();	//integerValueにキーボードから読み込んだ整数値を読み込む
		
		System.out.println("10を加えた値は" + (integerValue + 10) + "です。");		//
		System.out.println("10を減じた値は" + (integerValue - 10) + "です。");		//
	}
}
