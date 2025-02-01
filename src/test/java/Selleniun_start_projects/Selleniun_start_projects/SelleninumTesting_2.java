package Selleniun_start_projects.Selleniun_start_projects;

import static org.junit.Assert.assertNotEquals;

import java.util.concurrent.TimeUnit;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class SelleninumTesting_2 {
	
	static WebDriver  browser;
	 
	 @Before
	  public void setup() {
		 
			  System.setProperty("webdriver.gecko.driver","C:\\geckodriver\\geckodriver.exe");
		      browser = new FirefoxDriver();
		  	  browser.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
			
		      browser.get("https://testpages.eviltester.com/styled/validation/input-validation.html");
		
	  }
		
	    @Test
	    public void testCase_1() {
	        validateInput("Xy12*");
	    }

	    @Test
	    public void testCase_2() {
	        validateInput("AB12&CD");
	    }

	    @Test
	    public void testCase_3() {
	        validateInput("QWer567*");
	    }

	    @Test
	    public void testCase_4() {
	        validateInput("MNO*XYZ");
	    }

	    @Test
	    public void testCase_5() {
	        validateInput("JKL%D45");
	    }

	    @Test
	    public void testCase_6() {
	        validateInput("ZXCV8^");
	    }

	    @Test
	    public void testCase_7() {
	        validateInput("$B9#RT");
	    }

	    @Test
	    public void testCase_8() {
	        validateInput("LMN34");
	    }

	    @Test
	    public void testCase_9() {
	        validateInput("Cx87*");
	    }

	    @Test
	    public void testCase_10() {
	        validateInput("FGHIJ");
	    }

	    private void validateInput(String input) {
	        WebElement textBox = browser.findElement(By.name("characters"));
	        textBox.sendKeys(input);
	        String currentPage = browser.getCurrentUrl();
	        browser.findElement(By.name("validate")).click();
	        String newPage = browser.getCurrentUrl();
	        assertNotEquals("כתובת ה-URL אמורה להשתנות אחרי לחיצה על validate", currentPage, newPage);
	    }

}
