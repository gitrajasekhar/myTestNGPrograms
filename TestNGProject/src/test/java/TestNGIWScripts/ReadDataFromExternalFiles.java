package TestNGIWScripts;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Properties;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.testng.annotations.Test;

import com.google.gson.JsonArray;

import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class ReadDataFromExternalFiles {

	@Test
	public void ReadDataFromPropertyFile() throws IOException {
		
		//read a key from properties file:
 		FileInputStream fr = new FileInputStream("PropertyFile.properties");
		Properties prop = new Properties();
		prop.load(fr);
		System.out.println(" ****************** Read value from Property File ************************");
		System.out.println(prop.get("Browser"));
		System.out.println(prop.get("Platform"));
		prop.getProperty("Browser");
 	}
	
	@Test
	public void ReadDataFromTextFile() throws IOException{
		
		//Read data from Text File:
		FileReader fr = new FileReader("ReadTextFile.txt");
		BufferedReader br = new BufferedReader(fr);
		String line = br.readLine();
		
		System.out.println(" ****************** Read lines from TXT File ************************");
		
		while((line = br.readLine())!=null) {
			System.out.println(line);
		}
	}
	
	@Test
	public void WriteDataToTextFile() throws IOException{
		
		System.out.println(" ****************** Write lines to TXT File ************************");
				
		//Read data from Text File:
		FileWriter fw = new FileWriter("WriteTextFile.txt");
		fw.write("This is first line + /n");
 		fw.write("This is second line + /n");
	 	fw.write("This is third line + /n");
		fw.write("This is fourth line + /n");
		fw.close();
 	}
	
	@Test
	public void WriteDataToJSON() throws IOException{
		
		System.out.println(" ****************** Write a JSON File ************************");
				
		//Create a JSON File - Add a JSON-Simple Maven Dependency:
		JSONObject jsonobj = new JSONObject();
		jsonobj.put("firstname", "raja");
		jsonobj.put("lastname", "sekhar");
 
		JSONArray jsonarray = new JSONArray();
 		 jsonarray.add("street"+":stree1");
 		 jsonarray.add("city:" + "hyd");
		 jsonarray.add("state:"+"TL");
		 
		jsonobj.put("address",jsonarray);
		
		System.out.println("the json look like -- " + jsonobj);
			 
	 
			
 	}
    
	@Test
	public void ReadDataFromJSONFile() throws IOException, ParseException{
		
		System.out.println(" ****************** Read a JSON File ************************");
		FileReader fr = new FileReader("jsonFile.json");
		JSONParser jsonparser = new JSONParser();
		Object obj = jsonparser.parse(fr);
				
		JSONObject jsonobject = (JSONObject)obj;
		System.out.println("the json value of firstname -" + jsonobject.get("firstname"));
		System.out.println("the json value of lastname -" + jsonobject.get("lastname"));
				
		JSONArray jsonarray = (JSONArray)jsonobject.get("address");
		
	    for(int i=0; i<jsonarray.size();i++) {
 	    	 System.out.println( "the array names in json is "  + jsonarray.get(i));
 	    	    JSONObject address = (JSONObject)jsonarray.get(i);
 	    	    System.out.println("the address json array - street - " + address.get("street"));
 	    	    System.out.println("the address json array - state - " + address.get("state"));
 	    	    System.out.println("the address json array - city - " + address.get("city"));
 	     }
	}
	
	@Test
	public void ReadDataFromExcelFile() throws BiffException, IOException {
		
		System.out.println(" ****************** Read data from Excel File ************************");
 		
		String FilePath = "D:\\MyEclipsePrograms\\TestNGProject\\ReadExcelData.xls";
		FileInputStream fs = new FileInputStream(FilePath);
		Workbook wb = Workbook.getWorkbook(fs);
		
		Sheet ws = wb.getSheet(0);                                                  
		
		System.out.println(ws.getRows());
		System.out.println(ws.getColumns());
		System.out.println(ws.getCell(2, 1));
		
		for(int r=0;r<ws.getRows();r++) {
			for(int c=0;c<ws.getColumns();c++) {
				System.out.println( "Rows = " + r + " , "+ "Column = " + c + " value - "+ ws.getCell(c, r).getContents());
			}
		}
	        
	        	
	}
	
	
	
	
	
	
	
	
	
}

