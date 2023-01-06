//クラス数・各クラスの人数・全員の点数を読み込んで、点数の合計点と平均点を求めるプログラムを作成
//合計点と平均点は、クラス毎のものと、全体のものとを表示すること

package kensyuu6;

import java.util.Scanner;

public class Ensyuu6_19 {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		//クラス数を入力してもらう
		System.out.print("クラス数:");
		int sumClass = stdIn.nextInt();

		//点数となるint型のpoint変数をクラス数の数だけ要素があるよう出力
		int[][] point = new int[sumClass][];

		//全クラスの人数の合計
		//peopleの処理の始まる前は値は０で定義
		//iは組、jは番号として定義
		int people = 0;
		for (int i = 0; i < point.length; i++) {
			//はじめに改行（\n）を使うのは問題の出力結果通り
			//組の生徒人数を調査する（入力してもらう）
			System.out.printf("\n%d組の人数:", i + 1);
			int student = stdIn.nextInt();
			point[i] = new int[student];
			people += student;
			//合計人数を求めたら、各生徒の点数を調査する
			for (int j = 0; j < point[i].length; j++) {
				System.out.printf("%d組%d番の点数:", i + 1, j + 1);
				point[i][j] = stdIn.nextInt();
			}
		}

		System.out.println();

		//各組の合計と平均を出力
		System.out.println("　組　｜　合計　平均");
		System.out.println("-----+----------");
		int total = 0;
		//全生徒の合計点を足していく
		//iは組、jは番号として定義
		for (int i = 0; i < point.length; i++) {
			int sum = 0;
			for (int j = 0; j < point[i].length; j++) {
				sum += point[i][j];
			}
			total += sum;
			System.out.printf("%2d組 ｜%5d %5.1f\n", i + 1, sum, (double) sum / point[i].length);
		}

		//全体の合計点を出力（少なくとも5桁)
		//全体の平均点を出力（全体を５桁以下で小数点以下を１桁）
		System.out.println("-----+----------");
		System.out.printf(" 計 ｜%5d %5.1f\f\n", total, (double) total / people);

	}
}
