package curriculum_32;

class Main{
	public static void main(String[] args){
		// インスタンス作成
		Person person1 = new Person("鈴木", "太郎", 20, 1.7, 60);
		person1.print();
		
		System.out.println();

		// インスタンス作成
		Person person2 = new Person("山田", "花子", 22, 1.5, 40);
		person2.print();
		
		System.out.println();

		Person.printCount();
	}
}