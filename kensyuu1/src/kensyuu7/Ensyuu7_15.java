//配列aの全要素の合計を求めるメソッドsumOfを作成せよ
//int sumOf(int[] a)

package kensyuu7;

import java.util.Scanner;

public class Ensyuu7_15 {

	//配列aの全要素の合計を求めるメソッドsumOfを作成
	//①intは返却型
	//②sumOfはメソッド名
	//③メソッドの本体は{}で囲む
	static int sumOf(int[] a) {

		//変数sumは引数で指定された配列aの全要素の合計を求める値を格納するために使用する変数
		//仮の値として0を代入する。
		int sum = 0;
		//受け取った引数の値の数まで繰り返し合計を右辺から左辺に加えてく
		for (int i = 0; i < a.length; i++) {
			sum += a[i];
		}
		//呼び出したint型の値(sum)を呼び出し元(sumOf)に返却する
		return sum;
	}

	//プログラムが実行されて起動するmainメソッドを作成
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		//要素数を入力してもらう
		System.out.print("要素数：");
		int element = stdIn.nextInt();

		//int型の配列変数Answerを作成
		//elementの値（要素数）だけ生成
		int[] Answer = new int[element];

		//各配列の要素毎に値を代入する
		for (int i = 0; i < element; i++) {
			System.out.print("a[" + i + "]:");
			Answer[i] = stdIn.nextInt();
		}

		//sumOfメソッドを呼び出す
		//仮引数int[] aは渡した実引数Answerによって初期化する
		//全要素の合計を出力
		System.out.println("全要素の合計は" + sumOf(Answer) + "です。");
	}
}
