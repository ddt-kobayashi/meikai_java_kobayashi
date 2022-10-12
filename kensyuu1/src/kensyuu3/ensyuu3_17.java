//0,1,2の値の乱数を生成し、0であれば”グー”、１であれば”チョキ”、２であれば”パー”を表示する

package kensyuu3;

import java.util.Random;

public class ensyuu3_17 {
	
	public static void main (String[] args) {
		Random fight = new Random();
		
		int hand = fight.nextInt(3);	//0~2の乱数を生成し、int型の変数handに値を代入する
		
		switch (hand) {
		 case 0 : System.out.println("グー");	//handが０の時、グーを表示する
		 	break;		//break文の為、switch文から抜け出る
		 case 1 : System.out.println("チョキ");	//handが１の時、チョキを表示する
		 	break;		//break文の為、switch文から抜け出る
		 case 2 : System.out.println("パー");	//handが２の時、パーを表示する
		 	break;		//break文の為、switch文から抜け出る
		}
	}

}
