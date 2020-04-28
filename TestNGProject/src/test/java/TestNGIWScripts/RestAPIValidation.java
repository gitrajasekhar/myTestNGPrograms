package TestNGIWScripts;

import java.util.Iterator;
import java.util.List;

import org.json.simple.JSONObject;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class RestAPIValidation {
	
	
	// *********************************************************
	   // List of API's GET Call: GET - URIs
	/*
		 * http://restapi.demoqa.com/utilities/weather/city/Hyderabad
		 * http://dummy.restapiexample.com/api/v1/employees
		 * http://jsonplaceholder.typicode.com/posts/5
	 
	 */	// *********************************************************	
	  // List of API's GET Call: POST - URIs
		/*
		 * http://restapi.demoqa.com/customer/register - not working
		 * http://dummy.restapiexample.com - Check for POST Call - working
		 * http://jsonplaceholder.typicode.com/guide.html - working
		 */	 
	//*********************************************************
	
	//=============================================
	 /* Below code developed using HTTPURLConnection:
	//=============================================
	 
	 * @Test public void GetCallUsingHttpURLConnection() throws IOException{ URL url
			 * = new URL("http://dummy.restapiexample.com/api/v1/employees");
			 * HttpURLConnection connection =(HttpURLConnection) url.openConnection();
			 * connection.setRequestMethod("GET"); connection.connect();
			 * System.out.println(connection.getResponseMessage());
			 * System.out.println(connection.getResponseCode()); }
 	 * @Test public void POSTCallUsingHttpURLConnection() throws IOException{
 			 * URL url = new URL("http://dummy.restapiexample.com/api/v1/employees");
			 * HttpURLConnection connection =(HttpURLConnection) url.openConnection();
			 * connection.setRequestMethod("POST");
			 * connection.setRequestProperty("Content-Type", "application/json"); String
			 * jsonBody = "{\"name\":\"Raj\",\"salary\":\"11111\",\"age\":\",\"}";
			 * byte[]inputjson = jsonBody.getBytes();
 			 * OutputStream outputStream = connection.getOutputStream();
			 * outputStream.write(inputjson);
			 * System.out.println(connection.getResponseCode());
			 * System.out.println(connection.getResponseMessage());
 			 * }
	 */
			
 @Test(enabled=false)
 public void GETCallUsingRestAssured() {
	 
	 RestAssured.baseURI = "http://dummy.restapiexample.com/api/v1";
	 RequestSpecification httpRequest = RestAssured.given();
	 
	 Response response = httpRequest.request(Method.GET,"/employees");
	 
	 System.out.println("GETCallUsingRestAssured Method - response body - "+ response.getBody().asString());
	 System.out.println("GETCallUsingRestAssured Method - response status code - " + response.getStatusCode());
	 System.out.println("GETCallUsingRestAssured Method- status line - "+ response.getStatusLine());
	 System.out.println(response.getContentType().contains("success"));
	 JsonPath jsonpath = response.getBody().jsonPath();
	 System.out.println("the value of status - " + jsonpath.get("status"));
	 //System.out.println("the value of data is - " + response.getBody().jsonPath(). 
	 System.out.println("response content type is --" + response.getContentType());
 	 List<Object> list = response.getBody().jsonPath().getList("data.id");
 	 Iterator<Object> i = list.iterator();
	 while(i.hasNext()) {
		 System.out.println(i.next());
 	 }
 	String theResponseBody = response.getBody().asString();
 	//System.out.println(response.getBody().jsonPath().get("data[0].employee_age"));
 	Assert.assertEquals(theResponseBody.contains("Tiger Nixon"),true); // to validate if Tiger Nixon exists in the response or not.
 	     
 }
 @Test(enabled=true)
 public void POSTCallUsingRestAssured() {
	 
	 RestAssured.baseURI = "http://dummy.restapiexample.com/api/v1";
	 RequestSpecification httpRequest = RestAssured.given();
	 
	 JSONObject responseparams = new JSONObject();
	 responseparams.put("name","rajasekhar121");
	 responseparams.put("salary","1232131321");
	 responseparams.put("age","3321");
 	 httpRequest.body(responseparams.toJSONString());
 	 Response response = httpRequest.request(Method.POST,"/create");
 	 System.out.println("POSTCallUsingRestAssured Method - response body - "+ response.getBody().asString());
	 System.out.println("POSTCallUsingRestAssured Method - response status code - " + response.getStatusCode());
	 System.out.println("POSTCallUsingRestAssured Method - status line - "+ response.getStatusLine());
	 System.out.println( "the valie of data name from Response is -- "+ response.getBody().jsonPath().get("data.name"));
	 Assert.assertEquals(response.getBody().jsonPath().get("data.name"), "rajasekhar121"); 
     System.out.println("the value of id is -- " + response.getBody().jsonPath().get("data.id")); 
    
     Response response1 = httpRequest.request(Method.GET,"/employee/"+response.getBody().jsonPath().get("data.id"));
     
     System.out.println("the response1 body is - " + response1.getBody().asString());
     
     System.out.println("the status code of Response1 - " + response1.getStatusCode());
     for(int i = 10; i<10;i++) {
    	 System.out.println(i);
     }
     
     
     
 }
	
 
 
 
 
 
	
}
