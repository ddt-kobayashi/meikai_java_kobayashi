//直角が右下側の三角形を表示するプログラム
//List4-16を一部流用
//流用のプログラムである為、変数は単純な命名とする

package kensyuu4;

import java.util.Scanner;

public class ensyuu4_21_2 {
	public static void main(String[] args) {

		//キーボードから値を入力してもらう、それをnに代入する
		Scanner stdIn = new Scanner(System.in);
		System.out.println("左下直角の三角形を表示します。");
		System.out.print("段数は：");
		int n = stdIn.nextInt();

		//このfor文での処理が3個目のループ処理
		//今回入力値は段数として処理を行う
		//int型の変数iの値は入力値として定義する（初期値）
		//入力値の値が0より小さい値である場合、改行し続ける（条件式）
		//iは処理を行うたびにデクリメントする（変更式）
		for (int i = n; i > 0; i--) {
			//このfor文での処理が1個目のループ処理
			//行毎の空白部分を作る処理を行う
			//int型の変数jの値はiと定義する（初期値）
			//入力値の値が0より大きい値である場合、出力し続ける（条件式）最後に＊が入力値の数だけ出る仕組み
			//処理を行うたびにデクリメントする（変更式）
			for (int j = i; j - 1 > 0; j--) {
				System.out.print(' ');
			}
			//このfor文での処理が2個目のループ処理
			//int型の変数kの値は0として定義する（初期値）
			//初期値の値が処理数より小さい値である場合、＊を出力し続ける（条件式）
			//初期値の値は処理を行うたびにインクリメントする（変更式）
			for (int k = 0; k <= n - i; k++) {
				System.out.print('*');
			}
			System.out.println();
		}
	}
}
