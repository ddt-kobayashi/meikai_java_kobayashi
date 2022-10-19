//List4-5のx--が--xとなっていた場合、どのような出力結果が得られるか検証する
//List4-5を流用

package kensyuu4;

import java.util.Scanner;

public class ensyuu4_5 {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		System.out.println("カウントダウンします。");
		int x;
		do {
			System.out.print("正の整数値：");
			x = stdIn.nextInt(); //キーボードから値を入力してもらう、それをxに代入する
		} while (x <= 0); //0以下の値が入力された場合、再度入力させる

		while (x >= 0) { //0以上の値が入力された場合、-1までの値を降順になるように出力する
			System.out.println(--x); //減少後のxの値を出力する
		}
	}

}