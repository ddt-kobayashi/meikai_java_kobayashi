//テストの点数の合計点・平均点・最低点を表示するプログラム
//人数と点数は、キーボードから読み込む

package kensyuu6;

import java.util.Scanner;

public class ensyuu6_6 {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		//人数を入力してもらう
		System.out.print("人数:");
		int people = stdIn.nextInt();

		//構成要素型がint型で構成要素数は入力値（people）
		int score[] = new int[people];

		//各点数を出力する
		//%dのdはDecimal（10進法）
		for (int i = 0; i < score.length; i++) {
			System.out.printf("%d人目の点数：", (i + 1));
			score[i] = stdIn.nextInt();
		}

		//最高点と最低点を求める為の変数を定義
		int max = score[0];
		int min = score[0];
		//各要素の最高点と最低点を走査する
		for (int i = 0; i < score.length; i++) {
			if (score[i] > max) {
				max = score[i];
			}
			if (min > score[i]) {
				min = score[i];
			}
		}

		//空行を加える（見た目を整える為）
		System.out.println();

		//合計点を人数分処理する
		//右辺から左辺に合計点に各点数を加える
		int sum = 0;
		for (int i = 0; i < score.length; i++) {
			sum += score[i];
		}

		//型が異なる為、キャスト演算子を利用
		//合計点を人数で割り、平均点を求める
		double average = sum / (double) people;

		//各点数を出力
		System.out.printf("最高点：%d\n", max);
		System.out.printf("最低点:%d\n", min);
		System.out.printf("合計点:%d\n", sum);
		//問題に指定はないが小数点以下の桁数は１桁にします
		System.out.printf("平均点:%.1f\n", average);
	}
}
