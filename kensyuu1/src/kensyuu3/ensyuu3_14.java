//キーボードから二つの整数値を読み込んで、小さい方の値と大きい方の値の両方を表示するプログラム
//整数値が等しい場合は「二つの値は同じです。」と表示する

package kensyuu3;

import java.util.Scanner;

public class ensyuu3_14 {
	
	public static void main (String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("整数値A：");
		int integerValueA = stdIn.nextInt();	//キーボードから値を入力してもらう、それをintegerValueAに代入する
		System.out.print("整数値B：");
		int integerValueB = stdIn.nextInt();	//キーボードから値を入力してもらう、それをintegerValueBに代入する
		
		int bigger = integerValueA;		//int型の大きい方の値となる変数（bigger）を定義
		int smaller = integerValueB;	//int型の小さい方の値となる変数（smaller）を定義
		
		if (bigger < smaller) {		//もしも整数値Aより整数値Bの方が大きい場合、それらの値を変換する
			int change = bigger;	//int型の変換用の変数となるものを定義、biggerの値をchangeに代入する
			bigger = smaller;		//smallerの値をbiggerに代入する
			smaller = change;		//changeの値（元biggerの値）をsmallerに代入する
		}
		//二つの整数値を読み込んで、小さい方の値と大きい方の値の両方または等しいかを表示する
		//(bigger == smaller) を評価した値がtrueであるならば"二つの値は同じです。" を評価する。falseであるならば"大きい方の値は" + bigger + "小さい方の値は" + smallerを評価する
		System.out.print((bigger == smaller) ? "二つの値は同じです。" : "大きい方の値は" + bigger + "小さい方の値は" + smaller);		
	}		
}