package com.cydeo.tests.homework.day02;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC04_PracticeCydeo_locator {
    public static void main(String[] args) {
    //        TC #4: Practice Cydeo – Class locator practice
    //1- Open a chrome browser
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();

    //2- Go to: https://practice.cydeo.com/inputs
        driver.navigate().to("https://practice.cydeo.com/inputs");
    //3- Click to “Home” link
       //WebElement homeBox=driver.findElement(By.linkText("Home"));
       WebElement homeBox=driver.findElement(By.className("nav-link"));

        homeBox.click();
    //4- Verify title is as expected:
    //Expected: Practice
        String expectedTitle="Practice";
        String actualTitle= driver.getTitle();

        if (actualTitle.equals(expectedTitle)){
            System.out.println("Title verification PASSED");
        }else{
            System.out.println("Title verification FAILED");

        }
    //PS: Locate “Home” link using “className” locator
        driver.findElement(By.className("nav-link"));
        System.out.println(driver.findElement(By.className("nav-link")));

    }
}
