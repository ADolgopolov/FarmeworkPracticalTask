package com.epam.training.student_andrii_dolhopolov.models;

public class CalculatorFormTestData {
    private String productName;
    private String numberOfInstances;
    private String operationSystem;
    private String VMClass;
    private String instanceSeries;
    private String instanceType;
    private String numberOfGPUs;
    private String GPUType;
    private String localSSD;
    private String regionDatacenterLocation;
    private String committedUsage;
    private String estimatedComponentCostPerMonth;

    public CalculatorFormTestData() {
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getNumberOfInstances() {
        return numberOfInstances;
    }

    public void setNumberOfInstances(String numberOfInstances) {
        this.numberOfInstances = numberOfInstances;
    }

    public String getOperationSystem() {
        return operationSystem;
    }

    public void setOperationSystem(String operationSystem) {
        this.operationSystem = operationSystem;
    }

    public String getVMClass() {
        return VMClass;
    }

    public void setVMClass(String VMClass) {
        this.VMClass = VMClass;
    }

    public String getInstanceSeries() {
        return instanceSeries;
    }

    public void setInstanceSeries(String instanceSeries) {
        this.instanceSeries = instanceSeries;
    }

    public String getInstanceType() {
        return instanceType;
    }

    public void setInstanceType(String instanceType) {
        this.instanceType = instanceType;
    }

    public String getNumberOfGPUs() {
        return numberOfGPUs;
    }

    public void setNumberOfGPUs(String numberOfGPUs) {
        this.numberOfGPUs = numberOfGPUs;
    }

    public String getGPUType() {
        return GPUType;
    }

    public void setGPUType(String GPUType) {
        this.GPUType = GPUType;
    }

    public String getLocalSSD() {
        return localSSD;
    }

    public void setLocalSSD(String localSSD) {
        this.localSSD = localSSD;
    }

    public String getRegionDatacenterLocation() {
        return regionDatacenterLocation;
    }

    public void setRegionDatacenterLocation(String regionDatacenterLocation) {
        this.regionDatacenterLocation = regionDatacenterLocation;
    }

    public String getCommittedUsage() {
        return committedUsage;
    }

    public void setCommittedUsage(String committedUsage) {
        this.committedUsage = committedUsage;
    }

    public String getEstimatedComponentCostPerMonth() {
        return estimatedComponentCostPerMonth;
    }

    public void setEstimatedComponentCostPerMonth(String estimatedComponentCostPerMonth) {
        this.estimatedComponentCostPerMonth = estimatedComponentCostPerMonth;
    }
}