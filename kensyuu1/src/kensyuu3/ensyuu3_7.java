//正の値を読み込んで３で割れる数と余りを表示する(入れ子となったif文)

package kensyuu3;

import java.util.Scanner;

public class ensyuu3_7 {
	
	public static void main (String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("整数値：");
		int integerValue = stdIn.nextInt();			//キーボードから整数値を入力してもらう、それをintegerValueに代入する
		
		if (integerValue > 0) {						//もしも入力した値が０より大きい場合、{}内の処理を行う
			if((integerValue % 3) == 0) {			//入力した値を3で割った余りが0である場合、"その値は3で割り切れます。"と表示する
				System.out.println("その値は3で割り切れます。");
			} else if((integerValue % 3) == 1){		//入力した値を3で割った余りが1である場合、"その値を3で割った余りは１です。"と表示する
				System.out.println("その値を3で割った余りは１です。");
			} else {								//入力した値を3で割った余りが2である場合、"その値を3で割った余りは２です。"と表示する
				System.out.println("その値を3で割った余りは２です。");
			}
		} else {									//もしも入力した値が０以下である場合、"正でない値が入力されました。"と表示する
			System.out.println("正でない値が入力されました。");
		}
	}		
}
