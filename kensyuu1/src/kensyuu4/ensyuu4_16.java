//読み込んだ個数だけ＊を表示するプログラム
//条件として５個表示するごとに改行する
//List4-11を流用

package kensyuu4;

import java.util.Scanner;

public class ensyuu4_16 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		int n;
		//キーボードから値を入力してもらう、それをnに代入する
		//正の整数値（０より上の値）を入力するまで繰り返し処理を行う
		//変更式がない為、ここはfor文にしない
		do {
			System.out.print("何個＊を表示しますか：");
			n = stdIn.nextInt();
		} while (n <= 0);

		//int型の変数iの初期値は1（初期値）
		//入力値の値がi以上の場合、＊の出力を行う（条件式）
		//iは処理を行うたびにインクリメントする（変更式）
		//上記の条件式と変更式が成立する度に繰り返し処理を行う
		for (int i = 1; i <= n; i++) {
			System.out.print('*');

			//もしも初期値を５で割った余りが0以下の場合、改行する
			if (i % 5 <= 0) {
				System.out.println();
			}
		}
	}

}