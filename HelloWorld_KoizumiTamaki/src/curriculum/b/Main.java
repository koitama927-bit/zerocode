package curriculum.b;

import q4.Greeting;
import q5.Animal;

public class Main {

	public static void main(String[] args) {
		
	// Q4
		
	Greeting.sayHello () ; // GreetingクラスからsayHelloメソッドを呼び出し


	// Q5
	
	
	Animal animal = new Animal() ; // animalインスタンスを作成
	
	animal.setName ( "ライオン" ); // setNameに“ライオン”を設定
	animal.setLength( 2.1 ); // setLengthに2.1を設定
	animal.setSpeed( 80 ); // setSpeedに80を設定
	
	 System.out.println("動物名: " + animal.getName() ); // 動物名を表示
     System.out.println("体長: " + animal.getLength() + "m"); // 体長を表示
     System.out.println("速度: " + animal.getSpeed() + "km/h"); // 速度を表示
    
	
	}

}
