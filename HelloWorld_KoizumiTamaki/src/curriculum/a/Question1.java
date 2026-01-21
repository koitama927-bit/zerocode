package curriculum.a;

import java.text.DecimalFormat;

public class Question1 {

	public static void main(String[] args) {
		
		/*
		 * [概要] 変数の宣言・初期値の設定、代入処理
         * [詳細] 各データ型の変数を宣言、初期値を設定し、その後代入する。
		 */
		
		//Q1
		 
		byte byteNum = 0; // 変数byteNumを宣言し、初期値を設定
		
		short shortNum = 0; // 変数shortNumを宣言し、初期値を設定
		
		int intNum = 0; // 変数intNumを宣言し、初期値を設定
		
		long longNum = 0L; // 変数longNumを宣言し、初期値を設定
		
		float floatNum = 0.0f; // 変数floatNumを宣言し、初期値を設定
		
		double doubleNum = 0.0; // 変数doubleNumを宣言し、初期値を設定
		
		char letter = '\u0000'; // 変数letterを宣言し、初期値を設定
		
		String letters = null; // 変数lettersを宣言し、初期値を設定
		
		boolean isBoolean = false; //変数isBooleanを宣言し、初期値を設定
		
		/*
		 *[詳細]Question1で設定した初期値に新たな数値を代入する。
		 */
		
		// Q2	
		
		byteNum = 10; // 変数の値を更新
		
		shortNum = 100; // 変数の値を更新
		
		intNum = 1000; // 変数の値を更新
		
		longNum = 10000; // 変数の値を更新
		
		floatNum = 9.5f; // 変数の地を更新
		
		doubleNum = 10.5; // 変数の値を更新
		
		letter = 'a'; // 変数の値を更新
		
		letters = "ハロー"; // 変数の値を更新
		
		isBoolean = true; //変数の値を更新 
		
		
		/*
		 *[詳細]値を代入した変数を用いて出力する。
		 */
		
		//Q3
		
		System.out.println( byteNum + shortNum + intNum + longNum ); // 設定した値を使い11110を出力
		
		System.out.println( byteNum  * 2 ); // 設定した値を使い20を出力

		System.out.println( "" + letter + letters + isBoolean ); // 設定した値を使い"aハローture"を出力
		
		DecimalFormat df = new DecimalFormat("#.#"); // 小数点以下の数字が0の場合、表示しない
		String formattedNumber = df.format(byteNum + shortNum + intNum + longNum + floatNum + doubleNum ); // 計算結果をフォーマットに代入
		System.out.println( formattedNumber );// 設定した値の数字をすべて足し、11130を出力
		
		System.out.println( byteNum * shortNum * intNum * longNum );
		// 設定した値の小数点以外の数字をすべて掛けて出力
		
		System.out.println( doubleNum / shortNum ); // 10.5割る100均をして出力
		
		System.out.println( byteNum - shortNum ); // 10引く100をして出力
		
		
		//Q4
		
		
		String name = "山田太郎"; // String型の変数nameを宣言し、"山田太郎"を代入
		System.out.println( "こんにちは、" + name + "さん！"); // name変数を利用して挨拶を表示
		
		
		//Q5
		
		int age = 25; // int型の変数ageを宣言し、25を代入
		System.out.println( "年齢:" + age + "歳" ); // age変数を利用して年齢を表示
		
		
		//Q6
		
		int num1 = 10; // int型の変数num1を宣言し、10を代入
		int num2 = 5 ; // int型の変数num2を宣言し、５を代入
		int sum = ( num1 + num2 ); // int型の変数sumを宣言し、num1変数とnum2変数の和を代入
		System.out.println( "計算結果:" + sum ); //計算結果を表示
		
		
		//Q7
		
		
		int score = 80; // int型の変数scoreを宣言し、８０を代入
		score = score + 20; // scoreの現在の値(80)に20を足して、scoreに再代入
		System.out.println( "最終スコア:" + score ); // score変数を利用して、最終スコアを表示
		
		/*
		 * [詳細]変数の型変換を利用し、出力する。
		 */
		
		
		//Q8
		
		
		double price = 99.99; // double型の変数priceを宣言し、99.99を代入
		int newprice = (int) price; // double型priceをint型に変換（小数点以下切り捨て）
		System.out.println( "整数価格:" + newprice ); // 変換した変数を利用して表示
		
		
		//Q9
		
		
		String numStr = "123"; //String型の変数numStrを宣言し"123"を代入
		int str = Integer.parseInt( numStr ); // 文字列をintに変換
		System.out.println( str + 10 ); // 変換した変数を利用して表示
	
		
		//Q10
		
		
		int num = 50;// int型の変数numを宣言し、50を代入
		String nuM = String.valueOf(num); // intを文字列に変換
		System.out.println( "‟得点：" + nuM + "点‟");  // 変換した変数を利用して表示
		
		
		//Q11
		
		
		int a = 10; // int型の変数aを宣言し、10を代入
		int b = 20; // int型の変数bを代入し、20を代入
		boolean result = ( a < b ); // boolean型の変数resultにa<bの比較演算子を代入
		System.out.println( result ); // 結果を表示
		
		
		//Q12
		
		
		int x = 15; // int型の変数xを宣言し、15を代入
		String  y =  x > 10 ? " OK " : " NG " ; // 三項演算子を代入xが10以上ならOK、そうでなければNGの表示
		System.out.println( y ); // 結果を表示
		
		
		//Q13
		
		
		String text = "私はJavaが好きです。Javaは楽しい！"; // String型の変数textを宣言し、文を代入
		String newtext = text.replace ( "Java",  "Python" ); // String型の変数text2を宣言し、”Java”を”Python”に置き換える
		System.out.println( newtext ); // 置き換えた文を表示
		
		
	}

}
