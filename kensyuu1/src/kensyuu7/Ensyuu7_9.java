//「正の整数値：」と表示してキーボードから正の整数値を読み込んで、その値を返却するメソッドrealPlusIntを作成せよ。
//0や負の値が入力されたら再入力させること
//int readPlusInt()

package kensyuu7;

import java.util.Scanner;

public class Ensyuu7_9 {
	static Scanner stdIn = new Scanner(System.in);

	//「正の整数値：」と表示してキーボードから正の整数値を読み込んで、その値を返却するメソッドrealPlusIntを作成
	//①intは返却型
	//②readPlusIntはメソッド名
	//③メソッドの本体は{}で囲む
	static int readPlusInt() {
		int integer;
		//０より大きい整数値を入力してもらう（正の整数値）
		do {
			System.out.print("正の整数値：");
			integer = stdIn.nextInt();
		} while (integer <= 0);
		//呼び出したint型の値(integer)を呼び出し元(readPlusInt)に返却する
		return integer;
	}

	//プログラムが実行されて起動するmainメソッドを作成
	public static void main(String[] args) {

		//readPlusIntメソッドを呼び出す
		//問題の例の通りではないが出力結果を確認したい為、下記の処理を記載しています
		System.out.print("受け取った正の整数値は「" + readPlusInt() + "」です。");

	}
}
