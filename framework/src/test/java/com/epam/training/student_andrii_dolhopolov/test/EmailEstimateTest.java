package com.epam.training.student_andrii_dolhopolov.test;

import com.epam.training.student_andrii_dolhopolov.models.CalculatorFormTestData;
import com.epam.training.student_andrii_dolhopolov.pages.CloudGoogleHomePage;
import com.epam.training.student_andrii_dolhopolov.pages.CloudGooglePricingCalculatorPage;
import com.epam.training.student_andrii_dolhopolov.pages.SendEmailEstimateForm;
import com.epam.training.student_andrii_dolhopolov.pages.yopmail.YopmailGeneratorPage;
import com.epam.training.student_andrii_dolhopolov.pages.yopmail.YopmailHomePage;
import org.openqa.selenium.WindowType;
import org.testng.Assert;
import org.testng.annotations.Test;


public class EmailEstimateTest extends AbstractTest{

    @Test
    public void emailEstimatedCostTest() {


        CalculatorFormTestData testCalculatorFormData = new CalculatorFormTestData().fastSetTestData();
        CloudGooglePricingCalculatorPage calculatorPage = new CloudGoogleHomePage(driver)
                .openPage()
                .inputSearchTerm(searchTerm)
                .clickLinkWithText(searchTerm);
        CalculatorFormTestData actualCalculatedData = calculatorPage.makeCalculationOnPage(testCalculatorFormData);
        SendEmailEstimateForm sendEmailEstimateForm = calculatorPage.emailEstimate();
        String googleCalculatorWindow = driver.getWindowHandle();

        driver.switchTo().newWindow(WindowType.TAB);
        YopmailGeneratorPage yopmailPage = new YopmailHomePage(driver)
                .openPage()
                .generateEmailAddress();
        String generatedEmailAddress = yopmailPage.getEmailAddress();
        String yopmailWindow = driver.getWindowHandle();

        driver.switchTo().window(googleCalculatorWindow);
        calculatorPage.switchToInnerFrame();
        sendEmailEstimateForm.sendEmailTo(generatedEmailAddress);

        driver.switchTo().window(yopmailWindow);
        String emailEstimatedComponentCostPerMonth = yopmailPage.pressCheckEmailButton().getPrice();

        Assert.assertTrue(actualCalculatedData.getEstimatedComponentCostPerMonth().contains(emailEstimatedComponentCostPerMonth),
                "\nActual estimated component cost per month in E-mail:\n'" + emailEstimatedComponentCostPerMonth + "'"
                        + "\n not equal expected value calculated on website: '" + actualCalculatedData.getEstimatedComponentCostPerMonth() + "'");
    }

}
