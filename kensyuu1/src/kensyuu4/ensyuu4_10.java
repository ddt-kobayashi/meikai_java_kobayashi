//読み込んだ値が１未満であれば改行文字を出力しないようにするプログラム
//List4-11を流用

//読み込んだ個数だけ*を表示

package kensyuu4;

import java.util.Scanner;

public class ensyuu4_10 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		System.out.print("何個*を表示しますか：");
		//キーボードから値を入力してもらう、それをnに代入する
		int n = stdIn.nextInt();

		//int型の変数iの初期値は0（初期値）
		//入力値の値がiより大きい場合、＊の出力を行う（条件式）
		//iは処理を行うたびにインクリメントする（変更式）
		//上記の条件式と変更式が成立する度に繰り返し処理を行う
		for (int i = 0; i < n; i++) {
			System.out.print('*');

			//もし、入力値の値が1より大きければ改行文字を出力する
			//もし、入力値の値が1未満であれば改行文字を出力しない
			if (n > 1) {
				System.out.println();
			}
		}
	}

}
