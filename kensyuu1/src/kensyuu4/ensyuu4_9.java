//正の整数値を読み込んで、1からnまでの積を求めるプログラム

package kensyuu4;

import java.util.Scanner;

public class ensyuu4_9 {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		//int型の変数valueNを定義
		int valueN;
		//0以下の値が入力された場合、再度入力させる(1からnまでの積を求める為)
		do {
			System.out.print("nの値：");
			//キーボードから値を入力してもらう、それをvalueNに代入する
			valueN = stdIn.nextInt();
		} while (valueN <= 0);

		//int型の変数productに１の値を代入する（積を求める為の変数）
		int product = 1;
		//int型の変数initialに１の値を代入する（１とする）
		int initial = 1;
		//initialが入力値以下の整数である場合、initialの値を掛け続ける
		//initialの値がvalueNの値と同様になった際はそれまでで終了する
		//1からn(valueN)までの積の値を求めたい為
		do {
			product *= initial;
			//initialの値がvalueNの値になるまでインクリメントさせて対応する
			initial++;
		} while (initial <= valueN);
		//処理結果として、1からnまでの積を出力する
		System.out.print("１から" + valueN + "までの積は" + product + "です。");
	}
}