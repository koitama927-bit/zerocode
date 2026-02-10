package curriculum.i;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {

		List<Employee> employees = new ArrayList<>(); // Employee型のリストを作成
		FullTimeEmployee full = new FullTimeEmployee("E001", "佐藤太郎");
		ContractEmployee cont = new ContractEmployee("E002", "田中花子"); // コンストラクタを使って社員を作成

		employees.add(full);
		employees.add(cont); // リストに2名の社員を追加

		for (Employee employee : employees) {

			int wage = employee.calculateDailyWage(9); // 9時間働いた場合の給与を、メソッドを呼び出し計算

			System.out.println(wage); // 計算した給与を出力
		}

	}

}
