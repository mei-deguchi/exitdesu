package curriculum_19;

import java.time.LocalDateTime;

public class Animal {
	
	public static void main(String[] args) {
		Dog kirin = new Dog("キリン", 30);		// キリンインスタンス作成
		Dog elephant = new Dog("ゾウ", 10);		// ゾウインスタンス作成

		// Q1：Dogクラスを呼び出して変数に代入し、動物の名前をコンソールに出力してください。
		// コンソールに動物名を出力
		System.out.println(kirin.animalName);
		System.out.println(elephant.animalName);
		
		// Q2：Dogクラスを呼び出して変数に代入し、動物の数をコンソールに出力してください。
		// 動物の数を出力
		System.out.println(kirin.count);
		System.out.println(elephant.count);

		// 現在の日時を「yyyy-MM-dd H:m:s」形式で変数に代入して、コンソールに出力してください
		// 日付出力
		LocalDateTime ldt = LocalDateTime.now();
		System.out.println(ldt);
	}
}