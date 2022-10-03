//List2-6を流用

package kensyuu2;

public class ensyuu2_1 {

	public static void main(String[] args) {
		
		int x;	//xはint型の変数
		int y;	//yはint型の変数
		
		//問題はX,Yの値を小数部に変更すること
		
		x = 63.1;	//int型は整数しか扱えないため、エラーが発生する
		y = 18.1;	//int型は整数しか扱えないため、エラーが発生する
		
		System.out.println("xの値は" + x + "です。");
		System.out.println("yの値は" + y + "です。");
		System.out.println("合計は" + (x + y) + "です。");
		System.out.println("平均は" + (x + y) / 2 + "です。");
	}

}
