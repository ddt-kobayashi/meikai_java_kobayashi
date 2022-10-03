//読み込んだ整数値を絶対値に変更して表示する

package kensyuu3;

import java.util.Scanner;

public class ensyuu3_1 {
	
	public static void main (String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("整数値：");
		int integerValue = stdIn.nextInt();	//キーボードから整数値を入力してもらう、それをintegerValueに代入する
		
		if (integerValue < 0) {				//もし入力した値が0以下(負の値)の場合、正の値に変える
			integerValue = -integerValue;
		}
		System.out.println("その絶対値は" + integerValue + "です。");		//入力した絶対値を表示する
	}
}
