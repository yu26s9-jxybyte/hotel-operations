package com.pluralsight.models;

public class Employee {

    private int employeeId;
    private String name;
    private String department;
    private double payRate;
    private double hoursWorked;
    private int punchInTime;  // added the stores the hour they clocked in

    public Employee(int employeeId, String name, String department, double payRate, double hoursWorked) {
        this.employeeId = employeeId;
        this.name = name;
        this.department = department;
        this.payRate = payRate;
        this.hoursWorked = hoursWorked;
    }

    //getters
    public int getEmployeeId() { return employeeId; }
    public String getName() { return name; }
    public String getDepartment() { return department; }
    public double getPayRate() { return payRate; }
    public double getHoursWorked() { return hoursWorked; }

    // part 2 of exercise vv

    public void punchIn(int time) {
        punchInTime = time;
        System.out.println(name + " punched in at " + time + ":00");
    }

    public void punchOut(int time) {
        int hours = time - punchInTime;

        if (hours > 0) {
            hoursWorked += hours;
            System.out.println(name + " punched out at " + time + ":00");
            System.out.println("Hours worked this shift: " + hours);
        } else {
            System.out.println("Invalid punch-out time.");
        }
    }

    // derived getters
    public double getRegularHours() {
        if (hoursWorked > 40) return 40;
        return hoursWorked;
    }

    public double getOvertimeHours() {
        if (hoursWorked > 40) return hoursWorked - 40;
        return 0;
    }

    public double getTotalPay() {
        double regularPay = getRegularHours() * payRate;
        double overtimePay = getOvertimeHours() * payRate * 1.5;
        return regularPay + overtimePay;
    }
}

