//二つの整数値を読み込んで、小さい方の数以上で大きい方の数以下の全整数を小さい方から順に表示する

package kensyuu4;

import java.util.Scanner;

public class ensyuu4_3 {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("整数A:");
		int integerA = stdIn.nextInt();		//キーボードから値を入力してもらう、それをintegerValueAに代入する
		System.out.print("整数B:");
		int integerB = stdIn.nextInt();		//キーボードから値を入力してもらう、それをintegerValueBに代入する
		
		int maxValue = integerA;		//int型の大きい方の値となる変数（maxValue）を定義
		int minValue = integerB;		//int型の小さい方の値となる変数（minValue）を定義
		
		if (maxValue < minValue) {	//もしも整数値Aより整数値Bの方が大きい場合、それらの値を変換する
			int change = maxValue;	//int型の変換用の変数となるものを定義、maxValueの値をchangeに代入する
			maxValue = minValue;	//minValueの値をmaxValueに代入する
			minValue = change;		//changeの値（元maxValueの値）をminValueに代入する
		}
		
		int between = minValue;		//int型の間の数も含め最小値から最大値となる変数（between）を定義,そして最小値をそれに代入する
		do {
			System.out.print(between + " ");//小さい方の数以上で大きい方の数以内の全整数を出力する
			between = between + 1;			//betweenの値を１増やす
		} while (maxValue != between);		//betweenの値が最大値になるまで繰り返す
		System.out.println(between);		//最大値を出力する
	}

}