package com.epam.training.student_andrii_dolhopolov.test;

import com.epam.training.student_andrii_dolhopolov.pages.yopmail.YopmailGeneratorPage;
import com.epam.training.student_andrii_dolhopolov.pages.yopmail.YopmailHomePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
public class YopTest {
    private static WebDriver driver;
    @BeforeClass
    public static void browserSetup() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @Test
    public void emailEstimatedCostTest() {
        YopmailGeneratorPage yopmailPage = new YopmailHomePage(driver)
                .openPage()
                .generateEmailAddress();
        String generatedEmailAddress = yopmailPage.getEmailAddress();
        System.out.println(generatedEmailAddress);
    }

    @AfterClass(alwaysRun = true)
    public static void browserTearDown() {
        driver.quit();
        driver = null;
    }
}
