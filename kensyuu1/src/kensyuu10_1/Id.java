//List10-3に示した連番クラスIDに、最後に与えた識別番号を返すクラスメソッドgetMaxIdを追加せよ

package kensyuu10_1;

public class Id {

	//クラス変数counterを定義
	private static int counter = 0;
	//識別番号となるフィールド(id)
	private int id;

	//コンストラクタを定義
	//IDクラスのインスタンスが生成されるたびに、クラス変数counterをインクリメントする
	public Id() {
		id = ++counter;
	}

	//識別番号を取得（フィールドの値を取得、返却）
	public int getId() {
		return id;
	}

	//インスタンスを生成した数の値を返す
	public static int getMaxId() {
		return counter;
	}
}
