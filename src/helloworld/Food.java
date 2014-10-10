package helloworld;

public class Food {

	private String name;
	private double saturateFat;
	
	public Food(String name,double saturateFat)
	{
		this.setName(name);
		this.setSaturateFat(saturateFat);
	}
	
	public String getName() {
		return name;
	}
	private void setName(String name) {
		this.name = name;
	}
	public double getSaturateFat() {
		return saturateFat;
	}
	private void setSaturateFat(double saturateFat) {
		this.saturateFat = saturateFat;
	}
	

	
}
