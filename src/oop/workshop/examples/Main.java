package oop.workshop.examples;

public class Main {

 public static void main(String[] args) {
     // instancirawe na objekt so default constructor
     MyFirstClass myFirstClass = new MyFirstClass(500, true);
     int mnozhitel = 3;

     // magicIntNumber i iAmBoolean promenlivite dobivaat vrednosti vo constructor-ot
     // notSomagicIntNumber bidejki ne e prisutna vo constructorot dobiva default vrednost

     // od objektot myFirstClass, ispechati ja vrednosta na promenlivite
     System.out.println("magicIntNumber = " + myFirstClass.getMagicIntNumber());
     System.out.println("notSomagicIntNumber = " + myFirstClass.getNotSomagicIntNumber());
     System.out.println("iAmBoolean = " + myFirstClass.isiAmBoolean());
     System.out.println("proizvod = " + myFirstClass.pomnozhiMagicNumbers(mnozhitel));

     // smeni ja i vrednosta na site promenlivi i ispechati gi novite vrednosti
     myFirstClass.setMagicIntNumber(100);
     myFirstClass.setNotSomagicIntNumber(-1);
     myFirstClass.setiAmBoolean(false);

     System.out.println("new values:");
     System.out.println("magicIntNumber = " + myFirstClass.getMagicIntNumber());
     System.out.println("notSomagicIntNumber = " + myFirstClass.getNotSomagicIntNumber());
     System.out.println("iAmBoolean = " + myFirstClass.isiAmBoolean());

 }
}