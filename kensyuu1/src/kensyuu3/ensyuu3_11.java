//二つの整数値を読み込んで、それらの値の差が１０以下である場合とそうでない場合を表示するプログラム

package kensyuu3;

import java.util.Scanner;

public class ensyuu3_11 {
	
	public static void main (String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("実数値A：");
		int integerValueA = stdIn.nextInt();			//キーボードから値を入力してもらう、それをintegerValueAに代入する
		System.out.print("実数値B：");
		int integerValueB = stdIn.nextInt();			//キーボードから値を入力してもらう、それをintegerValueBに代入する
		
		int difference = integerValueA > integerValueB ? (integerValueA - integerValueB) : (integerValueB - integerValueA);	//integerValueA > integerValueBを評価した値がtrueであるならば(integerValueA - integerValueB)を評価する。falseであるならば(integerValueB - integerValueA)を評価する
		
		if (difference > 10) {		//もしもdifferenceの値が11以上である場合は20行目、そうでない場合は22行目の出力処理を行う
			System.out.println("それらの差は11以上です。");
		} else {
			System.out.println("それらの差は10以下です。");
		}
	}		
}