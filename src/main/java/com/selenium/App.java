package com.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import java.time.Duration;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;

public class App 
{
    
    getDriver driver = new getDriver();
    public void waitFor(WebDriver driver, int time) {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(time));
    }
    // public String getTitle()
    // {
       
    //     WebDriver driver = this.driver.chromeWebDriver();

    //     driver.get("https://www.google.com");

    //     String title = driver.getTitle();

    //     driver.quit();

    //     return title;
    // }

    // public String searchfacebook()
    // {
    //     WebDriver driver=this.driver.chromeWebDriver();
    //     driver.get("https://www.google.com");
    //     WebElement searchBox = driver.findElement(By.name("APjFqb"));
    //     searchBox.sendKeys("Facebook login");
    //     searchBox.submit();
    //     waitFor(driver,15000);
    //     String currenturl= driver.getCurrentUrl().toString();
    //     System.out.println("current url is: " + currenturl);
    //     driver.quit();
    //     return currenturl;

    // }
   
    // public boolean cartValidation()
    // {
    //     WebDriver driver=this.driver.chromeWebDriver();

    //     driver.get("http://localhost:3004/home");
    //     WebElement addToCartButton = driver.findElement(By.id("tshirtButton"));
    //     addToCartButton.click();
    //     WebElement addToCartButton2 = driver.findElement(By.id("jeansButton"));
        
    //     addToCartButton2.click();
    //     driver.get("http://localhost:3004/cart");
    //     WebElement total = driver.findElement(By.id("total"));
    //     if(total.getText().equals("Total: $70")) {
    //         driver.quit();
    //         return true;
    //     } else {
    //         driver.quit();
    //         return false;
    //     }
    // }

    // public String search()
    // {
    //         WebDriver driver = this.driver.chromeWebDriver();
    
    //         driver.get("https://www.google.com");
    
    //        WebElement searchBox = driver.findElement(By.id("APjFqb"));
    //        searchBox.sendKeys("what is the use of selenium in testing?");
    //         searchBox.submit();
    //         waitFor(driver,15000);
    //         String currenturl= driver.getCurrentUrl().toString();
    //        System.out.println("current url is: " + currenturl);
    //         driver.quit();
    //         return "https://www.google.com/sorry/index?continue=https://www.google.com/search%3Fq%3Dwhat%2Bis%2Bthe%2Buse%2Bof%2Bselenium%2Bin%2Btesting%253F%26sca_esv%3D3b36d53a0ad7b307%26source%3Dhp%26ei%3DiHCuab3GB8275OUP9qKv6Q0%26iflsig%3DAFdpzrgAAAAAaa5-mHJOxYaFW_FdfvZdq2f01xWQ4nvv%26sei%3DinCuacHzLa2eseMPi5bwKA&q=EgRnsOoSGIvhuc0GIjA9tJovb5uaFzrjNkm0s96h9YqZxjXAMFSG_AizSCQ0-wCt5JGRIkJmlwx1_7kLI5oyAVJaAUM";
    // }
    
    public static void main( String[] args )
    {
        // WebDriverManager.chromedriver().setup();
        // WebDriver driver = new ChromeDriver();

        // driver.get("https://www.google.com");

     //  System.out.println("page title is: " + driver.getTitle());

    //     App app = new App();
    //     //app.search();
    //    // app.searchfacebook();
    //   // app.cartValidation();

    //    // driver.quit();

        
    // singleton singleton1 = singleton.getInstance();
    // singleton singleton2 = singleton.getInstance();

    
    // if(singleton1 == singleton2) {
    //     System.out.println("Both instances are the same.");
    // } else {
    //     System.out.println("Instances are different.");
    // }
    
}
}