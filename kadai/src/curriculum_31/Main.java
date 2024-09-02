package curriculum_31;

class Main{
	public static void main(String[] argos){
		// インスタンス作成
		Person person1 = new Person("鈴木太郎", 20, 1.7, 60);
		person1.print();
		
		System.out.println();

		// インスタンス作成
		Person person2 = new Person("山田花子", 22, 1.5, 40);
		person2.print();

		System.out.println();
		
		// クラスメソッドを呼び出して合計人数出力
		Person.printCount();
	}
}
