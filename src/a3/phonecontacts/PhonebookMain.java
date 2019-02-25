package a3.phonecontacts;

import java.util.Scanner;

public class PhonebookMain {

  public static void main(String[] args) {

    Phonebook phonebook = new Phonebook();
    insertRoutine(phonebook);
    updateRoutine(phonebook);
  }

  private static void insertRoutine(Phonebook phonebook) {
    Scanner in = new Scanner(System.in);

    String populateCriteria = "yes";
    String exitCriteria = "done";
    System.out.println(
        "Do you want to populate your phonebook or use defaults ? Type '"
            + populateCriteria
            + "' to populate it yourself. Type '" + exitCriteria + "' when done adding contacts");
    String populatePhonebookInput = in.nextLine();
    if (populateCriteria.equals(populatePhonebookInput)) {
      while (true) {
        System.out.println("enter name:");
        String name = in.nextLine();
        name = name.trim();
        if (name.length() == 0) {
          System.out.println("Contact must have name. Empty input is not a name");
          continue;
        }

        if (exitCriteria.equals(name)) {
          break;
        }
        System.out.println("enter phone:");
        String phoneNumber = in.nextLine();
        phoneNumber = phoneNumber.trim();
        if (phoneNumber.length() == 0) {
          System.out.println("Contact must have phone number. Empty input is not a phone number");
          continue;
        }
        phonebook.addContact(name, phoneNumber);
        System.out.println("Contact '" + name + "' added successfully.");
      }
    } else {
      phonebook.populateDefaults();
    }

    System.out.println("Phonebook populated. you have " + phonebook.phonebookSize() + " contacts in the phonebook");
  }

  private static void updateRoutine(Phonebook phonebook) {
    Scanner in = new Scanner(System.in);

    String exitCriteria = "done";
    String changeNameCriteria = "yes";
    while (true) {
      // just some guides how to use the application
      System.out.println("enter input in format: 'index newphonenumber' to update phone contact. note the space");
      System.out.println("if you are done with updating, type '" + exitCriteria + "'");
      phonebook.printContactsMenu();

      String input = in.nextLine();

      // ignore case sensitivity, just to be sure that all strings are the same.
      // this way we can compare successfully strings like "finnish", "FINISH", "FIniSh" and so on
      input = input.toLowerCase();

      // trim means that it will remove all the blank characters in front and end of the string
      // this will allow us to compare successfully strings "finish ", " finish", " finish  " and so on
      input = input.trim();

      // add the exit criteria
      if (exitCriteria.equals(input)) {
        break;
      }

      String[] splittedInput = input.split(" ");
      if (splittedInput.length != 2) {
        System.out.println("------------------------------------------------");
        System.out.println("wrong input!!");
        continue;
      }

      String index = splittedInput[0];
      if(!isInteger(index)) {
        System.out.println("index is not a number!");
        continue;
      }

      int contactsIndexToUpdate = Integer.parseInt(index);
      String newPhoneNumber = splittedInput[1];

      // make sure that the index from user input is present in the phonebook.
      // If it doesn't, stop here and start the process from the beginning.
      if (!phonebook.indexExists(contactsIndexToUpdate)) {
        System.out.println("------------------------------------------------");
        System.out.println("index '" + contactsIndexToUpdate
            + "'does not exist. Check the menu again for correct indexes");
        continue;
      }
      // update contact's phone finishes here
      phonebook.updateContactPhone(contactsIndexToUpdate, newPhoneNumber);

      // this handles the update contact name, if user wants to.
      System.out.println("Do you want to update contact's name too? Type '" + changeNameCriteria + "' if so.");
      String nameChangeInput = in.nextLine();
      nameChangeInput = nameChangeInput.trim();
      if (changeNameCriteria.equals(nameChangeInput)) {
        System.out.println("Enter name to update:");
        String newName = in.nextLine();
        newName = newName.trim();
        if (newName.length() == 0) {
          System.out.println("Invalid value for name. Empty input is not a name");
          continue;
        }
        phonebook.updateContactName(contactsIndexToUpdate, newName);
      }
      System.out.println("------------------------------------------------");
    }

    System.out.println("updating done! Phonebook content at the end:");
    phonebook.printContactsMenu();
  }

  public static boolean isInteger(String value) {
    boolean isInteger = true;
    try {
      Integer.parseInt(value);
    } catch (NumberFormatException e) {
      isInteger = false;
    }
    return isInteger;
  }

}
