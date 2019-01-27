package oop.modeling2.building;

public class Building {

    private String address;
    private Floor floor1;
    private Floor floor2;
    private Floor floor3;

    public Building(String address, Floor floor1, Floor floor2, Floor floor3) {
        this.address = address;
        this.floor1 = floor1;
        this.floor2 = floor2;
        this.floor3 = floor3;
    }

    public void printDetails() {
        System.out.println("Details for building with address '" + address + "':");
        System.out.println();
        printFloorDetails(floor1);
        printFloorDetails(floor2);
        printFloorDetails(floor3);
    }

    private void printFloorDetails(Floor floor) {
        int freeApartments = floor.getNumberFreeApartments();
        int num = floor.getFloorNumber();
        System.out.println("Floor " + num + " - free apartments: " + freeApartments);
        floor.printFreeApartmentDetails();
        System.out.println();
    }
}
