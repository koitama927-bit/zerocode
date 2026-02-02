package curriculum.b;

public class Question5 {
	
	/*
	 * [概要] メソッド
	 * [詳細] 各Qで利用するそれぞれのメソッドを用意する
	 */
	
	
	
	// Q1
	
	
	public static void helloWorld ( ) {
		System.out.println ( " Hello,World! " ); // 引数、戻り値なしで“Hello,Wold!”を表示するメソッド
	}
	
	
	// Q2
	
	
	public static int doubleValue ( int num ) {
		return num * 2 ; // 引数int num 戻り値が引数の2倍の値になるメソッド
	}
	
	
	// Q3
	
	
	public static boolean isEven ( int num ) {
		return num % 2 == 0;  // 引数int numが偶数の場合ture,奇数の場合falseで返すメソッド
	}
	
	
	/*
	 * 	[詳細] 各メソッドを利用した実際の処理
	 */
	
	
	public static void main(String[] args) {
		
		
	// Q1 
		
	helloWorld (); // メソッド呼び出し
	
	
	// Q2
	
	
	int result = doubleValue ( 10 ); // doubleValueメソッドを引数10で呼び出し
	System.out.println ( "10を2倍すると" + result + "です。" ); // 戻り値を利用して表示
	
	
	// Q3
	
	int num1 = 7 , num2 =10 ; // int型の変数num1,num2にそれぞれ7,10を代入
	
	System.out.println( num2 + (isEven(num2) ? "は偶数です。" : "は奇数です。") );
	System.out.println( num1 + (isEven(num1) ? "は偶数です。" : "は奇数です。") ); // メソッドisEvenを呼び出し表示

		
	}

}
