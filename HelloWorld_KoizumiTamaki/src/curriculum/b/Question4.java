package curriculum.b;

import java.util.Scanner;

public class Question4 {

	public static void main(String[] args) {

		/*
		 * [概要] 配列
		 * [詳細] 変数の配列をつかって課題を表示する
		 */

		// Q1

		int[] numbers1 = { 1, 2, 3, 4, 5 }; // int型の変数numbers1の配列を宣言
		for (int num : numbers1) {
			System.out.println(num); // 配列の要素を順番に表示

		}

		// Q2

		int[] numbers2 = { 10, 20, 30, 40, 50 }; // int型の変数numbers2の配列を宣言
		for (int i = numbers2.length - 1; i >= 0; i--) {
			System.out.println(numbers2[i]); // 配列の要素を逆順に表示
		}

		// Q3

		int[] numbers3 = { 3, 5, 7, 9, 11 }; // int型の変数numbers3の配列を宣言
		int sum = 0; // nembers3の合計を格納する変数sumを宣言
		for (int numberSum : numbers3) {
			sum += numberSum; // 配列の要素を合計
		}
		System.out.println("合計: " + sum); // 合計値を表示

		// Q4

		int[] numbers4 = { 12, 7, 9, 21, 5, 18 }; // int型の変数numbers4の配列を宣言
		int max = numbers4 [0]; // 仮の最大値を初期化
		int min = numbers4 [0]; // 仮の最小値を初期化
		
		for (int i = 1; i < numbers4.length; i++) {
			if ( numbers4[i] > max ) {
			max = numbers4[i]; // 配列の数値をmaxと比較
			}
			if ( numbers4[i] < min ) {
			min = numbers4[i]; // 配列の数値をminと比較
			}
		}
		
		System.out.println("最大値: " + max ); // 最大値を表示
		System.out.println("最小値: " + min ); // 最小値を表示
		
		
		// Q5
		
		
		int [] numbers5 = { 1, 2, 3, 4, 5, }; //int型の配列numbers5を宣言
		for ( int d  : numbers5 ) {
			System.out.println( d * 2 ); // 各要素の2倍をを表示
			
		}
		
		
		// Q6
		
		
		int [] numbers6 = { 4, 7, 10, 15, 20 }; // int型の変数numbers6の配列を宣言
		
		Scanner scanner = new Scanner (System.in);
		while ( true ) {
		    System.out.print("数値を入力してください (終了：0) : "); // コンソール入力で数値を受け取る 
		    
		    if ( scanner.hasNextInt() ) {
		    int input = scanner.nextInt(); // 入力が数値か判断する
		    boolean found = false;  // あてはまる数値が見つかった場合、false
		    
		    if ( input == 0 ) {
		       break; // 0の入力があった段階で終了する
		    }

		    for (int p : numbers6) {
		        if (p == input) {
		            found = true;
		            break; // 配列の要素の中に当てはまる数字が見つかった場合、そこでループを終了する
		        }
		    }

		    if (found) {
		        System.out.println(input + "は配列に含まれています"); // 配列にあてはまった場合の表示
		    } else {
		        System.out.println(input + "は配列に含まれていません");} // 配列に当てはまらなかった場合の表示
		    
		   
		    
		    }
		}
		scanner.close();
		    
	}

}
