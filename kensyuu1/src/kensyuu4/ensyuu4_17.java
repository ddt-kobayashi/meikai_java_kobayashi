//読み込んだ整数値の全ての約数を表示するプログラム
//約数の表示が終わった後に約数の個数を表示する
//List4-13を流用

package kensyuu4;

import java.util.Scanner;

public class ensyuu4_17 {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		int n;
		//キーボードから値を入力してもらう、それをnに代入する
		//正の整数値（０より上の値）を入力するまで繰り返し処理を行う
		//変更式がない為、ここはfor文にしない
		do {
			System.out.print("整数値：");
			n = stdIn.nextInt();
		} while (n <= 0);

		//処理回数を確認したい為、count変数を定義する
		int count = 0;

		//int型の変数iの値はスタート地点の整数値を意味して1として定義する（初期値）
		//入力値の値がi以上である場合、総和を求め続ける（条件式）
		/*iは処理を行うたびにインクリメントする（変更式）
		//上記の条件式と変更式が成立する度に繰り返し全ての約数を表示し、
		個数をカウントする処理を行う*/
		for (int i = 1; i <= n; i++) {
			/*入力値を初期値で割った余りが０以下の場合、その初期値の値（約数）
			を出力し、変数countをインクリメントする（約数の数をカウントする）*/
			if (n % i <= 0) {
				System.out.println(i);
				count++;
			}
		}
		//約数の表示が終わった後に約数の個数を表示する
		System.out.println("約数は" + count + "個です。");
	}
}
