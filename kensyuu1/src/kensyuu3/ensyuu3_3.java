//List3-5を流用

package kensyuu3;

import java.util.Scanner;

public class ensyuu3_3 {
	
	public static void main (String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("整数値：");
		int integerValue = stdIn.nextInt();		//キーボードから整数値を入力してもらう、それをintegerValueに代入する
		
		if (integerValue > 0) {					//入力した値が０より大きい場合、"その値は正です。"といった出力処理を行う
			System.out.println("その値は正です。");
		} else if (integerValue < 0){			//入力した値が０より小さい場合、"その値は負です。"といった出力処理を行う
			System.out.println("その値は負です。");
		} else if (integerValue == 0){			//入力した値が０と等しい場合、"その値は０です。"といった出力処理を行う
			System.out.println("その値は０です。");
			
		//elseの場合は、もしそうでなければ〇〇を行うといった処理を行う
		//else ifの場合は、()内の条件式でなければ処理を行わない
		//本件は、出力結果に差は生まれない認識です
			
		}
	}
}
