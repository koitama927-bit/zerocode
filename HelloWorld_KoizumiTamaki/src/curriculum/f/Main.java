package curriculum.f;

public class Main {

	public static void main(String[] args) {

		Employee emp = new Employee (); // Employeeのインスタンスを生成
		emp.setEmployeeId( "E001" ); // setEmployeeIdに"E001"を設定
		emp.setName( "佐藤太郎"); // setNameに"佐藤太郎"を設定
		
    emp.showInfo(); // showInfoメソッドを呼び出して出力
	
	}

}
