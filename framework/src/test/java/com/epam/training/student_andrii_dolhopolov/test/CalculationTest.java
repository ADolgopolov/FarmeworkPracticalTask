package com.epam.training.student_andrii_dolhopolov.test;

import com.epam.training.student_andrii_dolhopolov.models.CalculatorFormTestData;
import com.epam.training.student_andrii_dolhopolov.pages.CloudGoogleHomePage;
import com.epam.training.student_andrii_dolhopolov.service.TestDataCreator;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CalculationTest extends AbstractTest {

    @Test
    public void estimatedComponentCostPerMonthMatchesTest() {
        CalculatorFormTestData calculatorFormData = TestDataCreator.withEnvironmentProperties();

        CalculatorFormTestData actualCalculatedData = new CloudGoogleHomePage(driver)
                .openPage()
                .inputSearchTerm(searchTerm)
                .clickLinkWithText(searchTerm)
                .switchToInnerFrame()
                .selectProductName(calculatorFormData.getProductName())
                .setNumberOfInstances(calculatorFormData.getNumberOfInstances())
                .selectOperatingSystem(calculatorFormData.getOperationSystem())
                .selectVMClass(calculatorFormData.getVMClass())
                .selectInstanceSeries(calculatorFormData.getInstanceSeries())
                .selectInstanceType(calculatorFormData.getInstanceType())
                .selectAddGPUsCheckBox()
                .selectGPUType(calculatorFormData.getGPUType())
                .selectNumberOfGPUs(calculatorFormData.getNumberOfGPUs())
                .selectLocalSSD(calculatorFormData.getLocalSSD())
                .selectDatacenterLocation(calculatorFormData.getRegionDatacenterLocation())
                .selectCommittedUsageTime(calculatorFormData.getCommittedUsage())
                .clickAddToEstimateButton()
                .returnActualCalculatedData();

        Assert.assertTrue(actualCalculatedData.getEstimatedComponentCostPerMonth().contains(calculatorFormData.getEstimatedComponentCostPerMonth()),
                "Actual string:\n'" + actualCalculatedData.getEstimatedComponentCostPerMonth() + "'"
                        + "\n not contains expected test value: '" + calculatorFormData.getEstimatedComponentCostPerMonth() + "'");
    }
}
