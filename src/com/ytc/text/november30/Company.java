package com.ytc.text.november30;

public class Company {


    private String companyName; //公司名称
    private String companyAddress; //公司地址
    private int empNum; //人数

    public String getCompanyName() {
        return companyName;
    }

    public String getCompanyAddress() {
        return companyAddress;
    }

    public int getEmpNum() {
        return empNum;
    }

    public Company() {
    }

    public Company(String companyName, String companyAddress, int empNum) {
        this.companyName = companyName;
        this.companyAddress = companyAddress;
        this.empNum = empNum;
    }

    @Override
    public String toString() {
        return companyName + "在" + companyAddress + ",一共有" + empNum + "人";
    }
}

class CompanyTest{
    public static void main(String[] args) {
        Company company = new Company("华为","软件园",1000000);
        Company company1 = new Company("aaa","bbb",10000);
        if (company.getEmpNum() > company1.getEmpNum()) {
            System.out.println(company);
        }else {
            System.out.println(company1);
        }

    }
}