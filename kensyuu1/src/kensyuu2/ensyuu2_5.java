//２つのキーボードから読み込んだ値に合計値と平均値を表記するプログラム

package kensyuu2;

import java.util.Scanner;

public class ensyuu2_5 {

	public static void main (String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		//今回の変数名の命名は問題にある実行結果から指す
		
		System.out.print("xの値：");
		double x = stdIn.nextDouble();	//xにキーボードから読み込んだ整数値を読み込む
		
		System.out.print("yの値：");
		double y = stdIn.nextDouble();	//yにキーボードから読み込んだ整数値を読み込む
		
		System.out.println("合計は" + (x + y) + "です。");		//xとyの合計値を表示
		System.out.println("平均は" + (x + y)/2 + "です。");	//xとyの平均値を表示
	}
}
