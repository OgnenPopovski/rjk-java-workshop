package oop.modeling2.building;

public class Main {

    public static void main(String[] args) {
        Apartment apartment1 = new Apartment(1, 50, false);
        Apartment apartment2 = new Apartment(2, 60, false);
        Apartment apartment3 = new Apartment(3, 56, true);
        Apartment apartment4 = new Apartment(4, 70, false);
        Floor floor1 = new Floor(1, apartment1, apartment2, apartment3, apartment4, 100);

        Apartment apartment5 = new Apartment(5, 100, false);
        Apartment apartment6 = new Apartment(6, 85, false);
        Apartment apartment7 = new Apartment(7, 50, false);
        Apartment apartment8 = new Apartment(8, 70, false);
        Floor floor2 = new Floor(2, apartment5, apartment6, apartment7, apartment8, 150);

        Apartment apartment9 = new Apartment(9, 85, true);
        Apartment apartment10 = new Apartment(10, 60, true);
        Apartment apartment11 = new Apartment(11, 110, true);
        Apartment apartment12 = new Apartment(12, 65, true);
        Floor floor3 = new Floor(3, apartment9, apartment10, apartment11, apartment12, 200);

        Building building = new Building("My Street", floor1, floor2, floor3);
        building.printDetails();
    }
}
