//List6-9は探索するキー値と同じ値の要素が複数存在する場合、最も先頭に位置する要素を見つけるプログラムである
//今回は最も末尾側に位置する要素を見つけるプログラムを作成
//List6-9を流用

package kensyuu6;

import java.util.Random;
import java.util.Scanner;

public class ensyuu6_7 {
	public static void main(String[] args) {
		Random rand = new Random();
		Scanner stdIn = new Scanner(System.in);

		//再代入しないためにfinal変数を使用
		final int n = 12;
		//構成要素型がint型で構成要素数は12（n）
		int[] a = new int[n];
		//要素数の値までを０から１つずつ生成する
		//代入する値は１から10のランダム
		for (int j = 0; j < n; j++) {
			a[j] = rand.nextInt(10);
		}

		//全ての要素の値を出力する
		System.out.print("配列aの全要素の値\n{");
		for (int j = 0; j < n; j++) {
			System.out.print(a[j] + " ");
		}
		System.out.println("}");

		//探したい要素の値をキー値として入力してもらう
		System.out.println("探す数値：");
		int key = stdIn.nextInt();

		//キー値と要素の値が一致するまで処理を続ける
		//この際、要素数は末尾から処理する流れとする
		int i;
		for (i = n - 1; i >= 0; i--) {
			if (a[i] == key) {
				break;
			}
		}
		//キー値と要素の値が一致した値を出力する
		if (i >= 0) {
			System.out.println("それはa[" + i + "]にあります。");
		} else {
			System.out.println("それはありません。");
		}
	}
}
