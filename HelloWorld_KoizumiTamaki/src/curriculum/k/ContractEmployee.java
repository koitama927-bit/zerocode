package curriculum.k;

public class ContractEmployee extends NewEmployee {

	public ContractEmployee (String name) {
		super( name ); // nameを受け取るコンストラクタを作成

	}

	@Override
	public int costForDay(int hoursWorked) {
		return hoursWorked * 1000; // 給与の計算式

	}

}
