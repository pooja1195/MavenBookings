package TestCases;

import java.io.IOException;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import Resources.BaseClass;

public class Bookings_Bus extends BaseClass{
	@Test
	public void Buses() throws IOException {
		url();
		Driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		Driver.manage().window().maximize();
		Driver.findElement(By.xpath("//a[@data-venue-code='ESBW']")).click();
		
		
	}
}