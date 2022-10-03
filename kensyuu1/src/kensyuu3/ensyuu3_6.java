//正の値を読み込んで100の倍数である表示する(入れ子となったif文)

package kensyuu3;

import java.util.Scanner;

public class ensyuu3_6 {
	
	public static void main (String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("整数値：");
		int integerValue = stdIn.nextInt();			//キーボードから整数値を入力してもらう、それをintegerValueに代入する
		
		if (integerValue > 0) {						//もしも入力した値が０より大きい場合、16〜17行目または18〜19行目の処理を行う
			if((integerValue % 10) == 0) {			//入力した値を10で割った余りが0である場合17行目の出力処理を行う
				System.out.println("その値は10の倍数です。");
			} else {								//入力した値を10で割った余りが0でない場合19行目の出力処理を行う
				System.out.println("その値は10のばいすうではありません。");
			}
		} else {									//もしも入力した値が０以下である場合、22行目の処理を行う
			System.out.println("正でない値が入力されました。");
		}
	}		
}
