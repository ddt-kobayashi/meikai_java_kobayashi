//行列xとyの和を格納した２次元配列を返すメソッドを作成せよ（行数及び列数が同一の配列をxとyに受け取ることを前提としてよい）

package kensyuu7;

import java.util.Scanner;

public class Ensyuu7_28 {
	//行列xとyの和を格納した２次元配列を返すメソッドを作成
	//①intは返却型
	//②addMatrixはメソッド名
	//③()内のint[][] x, int[][] yは仮引数
	//④メソッドの本体は{}で囲む
	static int[][] addMatrix(int[][] x, int[][] y) {

		//行列xとyの和を格納するための配列answerを作成
		int[][] answer = new int[x.length][];

		//受け取った行数分answerの行を生成する
		for (int i = 0; i < x.length; i++) {
			answer[i] = new int[x[i].length];

			//各それぞれの行列xとyの和を全て合わせてanswerの配列に格納する
			for (int j = 0; j < x[i].length; j++) {
				answer[i][j] = x[i][j] + y[i][j];
			}
		}
		//配列answerの値をaddMatrixメソッドに返却する
		return answer;
	}

	//List7-20を参考に記載しています（P258）
	//行列の全要素を表示
	//①voidは戻り値のない型
	//②printMatrixはメソッド名
	//③()内のint[][] allは仮引数
	//④メソッドの本体は{}で囲む
	static void printMatrix(int[][] all) {
		for (int i = 0; i < all.length; i++) {
			for (int j = 0; j < all[i].length; j++) {
				System.out.print(all[i][j] + " ");
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
		int width = stdIn.nextInt();

		//int型の配列変数xを作成
		//２次元配列を作成、height　高さ、height　高さ
		int[][] x = new int[height][width];
		//int型の配列変数yを作成
		//２次元配列を作成、height　高さ、height　高さ
		int[][] y = new int[height][width];

		//各二次元配列xの要素の値を全て入力する
		for (int i = 0; i < x.length; i++) {
			for (int j = 0; j < x[i].length; j++) {
				System.out.printf("a[%d][%d] : ", i, j);
				x[i][j] = stdIn.nextInt();
			}
		}

		//各二次元配列yの要素の値を全て入力する
		for (int i = 0; i < y.length; i++) {
			for (int j = 0; j < y[i].length; j++) {
				System.out.printf("b[%d][%d] : ", i, j);
				y[i][j] = stdIn.nextInt();
			}
		}

		//int型の配列変数cを作成
		//これはメソッド処理後を格納するために作る配列変数
		int[][] after = addMatrix(x, y);

		//行列xを出力するこの際、printMatrixメソッドを呼び出し、配列変数aを渡す
		System.out.println("行列x");
		printMatrix(x);
		//行列yを出力するこの際、printMatrixメソッドを呼び出し、配列変数bを渡す
		System.out.println("\n行列y");
		printMatrix(y);
		//行列afterを出力するこの際、printMatrixメソッドを呼び出し、配列変数cを渡す
		System.out.println("\n行列after");
		printMatrix(after);
	}
}
