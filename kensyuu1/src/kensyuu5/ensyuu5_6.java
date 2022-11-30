//0.0から1.0まで0.001単位で増やして合計を表示（繰り返しをfloat,intで制御）
//List5-9を流用

package kensyuu5;

public class ensyuu5_6 {
	public static void main(String[] args) {
		
		System.out.println(" float     int");
		System.out.println("----------------------");
		for(float x = 0.0F, i = 0.0F; x <= 1.0F; x += 0.001F, i++) {
			float y = (float)i / 1000;
			//小数点7桁以下の出力
			//0から1.0まで0.001ずつ増やしていく様子(x)
			//0から1000までインクリメントした値を1000であった値求める様子(y)
			System.out.printf("%.7f %.7f\n", x, y);
		}
	}
}
