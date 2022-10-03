//変数a,bを読み込んで大小関係を表示する

package kensyuu3;

import java.util.Scanner;

public class ensyuu3_4 {
	
	public static void main (String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		//変数a,bは問題に指示有り
		
		System.out.print("整数値a：");
		int a = stdIn.nextInt();	//キーボードから整数値を入力してもらう、それをaに代入する
		System.out.print("整数値b：");
		int b = stdIn.nextInt();	//キーボードから整数値を入力してもらう、それをbに代入する
		
		if (a > b) {		//もしaがbよりも大きい場合、20行目の出力処理を行う
			System.out.println("aの方が大きいです。");
		} else if (a < b){	//もしaがbよりも小さい場合、22行目の出力処理を行う
			System.out.println("bの方が大きいです。");
		} else {			//19行目、21行目どちらでもなければaとbは同じ値として24行目の出力処理を行う
			System.out.println("aとbは同じ値です。");
		}
	}
}
