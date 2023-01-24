//演習8-1で作成した人間クラスの配列を生成するプログラムを作成せよ
//生成時に要素を初期化するもの、生成後の要素に代入する物などパターンを作る

package kensyuu9_1;

import java.util.Scanner;

public class HumanArrayTester {

	//繰り返し配列の長さだけ、名前、身長、体重を出力するメソッドを作成
	//仮引数はHumanクラス型の配列変数answer
	static void printHumanArray(Human[] answer) {
		for (int i = 0; i < answer.length; i++) {
			System.out.printf("No.%d %s %3dcm %3dkg\n", i, answer[i].getName(), answer[i].getHeight(), answer[i].getWeight());
		}
	}

	//プログラムが実行されて起動するmainメソッドを作成
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		//一次元配列のHumanクラス型の配列変数memberを作成
		//インスタンス化し、名前、身長、体重をそれぞれ渡す
		Human[] member = {
				new Human("足立幸一", 170, 70),
				new Human("仲田幸一", 160, 60)
		};

		//すいません、名前が捻り出せませんでした。。。aで許してください
		//要素数を入力してもらう
		System.out.print("配列aの要素数：");
		int element = stdIn.nextInt();

		//要素数の数だけHumanクラス型の配列aを生成
		Human[] a = new Human[element];
		//それぞれの要素に名前と身長、体重を入力する
		for (int i = 0; i < a.length; i++) {
			System.out.println("a[" + i + "]");
			System.out.print("名前：");
			String name = stdIn.next();
			System.out.print("身長：");
			int height = stdIn.nextInt();
			System.out.print("体重：");
			int weight = stdIn.nextInt();
			//それぞれの要素に名前と身長、体重を代入する
			a[i] = new Human(name, height, weight);
		}

		//二次元配列のHumanクラス型の配列変数peopleを作成
		//インスタンス化し、名前、身長、体重をそれぞれ渡す
		Human[][] people = {
				{ new Human("足立幸一", 170, 70), new Human("足立幸二", 171, 71) },
				{ new Human("足立幸三", 172, 72), new Human("足立幸四", 173, 73) },
				{ new Human("足立幸五", 174, 74), new Human("足立幸六", 175, 75), }
		};

		//すいません、名前が捻り出せませんでした。。。bで許してください
		//要素数を入力してもらう
		System.out.print("配列bの要素数：");
		element = stdIn.nextInt();

		//要素数の数だけHumanクラス型の配列bを生成
		Human[][] b = new Human[element][];
		//それぞれの列数を入力する
		for (int i = 0; i < b.length; i++) {
			//列数はここで入力し、定義する
			System.out.print("b[" + i + "]の列数：");
			element = stdIn.nextInt();
			//要素数の数だけHumanクラス型の配列bを生成
			b[i] = new Human[element];
			//それぞれの要素に名前と身長、体重を入力する
			for (int j = 0; j < b[i].length; j++) {
				System.out.println("b [" + i + "][" + j + "]");
				System.out.print("名前：");
				String name = stdIn.next();
				System.out.print("身長：");
				int height = stdIn.nextInt();
				System.out.print("体重：");
				int weight = stdIn.nextInt();
				//それぞれの要素に名前と身長、体重を代入する
				b[i][j] = new Human(name, height, weight);
			}
		}

		//配列memberの値を出力する
		System.out.println("配列member");
		printHumanArray(member);
		//配列aの値を出力する
		System.out.println("配列a");
		printHumanArray(a);

		//配列peopleの値を出力する
		//表現を行ごとに表しています
		System.out.println("配列people");
		for (int i = 0; i < people.length; i++) {
			System.out.printf("第%d行\n", i);
			printHumanArray(people[i]);
		}
		//配列bの値を出力する
		//表現を行ごとに表しています
		System.out.println("配列b");
		for (int i = 0; i < b.length; i++) {
			System.out.printf("第%d行\n", i);
			printHumanArray(b[i]);
		}
	}
}
