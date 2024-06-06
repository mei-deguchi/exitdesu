package curriculum_19;

public class Dog {
	private static final String DogName = null;

	// Q1：フィールドに犬の名前の変数を定義してください。
	String name;	// 動物名
	
	// Q2：フィールドに犬の数の変数を定義してください。
	int count;			// 動物の数
	
	// Q3：Q1で作成した変数に「犬」を代入するコンストラクタを作成してください。
	// 犬の名前と犬の数の初期値を代入
	public Dog() {
		// TODO 自動生成されたコンストラクター・スタブ
		count ++;
		this.name = DogName;
	}

	// Q4：Q2で作成した変数に引数を代入するコンストラクタを作成してください。
	// 犬の数の代入　問題文が分かれているため、別途作成
	public void Count(int number){
		this.count = number;
	}
}
