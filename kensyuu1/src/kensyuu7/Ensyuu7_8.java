//a以上b未満の乱数を生成して、その値を返却するメソッドrandomを作成せよ
//内部で乱数を生成する標準ライブラリ（P45）を呼び出すこと。
//int random(int a, int b)
//なお、bの値がaより小さい場合には、aの値をそのまま返却すること

package kensyuu7;

import java.util.Random;
import java.util.Scanner;

public class Ensyuu7_8 {

	//a以上b未満の乱数を生成して、その値を返却するメソッドrandomを作成
	//①intは返却型
	//②randomはメソッド名
	//③()内のint a, int bは仮引数
	//④メソッドの本体は{}で囲む
	static int random(int a, int b) {
		//問題文に従い、bの値がaより小さい場合には、aの値をそのまま返却します
		if (b < a) {
			return a;
		}
		//bの値がaより大きい場合は、a以上b未満の範囲で乱数を生成する
		else {
			Random rand = new Random();
			//正確にはaにb-aの差分の範囲の乱数を加えるイメージです
			//呼び出した処理後の値を呼び出し元(Random)に返却する
			return a + rand.nextInt(b - a);
		}
	}

	//プログラムが実行されて起動するmainメソッドを作成
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		//a以上b未満の乱数を生成する為、下限値と上限値をそれぞれ入力してもらう
		System.out.print("下限値:");
		int min = stdIn.nextInt();
		System.out.print("上限値:");
		int max = stdIn.nextInt();

		//randomメソッドを呼び出す
		//仮引数int a,bは渡した実引数min,maxによって初期化する
		//a以上b未満の範囲の乱数の値を出力する
		System.out.println("生成した乱数は「　" + random(min, max) + "　」");
	}

}
