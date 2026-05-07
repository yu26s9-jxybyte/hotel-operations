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

    public boolean isAvailable() {
        if (occupied) return false;
        if (dirty) return false;
        return true;
    }

    public void checkIn() {
        if (isAvailable()) {
            occupied = true;
            dirty = true;
            System.out.println("Guest checked in.");
        } else {
            System.out.println("Room is not available for check-in.");
        }
    }

    public void checkOut() {
        if (occupied) {
            occupied = false;
            dirty = true;
            System.out.println("Guest checked out. Room needs cleaning.");
        } else {
            System.out.println("Room is already empty.");
        }
    }

    public void cleanRoom() {
        if (!occupied) {
            dirty = false;
            System.out.println("Room has been cleaned.");
        } else {
            System.out.println("Cannot clean an occupied room.");
        }
    }
}

