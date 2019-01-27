package oop.modeling2.building;

public class Apartment {

    private int number;
    private int size;
    private boolean sold;

    public Apartment(int number, int size, boolean sold) {
        this.number = number;
        this.size = size;
        this.sold = sold;
    }

    public int getSize() {
        return size;
    }

    public boolean isSold() {
        return sold;
    }

    public int getNumber() {
        return number;
    }
}
