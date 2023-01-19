//List7-20のプログラムは、三つの配列x,y,zの行数及び列数が同一であることを前提としている
//三つの配列の要素数が等しければ加算を行ってtrueを返し、等しくなければ加算を行わずにfalseを返すメソッドに書き換えよ
//List7-20を流用

package kensyuu7;

public class Ensyuu7_27 {

	static boolean addMatrix(int[][] x, int[][] y, int[][] z) {
		//今回は三つの配列の長さが等しいか、等しくないか確認する
		//全ての長さが均一でない場合、falseを返す
		if (x.length != y.length || y.length != z.length) {
			return false;
		}

		//今回は三つの配列の要素数が等しいか、等しくないか確認する
		//全ての長さが均一でない場合、falseを返す
		for (int i = 0; i < x.length; i++) {
			if (x[i].length != y[i].length || y[i].length != z[i].length) {
				return false;
			}
		}

		//各それぞれの行列xとyの和を配列zに代入する
		for (int i = 0; i < x.length; i++) {
			for (int j = 0; j < x.length; j++) {
				z[i][j] = x[i][j] + y[i][j];
			}
		}
		return true;
	}

	//List7-20を参考に記載しています（P258）
	//行列の全要素を表示
	//①voidは戻り値のない型
	//②printMatrixはメソッド名
	//③()内のint[][] allは仮引数
	//④メソッドの本体は{}で囲む
	static void printMatrix(int[][] m) {
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[i].length; j++) {
				System.out.print(m[i][j] + " ");
				System.out.println();
			}
		}
	}

	//プログラムが実行されて起動するmainメソッドを作成
	public static void main(String[] args) {
		//配列変数a,b,cやその値は教科書通りとしています
		int[][] a = { { 1, 2, 3 }, { 4, 5, 6 } };
		int[][] b = { { 6, 3, 4 }, { 5, 1, 2 } };
		int[][] c = new int[2][3];

		//addMatrixメソッドを呼び出しa,b,cの値をそれぞれ渡す
		addMatrix(a, b, c);
		//それぞれの行列を全て出力する
		System.out.println("行列a");
		printMatrix(a);
		System.out.println("行列b");
		printMatrix(b);
		System.out.println("行列c");
		printMatrix(c);

	}
}
