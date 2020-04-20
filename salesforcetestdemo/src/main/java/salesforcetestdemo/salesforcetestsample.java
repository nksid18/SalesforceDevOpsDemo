package salesforcetestdemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class salesforcetestsample {

	public static void main(String[] args) {
	   System.setProperty("webdriver.chrome.driver", "C:\\Program Files (x86)\\Jenkins\\workspace\\chromedriver.exe");
       WebDriver driver = new ChromeDriver();
       String baseUrl = "https://experitest.com/free-trial/";
       String expectedTitle = "Free trial";
       String actualTitle = "";
       driver.get(baseUrl);
       actualTitle = driver.getTitle();
       System.out.println(actualTitle);
       if (actualTitle.contentEquals(expectedTitle)){
           System.out.println("TEST PASSED!");
       } else {
           System.out.println("TEST FAILED");
	       }
	       driver.close();
	   

	}

}
