package core;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverManager {
    private WebDriver driver;

    public void initializeDriver() {
        System.setProperty("webdriver.chrome.driver", "C:/Users/diegojose.navarro/Documents/chromedriver/chromedriver.exe");
        driver = new ChromeDriver();
    }

    public WebDriver getDriver() {
        return driver;
    }

    // quick test to check if its running and working the directory
    public static void main(String[] args) {
        WebDriverManager manager = new WebDriverManager();
        manager.initializeDriver();
        manager.getDriver().get("https://www.google.com");

        // close the browser
        manager.getDriver().close();
    }

}