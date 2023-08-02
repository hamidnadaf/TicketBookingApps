package MyPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Yatra {
  @Test
  public void Testyatra() throws InterruptedException 
  {
	  WebDriver driver=new ChromeDriver();
      driver.manage().deleteAllCookies();
      driver.get("https://www.yatra.com/");
      driver.manage().window().maximize();
      Thread.sleep(5000);
      driver.close();
  }
}
