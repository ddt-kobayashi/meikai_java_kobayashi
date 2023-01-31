//配列aの全要素を配列bに対して逆順にコピーするプログラムを作成
//二つの配列の要素数は同一であると仮定してよい
//List6-13を流用

package kensyuu6;

import java.util.Scanner;

public class Ensyuu6_13 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		//要素数（n）を入力してもらう
		System.out.print("要素数：");
		int n = stdIn.nextInt();
		//int型の配列を宣言
		int[] a = new int[n];
		int[] b = new int[n];

		//各要素(a)に値を代入する
		for (int i = 0; i < n; i++) {
			System.out.print("a[" + i + "] =");
			a[i] = stdIn.nextInt();
		}

		//各要素(b)に各要素(a)の値を逆順に代入する
		//配列は、繰り返し文により逐一コピーする（P202）
		//List6-11の方法を参考
		//ex)要素数4の場合はa[3]から降順に処理されるイメージ
		for (int i = 0; i < n; i++) {
			b[i] = a[n - i - 1];
		}

		System.out.println("aの全要素をbに逆順にコピーしました。");

		//各要素(b)の値を出力する
		for (int i = 0; i < n; i++) {
			System.out.println("b[" + i + "] = " + b[i]);
		}
	}
}
