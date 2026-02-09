package curriculum.h;

public abstract class Employee {

	private String employeeId;
	private String name; // フィールドを作成

	public Employee(String id, String name) {
		employeeId = id;
		this.name = name;
	}

	public String getEmployeeId() {
		return this.employeeId; // getterを作成
	}

	public String getName() {
		return this.name; // getterを作成
	}

	public abstract int calculateDailyWage(int hoursWorked); // 就業時間の設定でintを返すメソッドを作成

}
