package PageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

public class BaseClass {
    protected WebDriver driver;

   public BaseClass(String browser){
       if (browser.equalsIgnoreCase("chrome")){
           ChromeOptions options = new ChromeOptions();
           options.addArguments("--start-maximized");
           options.addArguments("--disable-notifications");
           options.addArguments("--disable-popup-blocking");
           options.addArguments("--disable-infobars");
           driver = new ChromeDriver(options);
       }
       else if (browser.equalsIgnoreCase("edge")) {
           EdgeOptions options = new EdgeOptions();
           options.addArguments("--start-maximized");
           options.addArguments("--disable-notifications");
           options.addArguments("--disable-popup-blocking");
           options.addArguments("--disable-infobars");
           driver = new EdgeDriver(options);
       }
       else{
           throw new IllegalArgumentException("Browser not supported..");
       }
   }

    public WebDriver getDriver() {
        return driver;
    }

}

