package kensyuu2;

import java.util.Random;

public class ensyuu2_9 {
	
	public static void main (String[] args) {
	
		Random rand = new Random();
	
		double random1 = rand.nextDouble();		//小数の値をランダムに生成
		System.out.println("0.0以上1.0未満の実数値:" + random1 );		//11行目に生成されたものを表記
		
		int random2 = rand.nextInt(10);		//0から9までの乱数
		double random3 = rand.nextDouble();		//小数の値をランダムに生成
		System.out.println("0.0以上10.0未満の実数値:" + (random2 + random3) );		//0.0以上10.0未満の実数値を表記
		
		int random4 = rand.nextInt(2);		//0から１までの乱数
		double random5 = rand.nextDouble();		//小数の値をランダムに生成
		System.out.println("-1.0以上1.0未満の実数値:" + (random4 - random5) );		//-1.0以上1.0未満の実数値を表記
	
	}
}
