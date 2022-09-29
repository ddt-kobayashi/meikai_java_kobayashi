//三つの型変数に値を代入し、合計と平均を求めるプログラム

package kensyuu2;

public class ensyuu2_2 {
	
	public static void main(String[] args) {
		
		int subject1;	//subject1はint型の変数
		int subject2;	//subject2はint型の変数
		int subject3;	//subject3はint型の変数
		
		subject1 = 693;	//subject1に693を代入
		subject2 = 188;	//subject2に188を代入
		subject3 = 123;	//subject3に123を代入
		
		//整数の演算としているため小数は切り捨てられます。
		System.out.println("合計は" + (subject1 + subject2 + subject3) + "です。");		//合計を表示
		System.out.println("平均は" + (subject1 + subject2 + subject3) / 3 + "です。");	//平均を表示
	}

}
