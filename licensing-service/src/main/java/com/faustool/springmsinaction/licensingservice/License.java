package com.faustool.springmsinaction.licensingservice;

public class License {
    private String licenseId;
    private String productName;
    private String licenseType;
    private String organizationId;

    public License(String licenseId, String productName, String licenseType, String organizationId) {
        this.licenseId = licenseId;
        this.productName = productName;
        this.licenseType = licenseType;
        this.organizationId = organizationId;
    }

    public String getLicenseId() {
        return licenseId;
    }

    public void setLicenseId(String licenseId) {
        this.licenseId = licenseId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getLicenseType() {
        return licenseType;
    }

    public void setLicenseType(String licenseType) {
        this.licenseType = licenseType;
    }

    public String getOrganizationId() {
        return organizationId;
    }

    public void setOrganizationId(String organizationId) {
        this.organizationId = organizationId;
    }
}
