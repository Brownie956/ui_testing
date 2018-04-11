package config;

import org.openqa.selenium.Platform;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Driver {

    private RemoteWebDriver webDriver;

    public enum DriverType {
        FIREFOX, CHROME
    }

    public Driver(DriverType type) {
        if(type == DriverType.FIREFOX){
            this.webDriver = create_firefox_driver();
        }
        else if(type == DriverType.CHROME){
            this.webDriver = create_chrome_driver();
        }
    }

    public Driver(){
        this(DriverType.FIREFOX);
    }

    public RemoteWebDriver getWebDriver() {
        return webDriver;
    }

    private FirefoxDriver create_firefox_driver(){
//        DesiredCapabilities capabilities = DesiredCapabilities.firefox();
//        capabilities.setVersion("latest");
//        capabilities.setPlatform(Platform.MAC);
//        capabilities.setCapability("name", "Testing Selenium");
//        FirefoxOptions firefoxOptions = new FirefoxOptions(capabilities);
        return new FirefoxDriver();
    }

    private ChromeDriver create_chrome_driver(){
        return new ChromeDriver();
    }
}