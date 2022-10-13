//List3-5が繰り返し何度でも利用できるプログラム
//今回は変数nを扱う

package kensyuu4;

import java.util.Scanner;

public class ensyuu4_1 {

	public static void main (String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int retry;		//int型の変数retry
		do {	//do文によって{}は繰り返される
			System.out.print("整数値：");
			int n = stdIn.nextInt();		//キーボードから整数値を入力してもらう、それをnに代入する
			
			if (n > 0) {					//入力した値が０より大きい場合、"その値は正です。"といった出力処理を行う
				System.out.println("その値は正です。");
			} else if (n < 0){				//入力した値が０より小さい場合、"その値は負です。"といった出力処理を行う
				System.out.println("その値は負です。");
			} else  {						//入力した値が０と等しい場合、"その値は０です。"といった出力処理を行う
				System.out.println("その値は０です。");
			}
			System.out.println();			//改行
			System.out.print("もう一度？");	//もう一度行うかを表示
			retry = stdIn.nextInt();		//キーボードから読み込んだ値を変数retryに代入する
		} while (retry == 1);				//変数retryに読み込まれた数値が１である場合ループ本体であるブロックが再び実行される
		System.out.println("終了");			//変数retryに読み込まれた数値が１以外である場合”終了”を表示する
	}
}
