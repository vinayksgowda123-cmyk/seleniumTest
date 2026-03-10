package com.selenium;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.After;
import org.junit.Test;
import org.junit.runners.Parameterized.Parameter;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
/**
 * Unit test for simple App.
 */
public class AppTest 
{
    WebDriver webdriver;
    getDriver driver;

    @BeforeEach
    public void setUp() {
        driver = new getDriver();
        webdriver = driver.chromeWebDriver();
    }
 App app = new App();

    @AfterEach
    public void tearDown() {
        if (webdriver != null) {
            webdriver.quit();
        }
    }

    @ParameterizedTest
    @CsvSource({
        "vinayksgowda@gmail.com, vinay@12345",
        "john.doe@gmail.com, john@12345",
        "jane.smith@gmail.com, jane@12345",
        "bob.wilson@gmail.com, bob@12345",
        "alice.johnson@gmail.com, alice@12345",
        "eve.brown@gmail.com, eve@12345",
        "charlie.davis@gmail.com, charlie@12345",
        "david.miller@gmail.com, david@12345",
        "alice.brown@gmail.com, alice@12345",
        "bob.smith@gmail.com, bob@12345"
        
    })
     public void Login(String email, String password)
    {

        webdriver.get("http://localhost:3004");
        WebElement signup= webdriver.findElement(By.id("signupLink"));
        signup.click();
        WebElement signupEmail = webdriver.findElement(By.id("regEmail"));
        signupEmail.sendKeys(email);
        WebElement signupPassword = webdriver.findElement(By.id("regPassword"));
        signupPassword.sendKeys(password);
        WebElement signupButton = webdriver.findElement(By.id("signUpButton"));
        signupButton.click();

       Alert alert1 = webdriver.switchTo().alert();
        String alertText1 = alert1.getText();
        alert1.accept();
        assertEquals("Account created successfully! Please login.", alertText1);
        app.waitFor(webdriver, 10000);



        WebElement loginEmail = webdriver.findElement(By.id("loginEmail"));
        loginEmail.sendKeys(email);
        WebElement loginPassword = webdriver.findElement(By.id("loginPassword"));
        loginPassword.sendKeys(password);
        WebElement loginButton = webdriver.findElement(By.id("submitButton"));
        loginButton.click();
        app.waitFor(webdriver, 10000);
       
        Alert alert = webdriver.switchTo().alert();
        String alertText = alert.getText();
        alert.accept();

        assertEquals("Login successful", alertText);

        

       
        WebElement addToCartButton = webdriver.findElement(By.id("tshirtButton"));
        addToCartButton.click();
        Alert alert3 = webdriver.switchTo().alert();
        String alertText3 = alert3.getText();
        alert3.accept();
        app.waitFor(webdriver, 5000);

        assertEquals("T-Shirt added to cart", alertText3);

        WebElement addToCartButton2 = webdriver.findElement(By.id("jeansButton"));
        addToCartButton2.click();
        Alert alert4 = webdriver.switchTo().alert();
        String alertText4 = alert4.getText();
        alert4.accept();
        app.waitFor(webdriver, 5000);
        assertEquals("Jeans added to cart", alertText4);

        WebElement cart= webdriver.findElement(By.id("cartLink"));
        cart.click();

        WebElement cartLink = webdriver.findElement(By.id("cartButton"));
        cartLink.click();
       
       // WebElement total = webdriver.findElement(By.id("total"));
       Alert alert5= webdriver.switchTo().alert();
        String alertText5 = alert5.getText();
        alert5.accept();
        assertEquals("your amount is $70", alertText5);

    }
        


    // class users{
    //     String email;
    //     String password;

    //     public users(String email, String password) {
    //         this.email = email;
    //         this.password = password;
    //     }
    // }
    // @Test
    // public void getTitle()
    // {
    //     String title = app.getTitle();
    //     assertTrue(title.equals("Google"));
    // }

    // @Test
    // public void search()
    // {
    //     String url=app.search();
    //     assertTrue(url.contains("https://www.google.com/sorry/index?continue=https://www.google.com/search%3Fq%3Dwhat%2Bis%2Bthe%2Buse%2Bof%2Bselenium%2Bin%2Btesting%253F%26sca_esv%3D3b36d53a0ad7b307%26source%3Dhp%26ei%3DiHCuab3GB8275OUP9qKv6Q0%26iflsig%3DAFdpzrgAAAAAaa5-mHJOxYaFW_FdfvZdq2f01xWQ4nvv%26sei%3DinCuacHzLa2eseMPi5bwKA&q=EgRnsOoSGIvhuc0GIjA9tJovb5uaFzrjNkm0s96h9YqZxjXAMFSG_AizSCQ0-wCt5JGRIkJmlwx1_7kLI5oyAVJaAUM"));
    // }

}
