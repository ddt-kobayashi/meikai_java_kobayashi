//要素型がdouble型で要素数が5の配列を生成して、その全要素の値を表示するプログラム

package kensyuu6;

public class ensyuu6_1 {
	public static void main(String[] args) {
		//構成要素型がdouble型で構成要素数は５
		double[] array = new double[5];

		array[0] = 2; //a[0]に2を代入
		array[1] = 22; //a[1]に22を代入
		array[2] = 23; //a[2]に23を代入
		array[3] = 213; //a[3]に213を代入
		array[4] = 22453; //a[4]に22453を代入

		//全要素の値を表示
		System.out.println("array[" + 1 + "] = " + array[0]);
		System.out.println("array[" + 2 + "] = " + array[1]);
		System.out.println("array[" + 3 + "] = " + array[2]);
		System.out.println("array[" + 4 + "] = " + array[3]);
		System.out.println("array[" + 5 + "] = " + array[4]);
	}
}
