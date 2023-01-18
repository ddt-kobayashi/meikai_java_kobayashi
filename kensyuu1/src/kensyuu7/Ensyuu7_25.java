//配列aから要素a[idx]を先頭とするn個の要素を削除した配列を返却するメソッドarrayyRmvOfNを作成
//削除はa[idx]より後ろの全要素をn個前方にずらすことによって行うこと

package kensyuu7;

import java.util.Scanner;

public class Ensyuu7_25 {
	//配列aの要素の中で値がxである全要素のインデックスを先頭から順に格納した配列を返却するメソッドarrayySrchIdx
	//①intは返却型
	//②arrayyRmvOfNはメソッド名
	//③()内のint[] a, int idx, int nは仮引数
	//④メソッドの本体は{}で囲む
	static int[] arrayyRmvOfN(int[] a, int idx, int n) {
		//今回は入力してもらったインデックスの値をここで確認する
		//0より小さく、配列の大きさ以上を要求された場合は、a配列をそのまま返す
		if (n < 0 || idx < 0 || idx > a.length) {
			return a.clone();
		} else {
			//a配列の長さより開始値から後ろの削除範囲が広い場合
			if (idx + n > a.length) {
				//nは削除開始するインデックスから末尾までの要素を指す
				n = a.length - idx;
			}
			//要素削除後の配列を格納するための配列answerを作成（全体から削除開始するインデックスから末尾までの要素を削除した配列）
			int[] answer = new int[a.length - n];
			//今回は同じ配列変数で前後をまとめたい為、ループ文の初期値は最初に定義します
			int i = 0;
			//削除したインデックスより前を繰り返し代入する（複製）
			for (; i < idx; i++) {
				answer[i] = a[i];
			}
			//削除したインデックスより後ろを繰り返し出力する
			//iに対してインクリメントを前のfor文でしている為続きからとなるはず
			for (; i < a.length - n; i++) {
				answer[i] = a[i + n];
			}
			//配列answerの値をarrayyRmvOfNメソッドに返却する
			return answer;
		}
	}

	//プログラムが実行されて起動するmainメソッドを作成
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		//要素数を入力してもらう
		System.out.print("要素数：");
		int element = stdIn.nextInt();

		//int型の配列変数beforeを作成
		//elementの値（要素数）だけ生成
		int[] before = new int[element];

		//各配列beforeの要素毎に値を代入する
		for (int i = 0; i < element; i++) {
			System.out.print("x[" + i + "]:");
			before[i] = stdIn.nextInt();
		}

		//削除開始するインデックスの値を入力してもらう
		System.out.print("削除する開始インデックス：");
		int idxStart = stdIn.nextInt();

		//削除する要素の数を入力する
		System.out.print("削除する要素数：");
		int deleatElement = stdIn.nextInt();

		//配列削除後を確認するため、配列変数afterを作成
		//この際にarrayyRmvOfNメソッドを呼び出し、配列変数beforeと変数idxStartと変数deleatElementを渡す
		int[] after = arrayyRmvOfN(before, idxStart, deleatElement);

		//繰り返しarrayyRmvOfNメソッドの処理後の配列の状況を出力する。（before　→　after）
		for (int i = 0; i < after.length; i++) {
			System.out.println("y[" + i + "] = " + after[i]);
		}
	}
}
