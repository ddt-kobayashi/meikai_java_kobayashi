//合計だけでなく平均も求めるプログラムを作成
//List4-17を流用
//読み込んだ整数を加算（０が入力されたら終了）
//今回の変数名は流用に従う

package kensyuu4;

import java.util.Scanner;

public class ennsyuu4_25 {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		System.out.println("整数を加算します。");
		System.out.print("何個加算しますか：");

		//キーボードから値を入力してもらう、それをnに代入する
		int n = stdIn.nextInt();

		double sum = 0; //合計を求める変数として変数を定義
		int count = 0; //平均を求める為のもの（個数）として変数を定義

		//int型の変数iの値は判定のスタート地点の整数値を意味して０として定義する（初期値）
		//入力値の値がi以上である場合、整数値tを入力しそれらを合わせる処理を行う（条件式）
		//iは処理を行うたびにインクリメントする（変更式）
		for (int i = 0; i < n; i++) {
			System.out.print("整数を加算します。");
			int t = stdIn.nextInt();
			//もしも入力値tが0の場合は処理を中断する
			if (t == 0) {
				System.out.print("処理を中断します。");
				break;
			}

			sum += t; //合計値に入力値を加える
			count++; //平均値を求める為、処理回数をカウントする
		}
		//合計値をカウント（処理回数）で割った数を平均値（average）とする
		double average = (sum / count);
		System.out.println("合計は" + sum + "です。");
		System.out.println("平均は" + average + "です。");
	}
}
