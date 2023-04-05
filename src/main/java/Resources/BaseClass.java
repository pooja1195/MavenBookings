package Resources;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	Properties prop;
	public WebDriver Driver;
	
	public void initializeDriver() throws IOException {
		FileInputStream fis = new FileInputStream(System.getProperty("user.dir") + "\\src\\main\\java\\Resources\\data.properties");
		prop = new Properties();
		prop.load(fis);
		String browsername = prop.getProperty("browser");
		
		if(browsername.equalsIgnoreCase("chrome")) {
//			ChromeOptions option = new ChromeOptions();
//			option.addArguments("--remote-allow-origins=*");
			WebDriverManager.chromedriver().setup();
			Driver = new ChromeDriver();
		}
		else if(browsername.equalsIgnoreCase("edge")){
			System.out.println("no browser is available");
		}	
	}
	
	public void url() throws IOException {
		initializeDriver();
		String url = prop.getProperty("url");
		Driver.get(url);
	}
}
