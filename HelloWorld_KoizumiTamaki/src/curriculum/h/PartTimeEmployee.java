package curriculum.h;

public class PartTimeEmployee extends Employee { // 親クラスEmployeeを継承
	
	private static final int HOURLY_RATE = 1000 ; // パート社員の時給を定数で設定

	public PartTimeEmployee ( String id , String name ) {
		super ( id, name );	 // idとnameを受け取るコンストラクタを作成
	}
	
	@Override
	public int calculateDailyWage ( int hoursWorked ) {
	 int wage = HOURLY_RATE * hoursWorked;
	 return wage;
	 
	}

}
