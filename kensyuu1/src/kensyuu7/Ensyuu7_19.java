//配列aから要素a[idx]を先頭とするn個の要素を削除するメソッドaryRmvNを作成せよ
//削除はa[idx]より後ろの全要素をn個前方にずらすことによって行うこと。
//なお移動されずに余ってしまう要素の値は変更しなくてよい。

package kensyuu7;

import java.util.Scanner;

public class Ensyuu7_19 {

	//配列aから要素a[idx]を先頭とするn個の要素を削除するメソッドaryRmvNを作成
	//①voidは値を返さないメソッドの返却型
	//②aryRmvNはメソッド名
	//③()内のint[] a, int idx, int nは仮引数
	//④メソッドの本体は{}で囲む
	static void aryRmvN(int[] a, int idx, int n) {
		//もし削除希望の要素の個数とインデックス(削除対象)の値が０以上かつ対象削除範囲がその長さまでである場合
		if (n > 0 && idx >= 0 && idx + n < a.length) {
			//開始から削除の範囲までを定義するため、変数notIdxを作成
			int notIdx = idx + n - 1;
			//インデックスより後ろに長さがない場合
			//a.length - n - 1は要素を削除想定した場合の長さを意味しています
			if (notIdx > a.length - n - 1) {
				//開始から削除の範囲は要素を削除想定した場合の長さとなる
				notIdx = a.length - n - 1;
			}
			//受け取った削除希望のインデックスの値から順番に削除する要素の個数だけ行う
			//繰り返しインデックスの値はその後ろのインデックスへと上書きしていく
			for (int i = idx; i <= notIdx; i++) {
				a[i] = a[i + n];
			}
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

		//削除する要素のインデックスを入力してもらう
		System.out.println("削除する開始のインデックス：");
		int delete = stdIn.nextInt();
		//削除する要素の個数を入力してもらう
		System.out.println("削除する要素の個数：");
		int deleteElement = stdIn.nextInt();

		//aryRmvNメソッドを呼び出して、要素数が含まれている配列変数とインデックスとなる値（削除対象）と削除する要素の個数をaryRmvNメソッドに渡す
		aryRmvN(a, delete, deleteElement);

		//削除結果を確認するため、各要素の値を出力する
		for (int i = 0; i < element; i++) {
			System.out.println("a[" + i + "]=" + a[i]);
		}
	}

}
