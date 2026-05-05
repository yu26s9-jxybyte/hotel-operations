package com.pluralsight;

import com.pluralsight.models.Room;
import com.pluralsight.models.Employee;

public class Main {
    public static void main(String[] args) {

        // testing room class
        System.out.println("=== ROOM TESTS ===");

        Room room = new Room(2, 150.00, false, false);

        System.out.println("Room available? " + room.isAvailable());

        System.out.println("Checking in...");
        room.checkIn();
        System.out.println("Room available? " + room.isAvailable());

        System.out.println("Checking out...");
        room.checkOut();
        System.out.println("Room available? " + room.isAvailable());

        System.out.println("Cleaning room...");
        room.cleanRoom();
        System.out.println("Room available? " + room.isAvailable());


        // testing employee class
        System.out.println("\n=== EMPLOYEE TESTS ===");

        Employee emp = new Employee(101, "Jayln", "Front Desk", 20.00, 0);

        emp.punchIn(10);   // 10:00 AM
        emp.punchOut(14);  // 2:00 PM → worked 4 hours

        emp.punchIn(15);   // 3:00 PM
        emp.punchOut(20);  // 8:00 PM → worked 5 hours

        System.out.println("Total hours worked: " + emp.getHoursWorked());
        System.out.println("Regular hours: " + emp.getRegularHours());
        System.out.println("Overtime hours: " + emp.getOvertimeHours());
        System.out.println("Total pay: $" + emp.getTotalPay());
    }
}
