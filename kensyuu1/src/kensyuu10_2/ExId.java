//インスタンスを生成するたびに識別番号をnずつ増やして与える
//nの値は、指定されない限り１とするが、メソッドを通じて取得、変更できるようにする
//ex)インスタンスを３個生成した後にnを４に変更した場合、インスタンスに与える識別番号は1,2,3,7,11,15とする

package kensyuu10_2;

public class ExId {

	//クラス変数counterを定義
	//クラス変数plusを定義
	private static int counter = 0;
	private static int n = 1;
	//識別番号となるフィールド(id)
	private int id;

	//コンストラクタを定義
	//IDクラスのインスタンスが生成されるたびに、クラス変数counterに１追加する
	public ExId() {
		id = counter += n;
	}

	//識別番号を取得（フィールドの値を取得、返却）
	public int getId() {
		return id;
	}

	//次回与える予定の識別番号を取得（フィールドの値を取得、返却）
	public static int getPlus() {
		return n;
	}

	//引数で受け取った値（加える値）が１以上である場合、その受け取った値に加える数を書き換える
	//そうでない場合、１のまま加える
	//次回与える予定の識別番号を取得（フィールドの値を取得、返却）
	public static int setPlus(int add) {
		n = (add >= 1) ? add : 1;
		return n;
	}

	//クラス変数counterの値を返す
	public static int getMaxId() {
		return counter;
	}
}
