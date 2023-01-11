/*List7-7に示したn個の'*'を連続表示するメソッドputStarsを、内部でList7-8のメソッドputChars
 を呼び出すことによって表示を行うように書き換えよ */
//List7-7,7-8を流用

package kensyuu7;

import java.util.Scanner;

public class Ensyuu7_7 {

	//直角三角形を表示するメソッドputCharsを作成
	//①voidは値を返さないメソッドの返却型
	//②putCharsはメソッド名
	//③()内のchar c,int nは仮引数
	//④メソッドの本体は{}で囲む
	static void putChars(char c, int n) {
		//nの値が０より大きい値である間はcの値を出力し続ける
		while (n-- > 0) {
			System.out.print(c);
		}
	}

	//メソッドputCharsを呼び出すputStarsメソッドを作成（問題に沿って対応しています）
	//①voidは値を返さないメソッドの返却型
	//②putStarsはメソッド名
	//③()内のint nは仮引数
	//④メソッドの本体は{}で囲む
	static void putStars(int n) {
		putChars('*', n);
	}

	//プログラムが実行されて起動するmainメソッドを作成
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		//出力したい直角三角形の段数を入力してもらう
		System.out.println("左下直角三角形の二等辺三角形を表示します。");
		System.out.print("段数は:");
		int n = stdIn.nextInt();

		//putStarsメソッドを呼び出す
		//仮引数int nは渡した実引数iによって初期化する
		//引数で指定された値だけ＊を表示する
		for (int i = 1; i <= n; i++) {
			putStars(i);
			System.out.println();
		}
	}
}
