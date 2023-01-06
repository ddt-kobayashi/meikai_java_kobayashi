//６人の２科目（国語・数学）の点数を読み込んで、科目毎の平均点、学生毎の平均点を求めるプログラムを作成

package kensyuu6;

import java.util.Scanner;

public class Ensyuu6_17 {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		//人数
		int people = 6;
		//点数
		int[][] point = new int[people][2];
		//各学生の点数の合計
		int[] sumStudent = new int[people];
		//各教科の点数の合計
		int[] sumSubject = new int[2];
		//生徒の平均点
		int[] studentAverage = new int[people];

		System.out.println("国語、数学の点数を入力して下さい");
		//各生徒の国語と数学の点数を入力する
		for (int i = 0; i < people; i++) {
			System.out.print(i + 1 + "番目の国語の点数：");
			point[i][0] = stdIn.nextInt();
			System.out.print(i + 1 + "番目の数学の点数：");
			point[i][1] = stdIn.nextInt();

			//生徒の国語と数学の合計点
			sumStudent[i] = point[i][0] + point[i][1];
			//生徒の国語の合計
			sumSubject[0] += point[i][0];
			//生徒の国語の合計
			sumSubject[1] += point[i][1];
			//生徒の国語と数学の平均点
			studentAverage[i] = sumStudent[i] / 2;

		}
		//国語の平均点
		int NationalLanguageAverage = sumSubject[0] / 6;
		//数学の平均点
		int MathAverage = sumSubject[1] / 6;

		//各生徒の平均点を出力
		for (int i = 0; i < people; i++) {
			System.out.println(i + 1 + "番目の生徒の平均点は：" + studentAverage[i]);
		}

		//各教科の平均点を出力
		System.out.println("国語の平均点は" + NationalLanguageAverage);
		System.out.println("数学の平均点は" + MathAverage);
	}
}
