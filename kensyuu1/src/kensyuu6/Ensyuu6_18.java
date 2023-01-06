//行数・各行の列数・各要素の値をキーボードから読み込むようにList6-18を書き換えたプログラムを作成
//List6-18を流用

package kensyuu6;

import java.util.Scanner;

public class Ensyuu6_18 {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		//行数を入力してもらう
		System.out.print("行数を入力:");
		int line = stdIn.nextInt();
		//入力していただいた数だけ「int型を構成要素型とする配列」を構成要素型とする配列を宣言（行数）
		int[][] c = new int[line][];

		//各行ごとの列数を入力してもらう
		for (int i = 0; i < c.length; i++) {
			System.out.print(i + "行目の列数を入力:");
			int column = stdIn.nextInt();
			c[i] = new int[column];
		}

		//各要素の値を入力してもらう
		System.out.println("各要素の値を入力");
		for (int i = 0; i < c.length; i++) {
			for (int j = 0; j < c[i].length; j++) {
				//各要素をここで出力
				System.out.printf("c[%d][%d]:", i, j);
				//各要素の値を入力
				c[i][j] = stdIn.nextInt();
			}
		}

		//配列cの各要素の値を出力する
		System.out.println("配列cの各要素の値を出力します");
		for (int i = 0; i < c.length; i++) {
			for (int j = 0; j < c[i].length; j++) {
				//各要素の値はここで出力
				System.out.printf("%3d", c[i][j]);
			}
			System.out.println();
		}
	}
}
