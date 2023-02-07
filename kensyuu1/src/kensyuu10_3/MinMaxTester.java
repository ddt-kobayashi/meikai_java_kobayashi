//2値/3値/配列の最大値を求めるメソッドや最小値を求めるメソッドを集めたユーティリティクラスMinMaxを作成せよ

package kensyuu10_3;

import java.util.Scanner;

public class MinMaxTester {

	//プログラムが実行されて起動するmainメソッドを作成
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		//x,y,zの値を入力してもらう
		System.out.print("xの値：");
		int x = stdIn.nextInt();
		System.out.print("yの値：");
		int y = stdIn.nextInt();
		System.out.print("zの値：");
		int z = stdIn.nextInt();
		//配列aの要素数を入力してもらう
		System.out.print("配列aの要素数：");
		int num = stdIn.nextInt();
		//入力してもらった数だけ、要素数を生成
		int[] a = new int[num];
		//要素ごとに値を入力し、代入する
		for(int i = 0; i < num; i++) {
			System.out.print("a[" + i + "]：");
			a[i] = stdIn.nextInt();
		}
		
		//MinMaxクラスの各メソッドに値を渡し、それぞれの最大値最小値を出力する
		System.out.println("xyの最小値は" + MinMax.min(x,y) + "です。");
		System.out.println("xyの最大値は" + MinMax.max(x,y) + "です。");
		System.out.println("xyzの最小値は" + MinMax.min(x,y,z) + "です。");
		System.out.println("xyzの最大値は" + MinMax.max(x,y,z) + "です。");
		
		//配列aの最小の値を出力する
		//最小のインデックスを出力する
		System.out.println("配列aの最小値は" + MinMax.min(a) + "です。");
		int xmin[] = MinMax.minIndexArray(a);
		System.out.print("そのインデックスは{ ");
		for(int i = 0; i < xmin.length; i++) {
			System.out.print(xmin[i] + " ");
		}
		System.out.println("}です。");
		
		//配列aの最大の値を出力する
		//最大のインデックスを出力する
		System.out.println("配列aの最大値は" + MinMax.max(a) + "です。");
		int xmax[] = MinMax.maxIndexArray(a);
		System.out.print("そのインデックスは{ ");
		for(int i = 0; i < xmax.length; i++) {
			System.out.print(xmax[i] + " ");
		}
		System.out.println("}です。");
	}
}
