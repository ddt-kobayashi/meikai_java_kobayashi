//ランダムな値の生成

package kensyuu2;

import java.util.Random;

public class ensyuu2_7 {

	public static void main (String[] args) {
		Random rand = new Random();
		
		int integer1 = rand.nextInt(9);		//0から8までの乱数
		integer1 = integer1 + 1;			//1から9までの乱数
		System.out.println("ランダムな１から９までの正の整数値：" + integer1);		//11行目の定義内容を出力
		
		int integer2 = rand.nextInt(9);		//0から8までの乱数
		integer2 = -(integer2 + 1);			//-1から-9までの乱数
		System.out.println("ランダムな１から９までの負の整数値：" + integer2);		//15行目の定義内容を出力
		
		int integer3 = rand.nextInt(9);		//0から8までの乱数
		integer3 = (integer3 + 1) * 10;		//10から90までの乱数
		int integer4 = rand.nextInt(10);	//0から9までの乱数
		System.out.println("ランダムな２桁の正の整数値：" + (integer3 + integer4));		//10以上99未満の値を出力
	}
}
