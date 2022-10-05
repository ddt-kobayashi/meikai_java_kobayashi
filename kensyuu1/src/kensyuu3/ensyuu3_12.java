//キーボードから三つの整数値を読み込んで、それらの最小値を求めて表示するプログラム

package kensyuu3;

import java.util.Scanner;

public class ensyuu3_12 {
	
	public static void main (String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("整数値A：");
		int integerValueA = stdIn.nextInt();			//キーボードから値を入力してもらう、それをintegerValueAに代入する
		System.out.print("整数値B：");
		int integerValueB = stdIn.nextInt();			//キーボードから値を入力してもらう、それをintegerValueBに代入する
		System.out.print("整数値C：");
		int integerValueC = stdIn.nextInt();			//キーボードから値を入力してもらう、それをintegerValueCに代入する
		
		int minimumValue;								//int型の最小値となる変数（minimumValue）を定義
		
		if (integerValueA < integerValueB && integerValueA < integerValueC) {		//もしも整数値Aより整数値Bかつ整数値Cの方が大きい場合、integerValueAの値をminimumValueに代入する
			minimumValue = integerValueA;
		} else if (integerValueB < integerValueA && integerValueB < integerValueC) {	//もしも整数値Bより整数値Aかつ整数値Cの方が大きい場合、integerValueBの値をminimumValueに代入する
			minimumValue = integerValueB;
		} else {										//どちらでもなければintegerValueCの値をminimumValueに代入する
			minimumValue = integerValueC;
		}
		System.out.print("最小値は" + minimumValue + "です。");		//記載したif文の結果（minimumValue）を表示する
	}		
}