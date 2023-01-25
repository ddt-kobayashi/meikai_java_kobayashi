//第８章で作成した銀行口座クラス（第２版）に、口座開設日のフィールドとtoStringメソッドを追加せよ

package kensyuu9_3;

import java.util.Scanner;

public class AccountTester {

	//プログラムが実行されて起動するmainメソッドを作成
		public static void main(String[] args) {
			Scanner stdIn = new Scanner(System.in);
			
			System.out.println("口座情報を入力");
			//名義を入力してもらう
			System.out.print("名義：");
			String name = stdIn.next();
			//番号を入力してもらう
			System.out.print("番号：");
			String no = stdIn.next();
			//残高を入力してもらう
			System.out.print("残高：");
			int balance = stdIn.nextInt();
			//開設年を入力してもらう
			System.out.print("開設年：");
			int year = stdIn.nextInt();
			//開設月を入力してもらう
			System.out.print("開設月：");
			int month = stdIn.nextInt();
			//開設日を入力してもらう
			System.out.print("開設日：");
			int day = stdIn.nextInt();
			//Accountクラス型変数answerを作成
			Account answer = new Account(name, no, balance, new Day(year,month,day));
			//口座情報を出力
			//toStringメソッドにて口座情報を出力
			System.out.println("口座情報：" + answer);
			//口座開設日を出力
			//Day型のtoStringメソッドを呼び出す
			System.out.println("口座開設日:" + answer.getOpenDay().toString());
		}
}
