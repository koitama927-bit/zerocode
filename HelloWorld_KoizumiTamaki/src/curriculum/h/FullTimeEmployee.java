package curriculum.h;

public class FullTimeEmployee extends Employee { // 親クラスEmployeeを継承

	private static final int HOURLY_RATE = 1200; // 正社員の時給を定数で設定

	public FullTimeEmployee(String id, String name) {
		super(id, name); // idとnameを受け取るコンストラクタを作成
	}

	@Override
	public int calculateDailyWage(int hoursWorked) {
		int wage; // 給与の合計を入れる変数を宣言
		if (hoursWorked <= 8) {
			wage = HOURLY_RATE * hoursWorked; // 8時間以内の場合
		} else {
			int overTime = hoursWorked - 8; // 残業時間を求める
			wage = (HOURLY_RATE * 8) // 通常時給分の給与
					+ (int) (HOURLY_RATE * 1.25 * overTime); // 残業文の給与
		}
		return wage; // 合計の給与を返す

	}
}
