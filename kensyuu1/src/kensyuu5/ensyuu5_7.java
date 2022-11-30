//0.0から1.0まで0.001単位で増やして合計を表示（繰り返しをfloatで制御）
//その値を２乗するプログラム
//List5-9を流用

package kensyuu5;

public class ensyuu5_7 {
	public static void main(String[] args) {
		
		System.out.println(" float     int");
		System.out.println("----------------------");
		for(float x = 0.0F; x <= 1.0F; x += 0.001F) {
			//小数点7桁以下の出力
			//0.0から1.0まで0.001単位で増やして合計を表示（x）
			//その値を２乗下のを表示(x * x)
			System.out.printf("%.7f %.7f\n", x, (x * x));
		}
	}
}

