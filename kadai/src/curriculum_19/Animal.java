package curriculum_19;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Animal {
	
	public static void main(String[] args) {
		Dog dog = new Dog();		// インスタンス作成
		dog.name = "ダックスフンド";
		dog.count = 2;
		// Q1：Dogクラスを呼び出して変数に代入し、犬の名前をコンソールに出力してください。
		// コンソールに動物名を出力
		System.out.println(dog.name);
		
		// Q2：Dogクラスを呼び出して変数に代入し、犬の数をコンソールに出力してください。
		// 動物の数を出力
		System.out.println(dog.count);

		// 現在の日時を「yyyy-MM-dd H:m:s」形式で変数に代入して、コンソールに出力してください
		// 日付出力
		LocalDateTime ldt = LocalDateTime.now();
		
		// フォーマット指定
		DateTimeFormatter f = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
		System.out.println(ldt.format(f));
	}


}