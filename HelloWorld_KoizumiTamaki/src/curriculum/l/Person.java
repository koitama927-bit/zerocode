package curriculum.l;

public class Person {

	private String name;
	private int age;
	private double height;
	private double weight; // インスタンスフィールドを定義

	static int count = 0; // 人数カウント

	public Person(String name, int age, double height, double weight) {
		this.name = name;
		this.age = age;
		this.height = height;
		this.weight = weight; // インスタンスフィールドに値をセット
		count++; // Personが新しく作られたら人数を1増やす

	}

	public double bmi() {
		double bmi = weight / (height * height); // 身長と体重からBMIを求める計算
		return (int) (bmi * 100) / 100.0; // 小数点第2位で切り捨て

	}

	public void print() {
		System.out.println("名前は" + this.name + "です");
		System.out.println("年は" + this.age + "です");
		System.out.println("BMIは" + bmi() + "です"); // 出力表示用メソッド

	}

	public static void printCount() {
		System.out.println("合計" + count + "人です"); // カウント人数出力表示用メソッド
	}

}
