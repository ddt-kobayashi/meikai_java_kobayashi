//名前・身長・体重などをメンバとしてもつ「人間クラス」を作成
//フィールドは自分で自由に設計すること
//List8-2を参考

package kensyuu9_4;

class HumanTester {

	//プログラムが実行されて起動するmainメソッドを作成
	public static void main(String[] args) {

		//Human型のadachiとnakataのクラス型変数をインスタンス化
		//new演算子によって生成されたクラス型の実体をインスタンス
		//インスタンスを生成することをインスタンス化
		Human adachi = new Human("足立幸一",170,60,new Day(1975, 3, 12));
		Human nakata = new Human("仲田幸一",170,60,new Day(1975, 3, 12));

		//足立の情報を出力
		System.out.println(adachi);
		//仲田の情報を出力
		System.out.println(nakata);
	}

}
