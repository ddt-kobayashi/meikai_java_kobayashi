package kensyuu2;

import java.util.Random;
import java.util.Scanner;

public class ensyuu2_8 {

	public static void main (String[] args) {
		Scanner stdIn = new Scanner(System.in);
		Random rand = new Random();
		
		System.out.print("整数値：");
		int integer = stdIn.nextInt();		//integerにキーボードから読み込んだ整数値を読み込む
		int random = rand.nextInt(11);		//0から10までの乱数
		random = random - 5;
		System.out.println("その値の±5の乱数を生成しました。それは" + (integer + random) + "です。");		//整数値から読み込んだ+-5を表記する
		
	}
}
