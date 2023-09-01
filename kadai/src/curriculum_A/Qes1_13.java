package curriculum_A;

public class Qes1_13 {
	
	public static void main(String[] args) {
		
		
		// 1. 下記9個をローカル変数として宣言のみしてください	
		
		// バイト型の変数を宣言
		byte a;
		
		// 短整数型の変数を宣言
		short b;
		
		// 整数型の変数を宣言
		int c;
		
		// 長整数型の変数を宣言
		long d;
		
		// 単精度浮動小数点数型の変数を宣言
		float e;
		
		// 倍精度浮動小数点数型の変数を宣言
		double f;
		
		// 文字型の変数を宣言
		char g;
		
		// 文字列型の変数を宣言
		String h;
		
		// ブーリアン型の変数を宣言
		boolean i;
		
		
		// 2. それぞれのローカル変数をローカル内でそれぞれの初期値を代入し初期化してください
		
		// aに初期値を代入
		a = 0;
		
		// bに初期値を代入
		b = 0;
		
		// cに初期値を代入
		c = 0;
		
		// dに初期値に代入
		d = 0L;
		
		// eに初期値に代入
		e = 0.0f;
		
		// fに初期値に代入
		f = 0.0d;
		
		// gに初期値を代入
		g = '\u0000';
		
		// hに初期値を代入
		h = null;
		
		// iに初期値を代入
		i = false;
		
		
		// 3. 初期化をしたそれぞれの変数に下記の値を代入してください	
		
		// aに値を代入
		a = 10;
		
		// bに値を代入
		b = 100;
		
		// cに値を代入
		c = 1000;
		
		// dに値を代入
		d = 10000L;
		
		// eに値を代入
		e = 9.5F;
		
		// fに値を代入
		f = 10.5d;
		
		// gに値を代入
		g = 'a';
		
		// hに値を代入
		h = "ハロー";
		
		// iに値を代入
		i = true;
		
		
		/*
		 * 4. 下記の通りにコンソール出力されるようにしてください			
		 * 上記で作成した変数を必ず使用すること			
		 */
		
		// a,b,c,dに代入した値を足して、出力
		long sum1= a + b + c + d;
		
		// a+aをして、出力
		int sum2 = a + a;
		
		// g,h,iの値を文字列にして、出力
		System.out.println(g + " " + h + " " + i);
		
		// 全部足して、出力
		System.out.println(a + b + c + d + sum2);
		
		// 小数点以外の数字を全てかけて、出力
		System.out.println(a * b * c * d);
		
		// fの値割る100をして、出力
		System.out.println(f / b);
		
		// aの値引く100をして、出力
		System.out.println(a - b);
		
		
		/*
		 * 5. 次のプログラムを実行すると「ハローJAVA2023」という結果が表示されます。			
		 *「ハローJAVA43」と表示とさせたいのですが、意図通りに動きません。正しく動作するように修正してください。			
		 * String num="20";			
		 * int num1=23;			
		 * System.out.println("ハローJAVA"+(num+num1));			
		 */
		
		// 整数型に数字を代入し、文字列にして出力
		int num = 20;
		int num1 = 23;
		System.out.println("ハローJAVA" + (num + num1));
		
		
		/* 6. 『』で囲われた人の情報を変数にして、formatの通りコンソールに出力してください
		 * ローカル変数に代入し○○に入れてください
		 * 『山田太郎 18歳 170.5cm 62.2kg 寿司』
		 */
		
		// 名前
		String name = "山田太郎";
		System.out.println("初めまして" + name + "です");
		
		// 年齢
		int age = 18;
		System.out.println("年齢は" + age + "歳です");
		
		// 身長
		double height = 170.5;
		System.out.println("身長は" + height + "cmです");
		
		// 体重
		double weight = 62.2;
		System.out.println("体重は" + weight + "kgです");
		
		// 好きな食べ物
		String food = "寿司";
		System.out.println("好きな食べ物は" + food + "です");
		
		
		/*
		 * 7. 6で作成した自己紹介に続いてBMIが出力されるようにしてください		
		 * 「BMIは○○です」		
		 * ただし計算は数値を直書きせず、全て変数を使ってすること		
		 */
		
		// BMIを計算
		double HeightM = height / 100;
		double bmi = weight /(HeightM * HeightM);
		
		// 小数点第一位まで表示
		String bmiNumber = String.format("%.1f", bmi);
		System.out.println("BMIは" + bmiNumber + "です");
		
		
		// 8. 6で宣言した変数に再代入し下記の通りコンソールに出力してください
		
		// 名前		
		name = "鈴木一郎";
		System.out.println("初めまして" + name + "です");
		
		// 年齢
		age = 24;
		System.out.println("年齢は" + age + "歳です");
		
		// 身長
		height = 168.5;
		System.out.println("身長は" + height + "cmです");
		
		// 体重
		weight = 64.2;
		System.out.println("体重は" + weight + "kgです");
		
		// 好きな食べ物
		food = "オムライス";
		System.out.println("好きな食べ物は" + food + "です");
		
		// BMI
		double HeightM1 = height / 100;
		double bmi1 = weight /(HeightM1 * HeightM1);
		
		// 小数点第一位まで表示
		String bmiNumber1 = String.format("%.1f", bmi1);
		System.out.println("BMIは" + bmiNumber1 + "です");
		
		
		// 9. 8で使用した変数【年齢・身長・体重】の数値を和算で自己代入し、下記の通りコンソールに出力してください
		
		// 名前
		System.out.println("初めまして" + name + "です");
		
		// 年齢
		int age1 = age + age;
		System.out.println("年齢は" + age1 + "歳です");
		
		// 身長
		double height1 = height + height;
		System.out.println("身長は" + height1 + "cmです");
		
		// 体重
		double weight1 = weight + weight;
		System.out.println("体重は" + weight + "kgです");
		
		// 好きな食べ物
		System.out.println("好きな食べ物は" + food + "です");
		
		// BMI
		bmi1 = bmi1 / 2;
		System.out.println("BMIは" + ((double)Math.round(bmi1 * 100)/100) + "です");
		
		
		// 10. 8で使用した年齢が25歳以上ならtrueが出力されるようにしてください。ただしif文は使いません
		
		// 年齢が25歳以上の場合、trueを出力
		System.out.println(age1 >= 25);
		
		
		// 11. 8で使用した【年齢・身長・体重】を文字列型に型変換し繋げて出力してください
		
		// 年齢の値を文字列に型変換
		String age3 = String.valueOf(age);
		
		// 身長の値を文字列に型変換
		String height2 = String.valueOf(height);
		
		// 体重の値を文字列に型変更
		String weight2 = String.valueOf(weight);
		
		// 年齢・身長・体重
		System.out.println(age3 + "・" + height2 + "・" + weight2);
		
		
		// 12. 11で変換した【年齢・身長】を整数型に変換して出力してください
		
		// 年齢の値を整数型に変換
			int age4 = Integer.valueOf(age3);
		
		// 身長の値を倍精度浮動小数点数型から整数型に変換
			int height3 = (int)Double.parseDouble(height2);
		
		// 年齢・身長
			System.out.println(age4 + "・" + height2);
	
		
		/*
		 * 13. 12で変換した【年齢・身長】で【年齢が25もしくは身長が160以上】であればtrueを出力してください
		 * ただしif文は使わないでください
		 */
		
		// 年齢が25もしくは身長が160以上であれば、trueを出力
		System.out.println(age4 >= 25 || height3 >= 160);
	}

}
