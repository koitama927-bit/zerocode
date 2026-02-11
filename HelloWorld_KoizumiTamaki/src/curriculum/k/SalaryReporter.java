package curriculum.k;

public class SalaryReporter {

	public static void main(String[] args) {

		FullTimeEmployee full = new FullTimeEmployee ( "佐藤太郎" ); // FullTimeEmployeeのnameを設定
		ContractEmployee cont = new ContractEmployee ( "田中花子" ); // ContractEmployeeのnameを設定
		
		System.out.println( full.getName()+ "の給料は"  + full.costForDay(9) + "円");
		System.out.println( cont.getName()+ "の給料は"  + cont.costForDay(9) + "円");
		// それぞれの給与をメソッドを利用し出力
		
	}

}
