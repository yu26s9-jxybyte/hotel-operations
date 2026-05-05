package com.pluralsight;

import com.pluralsight.models.Hotel;
import com.pluralsight.models.Room;
import com.pluralsight.models.Employee;

public class Main {
    public static void main(String[] args) {

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

        System.out.println("\n");
        System.out.println("=========================");
        System.out.println("\n");


        // testing employee class
        Employee emp = new Employee(101, "Jayln", "Front Desk", 20.00, 0);

        emp.punchIn(10);
        emp.punchOut(14);

        emp.punchIn();
        emp.punchOut();

        System.out.println("Total hours worked: " + emp.getHoursWorked());
        System.out.println("Total pay: $" + emp.getTotalPay());
    }
}
