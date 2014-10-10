package helloworld;

public class NumberTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		NumberInfo n=new NumberInfo(3);
		System.out.println(n.getValue());
		n.increment();
		System.out.println(n.getValue());
		n.increment();
		System.out.println(n.getValue());
		n.increment();
		System.out.println(n.getValue());
	}

}
