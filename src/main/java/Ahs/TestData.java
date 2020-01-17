package Ahs;

import org.testng.annotations.DataProvider;

public class TestData {

	@DataProvider(name="InputData")
	public Object[][] getData()
	{
		// Row stands for how many different data types test should run
		//coloumn stands for how many values per each test
		
		// Array size is 2
		// 0,1
		Object[][] data=new Object[1][7];
		//0th row
		data[0][0]="07442382353";
		data[0][1]="Superadmin";
		data[0][2]="Name";
		data[0][3]="12";
		data[0][4]="Dr";
		data[0][5]="333333";
		data[0][6]="qwert45";
		
		
		
		
		return data;
		
		
		
		
		
		
	}
				
	

}
