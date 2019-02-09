package oop.modeling2.building.homework;

import java.util.List;

public class Floor {

    private List<Apartment> apartments;
    private int floorNumber;
    private int squareMeterPrice;

    public Floor(int floorNumber, List<Apartment> apartments, int squareMeterPrice) {
        this.apartments = apartments;
        this.floorNumber = floorNumber;
        this.squareMeterPrice = squareMeterPrice;
    }

    private int getNumberFreeApartments() {
        int freeApartments = 0;
        for (int i = 0; i < apartments.size(); i++) {
            Apartment apartment = apartments.get(i);
            if (apartment.isFree()) {
                freeApartments++;
            }
        }

        return freeApartments;
    }

    public void printFreeApartmentDetails() {
        int freeApartments = getNumberFreeApartments();
        System.out.println("Floor " + floorNumber + " - free apartments: " + freeApartments + "/" + apartments.size());

        if (freeApartments == 0) {
            System.out.println("No available apartments on this floor.");
        } else {
            for (int i = 0; i < apartments.size(); i++) {
                Apartment apartment = apartments.get(i);
                printFreeApartmentDetails(apartment);
            }
        }
        System.out.println();
    }

    private void printFreeApartmentDetails(Apartment apartment) {
        if (apartment.isFree()) {
            int size = apartment.getSize();
            int cost = size * squareMeterPrice;
            int num = apartment.getNumber();
            String msg = "apartment " + num + ": Size = " + size + "m^2, cost = " + cost + " euros";
            System.out.println(msg);
        }
    }

}
