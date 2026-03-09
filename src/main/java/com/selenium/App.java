package com.selenium;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.google.com");

        System.out.println("page title is: " + driver.getTitle());

        driver.quit();
    }
}
