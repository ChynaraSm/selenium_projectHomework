package com.cydeo.tests.homework.day02;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC01_EtsyTitleVerification {
    public static void main(String[] args) {


    //      HWP #1: Etsy Title Verification
    //1. Open Chrome browser
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();


    //2. Go to https://www.etsy.com
        driver.navigate().to("https://www.etsy.com");
    //3. Search for “wooden spoon”
        WebElement etsySearchBox=driver.findElement(By.name("search_query"));
        etsySearchBox.sendKeys("Wooden spoon"+ Keys.ENTER);


    //4. Verify title:
    //Expected: “Wooden spoon - Etsy”
        String expectedInBeginningTitle="Wooden spoon - Etsy";
        String actualTitle=driver.getTitle(); //Etsy - Shop for handmade, vintage, custom, and unique gifts for everyone

        if (actualTitle.startsWith(expectedInBeginningTitle)){
            System.out.println("Title verification PASSED");

        } else{
            System.out.println("Title verification FAILED");
        }

    }
}
