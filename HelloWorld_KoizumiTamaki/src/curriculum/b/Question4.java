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
		
		
		int [] numbers5 = { 1, 2, 3, 4, 5 }; //int型の配列numbers5を宣言
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
		    
		    if ( input == 0 ) {
			       break; // 0の入力があった段階で終了する
			    }
		    
		    boolean found = false;  // あてはまる数値が見つかった場合、false
		    
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
		    
		    } else {
		    	System.out.println("数値を入力してください");
		        scanner.next(); }
		}
		
		scanner.close();
		
		
		// Q7
		
		
		int [][] array = { // 2次元配列arrayを宣言
				{ 1, 2 },
				{ 3, 4 },
				{ 5, 6 }
		};
		
		for ( int i = 0; i < array.length;  i++) { // 行をループ
			for ( int j = 0; j < array[i].length;  j++) {  // 列ループ
			System.out.print( array[i][j] + "　" ); // 要素をすべて表示
			}
			System.out.println(); // 改行
			}
		
		
		// Q8
		
		
		int [][] array2 = { // 2次元配列array2を宣言
				{ 10, 20, 30 },
				{ 40, 50, 60 },
				{ 70, 80, 90 }
		};
		
		int sum2 = 0; // array2の合計値を格納する変数を宣言
		for ( int i = 0;  i < array2.length;  i++) { 
			 for ( int j = 0; j  <  array2[i].length;  j++) {
			  sum2 += array2[i][j]; // 行、列それぞれの数値をsum2に格納
			 }
			}
			System.out.println(  "合計値："  + sum2 ); // 合計値を表示
		
		
		// Q9
			
			
		int [][] array3 = { // 2次元配列array3を宣言
				{ 12, 15, 18 },
				{ 6, 19, 25 },
				{ 30, 2, 10 }
		};
		
        int max2 = array3[0][0];
        int min2 = array3[0][0];
				
        for ( int i = 0; i < array3.length; i++ ) { // 行のループ
            for ( int j = 0; j < array3[i].length; j++) { // 列のループ
                if ( array3[i][j] > max2 ) {
                    max2 = array3[i][j]; // 最大値との比較
                }
                if ( array3[i][j] < min2 ) {
                    min2 = array3[i][j]; // 最小値との比較
                }
            }
        }
        System.out.println( "最大値: " + max2 ); // 最大値の表示
        System.out.println( "最小値: " + min2 ); // 最小値の表示
			
			
		// Q10
        
        
        int[][][] array4 = { // 3次元配列array4を宣言
        	    { {1, 2}, {3, 4} },
        	    { {5, 6}, {7, 8} }
        	    
        	};
			
        for ( int i = 0; i <  array4.length; i++ ) { // 1次元目のループ
            for ( int j = 0; j < array4[i].length; j++ ) { // 2次元目のループ
                for ( int k = 0; k <  array4[i][j].length;  k++) { // 3次元目のループ
                    System.out.print( array4[i][j][k]  +  " " ); 
                }
                System.out.println(); // 行ごとの改行
            }
            System.out.println(); // ブロックごとの改行
            
            
        }
	}

}
