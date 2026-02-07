package curriculum.e;

public class Employee {
	
	private  String name;
	
	public void work ( ) {
		System.out.println ( name + "は働いています。 " ); // 引数、戻り値なしでnameを表示するメソッド
		
	}
	
	    public String getName() {
	    return this.name ; // getterを作成
	}

	    public void setName( String name ) {
	        this.name = name ; // setterを作成
	    

	}

}
