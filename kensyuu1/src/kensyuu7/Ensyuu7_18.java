//配列aから要素a[idx]を削除するメソッドaryRmvを作成せよ
//削除はa[idx]より後ろの全要素を一つ前方にずらすことによって行うこと。
//なお移動されずに余ってしまう末尾要素[a.length - 1]の値は変更しなくてよい。
//今回は変数名と引数名は同じ名前とさせて下さい

package kensyuu7;

import java.util.Scanner;

public class Ensyuu7_18 {

	//配列aから要素a[idx]を削除するメソッドaryRmvを作成
	//①voidは値を返さないメソッドの返却型
	//②aryRmvはメソッド名
	//③()内のint[] a, int idxは仮引数
	//④メソッドの本体は{}で囲む
	static void aryRmv(int[] a, int idx) {

		//もしインデックスの値が０以上かつその長さまでである場合
		if (idx >= 0 && idx < a.length) {
			//繰り返しインデックスの値はその後ろのインデックスへと上書きしていく
			for (int i = idx; i < a.length - 1; i++) {
				a[i] = a[i + 1];
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
		System.out.println("削除する要素のインデックス：");
		int delete = stdIn.nextInt();

		//aryRmvメソッドを呼び出して、要素数が含まれている配列変数とインデックスとなる値（削除対象）をaryRmvメソッドに渡す
		aryRmv(a, delete);

		//削除結果を確認するため、各要素の値を出力する
		for (int i = 0; i < element; i++) {
			System.out.println("a[" + i + "]=" + a[i]);
		}
	}

}
