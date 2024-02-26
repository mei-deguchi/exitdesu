package curriculum_B;

import java.util.Scanner;

public class Qes7 {

	public static void main(String[] args) {

		// Scannerクラスで標準入力を取得
		Scanner sc = new Scanner(System.in);

		System.out.print("生徒の人数を入力してください（２以上):");

		// 数列入力の受け取り
		int st = sc.nextInt();
		// 多次元配列を初期化し、変数に代入
		int[][] line = new int[st][4];
		
		
		// for文で指定した数まで繰り返し処理
		for (int i = 0; i < st; i++) {
				
			System.out.print((i + 1) + "人目の『英語』の点数を入力してください :");
			line[i][0] = sc.nextInt();

			System.out.print((i + 1) + "人目の『数学』の点数を入力してください :");
			line[i][1] = sc.nextInt();

			System.out.print((i + 1) + "人目の『理科』の点数を入力してください :");
			line[i][2] = sc.nextInt();

			System.out.print((i + 1) + "人目の『社会』の点数を入力してください :");
			line[i][3] = sc.nextInt();

			System.out.println();
		}
		
		// ４教科の平均点を人数分繰り返し処理
		for (int i = 0; i < st; i++) {
			double ave = ((line[i][0] + line[i][1] + line[i][2] + line[i][3]) / 4);

			System.out.println((i + 1) + "人目の平均点は" + ((double) Math.round(ave * 100)) / 100 + "点です。");

		}

		System.out.println();
		
		// 人数分の科目ごとの変数を初期化
		double sumEnglish = 0;
		double sumMath = 0;
		double sumSience = 0;
		double sumSociety = 0;

		// 人数分の各科目の点数を足していく
		for (int i = 0; i < st; i++) {

			sumEnglish += line[i][0];
			sumMath += line[i][1];
			sumSience += line[i][2];
			sumSociety += line[i][3];

		}
		
		// 小数点第2位までの値を出力
		System.out.println("英語の平均点は" + ((double) Math.round(sumEnglish / st * 100)) / 100 + "点です。");
		System.out.println("数学の平均点は" + ((double) Math.round(sumMath / st * 100)) / 100 + "点です。");
		System.out.println("理科の平均点は" + ((double) Math.round(sumSociety / st * 100)) / 100 + "点です。");
		System.out.println("社会の平均点は" + ((double) Math.round(sumEnglish / st * 100)) / 100 + "点です。");

		// 全体の平均点を求める
		double sumAll = (sumEnglish / st + sumMath / st + sumSience / st + sumSociety / st) / 4;
		System.out.println("全体の平均点は" + ((double) Math.round(sumAll) * 100) / 100 + "点です。");
		
		// スキャナを閉じる
		sc.close();
	}

}
