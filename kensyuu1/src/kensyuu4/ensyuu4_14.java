//1からnまでを求めるプログラムをfor文で作成
//加えて式を表示するプログラム
//ensyuu4_13を流用
//今回は問題に従い、変数は全て流用したものにする

package kensyuu4;

import java.util.Scanner;

public class ensyuu4_14 {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		System.out.println("1からnまでの和を求めます。");

		int n;
		//キーボードから値を入力してもらう、それをnに代入する
		//正の整数値（０より上の値）を入力するまで繰り返し処理を行う
		//変更式がない為、ここはfor文にしない
		do {
			System.out.print("nの値：");
			n = stdIn.nextInt();
		} while (n <= 0);
		int sum = 0;
		//int型の変数iの値はスタート地点を意味して1として定義する（初期値）
		//入力値の値がi以上である場合、総和を求め続ける（条件式）
		//iは処理を行うたびにインクリメントする（変更式）
		//上記の条件式と変更式が成立する度に繰り返しカウントダウン処理を行う
		for (int i = 1; i <= n; i++) {
			sum += i;

			//教科書P70(条件演算子(?))を参照
			//繰り返し処理を行う際に初期値がn以上になるまで(true)は"＋"を出力
			//繰り返し処理を行う際に初期値がn以上になる際(false)は"="を出力
			System.out.print(i);
			System.out.print(i >= n ? " = " : " + ");
		}
		//最後に最終的な合計値を出力する
		System.out.println(sum);
	}

}
