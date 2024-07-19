package doubt;

public class ReturnTypeDemo {

	public static void main(String[] args) {
		/*
		String str = "Arun Motoori";
		
		int n = str.substring(5).substring(2,4).replace("to","from").length();
		
		System.out.println(n);*/
		
		StringBuffer sb = new StringBuffer("Arun");
		System.out.println(sb);
		sb.append(" ").append("Motoori").reverse();
		System.out.println(sb);
		
		String palindrome = "Dot saw I was Tod";
		int len = palindrome.length();
		System.out.println(len);
		
		//DAY 74 BATCH ONE

	}

}
