package curriculum_27;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		// 文字列の受け取り
		Scanner sc = new Scanner(System.in);
		System.out.println("コンソールに文字を入力してください");
		String input = sc.nextLine();

		// 複数の動物の情報を区切るためのコンマ
		String[] animal = input.split(",");

		// 各動物の情報を処理する
		for (String animal1 : animal) {

			// :で情報を区切る
			String[] parts = animal1.split(":");

			// 動物名：体長：速度を入力した時の情報を取得
			if(parts.length == 3) {

				// 動物名：体長：速度の順番を指定
				String name = parts[0];
				double size = Double.parseDouble(parts[1]);
				int speed = Integer.parseInt(parts[2]);

				// インスタンス作成
				Animal animals = new Animal(name, size, speed);

				//コンソール出力
				System.out.println("動物名:" + animals.getName());
				System.out.println("体長:" + animals.getSize() + "m");
				System.out.println("速度:" + animals.getSpeed() + "km/h");
				System.out.println("学名:" + animals.getScientificName());
				System.out.println();
			}

		}

		// スキャナ閉じる
		sc.close();
	}
}
