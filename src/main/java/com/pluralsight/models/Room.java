package com.pluralsight.models;

public class Room {

    private int numberOfBeds;
    private double price;
    private boolean occupied;
    private boolean dirty;

    public Room(int numberOfBeds, double price, boolean occupied, boolean dirty) {
        this.numberOfBeds = numberOfBeds;
        this.price = price;
        this.occupied = occupied;
        this.dirty = dirty;
    }

    public int getNumberOfBeds() {
        return numberOfBeds;
    }

    public double getPrice() {
        return price;
    }

    public boolean isOccupied() {
        return occupied;
    }

    public boolean isDirty() {
        return dirty;
    }

    public boolean isAvailable() {
        if (occupied == true) return false;
        if (dirty == true) return false;
        return true;
    }

    // part 2 of exercise vv

    public void checkIn() {
        if (isAvailable()) {
            occupied = true;
            dirty = true;   // room becomes dirty as soon as someone stays
            System.out.println("Guest checked in.");
        } else {
            System.out.println("Room is not available for check-in.");
        }
    }

    public void checkOut() {
        if (occupied == true) {
            occupied = false;
            dirty = true;   // room must be cleaned after checkout
            System.out.println("Guest checked out. Room needs cleaning.");
        } else {
            System.out.println("Room is already empty.");
        }
    }

    public void cleanRoom() {
        if (dirty == true) {
            dirty = false;
            System.out.println("Room has been cleaned.");
        } else {
            System.out.println("Room is already clean.");
        }
    }
}
