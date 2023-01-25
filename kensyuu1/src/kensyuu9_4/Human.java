//演習8-1で作成した人間クラスの配列を生成するプログラムを作成せよ
//生成時に要素を初期化するもの、生成後の要素に代入する物などパターンを作る

package kensyuu9_4;

class Human {

	//人間クラス
	//名前、身長、体重というフィールドをセットしたもの
	private String name;
	private int height;
	private int weight;
	//誕生日のフィールドを追加
	private Day birthday;

	//コンストラクタを定義
	//仮引数で受け取った値をそのままフィールドに代入する
	Human(String name, int height, int weight, Day birthday){
		this.name = name;
		this.height = height;
		this.weight = weight;
		this.birthday = new Day(birthday);
	}
	//名前を取得（フィールドの値を取得、返却）
	String getName() {
		return name;
	}
	//高さを取得（フィールドの値を取得、返却）
	int getHeight() {
		return height;
	}
	//重さを取得（フィールドの値を取得、返却）
	int getWeight() {
		return weight;
	}
	//誕生日を取得（フィールドの値を取得、返却）
	Day getBirthday() {
		return new Day(birthday);
	}
	
	//個人情報を出力する為のtoStringメソッドを作成
	public String toString() {
		return "{" + name + " : " + height + "cm," + weight + "kg," + birthday + "生まれ}";
	}
}
