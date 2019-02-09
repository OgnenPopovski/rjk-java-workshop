package oop.modeling2.building.homework;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Apartment apartment1 = new Apartment(1, 50, true);
        Apartment apartment2 = new Apartment(2, 60, true);
        Apartment apartment3 = new Apartment(3, 56, false);
        Apartment apartment4 = new Apartment(4, 70, true);
        List<Apartment> floor1Apartments = new ArrayList<>();
        floor1Apartments.add(apartment1);
        floor1Apartments.add(apartment2);
        floor1Apartments.add(apartment3);
        floor1Apartments.add(apartment4);
        Floor floor1 = new Floor(1, floor1Apartments, 100);

        Apartment apartment5 = new Apartment(5, 100, true);
        Apartment apartment6 = new Apartment(6, 85, true);
        Apartment apartment7 = new Apartment(7, 50, true);
        Apartment apartment8 = new Apartment(8, 70, true);
        List<Apartment> floor2Apartments = new ArrayList<>();
        floor2Apartments.add(apartment5);
        floor2Apartments.add(apartment6);
        floor2Apartments.add(apartment7);
        floor2Apartments.add(apartment8);
        Floor floor2 = new Floor(2, floor2Apartments, 150);

        Apartment apartment9 = new Apartment(9, 85, false);
        Apartment apartment10 = new Apartment(10, 60, false);
        Apartment apartment11 = new Apartment(11, 110, false);
        Apartment apartment12 = new Apartment(12, 65, false);
        List<Apartment> floor3Apartments = new ArrayList<>();
        floor3Apartments.add(apartment9);
        floor3Apartments.add(apartment10);
        floor3Apartments.add(apartment11);
        floor3Apartments.add(apartment12);
        Floor floor3 = new Floor(3, floor3Apartments, 200);

        List<Floor> floors = new ArrayList<>();
        floors.add(floor1);
        floors.add(floor2);
        floors.add(floor3);
        Building building = new Building("My Street", floors);
        building.printDetails();
    }
}
