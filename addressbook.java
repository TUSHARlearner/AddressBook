import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
/***********************************************************************************************************
*************************
***********************NOT WORKING ***********
** */


class addressbook {
    private static Map<String, String> contacts;

    public addressbook() {
        contacts = new HashMap<>();
    }

    public static void addContact(String name, String phoneNumber) {
        contacts.put(name, phoneNumber);
        System.out.println("Contact added successfully!");
    }

    public static void searchContact(String name) {
        if (contacts.containsKey(name)) {
            System.out.println("Name:" + name + ",Phone Number:" + contacts.get(name));
        } else {
            System.out.println("contact not found!");
        }
    }

public void displayAllContacts(){
    if(contacts.isEmpty()){
        System.out.println("Adress Book is empty!");
    }else{
        for(Map.Entry<String, String> entry : contacts.entrySet()){
            System.out.println("Name:" + entry.getKey()+ ",Phone Number:" + entry.getValue());
        }
    }
}

public static void displayAllContscts() {
}

}

public class Main {
    public static void main(String[] args) {
        addressbook adderessBook = new addressbook();
       
        Scanner scanner = new Scanner();

        while (true) {
            System.out.println("\nAddress Book Menu:");
            System.out.println("1. Add Contact");
            System.out.println("2. Search Contact");
            System.out.println("3. Display All Contacts");
            System.out.println("4. Exit");
            System.out.println("\nEnter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    scanner.nextLine(); // Consume newline character
                    System.out.print("\nEnter contact name: ");
                    String name = scanner.nextLine();
                    System.out.print("enter contact phone number:");
                    String phoneNumber = scanner.nextLine();
                    addressbook.addContact(name, phoneNumber);
                    break;

                case 2:
                    scanner.nextLine(); // Consume newline character
                    System.out.print("\nEnter contact name to search: ");
                    String searchName = scanner.nextLine();
                    addressbook.searchContact(searchName);
                    break;

                case 3:
                    addressbook.displayAllContscts();
                    break;

                case 4:
                    System.exit(0);
                default:
                    System.out.println("Invalid choice! Please enter a valid option. ");
            }

        }
    }
}



