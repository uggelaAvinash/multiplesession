package ParallelTesting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class MultipleSession {
  WebDriver driver;
  @Test (priority=1)
  public void executeSessionOne() {
	  driver=new EdgeDriver();
	  driver.get("https://lxc.0ott.com/telugu-movies/");
	  driver.manage().window().maximize();
  }
	  @Test(priority=2)
  public void executeSessionTwo() {
	 System.setProperty("C:\\Program Files\\Java\\chromedriver", "chromedriver.exe");
	  driver=new ChromeDriver();
	  driver.get("https://lxc.0ott.com/telugu-movies/");
  }
	  @Test(priority=3)
  public void executeSessionThree() {
	System.setProperty("C:\\Program Files\\Java\\geckodriver", "geckodriver.exe");
	 driver=new FirefoxDriver();
	 driver.get("https://lxc.0ott.com/telugu-movies/");	  
	  }
}
