package TestCases;

import static org.testng.Assert.assertEquals;

import java.io.IOException;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import PageObjectModel.POM;
import Resources.BaseClass;
import Resources.CommonUtlities;
import Resources.Constant;

public class BusBooking extends BaseClass{
	@Test
	public void Buses() throws IOException, InterruptedException {
		
		url();
		Driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		Driver.manage().window().maximize();
		
		POM pom = new POM(Driver);
		CommonUtlities cou = new CommonUtlities();
		pom.movies().click();
		
		List<WebElement> lang= pom.langg();
		for(WebElement lg: lang) {
			if(lg.getText().equalsIgnoreCase(Constant.langgg)) {
				lg.click();
			}
		}
		
		pom.film().click();
		System.out.println(pom.about().getText());
		pom.book().click();
		
		pom.popup().click();//popup cancel
		pom.cinema().click();//time select
		pom.acceptpop().click();//accept cond
		
		pom.seatnum().click();
		
		pom.proceed().click();
		
		cou.seats(pom.selection(), Constant.seat1, Constant.seat2);
		
		int actualprice = cou.cuprice(pom.price());
		int Expectedprice = Constant.expprice;
		
		cou.asserts(actualprice, Expectedprice);

		pom.proceedtocart().click();
		
		cou.subc(pom.cornadd(), Constant.popc, Constant.popc1, pom.popnext(), pom.popplus());
		cou.subc(pom.samosaadd(), Constant.samc, Constant.samc1, pom.samosanext(), pom.samosaplus());
		
		Double sub2 = cou.total(pom.subtp());
		Double food2 = cou.total(pom.fnbp());
		Double bas2 = cou.total(pom.basp());
			
		System.out.println(" sub2 " + sub2+ " food2 " + food2 +" bas2 " + bas2);
		Double finalprice = sub2 + food2 + bas2;
		
		String totalprice = pom.ttp().getText();
		String total1 = totalprice.replace("Rs.", "").trim();
		Double total2 = Double.parseDouble(total1);
		
		cou.asserts(finalprice, total2);
	
		cou.asserts();
		
		
	
	
	
	}
}
