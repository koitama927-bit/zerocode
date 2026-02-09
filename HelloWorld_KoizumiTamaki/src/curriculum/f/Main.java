package curriculum.f;

public class Main {

	public static void main(String[] args) {

		Employee employee = new Employee(); // Employeeのインスタンスを生成
		employee.setEmployeeId("E001"); // setEmployeeIdに"E001"を設定
		employee.setName("佐藤太郎"); // setNameに"佐藤太郎"を設定

		employee.showInfo(); // showInfoメソッドを呼び出して出力

	}

}
