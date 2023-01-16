//整数を左右にシフトした値が、2のべき乗での乗算や徐算と等しくなることを確認するプログラムを作成

package kensyuu7;

import java.util.Scanner;

public class Ensyuu7_11 {

	//2のべき乗での乗算や徐算であることを確認するメソッドcheckを作成
	//①intは返却型
	//②checkはメソッド名
	//③メソッドの本体は{}で囲む
	static int check(int no) {

		//乗算や徐算を求めるために初期値として変数と値１を定義
		int calculation = 1;
		//掛けるか割るかの処理を条件の数だけ行う
		while (no-- > 0) {
			calculation *= 2;
		}
		//呼び出したint型の値(calculation)を呼び出し元(check)に返却する
		return calculation;
	}

	//プログラムが実行されて起動するmainメソッドを作成
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		System.out.println("整数integerをbitビットシフトします。");

		//整数を入力してもらう
		System.out.print("integer:");
		int integer = stdIn.nextInt();
		//ビット数を入力塩てもらう
		System.out.print("bit:");
		int bit = stdIn.nextInt();

		//整数を左にシフトした値となる変数
		int leftShift = integer << bit;
		//整数を右にシフトした値となる変数
		int rightShift = integer >> bit;

		//2のべき乗での乗算となる処理
		int multiplication = integer * check(bit);
		//2のべき乗での徐算となる処理
		int division = integer / check(bit);

		//それぞれの処理結果となる値を出力する
		System.out.println("整数を左にシフトした値は" + leftShift);
		System.out.println("整数を右にシフトした値は" + rightShift);
		System.out.println("2のべき乗での乗算の値は" + multiplication);
		System.out.println("2のべき乗での徐算の値は" + division);

		//左にシフトした値と2のべき乗での乗算の値、右にシフトした値と2のべき乗での徐算の値がどちらも等しい場合、出力が行われる
		if (multiplication == leftShift && division == rightShift) {
			System.out.println("整数を左右にシフトした値が、2のべき乗での乗算や徐算と等しくなる");
		}
	}
}
