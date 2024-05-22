package curriculum_19;

import java.time.LocalDateTime;

public class Animal {
	
	public static void main(String[] args) {
		//Dog.count();
		Dog kirin = new Dog("キリン", 30);
		Dog elephant = new Dog("ゾウ", 10);

		// Q1：Dogクラスを呼び出して変数に代入し、動物の名前をコンソールに出力してください。
		System.out.println(kirin.animalName);
		System.out.println(elephant.animalName);
		
		// Q2：Dogクラスを呼び出して変数に代入し、動物の数をコンソールに出力してください。
		System.out.println(kirin.count);
		System.out.println(elephant.count);

		// 現在の日時を「yyyy-MM-dd H:m:s」形式で変数に代入して、コンソールに出力してください
		LocalDateTime ldt = LocalDateTime.now();
		System.out.println(ldt);
	}
}