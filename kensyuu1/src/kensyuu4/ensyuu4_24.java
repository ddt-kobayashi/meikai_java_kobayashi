//正の整数値を読み込み、それが素数であるか判定するプログラムを作成
//素数とは2以上n未満のいずれの数でも割り切ることのできない整数nのこと

package kensyuu4;

import java.util.Scanner;

public class ensyuu4_24 {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		//問題文に従い変数はnとさせていただきます
		int n;
		//キーボードから値を入力してもらう、それをnに代入する
		//正の整数値（1より上の値）を入力するまで繰り返し処理を行う
		//素数を判定する問題である為、今回は１より上を出力する
		//変更式がない為、ここはfor文にしない
		do {
			System.out.print("整数値：");
			n = stdIn.nextInt();
		} while (n <= 1);

		//int型の変数iの値は判定のスタート地点の整数値を意味して2として定義する（初期値）
		//入力値の値がi以上である場合、素数判定を求め続ける（条件式）
		//iは処理を行うたびにインクリメントする（変更式）
		for (int i = 2; i <= n; i++) {
			//素数判定の為の条件分岐(問題文通り)
			//初期値の値が入力値の値以上になるまで行う
			if (i >= n) {
				System.out.println("素数である");
			//または２か３（処理を続けた際のiの値）で割り切れるまで行う（素数の意味検索してください）
			//下記の処理で２、３で割り切れる数(素数)であるか確認できる
			} else if (n % i == 0) {
				System.out.println("素数ではない");
				break;
			}
		}
	}
}