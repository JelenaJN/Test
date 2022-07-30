package com.bootcampexcercise.module10.activity;

import java.util.ArrayList;
import java.util.List;

public class EmployeeList {

    public static void main(String[] args) {
        Employee employee1 = new Employee("Manager", "Microsoft", 5000.0,"Mike");
        Employee employee2 = new Employee("QA", "Accenture", 2800.0, "Jelena");
        Employee employee3 = new Employee("Driver", "Laima", 1200.0,"Vasily");
        Employee employee4 = new Employee("Project manager", "Apple", 5500.0, "John");
        Employee employee5 = new Employee("Junior developer", "AGroup", 1000.0, "Vladimir");

        List <Employee>employeeList = new ArrayList<Employee>();

        employeeList.add(employee1);
        employeeList.add(employee2);
        employeeList.add(employee3);
        employeeList.add(employee4);
        employeeList.add(employee5);

        System.out.println("The Employee whose salary is the highest is: " + Employee.getHighestPaidEmp(employeeList));

    }
}
