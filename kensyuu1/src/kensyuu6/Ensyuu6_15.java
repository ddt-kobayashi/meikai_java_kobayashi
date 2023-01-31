//曜日を表示して、その英語表現を入力させる英単語学習プログラムを作成
//・出題する曜日は乱数で生成する
//・学習者が望む限り、何度も繰り返せる
//・同一月を連続して出題しない

package kensyuu6;

import java.util.Random;
import java.util.Scanner;

public class Ensyuu6_15 {
	public static void main(String[] args) {
		Random rand = new Random();
		Scanner stdIn = new Scanner(System.in);

		//各要素のString型の値を配列として定義（英語の曜日）
		String[] weekEnglish = {
				"sunday", "monday", "tuesday", "wednesday", "thursday", "friday","saturday"
		};

		System.out.println("英語の曜日名を小文字で入力してください。");

		//再挑戦のための変数を定義
		int retry;

		//入力される値が１である間、繰り返し処理｛｝を行う
		do {
			//各要素のString型の値を定義（日本語の曜日）
			String[] weekJapan = {
					"日曜日", "月曜日", "火曜日", "水曜日", "木曜日", "金曜日","土曜日"
			};
			//問題となる月の変数を定義
			//0から6の値をランダムで定義
			int week;
			week = rand.nextInt(7);

			//正解しない限り、繰り返し処理を行う
			while (true) {
				//日曜から土曜日の曜日が出力される
				System.out.print(weekJapan[week] + " : ");
				//答えを文字列（String型）で入力してもらう
				String answer = stdIn.next();
				//入力した値（英語の曜日）と配列weekEnglishの値を確認する
				//不一致であった場合繰り返し処理が行われる
				if (answer.equals(weekEnglish[week]))
					break;
				System.out.println("違います。");
			}
			//続けるか続けないかを入力する
			System.out.print("正解です。もう一度？ １…Yes／０…No：");
			retry = stdIn.nextInt();
		} while (retry == 1);
	}
}