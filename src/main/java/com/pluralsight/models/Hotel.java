package com.pluralsight.models;

public class Hotel {

    private String name;
    private int numberOfSuites;
    private int numberOfRooms;
    private int bookedSuites;
    private int bookedBasicRooms;

    // booked rooms default to 0
    public Hotel(String name, int numberOfSuites, int numberOfRooms) {
        this.name = name;
        this.numberOfSuites = numberOfSuites;
        this.numberOfRooms = numberOfRooms;
        this.bookedSuites = 0;
        this.bookedBasicRooms = 0;
    }

    // specify booked rooms
    public Hotel(String name, int numberOfSuites, int numberOfRooms, int bookedSuites, int bookedBasicRooms) {
        this.name = name;
        this.numberOfSuites = numberOfSuites;
        this.numberOfRooms = numberOfRooms;
        this.bookedSuites = bookedSuites;
        this.bookedBasicRooms = bookedBasicRooms;
    }

    // derived getters
    public int getAvailableSuites() {
        return numberOfSuites - bookedSuites;
    }

    public int getAvailableRooms() {
        return numberOfRooms - bookedBasicRooms;
    }

    // booking method
    public boolean bookRoom(int numberToBook, boolean isSuite) {

        if (isSuite) {
            if (numberToBook <= getAvailableSuites()) {
                bookedSuites += numberToBook;
                return true;
            } else {
                return false;
            }
        } else {
            if (numberToBook <= getAvailableRooms()) {
                bookedBasicRooms += numberToBook;
                return true;
            } else {
                return false;
            }
        }
    }
}
