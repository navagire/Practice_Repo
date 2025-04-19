import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class QtalkLogin {

	public static void main(String[] args) throws IOException {
		//load the browser
				WebDriver driver= new ChromeDriver();
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
				
				//load the data from the properties file
				FileInputStream fis= new FileInputStream("C:\\Users\\namra\\eclipse-workspace\\Maven_Demo\\src\\test\\resources\\CommonProperties");
				Properties prop = new Properties();
				prop.load(fis);
				String URL=prop.getProperty("url");
				String USERNAME = prop.getProperty("Mobile");
				String PASSWORD = prop.getProperty("passowrd");
				
				//launch the url
				driver.get(URL);
				
				//Login
				driver.findElement(By.id("username")).sendKeys(USERNAME);
				driver.findElement(By.id("password")).sendKeys(PASSWORD);
				driver.findElement(By.className("rs-btn rs-btn-default rs-btn-disabled")).click();
				//button[normalize-space()='Login']
				

	}

}
