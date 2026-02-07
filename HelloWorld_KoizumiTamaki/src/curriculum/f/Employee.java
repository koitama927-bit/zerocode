package curriculum.f;

public class Employee {
	
	private String employeeId;
	private String name; // フィールドを設定
	
	public void showInfo() {
		System.out.println ( "社員ID:" + employeeId + " 名前:" + name );
	}
		
	    public String getEmployeeId() {
	    return this.employeeId ; // getterを作成
	}

	    public void setEmployeeId( String employeeId ) {
	        this.employeeId = employeeId ; // setterを作成
	    

	}
	    public String getName() {
	    return this.name ; // getterを作成
	}

	    public void setName( String name ) {
	        this.name = name ; // setterを作成
	    
	    }

}
