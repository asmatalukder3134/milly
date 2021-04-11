package astonorall;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Home {
	
   @Test(dataProvider="data")
   public void click1(String uname, String pw) {
		System.out.println("uname");
		System.out.println("pw");

	}
    
	
   @DataProvider(name="data")
   public Object[][] click2() {
	   
	   
	   
		Object [][]obj=new Object[3][2];
		obj[0][0]="sayan";
		obj[0][1]="123";
		obj[1][0]="yan";
		obj[1][1]="12";
		obj[2][0]="nehan";
		obj[2][1]="34";
		return obj;
		

	}
   
}
