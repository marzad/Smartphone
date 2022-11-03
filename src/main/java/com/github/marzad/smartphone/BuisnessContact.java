package com.github.marzad.smartphone;

public class BuisnessContact extends Contact{
    private String companyName;
    private String number;

    public BuisnessContact() {
    }

    public BuisnessContact(String companyName, String number) {
        this.companyName = companyName;
        this.number = number;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getCompanyNumber() {
        return number;
    }

    public void setCompanyNumber(String number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return this.companyName + " : " + this.number;
    }
}
