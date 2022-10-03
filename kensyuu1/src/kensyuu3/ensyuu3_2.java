package kensyuu3;

import java.util.Scanner;

public class ensyuu3_2 {
	
	public static void main (String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("整数値A：");
		int integerA = stdIn.nextInt();			//キーボードから整数値を入力してもらう、それをintegerAに代入する
		System.out.print("整数値B：");
		int integerB = stdIn.nextInt();			//キーボードから整数値を入力してもらう、それをintegerBに代入する
		
		if ((integerA % integerB) == 0) {		//integerAをintegerBで割ったあまりが０である場合、16行目の出力処理を行う
			System.out.println("BはAの約数です。");
		} else {								//15行目の条件通りでない場合、18行目の出力処理を行う
			System.out.println("BはAの約数ではありません。");
		}
	}
}
