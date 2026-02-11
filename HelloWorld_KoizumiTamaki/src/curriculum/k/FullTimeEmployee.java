package curriculum.k;

public class FullTimeEmployee extends NewEmployee {

	public FullTimeEmployee(String name) {
		super(name); // nameを受け取るコンストラクタを作成

	}

	@Override
	public int costForDay(int hoursWorked) {
		return hoursWorked * 1200; // 給与の計算式

	}

}
