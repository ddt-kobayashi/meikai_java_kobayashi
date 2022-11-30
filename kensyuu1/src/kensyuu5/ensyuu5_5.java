//三つの整数値を読み込んで、その合計と平均を表示するプログラム
//平均はキャスト演算子を利用して表示する

package kensyuu5;

import java.util.Scanner;

public class ensyuu5_5 {
	public static void main(String[] args) {

		Scanner stdIn = new Scanner(System.in);

		System.out.print("整数値A:");
		int valueA = stdIn.nextInt(); //キーボードから整数値を入力してもらう、それをvalueAに代入する
		System.out.print("整数値B:");
		int valueB = stdIn.nextInt(); //キーボードから整数値を入力してもらう、それをvalueBに代入する
		System.out.print("整数値C:");
		int valueC = stdIn.nextInt(); //キーボードから整数値を入力してもらう、それをvalueCに代入する

		//総数をsumで定義する
		int sum = (valueA + valueB + valueC);
		//平均値をaveで定義する
		//キャスト演算子を利用 aveをdouble型に変換した値
		double ave = (double)sum / 3;
		System.out.println("合計は" + sum + "です。");
		System.out.println("平均は" + ave + "です。");
	}
}
