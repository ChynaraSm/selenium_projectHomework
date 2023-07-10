package com.cydeo.tests.homework.day03;

import com.cydeo.utilities.WebDriverFactory;
import com.google.common.base.Verify;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TC2_ZeroBank {
    public static void main(String[] args) {

    //        HWP #2: Zero Bank header verification
    //1. Open Chrome browser
        WebDriver driver= WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();

    //2. Go to http://zero.webappsecurity.com/login.html
        driver.get("http://zero.webappsecurity.com/login.html");

    //3. Verify header text
    //Expected: “Log in to ZeroBank”

        //WebElement headerName=driver.findElement(By.xpath("//div[@class='page-header']"));
        WebElement headerName=driver.findElement(By.cssSelector("div[class=\"page-header\"]"));

        String expectedHeader="Log in to ZeroBank";
        String actualHeader=headerName.getText();

        if (actualHeader.equals(expectedHeader)){
            System.out.println("Header verification PASSED");
        }else{
            System.out.println("Header verification FAILED");
        }



    }
}
