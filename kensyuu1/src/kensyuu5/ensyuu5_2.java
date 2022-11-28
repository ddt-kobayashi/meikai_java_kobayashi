//整数値を読み込んでfloat型とdouble型を表示するプログラム
//変数名は問題の実行結果に従い、x,yを使用します。

package kensyuu5;

import java.util.Scanner;

public class ensyuu5_2 {

	public static void main(String[] args) {

		Scanner stdIn = new Scanner(System.in);

		System.out.println("変数xはfloat型で、変数yはdouble型です。");

		System.out.print("x:");
		float x = stdIn.nextFloat(); //キーボードから整数値を入力してもらう、それをxに代入する

		System.out.print("y:");
		double y = stdIn.nextDouble(); //キーボードから整数値を入力してもらう、それをyに代入する

		System.out.println("x = " + x); //入力値からfloat型として出力
		System.out.println("y = " + y); //入力値からdouble型として出力

	}
}
