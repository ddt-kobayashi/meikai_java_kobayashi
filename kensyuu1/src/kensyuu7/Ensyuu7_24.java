//配列aから要素a[idx]を削除した配列を返却するメソッドarrayyRmvOfを作成せよ
//削除はa[idx]より後ろの全要素を一つ前方にずらすことによって行うこと

package kensyuu7;

import java.util.Scanner;

public class Ensyuu7_24 {
	//配列aから要素a[idx]を削除した配列を返却するメソッドarrayyRmvOf
	//①intは返却型
	//②arrayyRmvOfはメソッド名
	//③()内のint[] a, int idxは仮引数
	//④メソッドの本体は{}で囲む
	static int[] arrayyRmvOf(int[] a, int idx) {
		//今回は入力してもらったインデックスの値をここで確認する
		//0より小さく、配列の大きさ以上を要求された場合は、a配列をそのまま返す
		if (idx < 0 || idx >= a.length) {
			//aの複製をそのまま返却する
			return a.clone();
		} else {
			//配列aから要素を削除した配列を格納するための配列answerを作成
			//長さ調整のため−１しています
			int[] answer = new int[a.length - 1];
			//削除した要素より前方の要素を繰り返し複製する
			for (int i = 0; i < idx; i++) {
				answer[i] = a[i];
			}
			//削除した要素より後方の要素を繰り返し複製する（前につめる）
			for (int i = 0; i < a.length - 1; i++) {
				answer[i] = a[i + 1];
			}
			//配列answerの値をarrayyRmvOfメソッドに返却する
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
			System.out.print("before[" + i + "]:");
			before[i] = stdIn.nextInt();
		}

		//削除する要素のインデックスを入力してもらう
		System.out.print("削除する要素のインデックス：");
		int idx = stdIn.nextInt();

		//一致する配列の値として配列変数afterを作成
		//この際にarrayyRmvOfメソッドを呼び出し、配列変数arrayと変数idxを渡す
		int[] after = arrayyRmvOf(before, idx);

		//削除処理後の配列の値を繰り返し出力する
		for (int i = 0; i < after.length; i++) {
			System.out.println("deleat[" + i + "] = " + after[i]);
		}
	}
}
