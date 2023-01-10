//「こんにちは。」と表示して改行するメソッドhelloを作成せよ
//void hello()

package kensyuu7;

public class Ensyuu7_5 {
	//「こんにちは。」と表示して改行するメソッドhelloを作成
	//①voidは値を返さないメソッドの返却型
	//②helloはメソッド名
	//③メソッドの本体は{}で囲む
	static void hello() {
		//こんにちは。と出力する
		System.out.println("こんにちは");
	}

	//プログラムが実行されて起動するmainメソッドを作成
	public static void main(String[] args) {
		//改行されているか簡単に可視化できるように二回メソッドを呼び出しています
		hello();
		hello();
	}
}
