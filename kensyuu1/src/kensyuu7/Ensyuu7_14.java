//整数xのposビット目を最下位として連続するn個のビットを、1にした値を返すメソッドsetN
//0にした値を返すメソッドresetN,反転した値を返すメソッドinverseNを作成せよ

package kensyuu7;

import java.util.Scanner;

public class Ensyuu7_14 {

	//--int型のビット構成を表示（P246）
	//回転前
	//第iビットが１であるかどうかを調べる
	static void printBits(int x) {
		for (int i = 31; i >= 0; i--) {
			System.out.print(((x >>> i & 1) == 1) ? '1' : '0');
		}
	}

	//連続するn個のビットを、1にした値を返すメソッドsetN
	static int setN(int x, int pos, int n) {
		return x | (~(~0 << n) << pos);
	}

	//0にした値を返すメソッドresetN
	static int resetN(int x, int pos, int n) {
		return x & ~(~(~0 << n) << pos);
	}

	//反転した値を返すメソッドinverseN
	static int inverseN(int x, int pos, int n) {
		return x ^ (~(~0 << n) << pos);
	}

	//プログラムが実行されて起動するmainメソッドを作成
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		//整数と求めるビット目からn個のビットの値をそれぞれ入力する
		System.out.println("整数xのposビット目からn個のビットを操作します");
		System.out.print("x : ");
		int x = stdIn.nextInt();
		System.out.print("pos : ");
		int pos = stdIn.nextInt();
		System.out.print("n : ");
		int n = stdIn.nextInt();

		//それぞれのビット構成を表示する
		System.out.print("x　＝　");
		printBits(x);
		System.out.print("\nset(x,pos)　＝　");
		printBits(setN(x, pos, n));
		System.out.print("\nreset(x,pos)　＝　");
		printBits(resetN(x, pos, n));
		System.out.print("\ninverse(x,pos)　＝　");
		printBits(inverseN(x, pos, n));
		System.out.println();
	}

}
