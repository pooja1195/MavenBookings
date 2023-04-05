package Resources;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.asserts.SoftAssert;

public class CommonUtlities {


	public Integer cuprice(WebElement weprice ) {
		String price = weprice.getText();
		String fprice = price.replace("Rs.", "");
		System.out.println(fprice);
		int actualprice = Integer.parseInt(fprice.replaceAll("\\..*", ""));
		System.out.println(actualprice);
		return actualprice;	
	}
	
	public void asserts(int price1, int price2) {
		SoftAssert assertion = new SoftAssert();
		assertion.assertEquals(price1, price2);
	}
	public void asserts(double price1, double price2) {
		SoftAssert assertion = new SoftAssert();
		assertion.assertEquals(price1, price2);
	}
	public void asserts() {
		SoftAssert assertion = new SoftAssert();
		assertion.assertAll();	
	}
	public void subc(WebElement cornadd, String count, String count1, WebElement next, WebElement plus ) {
		cornadd.click();
		String popcount = count;
		while(!(popcount.equals(count1))) {
			next.click();
			popcount = plus.getText();
		}
	}
	public Double total(WebElement subtp) {
		String subtotal = subtp.getText();
		String sub1 = subtotal.replace("Rs.", "").trim();
		Double sub2 = Double.parseDouble(sub1);
		return sub2;
	}
	
	public void seats(List<WebElement> selection, String seat1, String seat2) {
		List<WebElement> sit = selection;

		for(WebElement seat:sit) {
		if(seat.getText().equals(seat1) || seat.getText().equals(seat2)) {
		seat.click();
		}
		}
	}
	
}
