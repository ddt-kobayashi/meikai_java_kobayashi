//月を1から12の数値として表示して、その英語表現を入力させる英単語学習プログラムを作成
//・出題する月の値は乱数で生成する
//・学習者が望む限り、何度も繰り返せる
//・同一月を連続して出題しない
//文字列s1とs2が等しい（全ての文字が等しい）かどうかの判定は、S1.equals(s2)によって行える

package kensyuu6;

import java.util.Random;
import java.util.Scanner;

public class Ensyuu6_14 {
	public static void main(String[] args) {
		Random rand = new Random();
		Scanner stdIn = new Scanner(System.in);

		//各要素のString型の値を配列として定義（英語の月）
		String[] monthEnglish = {
				"January", "February", "March", "April", "May", "June",
				"July", "August", "September", "October", "November", "December"
		};

		System.out.println("英語の月名を入力してください。");
		System.out.println("なお、先頭は大文字で、二文字目以降は小文字とします。");

		//再挑戦のための変数を定義
		int retry;

		//入力される値が１である間、繰り返し処理｛｝を行う
		do {
			//問題となる月の変数を定義
			//0から11の値をランダムで定義
			int month;
			month = rand.nextInt(12);

			//正解しない限り、繰り返し処理を行う
			while (true) {
				//1から12の月を出力される
				System.out.print((month + 1) + "月：");
				//答えを文字列（String型）で入力してもらう
				String answer = stdIn.next();
				//入力した値（英語の月）と配列monthEnglishの値を確認する
				//不一致であった場合繰り返し処理が行われる
				if (answer.equals(monthEnglish[month]))
					break;
				System.out.println("違います。");
			}
			//続けるか続けないかを入力する
			System.out.print("正解です。もう一度？ １…Yes／０…No：");
			retry = stdIn.nextInt();
		} while (retry == 1);
	}
}