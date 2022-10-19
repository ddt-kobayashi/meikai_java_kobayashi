//list4-4のwhile文終了時にxの値が-1になることを確認するプログラムを作成する
//list4-4流用

package kensyuu4;

import java.util.Scanner;

public class ensyuu4_4 {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		System.out.println("カウントダウンします。");
		int x;
		do {
			System.out.print("正の整数値：");
			x = stdIn.nextInt(); //キーボードから値を入力してもらう、それをxに代入する
		} while (x <= 0); //0以下の値が入力された場合、再度入力させる

		while (x >= 0) { //0以上の値が入力された場合、0までの値を降順になるように出力する
			System.out.println(x); //xの値を出力する
			x--; //xの値をデクリメントする（減分演算子）
		}
		System.out.println(x); //xの値が-1であるか確認する為、それを出力表示する
	}

}