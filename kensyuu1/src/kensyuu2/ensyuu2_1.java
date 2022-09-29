//List2-6を流用

package kensyuu2;

public class ensyuu2_1 {

	public static void main(String[] args) {
		
		int x;
		int y;
		
		//問題はX,Yの値を小数部に変更すること
		
		x = 63.1;	//変数が望ましくないため、エラーが発生する
		y = 18.1;	//変数が望ましくないため、エラーが発生する
		
		System.out.println("xの値は" + x + "です。");
		System.out.println("yの値は" + y + "です。");
		System.out.println("合計は" + (x + y) + "です。");
		System.out.println("平均は" + (x + y) / 2 + "です。");
	}

}
