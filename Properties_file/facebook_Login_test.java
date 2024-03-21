package Properties_file;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class facebook_Login_test {

	public static void main(String[] args) throws Throwable {
		
		WebDriver driver=new FirefoxDriver();

		Properties prop=new Properties();
		FileInputStream fis=new FileInputStream("C:\\maven_jenkins\\src\\main\\java\\Properties_file\\cofig.properties");
		prop.load(fis);
		
		driver.get(prop.getProperty("url3"));
		driver.findElement(By.xpath(prop.getProperty("email_id"))).sendKeys(prop.getProperty("userName"));
		driver.findElement(By.xpath(prop.getProperty("password_id"))).sendKeys(prop.getProperty("password"));
		Thread.sleep(3000);
		driver.findElement(By.name(prop.getProperty("login"))).click();
		Thread.sleep(3000);
	}
}
