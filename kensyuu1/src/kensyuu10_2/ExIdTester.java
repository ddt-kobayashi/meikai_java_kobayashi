//インスタンスを生成するたびに識別番号をnずつ増やして与える
//nの値は、指定されない限り１とするが、メソッドを通じて取得、変更できるようにする
//ex)インスタンスを３個生成した後にnを４に変更した場合、インスタンスに与える識別番号は1,2,3,7,11,15とする

package kensyuu10_2;

public class ExIdTester {

	//プログラムが実行されて起動するmainメソッドを作成
	public static void main(String[] args) {

		//Exidクラスのインスタンスa、b、cを作成
		ExId a = new ExId();
		ExId b = new ExId();
		ExId c = new ExId();
		//クラス型メソッドsetPlusを呼ぶ
		//引数4を渡す
		ExId.setPlus(4);
		//Exidクラスのインスタンスd、e、fを作成
		ExId d = new ExId();
		ExId e = new ExId();
		ExId f = new ExId();

		//それぞれの識別番号の値を出力する
		//インスタンスに与える識別番号は生成順に1,2,3,7,11,15
		System.out.println("aの識別番号：" + a.getId());
		System.out.println("bの識別番号：" + b.getId());
		System.out.println("cの識別番号：" + c.getId());
		System.out.println("dの識別番号：" + d.getId());
		System.out.println("eの識別番号：" + e.getId());
		System.out.println("fの識別番号：" + f.getId());

		//max変数にクラスメソッドのgetMaxIdの値を格納する
		int max = ExId.getMaxId();
		//最後のカウンターの値を出力する
		System.out.println("最後に与えた識別番号　＝　" + max);
		//最後のカウンターの値に付与予定後の値を出力する
		System.out.println("次回に与える識別番号　＝　" + (max + ExId.getPlus()));
	}
}
