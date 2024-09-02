package curriculum_31;

class Person{
	// インスタンスフィールドを定義
	public String name;
	public int age;
	public double height;
	public double weight;
	public static int count;

	// コンストラクタ
	Person(String name, int age, double height, double weight){

		this.name = name;
		this.age = age;
		this.height = height;
		this.weight = weight;

		// 1増やす
		count++;
	}

	// bmiのインスタンスを定義
	public double bmi(){
		return this.weight / this.height / this.height;
	}

	// printのインスタンスを定義
	public void print(){
		System.out.println("名前は" + this.name+ "です");
		System.out.println("年は" + this.age + "です");
		System.out.println("BMIは" + String.format("%.1f", this.bmi()) + "です");

	}

	// クラスメソッド「printCount」を定義
	public static void printCount() {
		System.out.println("合計は" + Person.count + "人です");
	}
}

