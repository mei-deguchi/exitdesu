package curriculum_29;

public class Japan {

	private String prefecture; // 都道府県名
	private String capital; // 県庁所在地
	private double area; // 面積

	// コンストラクタ
	Japan(String prefecture, String capital, double area) {
		this.prefecture = prefecture;
		this.capital = capital;
		this.area = area;		
	}

	// getter
	public String getPrefecture() {
		return prefecture;
	}

	public String getCapital() {
		return capital;
	}

	public double getArea() {
		return area;
	}
}

