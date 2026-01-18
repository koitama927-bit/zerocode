package curriculum.a;

public class Question1 {

	public static void main(String[] args) {
		
		/*
		 * [概要] 変数の宣言・初期値の設定、代入処理
         * [詳細] 各データ型の変数を宣言、初期値を設定し、その後代入する。
		 */
		
		//Question1
		 
		byte byteNum = 12; // 変数byteNumを宣言し、125を初期値に設定
		
		short shortNum = 125; // 変数shortNumを宣言し、125を初期値に設定
		
		int intNum = 1250; // 変数intNumを宣言し、1250を初期値に設定
		
		long longNum = 12500; // 変数longNumを宣言し、12500を初期値に設定
		
		float floatNum = 2026; // 変数floatNumを宣言し、2026を初期値に設定
		
		double doubleNum = 3.14; // 変数doubleNumを宣言し、3.14を初期値に設定
		
		char letter = 'W'; // 変数letterを宣言し、Wを初期値に設定
		
		String letters = "Java"; // 変数lettersを宣言し、Javaを初期値に設定
		
		boolean isBoolean = false; //変数isBooleanを宣言し、falseを初期値に設定
		
		/*
		 *[詳細]Question1で設定した初期値に新たな数値を代入する。
		 */
		
		// Question2	
		
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
		
		//Question3
		
		System.out.println( byteNum + shortNum + intNum + longNum ); // 設定した値を使い11110を出力
		
		System.out.println( byteNum  * 2 ); // 設定した値を使い20を出力

		System.out.println( letter + letters + isBoolean ); // 設定した値を使い"aハローture"を出力
		
		System.out.println( byteNum + shortNum + intNum + longNum + floatNum + doubleNum );
		// 設定した値の数字をすべて足し、11130を出力
		
		System.out.println( byteNum * shortNum * intNum * longNum );
		// 設定した値の小数点以外の数字をすべて掛けて出力
		
		System.out.println( doubleNum / shortNum ); // 10.5割る100均をして出力
		
		System.out.println( byteNum - shortNum ); // 10引く100をして出力
		
		
		//Question4
		
		
		String name = "山田太郎"; // String型の変数nameを宣言し、"山田太郎"を代入
		System.out.println( "こんにちは、" + name + "さん！"); // name変数を利用して挨拶を表示
		
		
		//Qestion5
		
		int age = 25; // int型の変数ageを宣言し、25を代入
		System.out.println( "年齢:" + age + "歳" ); // age変数を利用して年齢を表示
		
		
		//Question6
		
		int num1 = 10; // int型の変数num1を宣言し、10を代入
		int num2 = 5 ; // int型の変数num2を宣言し、５を代入
		int sum = ( num1 + num2 ); // int型の変数sumを宣言し、num1変数とnum2変数の和を代入
		System.out.println( "計算結果:" + sum ); //計算結果を表示
		
		
		//Qestion7
		
		
		int score = 80; // int型の変数scoreを宣言し、８０を代入
		score = score + 20; // scoreの現在の値(80)に20を足して、scoreに再代入
		System.out.println( "最終スコア:" + score ); 
	
	}

}
