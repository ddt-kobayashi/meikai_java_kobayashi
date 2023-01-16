//メソッドlinearSearchは、探索するキーと同じ値の要素が複数個存在する場合、最も先頭に位置する要素を見つけるものである
//最も末尾側に位置する要素を見つけるlinearSearchRメソッドを作成せよ
//int linearSearchR(int[] a, int key)

package kensyuu7;

import java.util.Scanner;

public class Ensyuu7_17 {

	//配列aの要素からkeyと一致する最も先頭の要素を線形探索する
	//①intは返却型
	//②linearSearchはメソッド名
	//③()内のint[] a, int bは仮引数
	//④メソッドの本体は{}で囲む
	static int linearSearch(int[] a, int key) {
		//繰り返し要素0から求める値を探索する
		//配列型変数aの要素数だけ行う
		//一致した場合は呼び出したint型の値(answer, key)を呼び出し元(linearSearch)に返却する
		for (int i = 0; i < a.length; i++) {
			if (a[i] == key) {
				return i;
			}
		}
		//何も一致しなかった場合は-1を返却する
		return -1;
	}

	//配列aの要素から最も末尾側に位置する要素を見つける
	//①intは返却型
	//②linearSearchはメソッド名
	//③()内のint[] a, int keyは仮引数
	//④メソッドの本体は{}で囲む
	static int linearSearchR(int[] a, int key) {
		//繰り返し要素の末尾から求める値を探索する
		//配列型変数aの要素数だけ行う
		//一致した場合は呼び出したint型の値(answer, key)を呼び出し元(linearSearchR)に返却する
		for (int i = a.length - 1; i >= 0; i--) {
			if (a[i] == key) {
				return i;
			}
		}
		//繰り返し要素0から求める値を探索する
		//配列型変数aの要素数だけ行う
		//一致した場合は呼び出したint型の値(x, key)を呼び出し元(linearSearch)に返却する
		return -1;
	}

	//プログラムが実行されて起動するmainメソッドを作成
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		//要素数を入力してもらう
		System.out.print("要素数：");
		int element = stdIn.nextInt();

		//int型のanswerの配列変数を要素数分、生成
		int[] answer = new int[element];

		//繰り返し各要素の値を入力してもらう
		for (int i = 0; i < element; i++) {
			System.out.print("[" + i + "]:");
			answer[i] = stdIn.nextInt();
		}

		//求める値を入力してもらう
		System.out.println("探す値：");
		int key = stdIn.nextInt();

		//先頭を求める変数として、topを定義
		//定義した際に配列aの要素からkeyと一致する最も先頭の要素を線形探索するメソッドを呼ぶ
		int top = linearSearch(answer, key);
		//末尾を求める変数として、endを定義
		//定義した際に配列aの要素から最も末尾側に位置する要素を見つけるメソッドを呼ぶ
		int end = linearSearchR(answer, key);

		//もし探索して値が確認できない場合は値を確認できないことを示す
		if (top == -1 && end == -1) {
			System.out.println("値を確認できません");
		}
		//もし探索した値が複数ない場合、探索した値を示す
		else if (top == end) {
			System.out.println("その値は[" + top + "]にあります。");
		}
		//もし探索した値が複数ある場合、探索した値を先頭と末尾を示す
		else {
			System.out.println("最も先頭に位置する要素はx[" + top + "]にあります。");
			System.out.println("最も末尾に位置する要素はx[" + end + "]にあります。");
		}
	}
}
