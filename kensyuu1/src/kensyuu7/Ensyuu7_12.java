//整数xを右にnビット回転した値を返すメソッドrRotateと、左にnビット回転した値を返すメソッドIRotateを作成せよ
//int rRotate(int x, int n)
//int IRotate(int x, int n)
//回転とは、最下位ビットと最上位ビットが繋がっているとみなしてシフトすること
//例えば右に５ビット回転した場合は、シフトによって弾き出されることになる下位５ビットを上位に持ってこなければならない

package kensyuu7;

import java.util.Scanner;

public class Ensyuu7_12 {

	//--int型のビット構成を表示（P246）
	//回転前
	//第iビットが１であるかどうかを調べる
	static void printBits(int x) {
		for (int i = 31; i >= 0; i--) {
			System.out.print(((x >>> i & 1) == 1) ? '1' : '0');
		}
	}

	//右回転
	static int rRotate(int x, int n) {
		//負の値が指定された場合の処理、左回転の処理を呼び出します
		if (n < 0) {
			return lRotate(x, -n);
		}
		//int型のビット数３２を超えた場合の調整
		//40ビットの場合,32（一回転）+8ビット回転のため
		n %= 32;
		//回転したビットを求める
		//nが０であれば回転は不要のため値を返却する
		//nが0でない場合、(x >>> n) | (x << (32 - n)を返却する
		return (n == 0 ? x : (x >>> n) | (x << (32 - n)));
	}

	//左回転
	static int lRotate(int x, int n) {
		//負の値が指定された場合の処理、右回転の処理を呼び出します
		if (n < 0) {
			return rRotate(x, -n);
		}
		//int型のビット数３２を超えた場合の調整
		//40ビットの場合,32（一回転）+8ビット回転のため
		n %= 32;
		//回転したビットを求める
		//nが０であれば回転は不要のため値を返却する
		//nが0でない場合、(x << n) | (x >>> (32 - n)を返却する
		return (n == 0 ? x : (x << n) | (x >>> (32 - n)));
	}

	//プログラムが実行されて起動するmainメソッドを作成
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		//整数とビット数をそれぞれ入力してもらう
		System.out.println("整数integerをbitビット回転します");
		System.out.print("integer : ");
		int integer = stdIn.nextInt();
		System.out.print("bit : ");
		int bit = stdIn.nextInt();

		//それぞれのメソッドを呼び出し、回転内容を確認する
		System.out.print("回転前　＝　");
		printBits(integer);
		System.out.print("\n右回転　＝　");
		printBits(rRotate(integer, bit));
		System.out.print("\n左回転　＝　");
		printBits(lRotate(integer, -bit));
		System.out.println();
	}
}
