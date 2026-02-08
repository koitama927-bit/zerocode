package curriculum.g;

public class Main {

	public static void main(String[] args) {

    Employee emp = new Employee(); // Employeeオブジェクトを生成
    
    emp.setEmployeeId ( "E002" );
    emp.setName ( "田中花子" ); // setメソッドでIDと名前を設定
    
    System.out.print ( "社員ID:" + emp.getEmployeeId() );
    System.out.print ( " 名前:" + emp.getName() ); // getメソッドを使い出力
    
	}

}
