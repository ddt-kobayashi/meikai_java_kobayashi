//直角が左上側、右下側、右上側の三角形を表示するプログラム
//List4-16を一部流用
//流用のプログラムである為、変数は単純な命名とする

package kensyuu4;

import java.util.Scanner;

public class ensyuu4_21 {
	public static void main(String[] args) {

		//キーボードから値を入力してもらう、それをnに代入する
		Scanner stdIn = new Scanner(System.in);
		System.out.println("左下直角の三角形を表示します。");
		System.out.print("段数は：");
		int n = stdIn.nextInt();

		//このfor文での処理が2個目のループ処理
		//今回入力値は段数として処理を行う
		//int型の変数iの値はスタート地点の整数値を意味して0として定義する（初期値）
		//入力値の値がiより大きい値である場合、改行し続ける（条件式）
		//initialは処理を行うたびにインクリメントする（変更式）
		for (int i = 0; i < n; i++) {

			//このfor文での処理が1個目のループ処理
			//int型の変数jの値は逆三角形を作る為、入力値から２個目のループ処理の初期値を引いていく値とする（初期値）
			//初期値の値が0より大きい値である場合、＊を出力し続ける（条件式）
			//初期値の値は処理を行うたびにデクリメントする（変更式）
			for (int j = (n - i); j > 0; j--) {
				System.out.print('*');
			}
			System.out.println();
		}
	}
}
