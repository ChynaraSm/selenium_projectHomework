package com.cydeo.tests.homework.day02;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC03_BackAndForth {
    public static void main(String[] args) throws InterruptedException {
     //   TC #3: Back and forth navigation
    //1- Open a chrome browser

        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
    //2- Go to: https://google.com
        driver.get("https://google.com");
    //3- Click to Gmail from top right.
        WebElement gmailBox=driver.findElement(By.className("gb_v"));
        gmailBox.click();
    //4- Verify title contains:

    //Expected: Gmail
        String expectedTitle="Gmail";
        String actualTitle= driver.getTitle();

        if (actualTitle.contains("Gmail")){
            System.out.println("Title verification PASSED");
        }else{
            System.out.println("Title verification FAILED");
        }
    //5- Go back to Google by using the .back();

        driver.navigate().back();
        Thread.sleep(1000);
        //6- Verify title equals:
        //Expected: Google
        expectedTitle="Google";
        actualTitle= driver.getTitle();

        if (actualTitle.equals(expectedTitle)){
            System.out.println("Title verification PASSED "+actualTitle);
        }else{
            System.out.println("Title verification FAILED "+actualTitle);
        }



    }
}
