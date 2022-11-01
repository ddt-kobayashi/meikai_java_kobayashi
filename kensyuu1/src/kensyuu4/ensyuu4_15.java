//身長と標準体重の対応表を表示するプログラム
//標準体重は(身長-100)*0.9で求める

package kensyuu4;

import java.util.Scanner;

public class ensyuu4_15 {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		int start; //開始値
		int end; //終了値
		int every; //増分

		//変更式がない為、ここはfor文にしない
		/*問題文に定義されている公式を利用すると開始値、終了値は100より大きくなければ
		値が0になってしまう為、100より大きい値を要求する*/
		//増加分を求める為、増分は０より大きい値を要求する
		do {
			//キーボードから値を入力してもらう、それをstartに代入する
			System.out.print("何cmから：");
			start = stdIn.nextInt();
			//キーボードから値を入力してもらう、それをendに代入する
			System.out.print("何cmまで：");
			end = stdIn.nextInt();
			//キーボードから値を入力してもらう、それをeveryに代入する
			System.out.print("何cmごと：");
			every = stdIn.nextInt();
		} while (start <= 100 || end <= 100 || every <= 0);

		//身長、標準体重という項目を出力（問題通り）
		System.out.println("身長　標準体重");

		//int型の変数heightの値は最初の身長を意味してstartの値を代入、初期化する（初期値）
		//身長の値が終了値以下である場合、身長とその対象の身長に対する標準体重をを求め続ける（条件式）
		//処理を繰り返す毎に増文（身長）を付与する（変更式）
		//上記の条件式と変更式が成立する度に繰り返し対象の身長に対する標準体重を求める処理を行う
		for (int height = start; height <= end; height += every) {
			System.out.println(height + "　　" + (height - 100) * 0.9);
		}
	}

}
