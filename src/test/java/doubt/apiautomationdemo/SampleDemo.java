package doubt.apiautomationdemo;

import io.restassured.RestAssured;
import static io.restassured.RestAssured.*;
import io.restassured.response.Response;

public class SampleDemo {

	public static void main(String[] args) {

		RestAssured .baseURI = "https://reqres.in/";
		
		Response resonse =RestAssured. get("/api/users?page=2");
		
		int statusCode = resonse.getStatusCode();
		System.out.println(statusCode);
		
		//Day 79 video batch one

	}

}
