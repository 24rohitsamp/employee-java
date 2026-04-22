package com.pluralsight;

public class Employee {
    private int employeeId;
    private String name;
    private double payRate;
    private double hoursWorked;

    //constructor
    public Employee(int employeeId, String name, double hoursWorked, double payRate) {
        this.employeeId = employeeId;
        this.payRate = payRate;
        this.name = name;
        this.hoursWorked = hoursWorked;
    }
//Getters
    public int getEmployeeId() {
        return employeeId;
    }

    public String getName() {
        return name;
    }

    public double getHoursWorked() {
        return hoursWorked;
    }
    public double getPayRate() {
        return payRate;
    }

    public double getGrossPay() {
        return hoursWorked * payRate;
    }
}
