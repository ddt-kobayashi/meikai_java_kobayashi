//２次元配列aと同じ配列（要素数が同じで、全ての要素の値が同じ配列）を生成して返却するメソッドarrayClone2を作成せよ

package kensyuu7;

import java.util.Scanner;

public class Ensyuu7_29 {
	//２次元配列aと同じ配列（要素数が同じで、全ての要素の値が同じ配列）を生成して返却するメソッド
	//①intは返却型
	//②arrayClone2はメソッド名
	//③()内のint[][] aは仮引数
	//④メソッドの本体は{}で囲む
	static int[][] aryClone2(int[][] a) {

		//２次元配列aと同じ配列（要素数が同じで、全ての要素の値が同じ配列）を格納するための配列answerを作成
		int[][] answer = new int[a.length][];

		//受け取った行数分answerの行を生成する
		for (int i = 0; i < a.length; i++) {
			answer[i] = new int[a[i].length];

			//各要素を全て複製する
			for (int j = 0; j < a.length; j++) {
				answer[i][j] = a[i][j];
			}
		}
		//配列answerの値をaryClone2メソッドに返却する
		return answer;
	}

	//List7-20を参考に記載しています（P258）
	//行列の全要素を表示
	//①voidは戻り値のない型
	//②printMatrixはメソッド名
	//③()内のint[][] allは仮引数
	//④メソッドの本体は{}で囲む
	static void printMatrix(int[][] m) {
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[i].length; j++) {
				System.out.print(m[i][j] + " ");
				System.out.println();
			}
		}
	}

	//プログラムが実行されて起動するmainメソッドを作成
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		//行数と列数をそれぞれ入力してもらう
		//height　高さ
		//width　横幅
		System.out.print("行数の行数；");
		int height = stdIn.nextInt();
		System.out.print("行数の列数：");
		int weight = stdIn.nextInt();

		//int型の配列変数aを作成
		//２次元配列を作成、height　高さ、height　高さ
		int[][] a = new int[height][weight];

		//各二次元配列aの要素の値を全て入力する
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				System.out.printf("a[%d][%d]", i, j);
				a[i][j] = stdIn.nextInt();
			}
		}

		//int型の配列変数cloneを作成
		//これはメソッド処理後を格納するために作る配列変数
		int[][] clone = aryClone2(a);
		//行列aの全要素を表示する
		//printMatrixメソッドを呼び出し、a配列を渡す
		System.out.println("行列a");
		printMatrix(a);
		//行列cloneの全要素を表示する
		//printMatrixメソッドを呼び出し、clone配列を渡す
		System.out.println("行列aの複製");
		printMatrix(clone);
	}
}
