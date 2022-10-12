//月を１〜１２月の整数値として読み込んで、それに対応する季節を表示するプログラム

package kensyuu3;

import java.util.Scanner;

public class ensyuu3_18 {
	
	public static void main (String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("整数値を入力せよ：");
		int season = stdIn.nextInt();
		
		switch(season) {
		case 1 :
		case 2 :
		case 3 :System.out.print("冬");
				break;
		case 4 :
		case 5 :
		case 6 :System.out.print("春");
				break;
		case 7 :
		case 8 :
		case 9 :System.out.print("夏");
				break;
		case 10:
		case 11:
		case 12:System.out.print("秋");
				break;
		}
		
	}

}
