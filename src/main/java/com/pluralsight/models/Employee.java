package com.pluralsight.models;

import java.time.LocalDateTime;

public class Employee {

    private int employeeId;
    private String name;
    private String department;
    private double payRate;
    private double hoursWorked;

    private int punchInHour;
    private int punchInMinute;

    public Employee(int employeeId, String name, String department, double payRate, double hoursWorked) {
        this.employeeId = employeeId;
        this.name = name;
        this.department = department;
        this.payRate = payRate;
        this.hoursWorked = hoursWorked;
    }


    public void punchIn(int time) {
        punchInHour = time;
        punchInMinute = 0;
        System.out.println(name + " punched in at " + time + ":00");
    }

    public void punchOut(int time) {
        int hours = time - punchInHour;

        if (hours > 0) {
            hoursWorked += hours;
            System.out.println(name + " punched out at " + time + ":00");
            System.out.println("Hours worked this shift: " + hours);
        } else {
            System.out.println("Invalid punchout time.");
        }
    }

    public double getHoursWorked() {
        return hoursWorked;
    }

    //  overload methods
    public void punchIn() {
        LocalDateTime now = LocalDateTime.now();
        punchInHour = now.getHour();
        punchInMinute = now.getMinute();

        System.out.println(name + " punched in at " + punchInHour + ":" + punchInMinute);
    }

    public void punchOut() {
        LocalDateTime now = LocalDateTime.now();
        int outHour = now.getHour();
        int outMinute = now.getMinute();

        double hours = (outHour - punchInHour) + ((outMinute - punchInMinute) / 60.0);

        if (hours > 0) {
            hoursWorked += hours;
            System.out.println(name + " punched out at " + outHour + ":" + outMinute);
            System.out.println("Hours worked this shift: " + hours);
        } else {
            System.out.println("Invalid punchout time.");
        }
    }

    // pay roll methods
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

