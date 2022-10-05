//二つの実数値を読み込んで、それらの差を表示するプログラム

package kensyuu3;

import java.util.Scanner;

public class ensyuu3_10 {
	
	public static void main (String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("実数値A：");
		double realValueA = stdIn.nextDouble();			//キーボードから値を入力してもらう、それをrealValueAに代入する
		System.out.print("実数値B：");
		double realValueB = stdIn.nextDouble();			//キーボードから値を入力してもらう、それをrealValueBに代入する
		
		double difference = realValueA > realValueB ? (realValueA - realValueB) : (realValueB - realValueA);	//realValueA > realValueBを評価した値がtrueであるならば(realValueA - realValueB)を評価する。falseであるならば(realValueB - realValueA)を評価する
		System.out.println("値の差は" + difference + "です。");	//値の差を出力する
		
	}		
}
