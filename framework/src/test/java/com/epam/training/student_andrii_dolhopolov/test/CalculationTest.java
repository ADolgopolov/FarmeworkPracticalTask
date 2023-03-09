package com.epam.training.student_andrii_dolhopolov.test;

import com.epam.training.student_andrii_dolhopolov.models.CalculatorFormTestData;
import com.epam.training.student_andrii_dolhopolov.pages.CloudGoogleHomePage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CalculationTest extends AbstractTest {

    @Test
    public void estimatedComponentCostPerMonthMatchesTest() {
        CalculatorFormTestData testCalculatorFormData = new CalculatorFormTestData().fastSetTestData();

        CalculatorFormTestData actualCalculatedData = new CloudGoogleHomePage(driver)
                .openPage()
                .inputSearchTerm(searchTerm)
                .clickLinkWithText(searchTerm)
                .makeCalculationOnPage(testCalculatorFormData);

        Assert.assertTrue(actualCalculatedData.getEstimatedComponentCostPerMonth().contains(testCalculatorFormData.getEstimatedComponentCostPerMonth()),
                "Actual string:\n'" + actualCalculatedData.getEstimatedComponentCostPerMonth() + "'"
                        + "\n not contains expected test value: '" + testCalculatorFormData.getEstimatedComponentCostPerMonth() + "'");
    }
}
