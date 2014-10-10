package helloworld;

public class MealTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Food starter=new Food("soup",5.3);
		Food mainCourse=new Food("Fish and Chips",20);
		
		Meal meal=new Meal(starter,mainCourse);
		
		if(meal.caluclateTotalSaturatedFat()>=20.0)
		{
			System.out.println(meal.toString());
			System.out.println("Saturated Fat " + meal.caluclateTotalSaturatedFat());
		}
	}

}
