package helloworld;

public class Meal {

	private Food starter;
	private Food mainCourse;
	
	public Meal(Food starter, Food mainCourse)
	{
		this.starter=starter;
		this.mainCourse=mainCourse;
	}
	
	public double caluclateTotalSaturatedFat()
	{
		return this.starter.getSaturateFat()+this.mainCourse.getSaturateFat();
	}

	@Override
	public String toString() {
		return "Meal [starter=" + starter.getName() + ", mainCourse=" + mainCourse.getName() + "]";
	}
	
	
}
