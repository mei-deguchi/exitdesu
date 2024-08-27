package curriculum_27;

public class Animal {

	// フィールド変数
	private String name;
	private double size;
	private int speed;
	private String scientificName;

	// コンストラクタ実行
	Animal(String name, double size, int speed){
		this.name = name;
		this.size = size;
		this.speed = speed;
		this.scientificName = scientificName(name);
	}

	// 学名を取得するメソッド
	private String scientificName(String name) {

		// 動物の名前によって学名を取得
		switch (name) {

		case "ライオン":
			return "パンテラ レオ";

		case "ゾウ":
			return "ロキソドンタ・サイクロティス";

		case "パンダ":
			return "アイルロポダ・メロノレウカ";

		case "チンパンジー":
			return "パン・トゥログロディテス";

		case "シマウマ":
			return "チャップマンシマウマ";

		case "インコ":
			return "不明";
		}

		return name;
	}

	// getterとsetter
	public String getName() {
		return this.name;
	}

	public void setAnimal(String name) {
		this.name = name;
	}
 
	public double getSize() {
		return this.size;
	}

	public void setSize(double size) {
		this.size = size;
	}

	public int getSpeed() {
		return this.speed;
	}

	public void setSpped(int speed) {
		this.speed = speed;
	}

	public String getScientificName() {
		return this.scientificName;
	}

}
