package curriculum.h;

public class Main {

	public static void main(String[] args) {

		Employee full = new FullTimeEmployee("E001", "佐藤太郎");

		Employee part = new PartTimeEmployee("E002", "田中花子"); // コンストラクタの初期化（指定がなかったため空）

		System.out.println("正社員の給与:" + full.calculateDailyWage(9) + "円");
		System.out.println("パート社員の給与:" + part.calculateDailyWage(9) + "円");
		// メソッドを呼び出しそれぞれの給与を出力

	}

}
