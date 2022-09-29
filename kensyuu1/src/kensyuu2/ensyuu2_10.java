package kensyuu2;

import java.util.Scanner;

public class ensyuu2_10 {

	public static void main (String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("姓：");
		String surname = stdIn.next();		//キーボードから苗字を入力してもらう、それをsurnameに代入する

		System.out.print("名：");
		String name = stdIn.next();		//キーボードから名前を入力してもらう、それをnameに代入する

		System.out.println("こんにちは" + surname + name + "さん。");		//挨拶を行うプログラムを実行する
		
	}
}
