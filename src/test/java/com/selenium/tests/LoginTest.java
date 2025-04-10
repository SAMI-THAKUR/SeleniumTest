package com.selenium.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class LoginTest {
    WebDriver driver;

    @BeforeTest
    public void setup() {
        // Make sure the chromedriver path is correct
        System.setProperty("", 
                "E:\\ENGINEERING\\SEM_0110\\SE&PM\\SeleniumTestProject\\SeleniumTestProject\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        File indexFile = new File("index.html"); // Relative to project root
        String filePath = "file://" + indexFile.getAbsolutePath();
        driver.get("E:\\ENGINEERING\\SEM_0110\\SE&PM\\SeleniumTestProject\\SeleniumTestProject\\index.html");
        // Make sure this URL is valid for your environment
    }

    @Test
    public void testLogin() {
        WebElement username = driver.findElement(By.id("username"));
        WebElement password = driver.findElement(By.id("password"));
        WebElement loginButton = driver.findElement(By.id("login"));

        username.sendKeys("testuser");
        password.sendKeys("password123");
        loginButton.click();
    }

    @AfterTest
    public void tearDown() {
        driver.quit();
    }
}
