//自動車クラスCarに対して、フィールドやメソッドを自由に追加せよ
//List8-4,5,6を参考

package kensyuu8_2;

import java.util.Scanner;

public class CarTester2 {

	//プログラムが実行されて起動するmainメソッドを作成
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		//車のデータをそれぞれ入力する
		System.out.println("車のデータを入力せよ。");
		System.out.println("名前：");
		String name = stdIn.next();
		System.out.println("ナンバー：");
		String number = stdIn.next();
		System.out.println("車幅：");
		int width = stdIn.nextInt();
		System.out.println("車高：");
		int height = stdIn.nextInt();
		System.out.println("車長：");
		int length = stdIn.nextInt();
		System.out.println("タンク容量：");
		double tankage = stdIn.nextDouble();
		System.out.println("ガソリン量：");
		double fuel = stdIn.nextDouble();
		System.out.println("燃費：");
		double sfc = stdIn.nextDouble();

		//Carクラス型のインスタンスmyCarを生成
		//それぞれの値を引数にセット
		Car myCar = new Car(name, number, width, height, length, tankage, fuel, sfc);

		//車の各移動状況、燃費の状況を出力する
		while (true) {
			//現在地（X,Y座標）を出力する
			System.out.printf("現在地：(%.2f,%.2f)\n", myCar.getX(), myCar.getY());
			//残り燃料を表記
			System.out.printf("残り燃料：%.2f\n", myCar.getFuel());
			//移動するかしないか条件分岐
			System.out.printf("移動しますか[0...No/1...Yes]：");
			if (stdIn.nextInt() == 0) {
				break;
			}

			//各座標の移動距離を入力してもらう
			System.out.print("X方向の移動距離：");
			double dx = stdIn.nextDouble();
			System.out.print("Y方向の移動距離：");
			double dy = stdIn.nextDouble();

			//燃料不足の場合はfalseが返却され、移動不可判定が表示される
			if (!myCar.move(dx, dy)) {
				System.out.println("燃料不足です");
			}
		}
	}
}
