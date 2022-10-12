//キーボードから三つの整数値を読み込んで、それらの中央値を求めて表示するプログラム
//変数を初期化して作成

package kensyuu3;

import java.util.Scanner;

public class ensyuu3_13_2 {
	
	public static void main (String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("整数値A：");
		int integerValueA = stdIn.nextInt();			//キーボードから値を入力してもらう、それをintegerValueAに代入する
		System.out.print("整数値B：");
		int integerValueB = stdIn.nextInt();			//キーボードから値を入力してもらう、それをintegerValueBに代入する
		System.out.print("整数値C：");
		int integerValueC = stdIn.nextInt();			//キーボードから値を入力してもらう、それをintegerValueCに代入する
		
		int minimumValue = integerValueA;		//整数値Aの値をint型の最小値となる変数（min）に代入する
		
		if(integerValueB < minimumValue) {		//整数値Bが変数minより少ない場合、minの値は整数値Bとなる
			minimumValue = integerValueB;		//(B<A)
		}
		if(integerValueC < minimumValue) {		//整数値Cが変数minより少ない場合、minの値は整数値Cとなる
			minimumValue = integerValueC;		//(C<B<A)
		}
		
		int maxValue = integerValueB;		//整数値Bの値をint型の最大値となる変数（max）に代入する
										
		if(integerValueA > maxValue) {		//整数値Aが変数maxより大きい場合、maxの値は整数値Aとなる
			maxValue = integerValueA;		//(A>B)
		}
		if(integerValueC > maxValue) {		//整数値Cが変数maxより大きい場合、maxの値は整数値Cとなる
			maxValue = integerValueC;		//(C>A>B)
		}
		
		int median = integerValueC;		////整数値Cの値をint型の中央値となる変数（mid）に代入する
		
		if(integerValueA != maxValue && integerValueA != minimumValue) {	//整数値Aの値が最大でも最小でもない場合、整数値Aは中央値となる
			median = integerValueA;
		}
		if(integerValueB != maxValue && integerValueB != minimumValue) {	//整数値Bの値が最大でも最小でもない場合、整数値Bは中央値となる
			median = integerValueB;
		}
		
		System.out.print("中央値は" + median + "です。");		//記載したif文の結果（median）を表示する
	}		
}
