//list4-4のwhile文終了時にxの値が-1になることを確認するプログラムを作成する
//list4-4流用

package kensyuu4;

import java.util.Scanner;

public class ensyuu4_4 {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("カウントダウンします。");
		int x;
		do {
			System.out.print("正の整数値："); 
			x = stdIn.nextInt();		//キーボードから値を入力してもらう、それをxに代入する
		} while (x <= 0);		//xの値が0以下である間、処理を実行する
		
		while(x >= 0) {			//xの値が０以上（true）である間、繰り返し{}内の処理を行う
			System.out.println(x);		//xの値を出力する
			x--;				//xの値をデクリメントする（減分演算子）
		}
		System.out.println(x);		//xの値が-1であるか確認する為、それを出力表示する
	}

}