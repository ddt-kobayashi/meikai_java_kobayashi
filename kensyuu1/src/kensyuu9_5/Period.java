//開始日と終了日から構成される〈期間〉を表すクラスPeriodを作成

package kensyuu9_5;

public class Period {

	//開始日から終了日を定義したクラス
	//開始日となるフィールド(Day from)
	private Day from;
	//終了日となるフィールド(Day to)
	private Day to;
	
	//コンストラクタを定義
	//仮引数で受け取った値をそのままフィールドに代入する
	public Period(Day from, Day to) {
		this.from = new Day(from);
		this.to = new Day(to);
	}
	
	//開始日を取得（フィールドの値を取得、返却）
	public Day getFrom() {
		return new Day(from);
	}
	//終了日を取得（フィールドの値を取得、返却）
	public Day getTo() {
		return new Day(to);
	}
	//開始日から終了日を出力する為のメソッドtoStringを作成
	public String toString() {
		return "{" + from + "~" + to + "}";
	}
}
