package curriculum.b;

import java.util.Scanner;

public class Question3 {

	public static void main(String[] args) {
		
    /*
	 * [概要] for型反復処理、while型反復処理
     * [詳細] for型、while型反復処理を使い分けて課題を出力する
	 */
	

	// Q1
		
		
	for ( int i = 1; i <= 10; i++ ) { 
	System.out.println( "カウント：" + i); } // 1から10までの数を表示
	
	
	// Q2
	
	
	for ( int q2 = 1; q2 <= 20 ; q2++ ) {
	if ( q2%2 != 0 ) {
	continue; } 
	System.out.println( "カウント：" + q2 ); } // // 2から20までの偶数を表示（奇数の時はスキップ）
	
	
	// Q3
	
	
	for ( int q3 = 10; q3 >= 1 ; q3-- ) { 
	System.out.println( "カウント：" + q3); } // 10から1までの数をカウントダウンで表示
	
	
	// Q4 
	
	
	int sum = 0; // 合計を表示するための変数sumを宣言
	for ( int q4 = 1; q4 <= 100; q4++ ) {
	sum += q4;}
	System.out.println( "合計：" + sum ); // 1から100までの合計を表示
	
	
	// Q5
	
	
	for ( int q5 = 1; q5 <= 5; q5++) {
		for ( int qq5 = 1; qq5 <= q5; qq5++) {
		System.out.print( "*" ); }
		System.out.println();
		}
	
	
	// Q6
	
	
	int count = 1; // カウントするint型の変数countを宣言
	
	while ( count <= 10 ) {
    System.out.println( "カウント：" + count ); 
    count ++ ;} // countが10以下の間、1ずつ増加をループ
	
	
	// Q7
	
	
	int countq7 = 1; // カウントするint型の変数zountq7を宣言
	while ( countq7 <= 20 ) {
	if ( countq7%2 == 0 ) {
    System.out.println( "カウント：" + countq7 ); } // countが20以下の間の偶数を表示
    countq7 ++ ;  // countが20以下の間、1ずつ増加をループ
	}
	
	
	// Q8
	
	
	int countq8 = 10; // カウントするint型の変数countq8を宣言
	while ( countq8 >= 1 ) {
    System.out.println( "カウント：" + countq8 ); // 数が1以上の間ループ
	countq8 -- ; // countq8を1ずつ減らす
	}
	
	
    // Q9 
	
	int sumq9 = 0; // 合計を表示するための変数sumq9を宣言
	int countq9 = 1; // カウントする変数countq9を宣言
	while ( countq9 <= 100 ) {
	sumq9 += countq9;
	countq9 ++;} // countq9が100以下の間、1ずつ増加
	
	System.out.println( "合計：" + sumq9 );
	
	
	
	// Q10
	
	
	Scanner scanner = new Scanner (System.in);
	while ( true ) {
    System.out.print("数値を入力してください（終了: 0）: "); // コンソール入力で数値を受け取る 
    
    if ( scanner.hasNextInt() ) {
	int input = scanner.nextInt();	// 入力が数値か判断する
	
	if (input == 0) { // 入力された数値が0の場合ループを終了する
		break; }
	System.out.println( "入力された数値: " + input );  // 入力された数値を表示する
	}
    else { 
    System.out.println( "入力が無効です" ); // 数値以外が入力された際表示
    scanner.next(); }
	
	}
	
	System.out.println( "終了しました" );  // 0が入力された場合、終了の表示をする

	
	
	// Q11
	
	
	for ( int q11 = 1; q11 <= 9; q11++ ) { // 九九表の行の数を指定する
	 for ( int j = 1; j <= 9; j++ ) { // 九九表の列の数を指定する
     System.out.printf( "%02d * %02d = %02d || " ,  q11 , j , q11 * j );	} // 表示のフォーマットを指定し、数値を当てはめる
		
	System.out.println(); // 行の終わりで改行
	System.out.println(); // 空行を追加
	}
	
	
	// Q12
	
	
	System.out.print("商品名をしてください（、区切り）: "); // コンソール入力を受けとる
	scanner.nextLine(); // Q10の改行を消化する
	String input = scanner.nextLine();
	String[] inputs = input.isEmpty()
	        ? new String[0]
	        : input.split("、"); // 入力された文字列を、で区切る
	
	int tvStock = (int) (Math.random() * 12); // テレビとディスプレイの共有ランダム値を設定する
	
	for ( String unit : inputs ) {
		
		int stock = (int) (Math.random() * 12); // それぞれの残り台数をランダムで生成する
	 
	 switch ( unit ) {
	   case "パソコン":
	    System.out.println( unit + "の残り台数は" + stock + "台です" );
	    break;
	   case "冷蔵庫":
	    System.out.println( unit + "の残り台数は" + stock + "台です"  );
	    break;
	   case "扇風機":
	    System.out.println( unit + "の残り台数は" + stock + "台です" );
	    break;
	   case "洗濯機":
	    System.out.println( unit + "の残り台数は" + stock + "台です" );
	    break;
	   case "加湿器":
	    System.out.println( unit + "の残り台数は" + stock + "台です" );
	    break; // "パソコン",  "冷蔵庫", "扇風機", "洗濯機", "加湿器",の入力があった場合、ランダムで残り台数を表示する
	    
	   case "テレビ":
	   case "ディスプレイ":
	    System.out.println( 
	    		unit.equals( "テレビ" )
	    		? "テレビの残り台数は" + tvStock + "台です"
	    	    : "ディスプレイの残り台数は" + ( 11 - tvStock ) + "台です"
	    		);
	    break; // "テレビ", "ディスプレイ"の入力があった場合変数tvStockを利用して合計値が11になるように表示する
	    
	   default:
	    System.out.println( "『 "  +  unit +  "』は指定の商品ではありません"); // 上記以外の入力があった場合表示する
	  }
	 
	}
	
	scanner.close();
	
	}

}


