package TestNGIWScripts;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import java.util.Hashtable;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class DataProviderTest {
	HashMap<Object, Object> hashmap = new HashMap<Object, Object>();

	
@Test(dataProvider ="arrayValues")

public void getArrayValues(String BrowserName, String FirstName, String LastName) {
	  if(BrowserName.equals("Chrome")) { 
		  System.out.println("BrowserName -- " + BrowserName); 
		  System.out.println("FirstName -- " + FirstName);
		  System.out.println("LastName -- " + LastName); 
		}
 }
	 

@Test(dataProvider = "HashMapValues")
public void getArrayValues(HashMap<Object, Object> data) {

		data = hashmap;
		System.out.println(data.get("EmployId"));
		System.out.println(data.get("EmployeeName"));
		System.out.println(data.get("CompanyName"));

	}

@DataProvider(name = "HashMapValues")
public Object[][] getHashMapTestData() throws BiffException, IOException {
		// Read Data from Excel
		FileInputStream fs = new FileInputStream("ReadExcelData.xls");
		Workbook wb = Workbook.getWorkbook(fs);
		Sheet ws = wb.getSheet(0);
		int r = ws.getRows();
		int c = ws.getColumns();
		System.out.println("the total rows - " + r);
		System.out.println("the total columns - " + c);

		Object[][] obj1 = new Object[r][1];
		for (int i = 0; i < r - 1; i++) {
			// HashMap<Object,Object>hashmap=new HashMap<Object,Object>();
			for (int j = 0; j < c - 1; j++) {
				hashmap.put(ws.getCell(j, 0).getContents(), ws.getCell(j, i + 1).getContents());
			}
			obj1[i][0] = hashmap;
		}
		return obj1;
	}

	
 @DataProvider(name="arrayValues")
 public Object[][] getArrayTestData(){
	  Object[][]obj = new Object[2][3];
	  obj[0][0]="Chrome";
	  obj[0][1]="Raj";
	  obj[0][2]="Sekhar";
	  
	  obj[1][0]="FireFox"; 
	  obj[1][1]="Raj1";
	  obj[1][2]="Sekhar1";
	  return obj;
    }
	 

}
