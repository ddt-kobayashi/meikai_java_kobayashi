//配列aの要素a[idx]にxを挿入した配列を返却するメソッドarrayyInsOfNを作成せよ
//挿入に伴ってa[idx]~a[a.length -2]を一つ後方にずらさなければならない

package kensyuu7;

import java.util.Scanner;

public class Ensyuu7_26 {
	//配列aの要素a[idx]にxを挿入した配列を返却するメソッドarrayyInsOfN
	//①intは返却型
	//②arrayyInsOfNはメソッド名
	//③()内のint[] a, int idx, int nは仮引数
	//④メソッドの本体は{}で囲む
	static int[] arrayyInsOfN(int[] a, int idx, int x) {
		//今回は入力してもらったインデックスの値をここで確認する
		//0より小さく、配列の大きさ以上を要求された場合は、a配列をそのまま返す
		if (x < 0 || idx > a.length) {
			return a.clone();
		} else {
			//要素挿入後の配列を格納するための配列answerを作成（＋１は挿入分となります）
			int[] answer = new int[a.length + 1];
			//今回は同じ配列変数でまとめたい為、ループ文の初期値は最初に定義します
			int i = 0;
			//挿入したインデックスより前を繰り返し代入する（複製）
			for (; i < idx; i++) {
				answer[i] = a[i];
			}
			//挿入したインデックスより後ろを繰り返し代入する（複製）
			//iに対してインクリメントを前のfor文でしている為続きからとなるはず
			for (; i < a.length; i++) {
				answer[i + 1] = a[i];
			}
			//挿入するインデックスに挿入する値を代入する
			answer[idx] = x;
			//配列answerの値をarrayyInsOfNメソッドに返却する
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

		//挿入したいインデックスを入力する
		System.out.print("挿入するインデックス：");
		int idxPlus = stdIn.nextInt();

		//その要素のいれる値を入力する
		System.out.print("挿入する値：");
		int plusElement = stdIn.nextInt();

		//配列削除後を確認するため、配列変数afterを作成
		//この際にarrayyRmvOfNメソッドを呼び出し、配列変数beforeと変数idxPlusと変数plusElementを渡す
		int[] after = arrayyInsOfN(before, idxPlus, plusElement);

		//繰り返しarrayyInsOfNメソッドの処理後の配列の状況を出力する。（before　→　after）
		for (int i = 0; i < after.length; i++) {
			System.out.println("after[" + i + "] = " + after[i]);
		}
	}
}
