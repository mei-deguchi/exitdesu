package curriculum_29;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main29 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine(); 

		String sort1 = sc.nextLine();

		List<Japan> cityList = Arrays.asList(
				new Japan("北海道", "札幌市", 83424),
				new Japan("青森県", "青森市", 9646),
				new Japan("岩手県", "盛岡市", 15275),
				new Japan("宮城県", "仙台市", 7282),
				new Japan("秋田県", "秋田市", 11638),
				new Japan("山形県", "山形市", 9323),
				new Japan("福島県", "福島市", 13784),
				new Japan("茨城県", "水戸市", 6097),
				new Japan("栃木県", "宇都宮市", 6408),
				new Japan("群馬県", "前橋市", 6263),
				new Japan("埼玉県", "さいたま市", 3798));


		List<Japan> selectedCities= getCityByCities(cityList, parseInput1(input));

		if("昇順".equals(sort1)) {
			selectedCities.sort(Comparator.comparingDouble(Japan::getArea));
		} else if("降順".equals(sort1)) {
			selectedCities.sort(Comparator.comparingDouble(Japan::getArea).reversed());
		}

		printCity(selectedCities);

		sc.close();
	}

	//	

	//	private static List<City> parseInput(String input){
	//		return Arrays.steam(input.)
	public static List<Japan> getCityByCities(List<Japan> cityList, List<Integer> cities) {
		return cityList.stream()
				.map(indexes -> cityList(indexes)
				.collect(Collectors.toList());
	}
	

	public static List<Integer> parseInput1(String input) {
		return Arrays.stream(input.split(","))
				.map(Integer::parseInt)// プレースホルダーとして空の都道府県名と面積0を設定
				.collect(Collectors.toList());
	}

	public static void printCity(List<Japan> selectedCities) {
		for (Japan city : selectedCities) {
			System.out.println("都道府県名：" + city.getPrefecture());
			System.out.println("県庁所在地：" + city.getCapital());
			System.out.println("面積：" + String.format("%.1f", city.getArea()) + " km²");
		}
	}
}

