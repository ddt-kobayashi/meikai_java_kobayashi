//配列aと配列bの全要素の値を交換するメソッドaryExchngを作成
//二つの配列の要素数が等しくない場合は、小さい方の要素数分の要素を交換すること。

package kensyuu7;

import java.util.Scanner;

public class Ensyuu7_21 {

	//配列aと配列bの全要素の値を交換するメソッドaryExchngを作成
	//①intは値を返さないメソッドの返却型
	//②aryExchngはメソッド名
	//③()内のint[] a, int[] bは仮引数
	//④メソッドの本体は{}で囲む
	static int aryExchng(int[] a, int[] b) {
		//交換要素数は小さい方の要素数分の要素を交換する
		//a.length < b.length（配列の長さがbよりaの方が低い場合） がtrueである場合、a.length、falseである場合、b.lengthをarray変数に代入する
		int array = a.length < b.length ? a.length : b.length;
		//繰り返しarray分の長さまで交換処理を行う
		for (int i = 0; i < array; i++) {
			//交換処理のため変数changeを作成（仮の値としてaの配列の値を定義）
			int change = a[i];
			//同じ要素数のbの配列の値をaの配列の値に代入する
			//aがbになるイメージ
			a[i] = b[i];
			//同じ要素数のaの配列の値をbの配列の値に代入する
			//bがaになるイメージ
			b[i] = change;
		}
		//呼び出したint型の値(array)を呼び出し元(aryExchng)に返却する
		return array;
	}

	//プログラムが実行されて起動するmainメソッドを作成
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		//配列aの要素数を入力してもらう
		System.out.print("配列aの要素：");
		int elementA = stdIn.nextInt();

		//int型の配列変数aを作成
		//elementAの値（要素数）だけ生成
		int[] a = new int[elementA];

		//各配列aの要素毎に値を代入する
		for (int i = 0; i < elementA; i++) {
			System.out.print("a[" + i + "]:");
			a[i] = stdIn.nextInt();
		}

		//配列bの要素数を入力してもらう
		System.out.print("配列bの要素：");
		int elementB = stdIn.nextInt();

		//int型の配列変数bを作成
		//elementBの値（要素数）だけ生成
		int[] b = new int[elementB];

		//各配列bの要素毎に値を代入する
		for (int i = 0; i < elementB; i++) {
			System.out.print("b[" + i + "]:");
			b[i] = stdIn.nextInt();
		}

		//aryExchngメソッドを呼び出して、要素数が含まれている配列変数a,bをaryExchngメソッドに渡す
		aryExchng(a, b);

		//aryExchngメソッドの処理後の意味も込めて出力
		System.out.println("配列a,bの全要素を交換しました。");

		//下記は確認のために出力
		//繰り返し配列aの各要素の値を出力する
		for (int i = 0; i < elementA; i++) {
			System.out.println("a[" + i + "]=" + a[i]);
		}
		//繰り返し配列bの各要素の値を出力する
		for (int i = 0; i < elementB; i++) {
			System.out.println("b[" + i + "]=" + b[i]);
		}
	}

}
