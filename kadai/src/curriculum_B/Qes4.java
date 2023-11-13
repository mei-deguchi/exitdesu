package curriculum_B;

public class Qes4 {

	public static void main(String[] args) {
		
		// for文を使って１から９まで繰り返す
		for (int i = 1; i < 10; i++) {
			for (int j = 1; j < 10; j++) {
				 
				
				// 九九の式の間に｜｜を表示
				if (10 > i && 10 > j) {
					System.out.print("|| ");
				
					// formatメソッドを使って九九の式を出力
					String kuku =(String.format("%02d * %02d = %02d ", i, j, i*j));	
					System.out.printf(kuku);
			
				}
		
			}
			
			// 行を改行
			System.out.println();
		}
		

	}

}
