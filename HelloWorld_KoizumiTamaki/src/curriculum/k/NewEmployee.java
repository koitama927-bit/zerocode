package curriculum.k;

abstract class NewEmployee implements Payable { // Payableを実装した抽象クラスEmployeeを作成

	protected String name;

	public NewEmployee( String name ) {
		this.name = name; 
		// if分岐の代わりにタイプごとのクラスで計算する、メソッドで就業時間を受け取るためｔype、hoursを削除
	}
	
	public String getName() {
	    return name; // 出力に表示するnameを受け取る
	}
	
	public abstract int costForDay(int hoursWorked); // Payableのメソッドを抽象メソッドとして作成

}
