package com.pluralsight.models;

public class Reservation {

    private String roomType;
    private double pricePerNight;
    private int numberOfNights;
    private boolean isWeekend;

    public Reservation(String roomType, int numberOfNights, boolean isWeekend) {
        setRoomType(roomType);          // sets pricePerNight using if statements
        this.numberOfNights = numberOfNights;
        this.isWeekend = isWeekend;
    }

    //getter for room type
    public String getRoomType() {
        return roomType;
    }

    // setter for room type (sets price too)
    public void setRoomType(String roomType) {
        this.roomType = roomType.toLowerCase();

        if (this.roomType.equals("king")) {
            pricePerNight = 139.00;
        } else if (this.roomType.equals("double")) {
            pricePerNight = 124.00;
        } else {
            System.out.println("Invalid room type.");
            pricePerNight = 0;
        }
    }

    // price per night
    public double getPrice() {
        return pricePerNight;
    }

    // number of nights
    public int getNumberOfNights() {
        return numberOfNights;
    }

    public void setNumberOfNights(int numberOfNights) {
        this.numberOfNights = numberOfNights;
    }

    // weekend
    public boolean isWeekend() {
        return isWeekend;
    }

    public void setIsWeekend(boolean isWeekend) {
        this.isWeekend = isWeekend;
    }

    // total cost calculation
    public double getReservationTotal() {
        double nightlyRate = pricePerNight;

        if (isWeekend == true) {
            nightlyRate = nightlyRate * 1.10; // weekend increase
        }

        return nightlyRate * numberOfNights;
    }
}
