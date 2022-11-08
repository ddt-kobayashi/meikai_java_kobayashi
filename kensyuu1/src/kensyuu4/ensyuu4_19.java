//入力された月の季節を表示
//1から12以外の値が入力された場合は再入力する
//List4-1流用

package kensyuu4;

import java.util.Scanner;

public class ensyuu4_19 {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		int retry;
		//本件はp122の多重ループを行う
		//季節を何度でも求められるプログラム
		//このdo文での処理が2個目のループ処理
		//キーボードから値を入力してもらう、それをretryに代入する
		//問いに対して正の整数値（１）を入力した場合、{}内の処理を再度行う
		do {
			int month;
			//このdo文での処理が1個目のループ処理
			//キーボードから値を入力してもらう、それをmonthに代入する
			//対象の月、正の整数値（１より大きい値か１２より小さい値）を入力するまで繰り返し処理を行う
			do {
				System.out.print("季節を求めます。\n何月ですか：");
				month = stdIn.nextInt();
				//各対象月に合わせて内容を出力する
				if (month >= 3 && month <= 5) {
					System.out.print("それは春です。");
				} else if (month >= 6 && month <= 8) {
					System.out.print("それは夏です。");
				} else if (month >= 9 && month <= 11) {
					System.out.print("それは秋です。");
				} else if (month == 12 || month == 1 || month == 2) {
					System.out.print("それは冬です。");
				}
			} while (month < 1 || 12 < month);
			System.out.print("もう一度？　1‥Yes/0‥No :");
			retry = stdIn.nextInt();

		} while (retry == 1);
	}
}
