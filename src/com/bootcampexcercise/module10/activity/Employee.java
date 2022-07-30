package com.bootcampexcercise.module10.activity;

import java.util.List;

public class Employee extends Person {

    private String jobTitle;
    private String company;
    private double salary;
    private String name;

    public Employee() {
        System.out.println("I am an Employee");
    }

    public Employee(String jobTitle, String company, double salary, String name) {
        this.jobTitle = jobTitle;
        this.company = company;
        this.salary = salary;
        this.name = name;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String JobTitle) {
        this.jobTitle = jobTitle;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void introduce() {
        super.introduce();
        System.out.println("My name is " + getName() + " and I am " + getAge() + " years old. I work as " + getJobTitle() + " in company " + getCompany() + " and my salary is " + getSalary());
    }

    public static String getHighestPaidEmp(List<Employee> employeeList) {
        double maxSalary = employeeList.get(0).getSalary();
        String name = employeeList.get(0).getName();
        for (int i = 0; i < employeeList.size(); i++) {
            if (employeeList.get(i).getSalary() > maxSalary) {
                name = employeeList.get(i).getName();
            }
        }
        return name;
    }
}

