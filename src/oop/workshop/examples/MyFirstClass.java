package oop.workshop.examples;

public class MyFirstClass {

    private int magicIntNumber;
    private int notSomagicIntNumber;
    private boolean iAmBoolean;

    public MyFirstClass() {
        // default constructor
    }

    public MyFirstClass(int magicIntNumber) {
        this.magicIntNumber = magicIntNumber;
    }

    public MyFirstClass(boolean iAmBoolean) {
        this.iAmBoolean = iAmBoolean;
    }

    public MyFirstClass(int magicIntNumber, boolean iAmBoolean) {
        this.magicIntNumber = magicIntNumber;
        this.iAmBoolean = iAmBoolean;
    }

    public MyFirstClass(int magicIntNumber, int notSomagicIntNumber, boolean iAmBoolean) {
        this.magicIntNumber = magicIntNumber;
        this.notSomagicIntNumber = notSomagicIntNumber;
        this.iAmBoolean = iAmBoolean;
    }

    public int pomnozhiMagicNumbers(int mnozhitel) {
        return magicIntNumber * notSomagicIntNumber * mnozhitel;
    }

    public int getMagicIntNumber() {
        return magicIntNumber;
    }

    public void setMagicIntNumber(int magicIntNumber) {
        this.magicIntNumber = magicIntNumber;
    }

    public int getNotSomagicIntNumber() {
        return notSomagicIntNumber;
    }

    public void setNotSomagicIntNumber(int notSomagicIntNumber) {
        this.notSomagicIntNumber = notSomagicIntNumber;
    }

    public boolean isiAmBoolean() {
        return iAmBoolean;
    }

    public void setiAmBoolean(boolean iAmBoolean) {
        this.iAmBoolean = iAmBoolean;
    }
}
