package curriculum_New_question;

import java.util.Random;

public class Curriculum_New_1_18{
	// Q1：引数に文字列型と整数型をいれてコンソールに「Hello JavaSE 11」と出力するメソッドを作成してください。
	
	// Q2：引数に整数を渡すと渡した値同士を乗算しコンソールに出力するメソッドを作成してください
		
	// Q3：引数として整数の配列を渡すと、受け取った値を順番にコンソールに出力するメソッドを作成してください
			
	// Q4：Q2をオーバーロードして引数を小数2つに変更し、引数同士を和算しコンソールに出力してください。
		
	// Q5：引数に整数を渡すと、1～100までのランダムな数字を引数の回数分格納して
	// 格納した値を順番にコンソールで出力後、格納した値を返すメソッドを作成してください。
	// ※0は出力＆格納しないようにしてください。

	// Q6：引数にQ5で作成したメソッドの返り値を受け取り、受け取った配列の要素の平均値をコンソールに出力するメソッドを作成してください。
	// ※小数点以下も表示されるようにしてください。
	
	// Q7：引数にQ6で作成したメソッドの返り値を受け取り、受け取った値が50以上ならばtrueそれ以外はfalseを返しコンソールに出力してください

	public static void main(String[] args) {
    // 作成したメソッドをここで呼び出してください
		hello("Hello ", "JavaSE ", 11);
		mul(12,34);
		int[] scores = {10, 20, 30};
//		↑こっちの方が簡単に書ける
//		int[] scores = new int[3];
//		scores[0] = 10;	
//		scores[1] = 20;
//		scores[2] = 30;	
		array(scores);
		mul(34.3,59.0);
		scores = ran(5);
		double num = ave(scores);
		number(num);
	}	
	
	// Q1
	public static void hello(String a, String b, int c) {
		System.out.println(a + b + c);
	}
	
	// Q2
	public static void mul(int d, int e) {
		System.out.println(d * e);
	}
	
	// Q3
	public static void array(int [] scores) {
		for (int i = 0; i < scores.length; i++) {
			System.out.println(scores[i]);
		}	
	}
	
	// Q4
	public static void mul(double f, double g) {
		System.out.println(f + g);
	}
	
	// Q5
	public static int[] ran(int h) {
		// ranで指定した分、ランダムの整数を作成
		Random rnd = new Random();
		int[] arr = new int[h];
		for (int i = 0; i < h; i++) {
			// 100までの数字
			arr[i] = rnd.nextInt(100) + 1;
			System.out.println(arr[i]);	
		}
		return arr;
		
	}
	
	// Q6
	public static double ave(int[] scores) {
		// 初期値宣言
		double sum = 0;
		// Q5で作成した数字をすべて足す
		for (int i = 0; i < scores.length; i++) {
			sum += scores[i];
		}
		// 上で足した数字をQ5の回数分で割って平均値を求める
		double average = sum / scores.length;
		System.out.println(average);
		
	return average;	
	}

	// Q7　返り値がないためvoid
	public static void number(double k) {
		// Q6の平均値を使って条件分岐
		if(k >= 50) {
			System.out.println("true");
		} else {
			System.out.println("false");
		}
	}
	
}