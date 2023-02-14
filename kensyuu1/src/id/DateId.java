//パッケージ宣言
//idのパッケージに所属させる
package id;

import static java.util.Calendar.*;

import java.util.GregorianCalendar;

public class DateId {

	//クラス変数counterを定義
	private static int counter;
	//識別番号となるフィールド(id)
	private int id;

	//クラス初期化子作成
	//一度だけ実行される
	static {
		//GregorianCalendarクラスのインスタンスtodayを作成
		GregorianCalendar today = new GregorianCalendar();
		//現在の年、月、日をそれぞれ取得する
		int y = today.get(YEAR);
		int m = today.get(MONTH) + 1;
		int d = today.get(DATE);

		//変数counterにyyyymmdd00をまず代入する
		System.out.println("今日は%04d年%02d月%02d日です。");
		counter = y * 1000000 + m * 10000 + d * 100;
	}

	//コンストラクタを定義
	//IDクラスのインスタンスが生成されるたびに、クラス変数counterをインクリメントする
	public DateId() {
		id = ++counter;
	}

	//識別番号を取得（フィールドの値を取得、返却）
	public int getId() {
		return id;
	}

}
