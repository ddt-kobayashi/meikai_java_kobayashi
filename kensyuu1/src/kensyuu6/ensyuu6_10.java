//要素型がint型である配列を作り、全要素を1~10の乱数で埋め尽くす（1以上10以下の値を代入する）プログラムを作成
//要素数はキーボードから読み込むこと
//今回は連続する要素が同じ値を持つことのないようにする

package kensyuu6;

import java.util.Random;
import java.util.Scanner;

public class ensyuu6_10 {
	public static void main(String[] args) {
		Random rand = new Random();
		Scanner stdIn = new Scanner(System.in);

		//要素数を読み込む入力値を入力してもらう
		System.out.print("要素数:");
		int n = stdIn.nextInt();
		//構成要素型がint型で構成要素数は入力値（n）
		int[] a = new int[n];
		//ランダムで代入される変数を生成
		int random;
		//入力値までの要素数の値を０から１つずつ要素数の数まで生成する
		//代入する値は１から10のランダム
		for (int i = 0; i < a.length; i++) {
			//要素数が０以下の場合
			if (i <= 0) {
				//1~10の乱数を生成
				random = rand.nextInt(10) + 1;
				a[i] = random;
				//要素数が０より上の場合で生成された連続する要素数の値が同じである限り処理を続ける
			} else if (i > 0) {
				do {
					//1~10の乱数を生成
					random = rand.nextInt(10) + 1;
					a[i] = random;
				} while (a[i] == a[i - 1]);
			}
			//上記の条件式により連続する要素が同じ値を持つことのないようにするのを出力する
			System.out.println("a[" + i + "] = " + a[i]);
		}
	}
}
