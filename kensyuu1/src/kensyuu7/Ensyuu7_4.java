//1からnまでの全整数の和を求めて返却するメソッドを作成
//int sumUp(int n)

package kensyuu7;

import java.util.Scanner;

public class Ensyuu7_4 {
	//1からnまでの全整数の和を求めて返却するメソッドsumUpを作成
	//①intは返却型
	//②sumUpはメソッド名
	//③()内のint nは仮引数
	//④メソッドの本体は{}で囲む
	static int sumUp(int n) {
		//全整数の和を求めるに伴い最初はtotalの値は0を代入する
		int total = 0;

		//渡された実引数integerの値まで繰り返し処理を行う
		for (int i = 1; i <= n; i++) {
			//totalに繰り返しiの値が加わる
			total += i;
		}
		//呼び出したint型の値(total)を呼び出し元(sumUp)に返却する
		return total;
	}

	//プログラムが実行されて起動するmainメソッドを作成
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		//整数を入力してもらう
		System.out.print("整数：");
		int integer = stdIn.nextInt();

		//sumUpメソッドを呼び出す
		//仮引数int nは渡した実引数integerによって初期化する
		//1からnまでの全整数の和の値を出力する
		System.out.println("1からnまでの全整数の和は「 " + sumUp(integer) + " 」");
	}
}
