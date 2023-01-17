//配列aと同じ配列（）を生成して返却するメソッドarrayCloneを作成

package kensyuu7;

import java.util.Scanner;

public class Ensyuu7_22 {

	//配列aと同じ配列（）を生成して返却するメソッドarrayCloneを作成
	//①intは返却型
	//②aryCloneはメソッド名
	//③()内のint[] aは仮引数
	//④メソッドの本体は{}で囲む
	static int[] aryClone(int[] a) {

		//int型の配列変数avatarを作成
		//配列aと同じ長さだけ生成
		int[] avatar = new int[a.length];
		//繰り返し同じ要素数の配列aを配列avatarに代入する
		for (int i = 0; i < avatar.length; i++) {
			avatar[i] = a[i];
		}
		//avater変数の値を呼び出し元(aryClone)に返却する
		return avatar;
	}

	//プログラムが実行されて起動するmainメソッドを作成
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		//要素数を入力してもらう
		System.out.print("要素数：");
		int element = stdIn.nextInt();

		//int型の配列変数aを作成
		//elementの値（要素数）だけ生成
		//問題に指示があるため、配列変数名はaとします
		int[] a = new int[element];

		//各配列aの要素毎に値を代入する
		for (int i = 0; i < element; i++) {
			System.out.print("a[" + i + "]:");
			a[i] = stdIn.nextInt();
		}

		//int型の配列変数cloneを作成
		//この際にaryCloneメソッドを呼び出し、配列変数aを渡す
		int[] clone = aryClone(a);

		//各配列の値を確認するため、それぞれ繰り返し出力（clone[]）する
		System.out.println("配列aの複製cloneを表示します");
		for (int i = 0; i < element; i++) {
			System.out.println("clone[" + i + "] = " + clone[i]);
		}
	}
}
