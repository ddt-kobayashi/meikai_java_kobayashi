//List6-5を書きかえて、右に示すように縦向きの棒グラフで表示するプログラム
//最下段には、インデックスを１０で割った剰余を表示すること
//List6-5を流用

package kensyuu6;

import java.util.Random;
import java.util.Scanner;

public class ensyuu6_4 {
	public static void main(String[] args) {
		Random rand = new Random();
		Scanner stdIn = new Scanner(System.in);

		//要素数を読み込む入力値を入力してもらう
		System.out.print("要素数:");
		int n = stdIn.nextInt();
		//構成要素型がint型で構成要素数は入力値（n）
		int[] a = new int[n];

		//入力値までの要素数の値を０から１つずつ生成する
		//代入する値は１から10のランダム
		for (int i = 0; i < n; i++) {
			//1~10の乱数を生成
			a[i] = 1 + rand.nextInt(10);
		}

		//'*'を出力
		//0から９まで繰り返し行う
		for (int i = 0; i < 10; i++) {
			//０から入力値の手前まで繰り返し行う（入力値数）
			for (int j = 0; j < n; j++) {
				//もしもiの値よりa[i]が小さければ※そうでなければ空白を繰り返し出力
				//入力数までランダムに＊を横並びに出力
				//最後の段は必ず＊を出力する
				if (i >= (10 - a[j])) {
					System.out.print('*');
				} else {
					System.out.print(' ');
				}
				//もしも入力値の回数まで処理を行ったら改行する
				//そうでなければ空白（この空白は見た目をよくする為のもの）
				//空白の意図は問題通りです
				if (j >= (n - 1)) {
					System.out.println();
				} else {
					System.out.print(' ');
				}
			}
		}

		//'-'を出力
		//０から入力値の手前まで繰り返し行う（入力値数）
		for (int i = 0; i < n; i++) {
			System.out.print('-');
			//もしも入力値の回数まで処理を行ったら改行する
			//そうでなければ'-'を出力する（この空白は見た目をよくする為のもの）
			if (i >= n - 1) {
				System.out.println();
			} else {
				System.out.print('-');
			}
		}
		//インデックスを１０で割った剰余の値を出力
		//０から入力値の手前まで繰り返し行う（入力値数）
		for (int i = 0; i < n; i++) {
			System.out.print(i % 10);
			//もしも入力値の回数まで処理を行ったら何も出力しない
			//そうでなければ'-'を出力する（この空白は見た目をよくする為のもの）
			//空白の意図は問題通りです
			if (i == n - 1) {
				System.out.print("");
			} else {
				System.out.print(' ');
			}
		}
	}
}
