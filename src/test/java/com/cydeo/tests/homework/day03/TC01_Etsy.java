package com.cydeo.tests.homework.day03;

import com.cydeo.utilities.WebDriverFactory;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TC01_Etsy {
    public static void main(String[] args) {
    //        HWP #1: Etsy Title Verification
    //1. Open Chrome browser
        WebDriver driver= WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();

    //2. Go to https://www.etsy.com
        driver.get("https://www.etsy.com");
    //3. Search for “wooden spoon”
        //3.1 cssLocator tagName[attribute='value']
//        WebElement searchBox=driver.findElement(By.cssSelector("input[id='global-enhancements-search-query']"));
        //3.1 locate search box by xpath
        WebElement searchBox=driver.findElement(By.xpath("//input[@id='global-enhancements-search-query']"));
        searchBox.sendKeys("Wooden spoon"+ Keys.ENTER);
    //4. Verify title:
    //Expected: “Wooden spoon - Etsy”
        String expectedTitle="Wooden spoon - Etsy";
        String actualTitle=driver.getTitle();

        if (actualTitle.equals(expectedTitle)){
            System.out.println("Title verification PASSED");
        }else{
            System.out.println("Title verification FAILED");

        }

    }
}
