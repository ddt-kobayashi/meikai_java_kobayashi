//自動車クラスCarに対して、フィールドやメソッドを自由に追加せよ
//List8-4,5,6を参考
package kensyuu8_2;

public class Car {

	//フィールドを記載
	//車を構成するデータを記載
	//インスタンスの状態を表す変数
	//private宣言されたフィールドはクラスの外部に対して非公開となる
	//データを外部から隠して不正なアクセスから守ることをデータ隠蔽
	
	//名前
	private String name;
	//番号
	private String number;
	//車幅
	private int width;
	//車高
	private int height;
	//車長
	private int length;
	//X方向の移動距離
	private double x;
	//Y方向の移動距離
	private double y;
	//タンク
	private double tankage;
	//ガソリン量
	private double fuel;
	//燃費
	private double sfc;

	//Carというコンストラクタ（構築子）を生成
	/*仮引数String name, String number, int width, int height, int length, double tankage, double fuel, double sfcに受け取った値を
	 フィールドに代入する*/
	//thisをつけることによりクラス内のフィールドにアクセスする
	//フィールドに仮引数の値を代入する
	Car(String name, String number, int width, int height, int length, double tankage, double fuel, double sfc) {

		this.name = name;
		this.number = number;
		this.width = width;
		this.height = height;
		this.length = length;
		this.tankage = tankage;
		this.fuel = (fuel <= tankage) ? fuel : tankage;
		this.sfc = sfc;
		x = y = 0.0;
	}

	//現在位置X座標を取得
	double getX() {
		return x;
	}

	//現在位置Y座標を取得
	double getY() {
		return y;
	}

	//残り燃料を取得
	double getFuel() {
		return fuel;
	}

	//スペックを表示
	void putSpec() {
		System.out.println("名前" + name);
		System.out.println("ナンバー" + number);
		System.out.println("車幅" + width + "mm");
		System.out.println("車高" + height + "mm");
		System.out.println("車長" + length + "mm");
		System.out.println("タンク" + tankage + "リットル");
		System.out.println("燃費" + sfc + "km/リットル");
	}

	//X方向にdx/Y方向にdy移動
	boolean move(double dx, double dy) {
		//移動距離を表示
		double dist = Math.sqrt(dx * dx + dy * dy);
		double f = dist / sfc;

		//移動できない
		if (f > fuel) {
			return false;
		} 
		//移動距離の分だけ減る
		else {
			fuel -= f;
			x += dx;
			y += dy;
		}
		//移動完了
		return true;
	}

	
	void refuel(double df) {
		if (df > 0) {
			fuel += df;
		}
		if (fuel > tankage) {
			fuel = tankage;
		}
	}
}
