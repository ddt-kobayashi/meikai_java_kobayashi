//配列aの要素の中で値がxである全要素のインデックスを先頭から順に格納した配列を返却するメソッドarrayySrchIdxを作成せよ

package kensyuu7;

import java.util.Scanner;

public class Ensyuu7_23 {
	//配列aの要素の中で値がxである全要素のインデックスを先頭から順に格納した配列を返却するメソッドarrayySrchIdx
	//①intは返却型
	//②arrayySrchIdxはメソッド名
	//③()内のint[] a, int xは仮引数
	//④メソッドの本体は{}で囲む
	static int[] arrayySrchIdx(int[] a, int x) {
		//countは求める配列を探索するための変数（0で初期化）
		int count = 0;
		//求める配列を探索するため、a配列の長さまで繰り返し処理を行う
		for (int i = 0; i < a.length; i++) {
			//値がxである要素の個数を調べてcountに代入していく
			if (a[i] == x) {
				count++;
			}
		}

		//int型の配列変数cを作成
		//count個の配列を作成（そのためすぐデクリメントさせています）
		int[] answer = new int[count--];
		//繰り返し同じ値の配列を探索し、配列cへの値を格納する
		for (int i = a.length - 1; count >= 0; i--) {
			if (a[i] == x) {
				answer[count--] = i;
			}
		}
		//配列変数answerの値を呼び出し元(arrayySrchIdx()に返却する
		return answer;
	}

	//プログラムが実行されて起動するmainメソッドを作成
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		//要素数を入力してもらう
		System.out.print("要素数：");
		int element = stdIn.nextInt();

		//int型の配列変数aを作成
		//elementの値（要素数）だけ生成
		int[] array = new int[element];

		//各配列arrayの要素毎に値を代入する
		for (int i = 0; i < element; i++) {
			System.out.print("x[" + i + "]:");
			array[i] = stdIn.nextInt();
		}

		//探索する値を入力してもらう
		System.out.print("探索する値：");
		int search = stdIn.nextInt();

		//一致する配列の値として配列変数matchを作成
		//この際にarrayySrchIdxメソッドを呼び出し、配列変数arrayと変数searchを渡す
		int[] match = arrayySrchIdx(array, search);

		//matchの配列の長さが０である場合、一致する要素はない
		if (match.length == 0) {
			System.out.println("一致する要素はありません");
		}
		//繰り返し一致する要素のインデックスを出力する
		else {
			System.out.println("一致する要素のインデックス");
			for (int i = 0; i < match.length; i++) {
				System.out.println(match[i]);
			}
		}
	}
}
