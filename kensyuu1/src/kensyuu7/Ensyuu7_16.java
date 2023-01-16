//配列aの要素の最小値を求めるメソッドminOfを作成せよ
//int minOf(int[] a)
//List7-15を参考(そのため指定はないが身長と体重で表現しています)

package kensyuu7;

import java.util.Scanner;

public class Ensyuu7_16 {
	//配列aの全要素の最小値を求めるメソッドminOfを作成
	//①intは返却型
	//②minOfはメソッド名
	//③メソッドの本体は{}で囲む
	static int minOf(int[] a) {

		//変数minは引数で指定された配列aの要素の最小値を求める値を格納するために使用する最小値となる変数
		//仮の値としてa[0](仮の最小値)を代入する。
		int min = a[0];
		//受け取った引数の値の数まで繰り返し最小値を求める
		for (int i = 1; i < a.length; i++) {
			//もしminの変数よりaの配列変数の方が小さい場合、aがminの値となる
			//上記を繰り返し行うことで最小値を求める
			if (a[i] < min) {
				min = a[i];
			}
		}
		//呼び出したint型の値(min)を呼び出し元(minOf)に返却する
		return min;
	}

	//プログラムが実行されて起動するmainメソッドを作成
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		//人数を入力してもらう
		System.out.print("人数は：");
		int people = stdIn.nextInt();

		//int型のheight、weightの配列変数を要素数（人数分）生成
		int[] height = new int[people];
		int[] weight = new int[people];

		//人数を出力する
		System.out.println(people + "人の身長と体重を入力せよ");

		//繰り返し各人の身長と体重を入力してもらう
		for (int i = 0; i < people; i++) {
			System.out.print((i + 1) + "番目の身長：");
			height[i] = stdIn.nextInt();
			System.out.print((i + 1) + "番目の体重：");
			weight[i] = stdIn.nextInt();
		}

		//最も背が低い人と痩せている人をそれぞれ出力する
		System.out.println("最も背が低い人の身長は" + minOf(height) + "です。");
		System.out.println("最も痩せている人の体重は" + minOf(weight) + "です。");
	}
}
