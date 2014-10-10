package helloworld;

public class ClockDisplayTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ClockDisplay cd=new ClockDisplay();
		
		for(int i=0;i<5000;i++)
		{
			cd.timeTick();
			System.out.println(cd.toString());
		}
	}

}
