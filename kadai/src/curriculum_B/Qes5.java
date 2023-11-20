package curriculum_B;

public class Qes5 {

	public static void main(String[] args) {

		// for文を使ってjは9まで、iは20まで繰り返す
		for (int j = 1; j < 10; j++) {
			for (int i = 1; i < 21; i++) {

				// formatメソッドを使って九九の式を出力
				String kuku = (String.format("%03d * %03d = %03d ", i, j, i * j));
				System.out.printf(kuku);

				// 九九の式の間に｜｜を表示
				if (i != 20 && j != 10) {
					System.out.print("|| ");

				}
			}
			// 1周回った後改行
			System.out.println();

		}
	}
}
