//List10-3に示した連番クラスIDに、最後に与えた識別番号を返すクラスメソッドgetMaxIdを追加せよ

package kensyuu10_1;

public class IdTester {

	//プログラムが実行されて起動するmainメソッドを作成
	public static void main(String[] args) {

		//IDクラスのインスタンスaを作成
		Id a = new Id();
		//IDクラスのインスタンスbを作成
		Id b = new Id();

		//aとbの識別番号を出力する
		System.out.println("aの識別番号：" + a.getId());
		System.out.println("bの識別番号：" + b.getId());

		//クラスメソッドのgetMaxIdにアクセスし、内容を出力する
		System.out.println("最後に与えた識別番号　＝　" + Id.getMaxId());
		//クラス型変数a,bにアクセスし、内容を出力する
		System.out.println("最後に与えた識別番号　＝　" + a.getMaxId());
		System.out.println("最後に与えた識別番号　＝　" + b.getMaxId());
	}
}
