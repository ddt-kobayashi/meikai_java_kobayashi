//読み込んだ値が１未満であれば改行文字を出力しないようにList4-7を書き換えたプログラム
//読み込んだ個数だけ＊を表示（その2）

package kensyuu4;

import java.util.Scanner;

public class ensyuu4_6_2 {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		System.out.println("何個＊を表示しますか：");
		int n = stdIn.nextInt();

		int i = 1;
		//キーボードから入力した値分、繰り返されるまで＊を出力する
		while (i <= n) {
			System.out.print('*');
			i++;
		}
		//もし読み込んだ値が１未満であれば改行文字を出力しない
		if (n >= 1) {
			System.out.println();
		}
	}
}