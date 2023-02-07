//2値/3値/配列の最大値を求めるメソッドや最小値を求めるメソッドを集めたユーティリティクラスMinMaxを作成せよ

package kensyuu10_3;

public class MinMax {

	//a,bの最小値を求める
	public static int min(int a, int b) {
		return a < b ? a : b;
	}

	//a,b,cの最小値を求める
	public static int min(int a, int b, int c) {
		int min = a;

		if (b < min) {
			min = b;
		}

		if (c < min) {
			min = c;
		}

		return min;
	}

	//配列aの最小値を求める
	public static int min(int[] a) {

		int min = a[0];
		for (int i = 1; i < a.length; i++) {
			if (a[i] < min) {
				min = a[i];
			}
		}
		return min;
	}

	//最小値をもつ全要素のインデックスを格納した配列を求める
	public static int[] minIndexArray(int[] a) {
		int min = min(a);
		int count = 0;
		for (int i = 0; i < a.length; i++) {
			if (a[i] == min) {
				count++;
			}
		}
		int[] c = new int[count--];
		for (int i = a.length - 1; count >= 0; i--) {
			if (a[i] == min) {
				c[count--] = i;
			}
		}
		return c;
	}

	//a,bの最大値を求める
	public static int max(int a, int b) {
		return a > b ? a : b;
	}

	//a,b,cの最大値を求める
	public static int max(int a, int b, int c) {
		int max = a;

		if (b > max) {
			max = b;
		}

		if (c > max) {
			max = c;
		}

		return max;
	}

	//配列aの最大値を求める
	public static int max(int[] a) {

		int max = a[0];
		for (int i = 1; i < a.length; i++) {
			if (a[i] > max) {
				max = a[i];
			}
		}
		return max;
	}

	//最大値をもつ全要素のインデックスを格納した配列を求める
	public static int[] maxIndexArray(int[] a) {
		int max = max(a);
		int count = 0;
		for (int i = 0; i < a.length; i++) {
			if (a[i] == max) {
				count++;
			}
		}
		int[] c = new int[count--];
		for (int i = a.length - 1; count >= 0; i--) {
			if (a[i] == max) {
				c[count--] = i;
			}
		}
		return c;
	}
}
