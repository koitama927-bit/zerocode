package curriculum.b;

import q4.Greeting;
import q5.Animal;

public class Main {

	public static void main(String[] args) {
		
	// Q4
		
	Greeting.sayHello () ; // GreetingクラスからsayHelloメソッドを呼び出し


	// Q5
	
	
	Animal animal = new Animal() ;
	
	animal.setName ( "ライオン" );
	animal.setLength( 2.1 );
	animal.setSpeed( 80 );
	
	 System.out.println("動物名: " + animal.getName() );
     System.out.println("体長: " + animal.getLength() + "m");
     System.out.println("速度: " + animal.getSpeed() + "km/h");
    
	
	}

}
