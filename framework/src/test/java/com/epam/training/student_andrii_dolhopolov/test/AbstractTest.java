package com.epam.training.student_andrii_dolhopolov.test;

import com.epam.training.student_andrii_dolhopolov.driver.DriverSingleton;
import com.epam.training.student_andrii_dolhopolov.util.TestListener;
import lombok.extern.log4j.Log4j2;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;

@Log4j2
@Listeners({TestListener.class})
public class AbstractTest {
    protected WebDriver driver;
    protected String searchTerm = "Google Cloud Platform Pricing Calculator";

    @BeforeMethod()
    public void browserSetup() {
        driver = DriverSingleton.getDriver();
    }

    @AfterMethod(alwaysRun = true)
    public void browserTearDown() {
        DriverSingleton.closeDriver();
    }
}
