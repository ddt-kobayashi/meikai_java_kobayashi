//インスタンスが生成されるたびに"明解銀行での口座開設ありがとうございます"と表示するように銀行口座クラスAccountを作成
//第８章で作成した銀行口座クラス（第２版）に、口座開設日のフィールドとtoStringメソッドを追加せよ

package kensyuu10_5;

public class Account {
	
	//口座を開設するたびに識別番号を割り振る為、カウンターを定義
	private static int counter = 0;
	
	//名義を格納する為のフィールド
	private String name;
	//番号を格納する為のフィールド
	private String no;
	//残高を格納する為のフィールド
	private long balance;
	//口座開設日を格納する為のフィールド
	//インスタンスを参照する変数
	private Day openDay;
	
	private int id;
	
	//インスタンスが生成されるたびにコメントを表示
	{
		id = ++counter;
		System.out.println("明解銀行での口座開設ありがとうございます");
	}
	
	//タイプ0の場合に利用するコンストラクタを作成
	public Account(String name, String no) {
		this(name, no,0,new Day());
	}
	
	//コンストラクタ（仮引数で受け取った値、String name, String no, long balance, Day dayを各フィールドに代入する）
	public Account(String name, String no, long balance, Day day){
		this.name = name;
		this.no = no;
		this.balance = balance;
		//クラス型インスタンスを生成し、与えられたクラス型変数（年、月、日）をopenDayフィールドに代入する
		openDay = new Day(day);
	}
	
	//名義を取得（フィールドの値を取得、返却）
	public String getName() {
		return name;
	}
	
	//番号を取得（フィールドの値を取得、返却）
	public String getNo() {
		return no;
	}
	
	//残高を取得（フィールドの値を取得、返却）
	public long getBalance() {
		return balance;
	}
	
	//識別番号を取得（フィールドの値を取得、返却）
	public int getId() {
		return id;
	}
	
	//口座開設日を取得（フィールドの値を取得、返却）
	public Day getOpenDay() {
		return new Day(openDay);
	}
	
	//toStringメソッドを作成
	public String toString() {
		return "{" + name + "," + no + "," + balance + "}";
	}

}
