//配列aの要素a[idx]にxを挿入するメソッドaryInsを作成せよ
//挿入に伴ってa[idx] ~ a[a.length - 2]を一つ後方にずらさなければならない。

package kensyuu7;

import java.util.Scanner;

public class Ensyuu7_20 {

	//配列aの要素a[idx]にxを挿入するメソッドaryInsを作成
	//①voidは値を返さないメソッドの返却型
	//②aryInsはメソッド名
	//③()内のint[] a, int idx, int xは仮引数
	//④メソッドの本体は{}で囲む
	static void aryIns(int[] a, int idx, int x) {
		//もし挿入するインデックスが０以上で配列の長さの範囲である場合
		if (idx >= 0 && idx < a.length) {
			//繰り返し配列末尾からインデックス挿入先まで最後の要素数の配列からその前の値を代入していく
			for (int i = a.length - 1; i > idx; i--) {
				a[i] = a[i - 1];
			}
			//最後に空いた挿入先に入れたい値を代入する
			a[idx] = x;
		}
	}

	//プログラムが実行されて起動するmainメソッドを作成
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		//要素数を入力してもらう
		System.out.print("要素数：");
		int element = stdIn.nextInt();
		//int型の配列変数aを作成
		//elementの値（要素数）だけ生成
		int[] a = new int[element];

		//各配列の要素毎に値を代入する
		for (int i = 0; i < element; i++) {
			System.out.print("a[" + i + "]:");
			a[i] = stdIn.nextInt();
		}

		//挿入するインデックスの値を入力してもらう
		System.out.print("挿入する要素のインデックス：");
		int idx = stdIn.nextInt();
		//挿入する要素の値を入力する
		System.out.print("挿入する値：");
		int idxPlus = stdIn.nextInt();

		//aryInsメソッドを呼び出して、要素数が含まれている配列変数とインデックスとなる値（挿入対象）と挿入する要素の個数をaryInsメソッドに渡す
		aryIns(a, idx, idxPlus);

		//結果を確認するため、各要素の値を出力する
		for (int i = 0; i < element; i++) {
			System.out.println("a[" + i + "]=" + a[i]);
		}
	}
}
