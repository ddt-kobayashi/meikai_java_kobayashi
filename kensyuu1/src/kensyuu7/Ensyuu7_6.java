//引数で指定された月の季節を表示するメソッドprintSeasonを表示せよ
//mが3,4,5であれば「春」,6,7,8であれば「夏」,9,10,11であれば「秋」,12,1,2であれば「冬」
//それ以外の値であれば何にも表示しないこと

package kensyuu7;

import java.util.Scanner;

public class Ensyuu7_6 {
	//引数で指定された月の季節を表示するメソッドprintSeasonを作成
	//①voidは値を返さないメソッドの返却型
	//②printSeasonはメソッド名
	//③()内のint nは仮引数
	//④メソッドの本体は{}で囲む
	static void printSeason(int n) {
		//渡された引数の値によってそれぞれの季節を出力する
		//break;はswitch文の処理が終了となる
		switch (n) {
		//渡された引数の値が3,4,5の場合は春
		case 3:
		case 4:
		case 5:
			System.out.print("春");
			break;
		//渡された引数の値が6,7,8の場合は夏
		case 6:
		case 7:
		case 8:
			System.out.print("夏");
			break;
		//渡された引数の値が9,10,11の場合は秋
		case 9:
		case 10:
		case 11:
			System.out.print("秋");
			break;
		//渡された引数の値が12,1,2の場合は冬
		case 12:
		case 1:
		case 2:
			System.out.print("冬");
			break;
		}
	}

	//プログラムが実行されて起動するmainメソッドを作成
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		//月を知る為の変数monthを作成
		int month;
		//今回は月を求める処理のため、１から１２以外の入力は受け付けない
		//下記の繰り返し処理は、上記の為のものとする
		do {
			System.out.print("知りたい月の季節を入力してください：");
			month = stdIn.nextInt();
		} while (month < 1 || month > 12);

		//printSeasonメソッドを呼び出す
		//仮引数int nは渡した実引数monthによって初期化する
		//引数で指定された月の季節を表示する
		System.out.print("その月の季節は「 ");
		printSeason(month);
		System.out.print(" 」");
	}
}
