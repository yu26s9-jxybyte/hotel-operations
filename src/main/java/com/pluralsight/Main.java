package com.pluralsight;

import com.pluralsight.models.Hotel;
import com.pluralsight.models.Room;
import com.pluralsight.models.Employee;

public class Main {
    public static void main(String[] args) {

        // testing room and employee
        Room room = new Room(2, 150, false, false);
        room.checkIn();
        room.checkOut();
        room.cleanRoom();

        Employee emp = new Employee(101, "Jayln", "Front Desk", 20.00, 0);
        emp.punchTimeCard(10);
        emp.punchTimeCard(14);

        emp.punchTimeCard();
        try { Thread.sleep(2000); } catch (Exception e) {}
        emp.punchTimeCard();

        System.out.println("Hours worked: " + emp.getHoursWorked());

        // testing hotel class
        Hotel hotel = new Hotel("The Grand Plaza!", 5, 20);

        System.out.println("\n");
        System.out.println("Available suites: " + hotel.getAvailableSuites());
        System.out.println("Available rooms: " + hotel.getAvailableRooms());

        System.out.println("Booking 2 suites...");
        System.out.println("Success? " + hotel.bookRoom(2, true));

        System.out.println("Booking 3 basic rooms...");
        System.out.println("Success? " + hotel.bookRoom(3, false));

        System.out.println("Available suites: " + hotel.getAvailableSuites());
        System.out.println("Available rooms: " + hotel.getAvailableRooms());

        System.out.println("\n");
        System.out.println("=========================");
        System.out.println("\n");


        // room
        System.out.println("=== ROOM TESTS ===");

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

        System.out.println("\n");
        System.out.println("=========================");
        System.out.println("\n");


        System.out.println("Total hours worked: " + emp.getHoursWorked());
        System.out.println("Total pay: $" + emp.getTotalPay());
    }
}
