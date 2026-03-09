package com.selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Hello world!
 *
 */
public class App 
{
    getDriver driver = new getDriver();
    public String getTitle()
    {
       
        WebDriver driver = this.driver.chromeWebDriver();

        driver.get("https://www.google.com");

        String title = driver.getTitle();

        driver.quit();

        return title;
    }
    public static void main( String[] args )
    {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.google.com");

        System.out.println("page title is: " + driver.getTitle());

        driver.quit();
    }
}