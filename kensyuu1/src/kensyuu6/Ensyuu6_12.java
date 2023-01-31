//配列の要素の並びをシャッフルする（ランダムな順となるようにかき混ぜる）プログラム
//List6-11を流用

package kensyuu6;

import java.util.Random;
import java.util.Scanner;

public class Ensyuu6_12 {

	public static void main(String[] args) {
		Random rand = new Random();
		Scanner stdIn = new Scanner(System.in);

		//要素数（n）を入力してもらう
		System.out.print("要素数：");
		int n = stdIn.nextInt();
		//int型の配列を宣言
		int[] a = new int[n];

		//各要素に値を代入する
		for (int i = 0; i < n; i++) {
			System.out.print("a[" + i + "] =");
			a[i] = stdIn.nextInt();
		}

		for (int i = 0; i < n / 2; i++) {
			//ランダムに要素数を二つ取り入れる
			int random1 = rand.nextInt(n);
			int random2 = rand.nextInt(n);
			//ランダムに取り入れた要素の値を交換する（シャッフルする）
			int t = a[random1];
			a[random1] = a[random2];
			a[random2] = t;
		}

		//要素数の数まで繰り返し、値を出力する
		System.out.println("配列の要素の並びをシャッフルしました。");
		for (int i = 0; i < n; i++) {
			System.out.println("a[" + i + "] =" + a[i]);
		}
	}

}
