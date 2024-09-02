package curriculum_30;

public class Person {
	// インスタンスフィールドを定義
	private String name;
	private int age;
	private double height;
	private double weight;
	public static int count;
	

	
	// コンストラクタを定義しインスタンスフィールドに値をセット
	Person(String name, int age, double height, double weight){
		
		Person.count++;
		
		this.name = name;
		this.age = age;
		this.height = height;
		this.weight = weight;
	}
	
	// getter
	public String getName() {
		return this.name;
	}
	public int getAge() {
		return this.age;
	}
	public double getHeight() {
		return this.height;
	}
	
	 // bmiのインスタンスを定義
	public double bmi() {
		return this.weight/this.height/this.height;
	}
	
	// printのインスタンスを定義
	public void print() {
		System.out.println("名前は" + this.name + "です");
		System.out.println("年は" + this.age + "才です");
		System.out.println("BMIは" + String.format("%.1f", this.bmi()) + "です");
	}
}


