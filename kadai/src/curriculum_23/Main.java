package curriculum_23;

public class Main {

	public static void main(String[] args)	{

		// インスタンス作成
		Lion lion = new Lion("ライオン", 2.1, 80);

		// コンソール出力
		System.out.println("動物名：" + lion.getAnimal());
		System.out.println("体長：" + lion.size + "m");
		System.out.println("速度：" + lion.speed + "km/h");
	}
	
}


