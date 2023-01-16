//整数xのposビット目(最下位から0,1,2...と数える)を、１にした値を返すメソッドset,0にした値を返すメソッドreset,反転した値を返すメソッドinverseを作成さよ
//int set(int x, int pos)
//int reset(int x, int pos)
//int inverse(int x, int pos)
//すいません、今回は変数名xを使わせて下さい

package kensyuu7;

import java.util.Scanner;

public class Ensyuu7_13 {
	//--int型のビット構成を表示（P246）
	//回転前
	//第iビットが１であるかどうかを調べる
	static void printBits(int x) {
		for (int i = 31; i >= 0; i--) {
			System.out.print(((x >>> i & 1) == 1) ? '1' : '0');
		}
	}

	//１にした値を返すメソッドset
	//xとpのビット単位の論理和を求める（P240）
	static int set(int x, int pos) {
		return x | (1 << pos);
	}

	//0にした値を返すメソッド
	//pのビットを反転したものとxとのビット単位の論理積を求める（P240）
	static int reset(int x, int pos) {
		return x & -(1 << pos);
	}

	//反転した値を返すメソッド
	//xとpのビット単位の排他的論理和を求める（P240）
	static int inverse(int x, int pos) {
		return x ^ (1 << pos);
	}

	//プログラムが実行されて起動するmainメソッドを作成
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		//整数と求めるビット目の値を入力する
		System.out.println("整数xのposビット目を操作します");
		System.out.print("x : ");
		int x = stdIn.nextInt();
		System.out.print("pos : ");
		int pos = stdIn.nextInt();

		//それぞれのビット構成を表示する
		System.out.print("x　＝　");
		printBits(x);
		System.out.print("\nset(x,pos)　＝　");
		printBits(set(x, pos));
		System.out.print("\nreset(x,pos)　＝　");
		printBits(reset(x, pos));
		System.out.print("\ninverse(x,pos)　＝　");
		printBits(inverse(x, pos));
		System.out.println();
	}
}
