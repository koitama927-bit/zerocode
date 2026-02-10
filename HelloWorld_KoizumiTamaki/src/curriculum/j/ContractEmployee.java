package curriculum.j;

public class ContractEmployee extends Employee { // 親クラスEmployeeを継承
	
	private static final int HOURLY_RATE = 1000; // パート社員の時給を定数で設定

	public ContractEmployee(String id, String name) {
		super ( id, name ); // idとnameを受け取るコンストラクタを作成
	}

	@Override
	public int costForDay(int hoursWorked) {
		int wage = HOURLY_RATE * hoursWorked; // 時給×労働時間で給与を求める
		return wage;

	}

}
