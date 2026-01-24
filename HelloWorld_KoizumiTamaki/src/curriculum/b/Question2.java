package curriculum.b;

import java.util.Scanner;

public class Question2 {

	public static void main(String[] args) {
	
		/*
		 * [概要] 条件分岐処理
         * [詳細] 条件分岐を使用して課題を出力する
		 */

		
		//Q1
		
		
		int score = 75; // int型の変数scoreを宣言し75を代入
		if (score >= 60 ) { System.out.println ( "合格です！" );} // scoreが60以上なら、“合格です！”と表示
		
		
		//Q2
		
		
		int age = 25; // int型の変数ageを宣言し、25を代入
		if ( age >= 20 && age <=30 ) { System.out.println ( "適正年齢です" );} // ageが20以上かつ30以下の場合、“適正年齢です”と表示
		else {  System.out.println ( "対象外です" ); } // 条件を満たさない場合、“対象外です”と表示
		
		
		//Q3
		
		
		int agE = 18; // int型の変数Ageに18を代入
		if ( agE  >= 20 ) { System.out.println ( "成人です" );} // Ageが20以上の場合、“成人です”と表示
		else if ( agE  >= 13 && agE <= 19 ) { System.out.println ( "ティーンエイジャーです" );} // Ageが13以上19以下の場合、“ティーンエイジャーです”と表示
		else { System.out.println ( "子供です" );} // Ageが12以下の場合、“子供です”と表示
		
		
		//Q4
		
		
		int x = 30 , y = 15 , z = 50; // int型の変数x,y,zにそれぞれ30,15,50を代入
		int max = Math.max ( x , Math.max ( y , z ) ); // 最大値を判断
		System.out.println("最大値: " + max); // 結果を表示
		
		
		//Q5
		
		
		int num; // int型の変数numを宣言
		Scanner scanner = new Scanner(System.in); // 入力処理を行う
		System.out.print("整数を入力: ");
		num = scanner.nextInt(); // コンソール入力で整数を受け取る
		
		if ( num > 0 ) { System.out.println ( "正の数です" );} // 数値が0より大きければ、“正の数です”と表示
		else if ( num == 0 ) { System.out.println ( "0です" );} // 数値が0と等しければ、“0です”と表示
		else { System.out.println ( "負の数です" );} // 数値が0より小さければ、“負の数です”と表示
		
		
		//Q6
		
		
		int valse; // int型変数valseを宣言
		System.out.print("整数を入力: ");
		valse = scanner.nextInt(); // コンソール入力で整数を受け取る
		
		if (valse % 2 == 0) { System.out.println( "偶数です" ); } // 数値が偶数であれば、“偶数です”と表示
		else { System.out.println( "奇数です"); } // 数値が奇数であれば、“奇数です”と表示
		
		
		//Q7
		
		
		int scorE; // int型の変数Scoreを宣言
		System.out.print( "scoreを0から100の整数で入力: " );
		scorE = scanner.nextInt(); // コンソール入力で数値を受け取る
		scanner.nextLine();
		
		if ( scorE >= 90) { System.out.println ( "優" ); } // scoreが90以上なら“優”と表示
	    else if ( scorE >= 70 ) { System.out.println ( "良" ); } // scoreが70以上なら“良”と表示
	    else if ( scorE >= 50 ) { System.out.println ( "可" ); } // scoreが50以上なら“可”と表示
	    else { System.out.println( "不可" ); } // scoreが50未満なら“不可”の表示
		
		
		//Q8
		
		
		String input; // string型の変数inputを宣言
		System.out.print( "文字列を入力: " ); 
	    input = scanner.nextLine(); // コンソール入力を受け取る
		if ( input == null || input.isEmpty() ) { System.out.println( "入力が無効です" ); } // 入力がnullまたは空文字だった場合、無効の表示
		
		
		//Q9
		
		
		int day; // int型の変数dayを宣言
		System.out.print( "1～7の数字を入力: " );
		day = scanner.nextInt(); // コンソール入力を受け取る
		
		switch ( day ) {
		   case 1:
		    System.out.println( "月曜日" );
		    break;
		   case 2:
		    System.out.println( "火曜日" );
		    break;
		   case 3:
		    System.out.println( "水曜日" );
		    break;
		   case 4:
		    System.out.println( "木曜日" );
		    break;
		   case 5:
		    System.out.println( "金曜日" );
		    break;
		   case 6:
		    System.out.println( "土曜日" );
		    break;
		   case 7:
		    System.out.println( "日曜日" );
		    break;
		   default:
		    System.out.println( "無効な入力です" ); } // 数値に対応した曜日の表示、いずれにも該当しない場合、無効の表示
		
		
		// Q10
		
		
		int month; // int型の変数monthを宣言
		System.out.print( "1～12の数字を入力: " );
		month = scanner.nextInt(); // コンソール入力を受け取る
		
		switch (month) {
		   case 12 : case 1 : case  2 :
		    System.out.println( "冬" ); // 12,1,2の入力で“冬”の表示
		    break;
		   case 3 : case 4 : case 5 :
		    System.out.println( "春" ); // 3,4,5の入力で“春”の表示
		    break; 
		   case 6 : case 7 : case 8 :
		    System.out.println( "夏" ); // 6,7,8の入力で“夏”の表示
		    break;
		   case 9 : case 10 : case 11 :
		    System.out.println( "秋" ); // 9,10,11の入力で“秋”の表示
		    break;
		   default:
		    System.out.println( "無効な月です" ); } // いずれにも該当しない場合、“無効な月です”の表示

		
         scanner.close();
		
		
	}
		
}
