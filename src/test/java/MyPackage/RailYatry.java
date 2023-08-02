package MyPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class RailYatry {
  @Test
  public void Testrailyatry() throws InterruptedException 
  {
	  WebDriver driver=new ChromeDriver();
      driver.manage().deleteAllCookies();
      driver.get("ttps://www.railyatri.in");
      driver.manage().window().maximize();
      Thread.sleep(5000);
      driver.close();
  }
}
