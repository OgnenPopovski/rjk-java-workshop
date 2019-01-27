package oop.modeling2.building;

public class Floor {

    private Apartment apartment1;
    private Apartment apartment2;
    private Apartment apartment3;
    private Apartment apartment4;
    private int floorNumber;
    private int squareMeterPrice;

    public Floor(int floorNumber, Apartment apartment1, Apartment apartment2, Apartment apartment3, Apartment apartment4, int squareMeterPrice) {
        this.floorNumber = floorNumber;
        this.apartment1 = apartment1;
        this.apartment2 = apartment2;
        this.apartment3 = apartment3;
        this.apartment4 = apartment4;
        this.squareMeterPrice = squareMeterPrice;
    }

    public int getNumberFreeApartments() {
        int freeApartments = 0;
        if (!apartment1.isSold()) {
            freeApartments++;
        }
        if (!apartment2.isSold()) {
            freeApartments++;
        }
        if (!apartment3.isSold()) {
            freeApartments++;
        }
        if (!apartment4.isSold()) {
            freeApartments++;
        }
        return freeApartments;
    }

    public void printFreeApartmentDetails() {
        int freeApartments = getNumberFreeApartments();

        if (freeApartments == 0) {
            System.out.println("No available apartments on this floor.");
        } else {
            printFreeApartmentDetails(apartment1);
            printFreeApartmentDetails(apartment2);
            printFreeApartmentDetails(apartment3);
            printFreeApartmentDetails(apartment4);
        }
    }

    private void printFreeApartmentDetails(Apartment apartment) {
        if (!apartment.isSold()) {
            int size = apartment.getSize();
            int cost = size * squareMeterPrice;
            int num = apartment.getNumber();
            String msg = "apartment " + num + ": Size = " + size + "m^2, cost = " + cost + " euros";
            System.out.println(msg);
        }
    }

    public int getFloorNumber() {
        return floorNumber;
    }
}
