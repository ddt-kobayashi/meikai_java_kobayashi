//正方形を表示するプログラム

package kensyuu4;

import java.util.Scanner;

public class ensyuu4_20 {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		int valueN;
		//キーボードから値を入力してもらう、それをvalueNに代入する
		//正の整数値（０より上の値）を入力するまで繰り返し処理を行う
		//変更式がない為、ここはfor文にしない
		do {
			valueN = stdIn.nextInt();
		} while (valueN <= 0);

		//このfor文での処理が2個目のループ処理
		//今回入力値は段数として処理を行う
		//int型の変数initialの値はスタート地点の整数値を意味して1として定義する（初期値）
		//入力値の値がinitial以上であるまで、改行し続ける（条件式）
		//initialは処理を行うたびにインクリメントする（変更式）
		for (int initial = 1; initial <= valueN; initial++) {
			System.out.println();
			//このfor文での処理が1個目のループ処理
			//int型の変数hangの値はスタート地点の整数値を意味して1として定義する（初期値）
			//入力値の値がhang以上である場合、＊と空白を出力し続ける（条件式）
			//hangは処理を行うたびにインクリメントする（変更式）
			for (int hang = 1; hang <= valueN; hang++) {
				System.out.print('*');
				System.out.print(" ");	//空白は回答結果参照
			}
		}
	}
}
