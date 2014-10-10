package helloworld;

public class NumberInfo {

	private int limit;
	private int value;
	
	
	public int getValue() {
		return value;
	}


	public void increment()
	{
		this.value+=1;
		this.value=(this.value)%this.limit;
		
		
		
	}


	public NumberInfo(int limit)
	{
		this.value=0;
		this.limit=limit;
	}
	
	
}
