//正の整数値を読み込んで、その桁数を表示するプログラム

package kensyuu4;

import java.util.Scanner;

public class ensyuu4_8 {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		//int型の変数integerを定義
		int integer;
		//0以下の値が入力された場合、再度入力させる
		do {
			System.out.print("整数値：");
			//キーボードから値を入力してもらう、それをintegerに代入する
			integer = stdIn.nextInt();
		} while (integer <= 0);

		//int型の変数digitにintegerの値を代入する
		int digit = integer;
		//処理回数を求めたい為、int型の変数countを定義
		int count = 0;
		//digitが0より上の整数である限り、10で割り続ける
		//上記の条件が桁数を求める内容となる（繰り返し桁数を減らすイメージです）
		//countは処理を行なった回数＝桁数とする為、インクリメントさせています。
		do {
			digit /= 10;
			count++;
		} while (digit > 0);
		//処理結果として、桁数を出力する
		System.out.print("その値は" + count + "桁です。");
	}
}