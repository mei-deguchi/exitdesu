package curriculum_33;

class Person{
	// インスタンスフィールド
	public static int count = 0;
	public String firstName;
	public String lastName; //lastName追加
	public int age;
	public double height, weight;

	// コンストラクタ
	Person(String firstName, String lastName,int age, double height, double weight){
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		this.height = height;
		this.weight = weight;
		count++;
	}

	Person(String firstName, int age, double height, double weight){
		this(firstName, "不明", age, height, weight); 
	}

	// fullNameメソッド
	public String fullName(){
		return this.firstName + this.lastName;
	}

	// printのインスタンスを定義
	public void print(){
		System.out.println("名前は" + this.fullName() + "です");
		System.out.println("年は" + this.age + "歳です");
		System.out.println("BMIは" + String.format("%.1f", this.bmi()) + "です");

	}

	// bmiのインスタンスを定義
	public double bmi(){
		return this.weight / this.height / this.height;
	}

	// クラスメソッド「printCount」を定義
	public static void printCount(){
		System.out.println("合計" + Person.count + "人です");
		System.out.println();
	}

	// インスタンスメソッドbuyを定義
	public void buy(Car car) {
		car.setOwner(this.fullName());
		System.out.println(car.getOwner() + "が購入しました");
	}

	public void buy(Bicycle bicycle) {
		bicycle.setOwner(this.fullName());
		System.out.println(bicycle.getOwner() + "が購入しました");
	}
}