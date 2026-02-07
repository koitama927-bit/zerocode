package curriculum.q5;

public class Animal {
	
	private String name;
	private double length;
	private int speed; // 動物名、体長、速度それぞれのフィールドを作成
	
	public String getName() {
	    return this.name ; // 動物名のgetterを作成
	}
    public void setName( String name ) {
        this.name = name ; // thisを使い動物名のsetterを作成
    }

    
	public double getLength() {
	    return this.length ; // 体長のgetterを作成
	}
    public void setLength( double length ) {
        this.length = length ; // thisを使い体長のsetterを作成
    }
    
    
    public int getSpeed() {
    	return this.speed ; // 速度のgetterを作成
    }
    public void setSpeed( int speed ) {
    	this.speed = speed ; // thisを使い速度のsetterを作成
    }

   

}
