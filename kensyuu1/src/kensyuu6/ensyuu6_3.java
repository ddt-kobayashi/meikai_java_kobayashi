//要素型がdouble型で要素数が5の配列の要素に対して、先頭から順に1.1、2.2、3.3、4.4、5.5を代入して表示するプログラム

package kensyuu6;

public class ensyuu6_3 {
	public static void main(String[] args) {
		//構成要素型がdouble型で構成要素数は５
		double[] array = new double[5];

		//array.lengthにて配列の要素数（長さ）を取得
		for (int algebra = 0; algebra < array.length; algebra++) {
			int standard = algebra + 1;
			//配列の中の元となる値を生成
			double arrayValue = (standard * 1.1);
			//先頭から順に1.1、2.2、3.3、4.4、5.5を代入
			//int型からdouble型へのキャスト演算子を利用
			array[algebra] = (double) arrayValue;
			//全要素の値を表示
			System.out.println(array[algebra]);
		}
	}
}
