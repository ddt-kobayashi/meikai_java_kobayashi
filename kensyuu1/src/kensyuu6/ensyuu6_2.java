//要素型がint型で要素数が5の配列の要素に対して、先頭から順に５、４、３、２、１を代入して表示するプログラム

package kensyuu6;

public class ensyuu6_2 {
	public static void main(String[] args) {
		//構成要素型がint型で構成要素数は５
		int[] array = new int[5];

		//array.lengthにて配列の要素数（長さ）を取得
		for(int algebra = 0; algebra < array.length; algebra++) {
			//先頭から順に５、４、３、２、１を代入
			array[algebra] = 5 - algebra;
			//全要素の値を表示
			System.out.println("array[" + algebra + "] = " + array[algebra]);
		}
	}
}
