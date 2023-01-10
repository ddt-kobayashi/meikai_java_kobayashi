//4行３列の行列と3行４列の行列の積を求めるプログラムを作成
//各要素の値はキーボードから読み込むこと

package kensyuu6;

import java.util.Scanner;

public class Ensyuu6_16 {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int[][] queueA = new int[4][3]; //4行3列の行列
		int[][] queueB = new int[3][4]; //3行4列の行列
		int[][] queueC = new int[4][4]; //aとbを格納する行列

		//lineは行、columnは列
		//4行3列の行列の値を１つずつ代入する処理
		System.out.println("行列aの値をキーボードで入力");
		for (int line = 0; line < 4; line++) {
			for (int column = 0; column < 3; column++) {
				System.out.printf("a[%d][%d] : ", line, column);
				queueA[line][column] = stdIn.nextInt();
			}
		}

		//lineは行、columnは列
		//3行4列の行列の値を１つずつ代入する処理
		System.out.println("行列bの値をキーボードで入力");
		for (int line = 0; line < 3; line++) {
			for (int column = 0; column < 4; column++) {
				System.out.printf("b[%d][%d] : ", line, column);
				queueB[line][column] = stdIn.nextInt();
			}
		}

		//lineは行、columnは列
		//aとbを格納する行列の値を１つずつ計算処理（aとbの積を求める）する
		for (int line = 0; line < 4; line++) {
			for (int column = 0; column < 4; column++) {
				queueC[line][column] = 0;
				//definitionは３つの要素数までを求めたい為、追加しました
				for (int definition = 0; definition < 3; definition++) {
					queueC[line][column] += queueA[line][definition] * queueB[definition][column];
				}
			}
		}

		//lineは行、columnは列
		//35から44行目で処理をした結果を一つずつ出力（少なくとも５桁）する
		System.out.println("行列aとbの積");
		for (int line = 0; line < 4; line++) {
			for (int column = 0; column < 4; column++) {
				System.out.printf("%5d", queueC[line][column]);
				System.out.println();
			}
		}

	}
}
