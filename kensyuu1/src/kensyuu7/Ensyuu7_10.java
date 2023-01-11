//List7-11を拡張して、以下の四つの問題をランダムに出題するプログラムを作成せよ
//x + y + z
//x + y - z
//x - y + z
//x - y - z
//暗算力トレーニング
//List7-11を流用

package kensyuu7;

import java.util.Random;
import java.util.Scanner;

public class Ensyuu7_10 {
	static Scanner stdIn = new Scanner(System.in);

	//続行の確認をするメソッドconfirmRetryを作成
	//①booleanは返却型
	//②confirmRetryはメソッド名
	//③メソッドの本体は{}で囲む
	static boolean confirmRetry() {
		//続行を確認する為の変数contを作成
		int cont;
		//0か1を入力しない限り繰り返し問われる
		do {
			System.out.print("もう一度？<Yes...1/No...0> : ");
			cont = stdIn.nextInt();
		} while (cont != 0 && cont != 1);

		//contが1であればtrue(続く),そうでなければfalse（続かない）
		return cont == 1;
	}

	public static void main(String[] args) {
		Random rand = new Random();
		System.out.println("暗算力トレーニング！！");

		//formulaはランダムな値を利用したい為、作成
		//ランダムな０から３の値を生成し、formulaに代入する
		int formula = rand.nextInt(4);

		do {
			//100から999のランダムな値を生成
			int x = rand.nextInt(900) + 100;
			int y = rand.nextInt(900) + 100;
			int z = rand.nextInt(900) + 100;

			//一問づつランダム（４パターン）に問題を出力して解けるまで繰り返し行う処理
			switch (formula) {
			//x + y + zの問題ケース
			case 0:
				while (true) {
					System.out.print(x + "+" + y + "+" + z + "=");
					//答えを入力してもらう
					int k = stdIn.nextInt();
					//正解であるならば処理{}から抜ける、間違いの場合もう一回
					if (k == x + y + z)
						break;
					System.out.println("違いますよ！！");
				}
				//続けるか問われる処理まで処理を抜ける
				break;
			//x + y - zの問題ケース
			case 1:
				while (true) {
					System.out.print(x + "+" + y + "-" + z + "=");
					//答えを入力してもらう
					int k = stdIn.nextInt();
					//正解であるならば処理{}から抜ける、間違いの場合もう一回
					if (k == x + y - z)
						break;
					System.out.println("違いますよ！！");
				}
				//続けるか問われる処理まで処理を抜ける
				break;
			//x - y + zの問題ケース
			case 2:
				while (true) {
					System.out.print(x + "-" + y + "+" + z + "=");
					//答えを入力してもらう
					int k = stdIn.nextInt();
					//正解であるならば処理{}から抜ける、間違いの場合もう一回
					if (k == x - y + z)
						break;
					System.out.println("違いますよ！！");
				}
				//続けるか問われる処理まで処理を抜ける
				break;
			//x - y - zの問題ケース
			default:
				while (true) {
					System.out.print(x + "-" + y + "-" + z + "=");
					//答えを入力してもらう
					int k = stdIn.nextInt();
					//正解であるならば処理{}から抜ける、間違いの場合もう一回
					if (k == x - y - z)
						break;
					System.out.println("違いますよ！！");
				}
				//続けるか問われる処理まで処理を抜ける
				break;
			}
			//呼び出したメソッドの値がtrueで有る限り処理が続く
		} while (confirmRetry());
	}
}
