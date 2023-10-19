package curriculum_B;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Qes1_3 {
	
	public static void main(String[] args) {
		
		// Scannerクラスで標準入力を取得
		Scanner scanner = new Scanner(System.in);
		
		// String型にnameを宣言
		String name="";
		
		// 文字列入力の受け取り
		name = scanner.nextLine();
		
		// 文字列パターンを（）内のものに指定
		Pattern p = Pattern.compile("^[A-Za-z0-9]+$");
		// 指定した文字列が形式にマッチするか確認
		Matcher m = p.matcher(name);
		
		// ユーザー名が10文字以上の場合、コメント出力
		if (name.length() >= 10) {
		System.out.println("「名前を10文字以内にしてください」");
		
		// ユーザー名が0文字以下・nullの場合、コメント出力
		} else if (name.isEmpty() || name == null) {
					System.out.println("「名前を入力してください」");
		
		// ユーザー名が半角英数字以外の場合、コメント出力
		} else if (!m.matches()) {
			System.out.println("「半角英数字のみで名前を入力してください」");
		
		// ユーザー名が正常値だった場合、コメント出力
		} else {
			System.out.println("ユーザー名「" + name + "」を登録しました");
		}
		
		
		// ジャンケン
		// String型にjankenを宣言し、値を代入
		String[] janken = {"「グー」", "「チョキ」", "「パー」"};
		
		// 勝つまでの数をint型でnumに代入
		int num = 1;
		
		// ユーザーが勝つまで繰り返し処理
		while (true) {
		
			// ユーザーの手の入力の受け取り
			int userHand = scanner.nextInt();
			// 	相手の手をランダムで表示
			int pcHand = new java. util.Random(). nextInt(3);
			
			// コメント出力
			System.out.println(name + "の手は" + janken[userHand]);
			System.out.println("相手の手は" + janken[pcHand]);
			System.out.println();
	
			
			// 自分が勝った場合、コメント出力
			if ((userHand == 0 && pcHand == 1) || (userHand == 1 && pcHand == 2) || (userHand == 2 && pcHand == 0)) {
				System.out.println("やるやん。");
				System.out.println("次は俺にリベンジさせて");
				System.out.println();
				System.out.println("勝つまでにかかった合計回数は" + num + "回です");
				// 勝った場合、繰り返し処理終了
				break;
				
			// 自分がグーに負けた場合、コメント出力	
			} else if (userHand == 1 && pcHand == 0) {
				System.out.println("俺の勝ち！");
				System.out.println("負けは次に繋がるチャンスです！");
				System.out.println("ネバーギブアップ！");
				
			// 自分がチョキに負けた時、コメント出力
			} else if (userHand == 2 && pcHand == 1) {
				System.out.println("俺の勝ち！");
				System.out.println("たかがじゃんけん、そう思ってないですか？");
				System.out.println("それやったら次も、俺が勝ちますよ");
					
			// 自分がパーに負けた時、コメント出力	
			} else if (userHand == 0 && pcHand == 2) {
				System.out.println("俺の勝ち！");
				System.out.println("なんで負けたか、明日まで考えといてください。");
				System.out.println("そしたら何かが見えてくるはずです");
				
			// あいこの場合、コメント出力
			} else {
				System.out.println("DRAW あいこ　もう一回しましょう！");
			
			}	
			
			// ジャンケン勝つまでの回数を増やす処理
			num++;
						
		}
		
		// スキャナを閉じる
		scanner.close();
		
	}

}
