//配列の要素数と、個々の要素の値を読み込んで、各要素の値を表示するプログラム
//表示の形式は、初期化子と同じ形式、各要素の値をコンマで区切って{}で囲んだ形式

package kensyuu6;

import java.util.Scanner;

public class ensyuu6_5 {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		//要素数を読み込む入力値を入力してもらう
		System.out.print("要素数:");
		int ElementCount = stdIn.nextInt();

		//構成要素型がint型で構成要素数は入力値（ElementCount）
		int[] array = new int[ElementCount];

		//全ての配列の要素数の値を入力して取得する
		//array.lengthにて配列の要素数（長さ）を取得
		for (int i = 0; i < array.length; i++) {
			System.out.print("a[" + i + "]:");
			array[i] = stdIn.nextInt();
		}

		//全ての配列の要素数の値を取得して出力
		//array.lengthにて配列の要素数（長さ）を取得
		System.out.print("array = {");
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i]);
			//条件演算子（P70）を利用
			//配列の要素数の長さであれば何も出力しない（ブロック内の処理が終了）
			//配列の要素数の長さでなければ”、”を出力する（For文に戻る）
			System.out.print((i + 1 == array.length) ? "" : ",");
		}
		System.out.println("}");
	}
}
