//三つのint型引数a,b,cの中央値を求めるメソッドmedを作成
//int med(int a, int b, int c)

package kensyuu7;

import java.util.Scanner;

public class Ensyuu7_3 {
	//中央値を求めるメソッドmedを作成
	//①intは返却型
	//②medはメソッド名
	//③()内のint a,b,c,は仮引数(仮引数並び)
	//④メソッドの本体は{}で囲む
	static int med(int a, int b, int c) {
		//もしaの値がb以上である場合
		if (a > b) {
			//もしbの値がa以下c以上である場合(a > b > c)
			if (b > c) {
				//呼び出したint型の値(b)を呼び出し元(med)に返却する
				return b;
			}
			//もしaの値がb以上c以下である場合(c > a > b)
			else if (a < c) {
				//呼び出したint型の値(a)を呼び出し元(med)に返却する
				return a;
				//もしcの値がb以上a以下である場合(a > c > c)
			} else {
				//呼び出したint型の値(c)を呼び出し元(med)に返却する
				return c;
			}
		}
		//もしaの値がb以下cより大きい場合(b > a > c)
		else if (a > c) {
			//呼び出したint型の値(a)を呼び出し元(med)に返却する
			return a;
		}
		//もしcの値がb以下aより大きい場合(b > c > a)
		else if (b > c) {
			//呼び出したint型の値(c)を呼び出し元(med)に返却する
			return c;
		}
		//もしbの値がc以下aより大きい場合(c > b > a)
		else {
			//呼び出したint型の値(b)を呼び出し元(med)に返却する
			return b;
		}
	}

	//プログラムが実行されて起動するmainメソッドを作成
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		//整数a,b,cをそれぞれ入力してもらう
		System.out.print("整数a：");
		int integerA = stdIn.nextInt();
		System.out.print("整数b：");
		int integerB = stdIn.nextInt();
		System.out.print("整数c：");
		int integerC = stdIn.nextInt();

		//medメソッドを呼び出す
		//仮引数int a,b,cは渡した実引数integerA,integerB,integerCによって初期化する
		//最後に中央値の値を出力する
		System.out.println("中央値は「 " + med(integerA, integerB, integerC) + " 」");
	}
}
