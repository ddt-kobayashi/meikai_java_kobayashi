//要素型がint型である配列を作り、全要素を1~10の乱数で埋め尽くす（1以上10以下の値を代入する）プログラムを作成
//要素数はキーボードから読み込むこと

package kensyuu6;

import java.util.Random;
import java.util.Scanner;

public class ensyuu6_9 {
	public static void main(String[] args) {
		Random rand = new Random();
		Scanner stdIn = new Scanner(System.in);

		//要素数を読み込む入力値を入力してもらう
		System.out.print("要素数:");
		int n = stdIn.nextInt();
		//構成要素型がint型で構成要素数は入力値（n）
		int[] a = new int[n];

		//入力値までの要素数の値を０から１つずつ要素数の数まで生成する
		//代入する値は１から10のランダム
		for (int i = 0; i < a.length; i++) {
			//1~10の乱数を生成
			int random = rand.nextInt(10) + 1;
			a[i] = random;
			System.out.println("a[" + i + "] = " + a[i]);
		}
	}
}
