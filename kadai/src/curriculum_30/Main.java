package curriculum_30;

public class Main {

	public static void main(String[] args) {
		
		// インスタンス作成
		Person person1 = new Person("鈴木太郎", 20, 1.7, 60);

		// 情報を出力
		System.out.println(person1.getName());
		System.out.println(person1.getAge());
		System.out.println(person1.getHeight());

		System.out.println();
		
		person1.print();

		System.out.println();
		
		// 合計人数出力
		System.out.println("合計" + Person.count + "人です");
	}


}
