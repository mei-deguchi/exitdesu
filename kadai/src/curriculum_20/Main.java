package curriculum_20;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Main {

	public static void main(String[] args) {
		// インスタンス作成
		Hello hello= new Hello("日本", "寿司", "和食");

		// コンソール出力
		System.out.println("こんにちは！ここは" + hello.country + "です！");
		System.out.println("この" + hello.food + "はうまい");
		System.out.println(hello.food + "は" + hello.countryFood + "です");

		// 日時出力
		LocalDateTime ldt = LocalDateTime.now();

		// フォーマット指定
		DateTimeFormatter f = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
		System.out.println("今の現在日時は" + ldt.format(f) + "です");

	}

}
