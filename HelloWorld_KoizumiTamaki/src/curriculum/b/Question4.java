package curriculum.b;

public class Question4 {

	public static void main(String[] args) {
		
	    /*
		 * [概要] 配列
	     * [詳細] 変数の配列をつかって課題を表示する
		 */
	
	// Q1
	
	int [] number = { 1, 2, 3, 4, 5 }; // int型の変数numberの配列を宣言
	for ( int num : number ) {
		System.out.println( num ); // 配列の要素を順番に表示
		
	}
	
	
	//Q2
	
	
	int [] numbers = { 10, 20, 30, 40, 50 }; // int型の変数numbersの配列を宣言
	for ( int i = numbers.length - 1; i >= 0; i-- ) {
		System.out.println( numbers[i] ); // 配列の要素を逆順に表示
	}
	
	
	//

	}

}
