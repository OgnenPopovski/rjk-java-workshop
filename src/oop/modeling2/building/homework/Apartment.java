package oop.modeling2.building.homework;

public class Apartment {

    private int number;
    private int size;
    private boolean free;

    public Apartment(int number, int size, boolean free) {
        this.number = number;
        this.size = size;
        this.free = free;
    }

    public int getSize() {
        return size;
    }

    public boolean isFree() {
        return free;
    }

    public int getNumber() {
        return number;
    }
}
