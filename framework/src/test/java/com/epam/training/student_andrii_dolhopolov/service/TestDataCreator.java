package com.epam.training.student_andrii_dolhopolov.service;

import com.epam.training.student_andrii_dolhopolov.models.CalculatorFormTestData;

public class TestDataCreator {
    public static CalculatorFormTestData withEnvironmentProperties() {
        CalculatorFormTestData calculatorFormTestData = new CalculatorFormTestData();
//        testdata.product_name=Compute Engine
        calculatorFormTestData.setProductName(TestDataReader.getTestData("testdata.product_name"));
//        testdata.number_of_instances=4
        calculatorFormTestData.setNumberOfInstances(TestDataReader.getTestData("testdata.number_of_instances"));
//        testdata.operation_system=Free
        calculatorFormTestData.setOperationSystem(TestDataReader.getTestData("testdata.operation_system"));
//        testdata.vm_class=Regular
        calculatorFormTestData.setVMClass(TestDataReader.getTestData("testdata.vm_class"));
//        testdata.instance_series=N1
        calculatorFormTestData.setInstanceSeries(TestDataReader.getTestData("testdata.instance_series"));
//        testdata.instance_type=n1-standard-8
        calculatorFormTestData.setInstanceType(TestDataReader.getTestData("testdata.instance_type"));
//        testdata.number_of_gpus=1
        calculatorFormTestData.setNumberOfGPUs(TestDataReader.getTestData("testdata.number_of_gpus"));
//        testdata.gpu_type=NVIDIA Tesla V100
        calculatorFormTestData.setGPUType(TestDataReader.getTestData("testdata.gpu_type"));
//        testdata.local_ssd=2x375
        calculatorFormTestData.setLocalSSD(TestDataReader.getTestData("testdata.local_ssd"));
//        testdata.datacenter_location=Frankfurt
        calculatorFormTestData.setRegionDatacenterLocation(TestDataReader.getTestData("testdata.datacenter_location"));
//        testdata.committed_usage=1 Year
        calculatorFormTestData.setCommittedUsage(TestDataReader.getTestData("testdata.committed_usage"));
        calculatorFormTestData.setEstimatedComponentCostPerMonth(TestDataReader.getTestData("testdata.estimatedComponentCostPerMonth"));
        return calculatorFormTestData;
    }
}
