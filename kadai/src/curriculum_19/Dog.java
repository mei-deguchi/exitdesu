package curriculum_19;

public class Dog {
	// Q1：フィールドに動物の名前の変数を定義してください。
	String animalName;	// 動物名
	
	// Q2：フィールドに動物の数の変数を定義してください。
	int count;			// 動物の数
	
	// Q3：Q1で作成した変数に「犬」を代入するコンストラクタを作成してください。
	// 動物名と動物の数の初期値を代入
	Dog(String animalName, int number) {
		count ++;
		this.animalName = animalName;
		Count(number);
	}
	// Q4：Q2で作成した変数に引数を代入するコンストラクタを作成してください。
	// 動物の数の代入　問題文が分かれているため、別途作成
	public void Count(int number){
		this.count = number;
	}
}
