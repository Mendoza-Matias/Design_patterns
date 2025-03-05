package com.builder;

public class Main {
    public static void main(String[] args) {
        Employee employee = new Employee.EmployeeBuilder().build();

        System.out.println(employee);
    }
}