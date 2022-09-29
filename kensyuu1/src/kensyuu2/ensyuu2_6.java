//キーボードから高さと底辺を読み込んだ値に面積を表記するプログラム

package kensyuu2;

import java.util.Scanner;

public class ensyuu2_6 {

	public static void main (String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("三角形の面積を求めます。");
		
		System.out.print("底辺：");
		double bottom = stdIn.nextDouble();		//bottomにキーボードから読み込んだ整数値を読み込む
		
		System.out.print("高さ：");
		double height = stdIn.nextDouble();		//heightにキーボードから読み込んだ整数値を読み込む
		
		System.out.println("面積は" + (bottom * height) / 2 + "です。");
	}
}
