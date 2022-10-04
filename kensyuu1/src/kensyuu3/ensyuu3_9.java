//二つの実数値を読み込んで、大きい方の値を表示するプログラム

package kensyuu3;

import java.util.Scanner;

public class ensyuu3_9 {
	
	public static void main (String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("実数値A：");
		double realValueA = stdIn.nextDouble();			//キーボードから値を入力してもらう、それをrealValueAに代入する
		System.out.print("実数値B：");
		double realValueB = stdIn.nextDouble();			//キーボードから値を入力してもらう、それをrealValueBに代入する
		
		double high = realValueA > realValueB ? realValueA : realValueB;	//realValueA > realValueBを評価した値がtrueであるならばrealValueAを評価する。falseであるならばrealValueBを評価する
		System.out.println("大きい方の値は" + high + "です。");
		
	}		
}
