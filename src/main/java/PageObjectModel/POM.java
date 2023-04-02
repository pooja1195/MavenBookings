package PageObjectModel;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class POM {
	WebDriver Driver;
	By a1 = By.xpath("(//a[contains(text(),'Events')])/preceding-sibling::a[2]");
	By a2 = By.xpath("//div[@class='style__StyledText-sc-7o7nez-0 kBjbXH']");
	By a3 = By.xpath("//div[contains(text(),'Tu Jhoothi Main Makkaar')]");
	By a4 = By.xpath("//h4[contains(text(),'About the movie')]/parent::span/div/span");
	By a5 = By.xpath("(//span[contains(text(),'Book tickets')])[1]");
	By a6 = By.xpath("//button[@id='wzrk-cancel']");
	By a7 = By.xpath("//li[@data-name='Bollywood Multiplex: Kharadi']//a[@data-display-showtime='11:00 PM']");
	By a8 = By.xpath("//div[@id='btnPopupAccept']");
	By a9 = By.xpath("//li[@id='pop_10']");
	By b1 = By.xpath("//div[@id='proceed-Qty']");
	By b2 = By.xpath("(//td[@class='SRow1'])[5]/div[@data-seat-type='1']/a");
	By b3 = By.xpath("(//a[@id='btmcntbook'])[1]/span");
	By b4 = By.xpath("(//a[@id='btmcntbook'])[1]");
	By b5 = By.xpath("//div[@id='desc_1020002-1308']/div[3]/span[contains(text(),'ADD')]");
	By b6 = By.xpath("//div[@id='desc_1020002-1308']/div[3]/span[4]/div");
	By b7 = By.xpath("//div[@id='desc_1020002-1308']/div[3]/span[3]");
	By b8 = By.xpath("//div[@id='desc_1020019-150']/div[3]/span[contains(text(),'ADD')]");
	By b9 = By.xpath("//div[@id='desc_1020019-150']/div[3]/span[4]/div");
	By c1 = By.xpath("//div[@id='desc_1020019-150']/div[3]/span[3]");
	By c2 = By.xpath("//span[@id='subTT']");
	By c3 = By.xpath("//div[@id='fnbTotal']");
	By c4 = By.xpath("//div[@id='basPrice']");
	By c5 = By.xpath("//span[@id='ttPrice']");
	
	public POM(WebDriver driver2) {
		Driver = driver2;
	}

	public WebElement movies() {
		return Driver.findElement(a1);
	}
	
	public List<WebElement> langg() {
		return Driver.findElements(a2);
	}
	public WebElement film() {
		return Driver.findElement(a3);
	}
	public WebElement about() {
		return Driver.findElement(a4);
	}
	public WebElement book() {
		return Driver.findElement(a5);
	}
	public WebElement popup() {
		return Driver.findElement(a6);
	}
	public WebElement cinema() {
		return Driver.findElement(a7);
	}
	public WebElement acceptpop() {
		return Driver.findElement(a8);
	}
	public WebElement seatnum() {
		return Driver.findElement(a9);
	}
	public WebElement proceed() {
		return Driver.findElement(b1);
	}
	public List<WebElement> selection() {
		return Driver.findElements(b2);
	}
	public WebElement price() {
		return Driver.findElement(b3);
	}
	public WebElement proceedtocart() {
		return Driver.findElement(b4);
	}
	public WebElement cornadd() {
		return Driver.findElement(b5);
	}
	public WebElement popnext() {
		return Driver.findElement(b6);
	}
	public WebElement popplus() {
		return Driver.findElement(b7);
	}
	public WebElement samosaadd() {
		return Driver.findElement(b8);
	}
	public WebElement samosanext() {
		return Driver.findElement(b9);
	}
	public WebElement samosaplus() {
		return Driver.findElement(c1);
	}
	public WebElement subtp() {
		return Driver.findElement(c2);
	}
	public WebElement fnbp() {
		return Driver.findElement(c3);
	}
	public WebElement basp() {
		return Driver.findElement(c4);
	}
	public WebElement ttp() {
		return Driver.findElement(c5);
	}
	
	
}
