//package ContactsManagerCLI;
//
//import java.io.*;
//import java.util.ArrayList;
//import java.util.List;
//import java.util.Scanner;
//
//class ContactsManager {
//    private final List<Contact> contacts;
//
//    public ContactsManager() {
//        contacts = new ArrayList<>();
//        readContacts();
//    }
//
//    private void readContacts() {
//        try {
//            File file = new File("contacts.txt");
//            Scanner scanner = new Scanner(file);
//            while (scanner.hasNextLine()) {
//                String line = scanner.nextLine();
//                contacts.add(Contact.fromString(line));
//            }
//            scanner.close();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//    }
//
//    public void showMenu() {
//        System.out.println("1. View contacts.");
//        System.out.println("2. Add a new contact.");
//        System.out.println("3. Search a contact by name.");
//        System.out.println("4. Delete an existing contact.");
//        System.out.println("5. Exit the application.");
//    }
//
//    public int getChoice() {
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Enter an option (1, 2, 3, 4 or 5): ");
//        return scanner.nextInt();
//    }
//
//    public void viewContacts() {
//        for (Contact contact : contacts) {
//            System.out.println(contact);
//        }
//    }
//
//    public void addContact() {
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Enter contact's name: ");
//        String name = scanner.nextLine();
//        System.out.print("Enter contact's phone number: ");
//        String phoneNumber = scanner.nextLine();
//        contacts.add(new Contact(name, phoneNumber));
//        System.out.println("Contact added!");
//    }
//
//    public void searchContact() {
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Enter contact's name: ");
//        String name = scanner.nextLine();
//        for (Contact contact : contacts) {
//            if (contact.getName().equals(name)) {
//                System.out.println(contact);
//                return;
//            }
//        }
//        System.out.println("Contact not found.");
//    }
//
//    public void deleteContact() {
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Enter contact's name: ");
//        String name = scanner.nextLine();
//        for (int i = 0; i < contacts.size(); i++) {
//            if (contacts.get(i).getName().equals(name)) {
//                contacts.remove(i);
//                System.out.println("Contact deleted!");
//                return;
//            }
//        }
//        System.out.println("Contact not found.");
//    }
//
//    public void saveContacts() {
//        try {
//            File file = new File("contacts.txt");
//            PrintWriter writer = new PrintWriter(file);
//            for (Contact contact : contacts) {
//                writer.println(contact);
//            }
//            writer.close();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//    }
//        public static void main(String[] args) {
//            ContactsManager manager = new ContactsManager();
//            int choice;
//            do {
//                manager.showMenu();
//                choice = manager.getChoice();
//                switch (choice) {
//                    case 1:
//                        manager.viewContacts();
//                        break;
//                    case 2:
//                        manager.addContact();
//                        break;
//                    case 3:
//                        manager.searchContact();
//                        break;
//                    case 4:
//                        manager.deleteContact();
//                        break;
//                    case 5:
//                        System.out.println("Exiting...");
//                        manager.saveContacts();
//                        break;
//                    default:
//                        System.out.println("Invalid choice.");
//                }
//            } while (choice != 5);
//        }
//    }
//
//
