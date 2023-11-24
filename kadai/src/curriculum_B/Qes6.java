package curriculum_B;

import java.util.Scanner;

public class Qes6 {
	
	public static void main(String[] args) {
		
		// Scannerクラスで標準入力を取得
		Scanner sc = new Scanner(System.in);
		// 文字列入力の受け取り
		String name = sc.nextLine();
		
		//点で入力した値を区切る
		String[] products = name.split("、"); 
		

		// 拡張for文で１１までの数字をランダムで表示
		for(String goods : products) {
			int ran = new java.util.Random().nextInt(12);
			
			switch(goods){
			
			// 	パソコンの場合、台数を出力
			case "パソコン":
				System.out.println("パソコンの残り台数は" + ran + "台です");
				break;
			
			// 冷蔵庫の場合、台数を出力
			case "冷蔵庫":
				System.out.println("冷蔵庫の残り台数は" + ran + "台です");
				break;
				
			// 	扇風機の場合、台数を出力
			case "扇風機":
				System.out.println("扇風機の残り台数は" + ran + "台です");
				break;
			
			// 洗濯機の場合、台数を出力
			case "洗濯機":
				System.out.println("洗濯機の残り台数は" + ran + "台です");
				break;
			
			// 加湿器の場合、台数を出力
			case "加湿器":
				System.out.println("加湿器の残り台数は" + ran + "台です");
				break;
				
			// 	テレビの場合、台数を出力
			case "テレビ":
			case "ディスプレイ":
				if(goods.equals("テレビ")) {
					System.out.println("テレビの残り台数は" + ran + "台です");
				break;	
				
				// ディスプレイの場合、テレビの最大台数１１台からランダムで出た数字を出力
				}else if(goods.equals("ディスプレイ")) {
					System.out.println("ディスプレイの残り台数は" + (11 - ran) + "台です");
				break;
				
				}
				// パソコン、冷蔵庫、扇風機、洗濯機、加湿器。テレビ、ディスプレイ以外の商品の場合、下記のコメントを出力
				default:
					System.out.println("『" + goods + "』は指定の商品ではありません");
				}
				
			}
			// スキャナを閉じる
			sc.close();
		}
	}


