//整数値を読み込んでその値を８進数と１６進数で表示するプログラム

package kensyuu5;

import java.util.Scanner;

public class ensyuu5_1 {

	public static void main(String[] args) {

		Scanner stdIn = new Scanner(System.in);

		System.out.print("整数：");
		int integer = stdIn.nextInt(); //キーボードから整数値を入力してもらう、それをintegerに代入する

		//printfメソッドを活用
		//今回は改行処理としてエスケープシーケンスを利用します。
		//%o,%xなどの書式文字列はP１３７参照
		System.out.printf("８進数では%oです。\n", integer); //入力値から８進数を出力
		System.out.printf("１６進数では%xです。", integer); //入力値から１６進数を出力

	}
}
