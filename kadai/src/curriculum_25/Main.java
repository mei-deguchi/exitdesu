package curriculum_25;

import java.util.Scanner; //　スキャナークラスをインポート

public class Main {

	public static void main(String[] args)	{

		// 文字列入力の受け取り
		Scanner sc = new Scanner(System.in);
		String name = sc.nextLine();

		// インスタンス作成
		Hero hero = new Hero(name, rdm(), rdm(), rdm(), rdm(), rdm());

		// コンソール出力
		System.out.println("こんにちは「" + hero.getName() + "」さん");
		System.out.println("ステータス");
		System.out.println("HP:" + hero.getHp());
		System.out.println("MP:" + hero.getMp());
		System.out.println("攻撃力:" + hero.getAttack());
		System.out.println("素早さ:" + hero.getSpeed());
		System.out.println("防御力:" + hero.getDefense());
		System.out.println();
		System.out.println("さあ冒険に出かけよう！");

		// スキャナークラス閉じる
		sc.close();

	}
	// ランダムに数字を生成
	private static int rdm() {
		return (int) (Math.random() * 1000);
	}

}
