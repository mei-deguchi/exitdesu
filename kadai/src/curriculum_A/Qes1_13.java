package curriculum_A;

public class Qes1_13 {
	
	public static void main(String[] args) {
		
		// 下記9個をローカル変数として宣言のみしてください			
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
		
		// それぞれのローカル変数をローカル内でそれぞれの初期値を代入し初期化してください
		// aに初期値を代入
		a = 0;
		// bに初期値を代入
		b = 0;
		// cに初期値を代入
		c = 0;
		// dに初期値に代入
		d = 0;
		// eに初期値に代入
		e = 0.0F;
		// fに初期値に代入
		f = 0.0;
		// gに初期値を代入
		g = 'b';
		// hに初期値を代入
		h = "a";
		// iに初期値を代入
		i = false;
		
		// 初期化をしたそれぞれの変数に下記の値を代入してください			
		// aに値を代入
		a = 10;
		// bに値を代入
		b = 100;
		// cに値を代入
		c = 1000;
		// dに値を代入
		d = 10000;
		// eに値を代入
		e = 9.5F;
		// fに値を代入
		f = 10.5;
		// gに値を代入
		g = 'a';
		// hに値を代入
		h = "ハロー";
		// iに値を代入
		i = true;
		
		/*
		 * 下記の通りにコンソール出力されるようにしてください			
		 * 上記で作成した変数を必ず使用すること			
		 */
		// a,b,c,dに代入した値を足して、出力
		long sum1 = a + b + c + d;
		System.out.println(sum1);
		// a+aをして、出力
		int sum2 = a + a;
		System.out.println(sum2);
		// g,h,iの値を文字列にして、出力
		System.out.println(g + " " + h + " " + i);
		// sum1とsum2を足して、出力
		System.out.println(sum1 + sum2);
		// 小数点以外の数字を全てかけて、出力
		System.out.println(a * b * c * d);
		// fの値割る100をして、出力
		System.out.println(f / 100);
		// aの値引く100をして、出力
		System.out.println(a - 100);
		
		/*
		 * 次のプログラムを実行すると「ハローJAVA2023」という結果が表示されます。			
		 *「ハローJAVA43」と表示とさせたいのですが、意図通りに動きません。正しく動作するように修正してください。			
		 * String num="20";			
		 * int num1=23;			
		 * System.out.println("ハローJAVA"+(num+num1));			
		 */
		// 整数型に数字を代入し、文字列にして出力
		int num = 20;
		int num1 = 23;
		System.out.println("ハローJAVA" + (num + num1));
		
		/* 『』で囲われた人の情報を変数にして、formatの通りコンソールに出力してください
		 * ローカル変数に代入し○○に入れてください
		 * 『山田太郎 18歳 170.5cm 62.2kg 寿司』
		 */
		// name変数に値を代入、出力
		String name = "山田太郎";
		System.out.println("初めまして" + name + "です");
		// age変数に値を代入、出力
		int age = 18;
		System.out.println("年齢は" + age + "歳です");
		// height変数に値を代入、出力
		double height = 170.5;
		System.out.println("身長は" + height + "cmです");
		// weight変数に値を代入、出力
		double weight = 62.2;
		System.out.println("体重は" + weight + "kgです");
		// food変数に値を代入、出力
		String food = "寿司";
		System.out.println("好きな食べ物は" + food + "です");
		
		/*
		 * 6で作成した自己紹介に続いてBMIが出力されるようにしてください		
		 * 「BMIは○○です」		
		 * ただし計算は数値を直書きせず、全て変数を使ってすること		
		 */
		// BMIを計算し、出力
		double kgHeight = height / 100;
		double bmi = weight /(kgHeight * kgHeight);
		System.out.println("BMIは" + bmi + "です");
		
		// 6で宣言した変数に再代入し下記の通りコンソールに出力してください
		// 名前の値を再代入し、出力			
		name = "鈴木一郎";
		System.out.println("初めまして" + name + "です");
		// 年齢の値を再代入し、出力
		age = 24;
		System.out.println("年齢は" + age + "歳です");
		// 身長の値を再代入し、出力
		height = 168.5;
		System.out.println("身長は" + height + "cmです");
		// 体重の値を再代入し、出力
		weight = 64.2;
		System.out.println("体重は" + weight + "kgです");
		// 好きな食べ物の値を再代入し、出力
		food = "オムライス";
		System.out.println("好きな食べ物は" + food + "です");
		// BMIの値を再計算し、出力
		double kgHeight1 = height / 100;
		double bmi1 = weight /(kgHeight1 * kgHeight1);
		System.out.println("BMIは" + bmi1 + "です");
		
		// 8で使用した変数【年齢・身長・体重】の数値を和算で自己代入し、下記の通りコンソールに出力してください
		// 名前を出力
		System.out.println("初めまして" + name + "です");
		// 年齢の値を自己代入、出力
		age = age + age;
		System.out.println("年齢は" + age + "歳です");
		// 身長の値の値を自己代入、出力
		height = height + height;
		System.out.println("身長は" + height + "cmです");
		// 体重の値を自己代入、出力
		weight = weight + weight;
		System.out.println("体重は" + weight + "kgです");
		// 好きな食べ物を出力
		System.out.println("好きな食べ物は" + food + "です");
		// BMIの値を再計算、出力
		bmi1 = bmi1 / 2;
		System.out.println("BMIは" + bmi1 + "です");
		
		// 8で使用した年齢が25歳以上ならtrueが出力されるようにしてください。ただしif文は使いません
		// 年齢が25歳以上の場合、trueを出力
		System.out.println(age >= 25);
		
		// 8で使用した【年齢・身長・体重】を文字列型に型変換し繋げて出力してください
		// 年齢の値を文字列に型変換
		String age1 = String.valueOf(age);
		// 身長の値を文字列に型変換
		String height1 = String.valueOf(height);
		// 体重の値を文字列に型変更
		String weight1 = String.valueOf(weight);
		// 年齢・身長・体重を出力
		System.out.println(age1 + "・" + height1 + "・" + weight1);
		
		// 11で変換した【年齢・身長】を整数型に変換して出力してください
		// 年齢の値を整数型に変換
			int age2 = Integer.valueOf(age1);
		// 身長の値を倍精度浮動小数点数型から整数型に変換
			int height2 =(int)Double.parseDouble(height1);
		// 年齢・身長を出力
			System.out.println(age2 + "・" + height2);
	
		/*
		 * 12で変換した【年齢・身長】で【年齢が25もしくは身長が160以上】であればtrueを出力してください
		 * ただしif文は使わないでください
		 */
		// 年齢が25もしくは身長が160以上であれば、trueを出力
		System.out.println(age2 >= 25 || height2 >= 160);
	}

}
