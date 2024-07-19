package actionsmousekeyboardeventsdemo;

import java.util.Date;

public class TimeStampDemo {

	public static void main(String[] args) {

		Date date = new Date();
		String newEmail = date.toString().replace(" ","_").replace(":","_").concat("@gmail.com");
		//String newEmail = date.toString().replace(" ","_").replace(":","_")+"@gmail.com";
		System.out.println(newEmail);
		
		//Day 84 video batch one
	}

}
