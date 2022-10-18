//２桁の整数値を当てる数あてゲーム

package kensyuu4;

import java.util.Random;
import java.util.Scanner;

public class ensyuu4_2 {
	public static void main(String[] args) {
		Random rand = new Random();
		Scanner stdIn = new Scanner(System.in);
		
		int answer = rand.nextInt(90) + 10;		//当てるべき２桁の乱数
		int number;		//プレイヤーが入力した値となる変数を定義
		
		System.out.println("数あてゲーム開始");
		System.out.println("２桁の整数値を当ててください");
		
		do {
			System.out.println("いくつかな：");
			number = stdIn.nextInt();		//プレイヤーが入力した数
			
			if(number > answer) {			//入力した値が正解よりも大きい場合
				System.out.println("もっと小さな数です");
			}else if(number < answer) {	//入力した値が正解よりも小さい場合
				System.out.println("もっと大きな数です");
			}
		} while (number != answer);		//不正解で有る限り繰り返す
		
		System.out.println("正解です");		//正解である場合、出力する
		
	}

}
