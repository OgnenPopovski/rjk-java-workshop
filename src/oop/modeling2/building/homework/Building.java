package oop.modeling2.building.homework;

import java.util.List;

public class Building {

    private String address;
    private List<Floor> floors;

    public Building(String address, List<Floor> floors) {
        this.address = address;
        this.floors = floors;
    }

    public void printDetails() {
        System.out.println("Details for building with address '" + address + "':");
        System.out.println();
        for (int i = 0; i < floors.size(); i++) {
            Floor floor = floors.get(i);
            floor.printFreeApartmentDetails();

        }
    }
}
