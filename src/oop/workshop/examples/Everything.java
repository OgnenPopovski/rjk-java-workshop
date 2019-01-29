package oop.workshop.examples;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Everything {

    public static void main(String[] args) {
        // Kreiranje na lista od Stringovi
        List<String> listWithStrings = new ArrayList<>();
        // Dodavanje na element na krajot na listata
        // so funkcijata 'add'
        listWithStrings.add("Element 1");
        listWithStrings.add("Element 2");
        listWithStrings.add("Element 3");
        listWithStrings.add("Element 4");
        listWithStrings.add("Element 5");
        listWithStrings.add("Element 6");

        // Izminuvanje na listata so for ciklus
        // listWithStrings.size() - dava kolku elementi ima vo listata
        System.out.println("Broj elementi: " + listWithStrings.size());
        for (int i = 0; i < listWithStrings.size(); i++) {
            // listWithStrings.get(i) - go zema elementot na pozicija i
            String element = listWithStrings.get(i);
            System.out.println(element);
        }

        boolean contains = listWithStrings.contains("Element 3");
        System.out.println(contains);

        // dodavanje na nov element na indeks 3
        listWithStrings.add(3, "new element 3");

        // brishenje na element na indeks 3
        listWithStrings.remove(3);

        // brishenje na site elementi od listata
        listWithStrings.clear();

        // proverka dali listata e prazna. vrakja true ako da
        boolean isEmpty = listWithStrings.isEmpty();


        String text = "abcd,efgh,ij,k,l,  ";
        char[] textToChars = text.toCharArray();
        String upperCaseText = text.toUpperCase();
        String lowerCaseText = text.toLowerCase();
        String[] split = text.split(",");


        String[] stringArray = {"abc","def","ghij","kl"};
        List<String> stringsAsList = Arrays.asList(stringArray);

        Integer[] intArray = {1, 2, 3, 4, 5};
        List<Integer> intsAsList = Arrays.asList(intArray);

        char a = 'a';
        char aUpperCase = Character.toUpperCase(a);
        char aLowerCase = Character.toLowerCase(a);

        char[] chars = {'a', 'b', 'c', 'd', 'e'};
        String wordFromChars = new String(chars);
        String word = "  abcd ef g     ";
        String trimmedWord = word.trim();
        System.out.println("trimmed word: " + trimmedWord);
        System.out.println(retryUntilReadInteger());
        System.out.println(retryUntilReadDouble());
        System.out.println(retryUntilReadBoolean());
    }

    public static boolean retryUntilReadBoolean() {
        Scanner in = new Scanner(System.in);

        while (!in.hasNextBoolean()) {
            String next = in.next();
            System.out.println("'" + next + "' is not a boolean (true/false). Try again");
        }
        return in.nextBoolean();
    }

    public static int retryUntilReadInteger() {
        Scanner in = new Scanner(System.in);

        while (!in.hasNextInt()) {
            String next = in.next();
            System.out.println("'" + next + "' is not an integer. Try again");
        }
        return in.nextInt();
    }

    public static double retryUntilReadDouble() {
        Scanner in = new Scanner(System.in);

        while (!in.hasNextDouble()) {
            String next = in.next();
            System.out.println("'" + next + "' is not a double. Try again");
        }
        return in.nextDouble();
    }

    public static void enterNewUntilExitCriteria() {
        Scanner in = new Scanner(System.in);
        String stopCriteria = "done";

        while (true) {
            String input = in.next();
            if (stopCriteria.equals(input.toLowerCase())) {
                break;
            }

            // koristi ja vrednosta za shto treba
            // primer: pechati ja
            System.out.println("your input is: " + input);
        }
    }
}
