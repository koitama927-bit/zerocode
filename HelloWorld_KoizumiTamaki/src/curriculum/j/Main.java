package curriculum.j;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {

		List<Billable> employees = new ArrayList<>(); // Billable型のリストを作成
		FullTimeEmployee full = new FullTimeEmployee("E001", "佐藤太郎");
		ContractEmployee cont = new ContractEmployee("E002", "田中花子"); // コンストラクタを使って社員を作成
		
		employees.add(full);
		employees.add(cont); // リストに2名の社員を追加
		
		for (Billable b : employees) {
			int cost = b.costForDay(9); // 9時間働いた場合の給与を、メソッドを呼び出し計算
			System.out.println( cost ); // 計算した給与を出力
		}

	}

}
