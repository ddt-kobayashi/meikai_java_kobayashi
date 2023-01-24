//日付クラス第三版を利用するプログラムを作成せよ
//全てのコンストラクタの動きを確認する

package kensyuu9_2;

import java.util.Scanner;

public class DayTester {

	//プログラムが実行されて起動するmainメソッドを作成
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		//年、月、日をそれぞれ入力してもらう
		System.out.println("day1を入力");
		System.out.print("年：");
		int y = stdIn.nextInt();
		System.out.print("月：");
		int m = stdIn.nextInt();
		System.out.print("日：");
		int d = stdIn.nextInt();

		//Day型のday1のクラス型変数をインスタンス化
		//入力した年、月、日をそれぞれ渡す
		Day day1 = new Day(y, m, d);
		System.out.println("day1 = " + day1);
		//Day型のday2のクラス型変数をインスタンス化
		//day1のクラス型変数を渡す（複製しています）
		Day day2 = new Day(day1);
		System.out.println("day2 = " + day2);

		//day1とday2が等しいか判定する
		if (day1.equalTo(day2)) {
			System.out.println("day1とday2は等しいです。");
		} else {
			System.out.println("day1とday2は等しくありません。");
		}

		//四つのDay型のインスタンスを生成
		//それぞれコンストラクタ①、②、③、④を呼び出す
		Day d1 = new Day();
		Day d2 = new Day(2017);
		Day d3 = new Day(2017, 10);
		Day d4 = new Day(2017, 10, 15);
		//呼び出した内容を出力する
		System.out.println("d1 = " + d1);
		System.out.println("d2 = " + d2);
		System.out.println("d3 = " + d3);
		System.out.println("d4 = " + d4);

		//Day型の配列を生成する
		//文字表現を確認する
		Day[] a = new Day[3];
		for (int i = 0; i < a.length; i++) {
			//全要素数を1年1月1日にする
			a[i] = new Day();
		}
		//全ての配列の値を出力する
		for (int i = 0; i < a.length; i++) {
			System.out.println("a[" + i + "] = " + a[i]);
		}
	}
}
