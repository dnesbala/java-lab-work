package com.company;

public class Room {
    private int roomNo;
    private String roomType;
    private double roomArea;
    private Boolean hasACMachine;

    public Room(int roomNo, String roomType, double roomArea, Boolean hasACMachine) {
        // this is used for name conflict resolution, when parameters and instance variables both have the same name
        this.roomNo = roomNo;
        this.roomType = roomType;
        this.roomArea = roomArea;
        this.hasACMachine = hasACMachine;
        System.out.println("Room " + roomNo + " created.");
    }

    public Room() {
    }

    void setData(int num, String type, double area, Boolean hasAC) {
        roomNo = num;
        roomType = type;
        roomArea = area;
        hasACMachine = hasAC;
        System.out.println("Data set.");
    }

    void displayData() {
        System.out.println("Room No = " + roomNo + " Room Type = " + roomType + " Room Area = " + roomArea
                + " Does room have AC machine = " + hasACMachine);

    }

    // pass by value
    void updateDataValue(int roomNoCopy) {
        roomNoCopy = 10;
    }

    // pass by reference
    void updateDataReference(Room roomCopy) {
        roomCopy.roomNo = 10;
    }

    Room compareRoomArea(Room r) {
        if (this.roomArea > r.roomArea) {
            return this;
        } else {
            return r;
        }
    }


    public static void main(String[] args) {
        Room kingRoom = new Room(1, "King", 250, true);
        kingRoom.updateDataValue(kingRoom.roomNo);
        System.out.println("Room No of King Room (after pass by value)= " + kingRoom.roomNo);

        kingRoom.updateDataReference(kingRoom);
        System.out.println("Room No of King Room (after pass by reference)= " + kingRoom.roomNo);

        Room doubleRoom = new Room();
        doubleRoom.setData(2, "Double", 120, false);

        Room largerAreaRoom = kingRoom.compareRoomArea(doubleRoom);
        System.out.println(largerAreaRoom.roomType + " room has the larger area.");
        System.out.println("Details: ");
        largerAreaRoom.displayData();
    }
}

