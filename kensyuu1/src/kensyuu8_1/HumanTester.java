//名前・身長・体重などをメンバとしてもつ「人間クラス」を作成
//フィールドは自分で自由に設計すること
//List8-2を参考

package kensyuu8_1;

class HumanTester {

	//プログラムが実行されて起動するmainメソッドを作成
	public static void main(String[] args) {

		//Human型のadachiとnakataのクラス型変数をインスタンス化
		//new演算子によって生成されたクラス型の実体をインスタンス
		//インスタンスを生成することをインスタンス化
		Human adachi = new Human();
		Human nakata = new Human();

		//クラス型変数名. フィールド名によってアクセスできる
		//インスタンス内のフィールドは、インスタンスごとに作られる変数であるからインスタンス変数と呼ばれる

		//足立くんの人間の各フィールドをアクセスする式
		//各インスタンス変数に値をそれぞれ設定しています
		//値がない場合は既定値で初期化されます
		
		//足立くんの名前というインスタンス変数
		adachi.name = "足立幸一";
		//足立くんの身長というインスタンス変数
		adachi.height = 170;
		//足立くんの体重というインスタンス変数
		adachi.weight = 70;

		//仲田くんの人間の各フィールドをアクセスする式
		//仲田くんの名前というインスタンス変数
		nakata.name = "仲田幸一";
		//仲田くんの身長というインスタンス変数
		nakata.height = 180;
		//仲田くんの体重というインスタンス変数
		nakata.weight = 60;

		//各インスタンス変数の値（足立くんの名前、身長、体重）を出力
		System.out.println("名前：" + adachi.name);
		System.out.println("身長：" + adachi.height + "cm");
		System.out.println("体重：" + adachi.weight + "kg");
		
		System.out.println();

		//各インスタンス変数の値（仲田くんの名前、身長、体重）を出力
		System.out.println("名前：" + nakata.name);
		System.out.println("身長：" + nakata.height + "cm");
		System.out.println("体重：" + nakata.weight + "kg");
	}

}
