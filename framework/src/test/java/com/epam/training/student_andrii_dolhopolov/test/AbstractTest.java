package com.epam.training.student_andrii_dolhopolov.test;

import com.epam.training.student_andrii_dolhopolov.driver.DriverSingleton;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class AbstractTest {
    protected WebDriver driver;
    protected String searchTerm = "Google Cloud Platform Pricing Calculator";

    @BeforeMethod()
    public void browserSetup() {
        driver = DriverSingleton.getDriver();
    }

    @AfterMethod(alwaysRun = true)
    public void browserTearDown() {
        //log.info("Closing browser");
        DriverSingleton.closeDriver();
    }
}
