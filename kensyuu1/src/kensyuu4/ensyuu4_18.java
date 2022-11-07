//１からnまでの整数値の二乗値を表示するプログラム

package kensyuu4;

import java.util.Scanner;

public class ensyuu4_18 {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		int valueN;
		//キーボードから値を入力してもらう、それをvalueNに代入する
		//正の整数値（０より上の値）を入力するまで繰り返し処理を行う
		//変更式がない為、ここはfor文にしない
		do {
			System.out.print("nの値：");
			valueN = stdIn.nextInt();
		} while (valueN <= 0);

		//int型の変数initialの値はスタート地点の整数値を意味して1として定義する（初期値）
		//入力値の値がinitial以上である場合、二乗を求め続ける（条件式）
		//initialは処理を行うたびにインクリメントする（変更式）
		for (int initial = 1; initial <= valueN; initial++) {
			//条件が成立する限り二乗の式を繰り返し行う
			System.out.println(initial + "の2乗は" + (initial * initial));
		}
	}
}
