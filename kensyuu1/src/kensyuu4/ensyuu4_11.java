//正の整数値を０までカウントダウンするList４-4をfor文で表現する
//List4-4を流用

package kensyuu4;

import java.util.Scanner;

public class ensyuu4_11 {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		System.out.println("カウントダウンします。");
		
		int x;
		//キーボードから値を入力してもらう、それをxに代入する
		//正の整数値（０より上の値）を入力するまで繰り返し処理を行う
		//変更式がない為、ここはfor文にしない
		do {
			System.out.print("正の整数値：");
			x = stdIn.nextInt();
		} while (x <= 0);

		//int型の変数initialの値は入力値として定義する（初期値）
		//入力値の値が0以上である場合、＊の出力を行う（条件式）
		//initialは処理を行うたびにデクリメントする（変更式）
		//上記の条件式と変更式が成立する度に繰り返しカウントダウン処理を行う
		for (int initial = x; initial >= 0; initial--) {
			System.out.println(initial);
		}
	}

}
