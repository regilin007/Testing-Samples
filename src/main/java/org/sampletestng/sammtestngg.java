package org.sampletestng;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.*;
public class sammtestngg extends baseClass{
	@Test(enabled = false)
	private void tc1() {
		launchUrl("https://en-gb.facebook.com/");

	}
	@BeforeClass
	private void tc0() {
		launchBrowser();
		windowMaximize();

	}
	@DataProvider(name = "product")
	@Test
	private Object[][] data() {
		return new Object[][] {
			{"8 gb ddr3 ram"},
			{"tookkit"},
			{"car toy"},
			{"apple 14 pro max"}
		};}
	
	

	
	
	
	@Test(dataProvider = "product")
	private void tc2(String srch) {
		launchUrl("https://www.amazon.in/");
		
		passText(srch, page.findElement(By.id("twotabsearchtextbox")));
		WebElement click = page.findElement(By.id("nav-search-submit-button"));
		click.click();

	}
	@Test(priority = -100)
	private void tc3() {
		launchUrl("https://mail.google.com/");
		

	}
	@Test(priority = 5  )
	private void tc4() {
		launchUrl("https://inmakes.com/");

	}
	@Test(priority = 4 )
	private void tc5() {
		launchUrl("https://www.redbus.in/");
		
	

	}
	@Test(priority = 3 )
	private void tc8() {
		launchUrl("https://www.redbus.in/");
	}
	@Test(priority = 2 )
	private void tc9() {
		launchUrl("https://www.flipkart.com/");
	}
	
	
}
