package bootstrapdropdowndemo;

public class SampleReturnDemo {

	public static void main(String[] args) {

		add(3, 5);

		add(10, 20);
		
		int a = addtwo(3, 5);

		int b = addtwo(10, 20);
		
		System.out.println(a+10);
		System.out.println(b-15);

	}

	public static void add(int a, int b) {

		int sum = a + b;
		System.out.println(sum);

	}

	public static int addtwo(int a, int b) {

		int sum = a + b;

		return sum;

	}

}
