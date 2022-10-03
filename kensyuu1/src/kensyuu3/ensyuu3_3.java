//List3-5を流用

package kensyuu3;

import java.util.Scanner;

public class ensyuu3_3 {
	
	public static void main (String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("整数値：");
		int integerValue = stdIn.nextInt();		//キーボードから整数値を入力してもらう、それをintegerValueに代入する
		
		if (integerValue > 0) {					//入力した値が０より大きい場合、16行目の出力処理を行う
			System.out.println("その値は正です。");
		} else if (integerValue < 0){			//入力した値が０より小さい場合、18行目の出力処理を行う
			System.out.println("その値は負です。");
		} else if (integerValue == 0){			//入力した値が０と等しい場合、20行目の出力処理を行う
			System.out.println("その値は０です。");
		}
	}
}
