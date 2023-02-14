//第８章で作成した銀行口座クラス（第２版）に、口座開設日のフィールドとtoStringメソッドを追加せよ
//日付クラス第三版を利用するプログラムを作成せよ
//全てのコンストラクタの動きを確認する

package kensyuu10_5;

public class Day {

	//年、月、日の各フィールドに1を代入する
	private int year = 1;
	private int month = 1;
	private int date = 1;

	//コンストラクタ①
	//yearに対して0が指定された場合は、強制的に１に調整する（西暦に0はないため）
	public Day() {
	}
	//仮引数と同一名のフィールドにアクセスするためにthis.を使う
	//コンストラクタ②
	public Day(int year) {
		this.year = year;
	}
	//コンストラクタ③（同一クラス内のコンストラクタ②の呼び出し）
	public Day(int year, int month) {
		this(year);
		this.month = month;
	}
	//コンストラクタ④（同一クラス内のコンストラクタ③の呼び出し）
	public Day(int year, int month, int date) {
		this(year, month);
		this.date = date;
	}
	//コンストラクタ⑤（同一クラス内のコンストラクタ④の呼び出し）
	public Day(Day d) {
		this(d.year, d.month, d.date);
	}

	//年を取得（フィールドの値を取得、返却）
	public int getYear() {
		return year;
	}

	//月を取得（フィールドの値を取得、返却）
	public int getMonth() {
		return month;
	}

	//日を取得（フィールドの値を取得、返却）
	public int getDate() {
		return date;
	}

	//年を設定(フィールドに値を設定するメソッド)
	public void setYear() {
		this.year = year;
	}

	//月を設定(フィールドに値を設定するメソッド)
	public void setMonth() {
		this.month = month;
	}

	//日を設定(フィールドに値を設定するメソッド)
	public void setDate() {
		this.date = date;
	}

	//年、月、日を設定
	public void set(int year, int month, int date) {
		this.year = year;
		this.month = month;
		this.date = date;
	}

	//曜日を求める
	//ツェラーの公式だそうです。。。
	public int dayOfWeek() {
		int y = year;
		int m = month;
		if (m == 1 || m == 2) {
			y--;
			m += 12;
		}
		return (y + y / 4 - y / 100 + y / 400 + (13 * m + 8) / 5 + date) % 7;
	}

	//日付dと等しいか判定するメソッド
	//与えた日付と仮引数dに受け取った日付の比較を行う
	public boolean equalTo(Day d) {
		return year == d.year && month == d.month && date == d.date;
	}

	//文字表現を返却するメソッド
	public String toString() {
		String[] wd = { "日", "月", "火", "水", "木", "金", "土" };
		return String.format("%04d年%02d月%02d日(%s)", year, month, date, wd[dayOfWeek()]);
	}
}
