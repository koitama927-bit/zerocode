package curriculum.l;

public class Main {

	public static void main(String[] args) {
		
		Person person1 = new Person( "鈴木太郎", 20, 1.7, 60 ); 
		
		person1.print();
		Person.printCount(); // メソッドを呼び出し出力
		
	}

}
