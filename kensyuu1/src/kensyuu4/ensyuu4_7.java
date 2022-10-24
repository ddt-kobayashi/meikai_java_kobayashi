//読み込んだ値の個数だけ記号文字を表示するプログラムを作成。表示は＊と＋を交互に行う

package kensyuu4;

import java.util.Scanner;

public class ensyuu4_7 {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		//int型の変数integerを定義
		int integer;
		//1以下の値が入力された場合、再度入力させる
		do {
			System.out.print("何個表示しますか：");
		//キーボードから値を入力してもらう、それをintegerに代入する
			integer = stdIn.nextInt(); 
		} while (integer < 1);
		
		//int型の変数initialを定義
		//値が０である理由は入力された値までインクリメントさせてそれまで繰り返し行うようにする為
		int initial = 0;
		//変数integerの値が変数initial以上の値である限り繰り返し処理を行う
		while (initial < integer) {
		//変数initialの値を２で割った余りの値が0であるならば*そうでないならば+
		//上記コメントを繰り返し行うこと（true,falseを交互に行うこと）で交互に出力する
			System.out.print(initial % 2 == 0 ? "*" : "+"); 
		//変数initialをインクリメントする
			initial++;
		}
	}
}