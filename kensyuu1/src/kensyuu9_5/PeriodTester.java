package kensyuu9_5;

public class PeriodTester {
	
	//プログラムが実行されて起動するmainメソッドを作成
		public static void main(String[] args) {

			//PeriodクラスのインスタンスにDayクラスのインスタンスを含ませ、生成（コンポジション）
			//それぞれに年、月、日を割り当てる
			//これらは明治、大正、昭和とする
			Period meiji = new Period(new Day(1868, 1, 25), new Day(1912, 7, 30));
			Period taisho = new Period(new Day(1912, 7, 30), new Day(1926, 12, 25));
			Period shouwa = new Period(new Day(1926, 12, 25), new Day(1989, 1, 7));
			
			//明治、大正、昭和の開始日、終了日をそれぞれ出力する
			System.out.println("明治　＝　" + meiji);
			System.out.println("大正　＝　" + taisho);
			System.out.println("昭和　＝　" + shouwa);
		}
}
