//キーボードから三つの整数値を読み込んで、それらの中央値を求めて表示するプログラム

package kensyuu3;

import java.util.Scanner;

public class ensyuu3_13 {
	
	public static void main (String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("整数値A：");
		int integerValueA = stdIn.nextInt();			//キーボードから値を入力してもらう、それをintegerValueAに代入する
		System.out.print("整数値B：");
		int integerValueB = stdIn.nextInt();			//キーボードから値を入力してもらう、それをintegerValueBに代入する
		System.out.print("整数値C：");
		int integerValueC = stdIn.nextInt();			//キーボードから値を入力してもらう、それをintegerValueCに代入する
		
		int median ;								//int型の中央値となる変数（median）を定義
		
		if (integerValueA > integerValueB) {
			if(integerValueA > integerValueC) {
				if(integerValueB < integerValueC) {
					median = integerValueB;
				} else {
					median = integerValueC;
				}
			}	else {
				median = integerValueA;
			}
		}	
		System.out.print("中央値は" + median + "です。");		//記載したif文の結果（median）を表示する
	}		
}
