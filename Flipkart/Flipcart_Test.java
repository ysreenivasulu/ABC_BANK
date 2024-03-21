package Flipkart;

import org.testng.annotations.Test;


public class Flipcart_Test extends driver_flip{


	
	flipkart_obj fp;
	@Test
	public  void Test() throws Throwable {
		
	
	    
		fp=new flipkart_obj(driver);
		
		fp.clickLogout();
	
	}
}
