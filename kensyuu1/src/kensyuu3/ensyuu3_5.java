//正の値を読み込んで5で割り切れるか表示する(入れ子となったif文)

package kensyuu3;

import java.util.Scanner;

public class ensyuu3_5 {
	
	public static void main (String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("整数値：");
		int integerValue = stdIn.nextInt();		//キーボードから整数値を入力してもらう、それをintegerValueに代入する
		
		//下記は入れ子となったif文を記載（値が●であり■または▲である場合、●でない場合✖️）
		//入れ子となったif文を書くことにより、if文の中にif文を加えられるイメージ
		
		if (integerValue > 0) {		//●もしも入力した値が０より大きい場合、16〜17行目または18〜19行目の処理を行う
			if((integerValue % 5) == 0) {		//■入力した整数値の余りが0である場合
				System.out.println("その値は5で割り切れます。");
			} else {							//▲入力した整数値の余りが0でない場合
				System.out.println("その値は5で割り切れません。");
			}
		} else {					//✖もしも入力した値が０以下である場合、22行目の処理を行う
			System.out.println("正でない値が入力されました。");
		}
	}		
}
