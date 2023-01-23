//自動車クラスCarに対して、フィールドやメソッドを自由に追加せよ
//List8-4,5,6を参考

package kensyuu8_2;

public class CarTester1 {

	//プログラムが実行されて起動するmainメソッドを作成
	public static void main(String[] args) {
		//Carクラス型のインスタンスをvitz,marchそれぞれ二つ生成
		Car vitz = new Car("ビッツ", "999", 1660, 1500, 3640, 40.0, 35.0, 12.0);
		
		Car march = new Car("マーチ", "999", 1660, 1500, 3640, 40.0, 35.0, 12.0);
		
		//vitzのスペックを表示するため、putSpec()メソッドを呼び出す
		vitz.putSpec();
		System.out.println();
		//marchのスペックを表示するため、putSpec()メソッドを呼び出す
		march.putSpec();
	}
}
