//double型の配列の全要素の合計値と平均値を求めるプログラムを作成
//要素数と全要素の値はキーボードから読み込むこと

package kensyuu6;

import java.util.Scanner;

public class ensyuu6_8 {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		//要素数を入力してもらう
		System.out.print("要素数：");
		int ElementCount = stdIn.nextInt();

		//構成要素型がdouble型で構成要素数は入力値（ElementCount）
		double[] array = new double[ElementCount];
		//全ての配列の要素数の値を入力して取得する
		//array.lengthにて配列の要素数（長さ）を取得
		for (int i = 0; i < array.length; i++) {
			System.out.print("要素[" + i + "] = ");
			array[i] = stdIn.nextDouble();
		}

		//これはきれいに見せる為のただの改行です
		System.out.println();

		//配列arrayの先頭から末尾までの全要素を一個ずつ走査する（拡張For文）
		//sumは合計値
		double sum = 0;
		for (double i : array) {
			sum += i;
		}
		//合計点と平均点を出力（小数点以下は一桁までとする）
		double average = sum / ElementCount;
		System.out.printf("合計：%.1f\n", sum);
		System.out.printf("平均：%.1f\n", average);
	}
}
