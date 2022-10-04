//キーボードから読み込んだ点数によって、判定を表示するプログラム。判定は下記。
//0~59 不可 /60~69 可 /70~79 良 /80~100 優

package kensyuu3;

import java.util.Scanner;

public class ensyuu3_8 {
	
	public static void main (String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("点数：");
		int point = stdIn.nextInt();			//キーボードから点数を入力してもらう、それをpointに代入する
		
		if (point >= 0 && point <= 59) {				//もしも入力した値が0以上かつ59未満の場合、17行目の出力処理を行う
			System.out.println("不可");		
			} else if(point >= 60 && point <= 69){		//もしも入力した値が60以上かつ69未満の場合、19行目の出力処理を行う
				System.out.println("可");
			} else if(point >= 70 && point <= 79){		//もしも入力した値が70以上かつ79未満の場合、21行目の出力処理を行う
				System.out.println("良");
			} else if(point >= 80 && point <= 100){		//もしも入力した値が80以上かつ100未満の場合、23行目の出力処理を行う
				System.out.println("優");
		} else {									//もしも入力した値が0以上かつ100未満でない場合、25行目の処理を行う
			System.out.println("望ましくない値が入力されました。");
		}
	}		
}
