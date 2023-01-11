//受け取ったint型の値nが負であれば-1を返却し、0であれば0を返却し、正であれば１を返却するメソッドsignOfを作成せよ
//int signOf(int n)

package kensyuu7;

import java.util.Scanner;

public class Ensyuu7_1 {
	//正負判定をするメソッドsignOfを作成
	//①intは返却型
	//②signOfはメソッド名
	//③()内のint nは仮引数
	//④メソッドの本体は{}で囲む
	static int signOf(int n) {
		//最小値を求めるために変数signを定義
		//整数0入力した際は0のまま値を返す仕組みとなります。
		int sign = 0;
		//もし受け取ったint型の値nが負であれば-1を返却する
		if (n < 0) {
			sign = -1;
		}
		//もし受け取ったint型の値nが正であれば１を返却する
		else if (n > 0) {
			sign = 1;
		}
		//呼び出したint型の値(sign)を呼び出し元(signOf)に返却する
		return sign;
	}

	//プログラムが実行されて起動するmainメソッドを作成
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		//整数を入力してもらう
		System.out.print("整数：");
		int integer = stdIn.nextInt();

		//signOfメソッドを呼び出す
		//仮引数int nは渡した実引数integerによって初期化する
		//最後に受け取ったint型nの値（正負判定）を出力する
		System.out.println("受け取ったint型nの値は「 " + signOf(integer) + " 」");
	}
}
