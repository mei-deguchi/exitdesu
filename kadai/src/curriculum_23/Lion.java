package curriculum_23;

public class Lion {

	// フィールド変数
	private String animal;
	double size;
	int speed;

	// コンストラクタ実行
	Lion(String animal, double size, int speed){	
		this.animal = animal;
		this.size = size;
		this.speed = speed;
	}

	// getter
	public String getAnimal() {
		return this.animal;
	}


	// setter
	public void setAnimal(String animal) {
		this.animal = animal;
	}

}