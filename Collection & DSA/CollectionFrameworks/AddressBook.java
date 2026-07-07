import java.util.*;

class Contact implements Comparable<Contact> {
    String name;
    String phone;
    String email;

    Contact(String name, String phone, String email) {
        this.name = name;
        this.phone = phone;
        this.email = email;
    }

    @Override
    public int compareTo(Contact c) {
        return this.name.compareToIgnoreCase(c.name);
    }

    @Override
    public String toString() {
        return "Name: " + name +
               ", Phone: " + phone +
               ", Email: " + email;
    }
}

public class AddressBook {
    static ArrayList<Contact> contacts = new ArrayList<>();
    static HashMap<String, Contact> contactMap = new HashMap<>();
    static HashSet<String> phoneNumbers = new HashSet<>();

    public static void addContact(String name, String phone, String email) {
        if (phoneNumbers.contains(phone)) {
            System.out.println("Duplicate phone number not allowed.");
            return;
        }

        Contact c = new Contact(name, phone, email);
        contacts.add(c);
        contactMap.put(name, c);
        phoneNumbers.add(phone);

        System.out.println("Contact Added.");
    }

    public static void searchContact(String name) {
        Contact c = contactMap.get(name);

        if (c != null)
            System.out.println(c);
        else
            System.out.println("Contact not found.");
    }

    public static void deleteContact(String name) {
        Contact c = contactMap.remove(name);

        if (c != null) {
            contacts.remove(c);
            phoneNumbers.remove(c.phone);
            System.out.println("Contact Deleted.");
        } else {
            System.out.println("Contact not found.");
        }
    }

    public static void displayContacts() {
        Collections.sort(contacts);

        System.out.println("\nSorted Contacts:");
        for (Contact c : contacts) {
            System.out.println(c);
        }
    }

    public static void main(String[] args) {
        addContact("Sahil", "9876543210", "sahil@gmail.com");
        addContact("Aman", "9999999999", "aman@gmail.com");
        addContact("Riya", "8888888888", "riya@gmail.com");

        searchContact("Aman");

        deleteContact("Riya");

        displayContacts();
    }
}