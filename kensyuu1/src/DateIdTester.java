//無名パッケージに所属させる

//idパッケージのDateIdクラスをインポート
import id.DateId;

public class DateIdTester {

	//プログラムが実行されて起動するmainメソッドを作成
	public static void main(String[] args) {

		//DateIdクラスのインスタンスa,b,cを作成
		DateId a = new DateId();
		DateId b = new DateId();
		DateId c = new DateId();

		//a,b,cの識別番号を出力する
		System.out.println("aの識別番号：" + a.getId());
		System.out.println("bの識別番号：" + b.getId());
		System.out.println("cの識別番号：" + c.getId());

	}

}
