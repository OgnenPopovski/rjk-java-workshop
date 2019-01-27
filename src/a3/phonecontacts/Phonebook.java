package a3.phonecontacts;

import java.util.ArrayList;
import java.util.List;

public class Phonebook {

  private List<Contact> contactList = new ArrayList<>();

  public void populateDefaults() {
    contactList.add(new Contact("Aleksandar", "070123456"));
    contactList.add(new Contact("Marko", "078567890"));
    contactList.add(new Contact("Ivana", "075246810"));
    contactList.add(new Contact("Monika", "076357911"));
    contactList.add(new Contact("Kristijan", "077951862"));
  }

  public void updateContactPhone(int index, String phoneNumber) {
    contactList.get(index).setPhonenumber(phoneNumber);
  }

  public void updateContactName(int index, String name) {
    contactList.get(index).setName(name);
  }

  public void addContact(String name, String phoneNumber) {
    contactList.add(new Contact(name, phoneNumber));
  }

  public int phonebookSize() {
    return contactList.size();
  }

  public boolean indexExists(int index) {
    int numberOfContacts = contactList.size();
    return index < numberOfContacts && index >= 0;
  }

  public void printContactsMenu() {
    for (int i = 0; i < contactList.size(); i++) {
      Contact contact = contactList.get(i);
      System.out.println(i + ") " + contact.getName() + ": " + contact.getPhonenumber());
    }
  }
}
