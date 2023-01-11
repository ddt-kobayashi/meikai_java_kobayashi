//三つのint型引数a,b,cの最小値を求めるメソッドminを作成
//int min(int a, int b, int c)

package kensyuu7;

import java.util.Scanner;

public class Ensyuu7_2 {
	//最小値を求めるメソッドminを作成
	//①intは返却型
	//②minはメソッド名
	//③()内のint a,b,c,は仮引数(仮引数並び)
	//④メソッドの本体は{}で囲む
	//今回はメソッド名と変数名を同じ名前にしてみます
	//メソッドと変数は種類が異なる為、衝突しないのを確認
	static int min(int a, int b, int c) {
		//変数minは引数で指定された3つの整数の最小値を格納するために使用する変数
		//仮の最小値として引数aを代入する。
		int min = a;
		//もし変数aよりbの方が低い場合はbを最小値とする
		if (b < min) {
			min = b;
		}
		//もし変数aまたはbよりcの方が低い場合はcを最小値とする
		else if (c < min) {
			min = c;
		}
		//呼び出したint型の値(min)を呼び出し元(min)に返却する
		return min;
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

		//minメソッドを呼び出す
		//仮引数int a,b,cは渡した実引数integerA,integerB,integerCによって初期化する
		//最後に最小値の値を出力する
		System.out.println("最小値は「 " + min(integerA, integerB, integerC) + " 」");
	}
}
