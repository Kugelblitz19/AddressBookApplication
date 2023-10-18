import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        AddressBook addressBook = new AddressBook();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Address Book Menu:");
            System.out.println("1.Add Contact");
            System.out.println("2.Update Contact");
            System.out.println("3.Delete Contact");
            System.out.println("4.Search Contact");
            System.out.println("5.show Contacts");
            System.out.println("6.Exit");
            System.out.print("Enter Your Choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.println("Enter Name: ");
                    String name = scanner.nextLine();
                    System.out.println("Enter Phone Number: ");
                    String phoneNumber = scanner.nextLine();
                    System.out.println("Enter Email Address: ");
                    String email = scanner.nextLine();
                    Contact newContact = new Contact(name, phoneNumber, email);
                    addressBook.addContact(newContact);
                    System.out.println("Contact Added Successfully!");
                    break;

                case 2:
                    System.out.println("Enter name of the contact to update.");
                    String contactNameToUpdate = scanner.nextLine();
                    System.out.println("Enter Updated Name: ");
                    String updatedPhoneNumber = scanner.nextLine();
                    System.out.println("Enter updated PhoneNumber:");
                    String updatedEmail = scanner.nextLine();
                    System.out.println("Enter Updated Email:");
                    Contact updatedContact = new Contact(contactNameToUpdate, updatedPhoneNumber, updatedEmail);
                    addressBook.updateContact(contactNameToUpdate, updatedContact);
                    break;
                case 3:
                    System.out.println("Enter name of the contact to delete: ");
                    String contactNameToDelete = scanner.nextLine();
                    addressBook.deleteContact(contactNameToDelete);
                    break;
                case 4:
                    System.out.println("Enter the name of the contact to search: ");
                    String contactNameToSearch = scanner.nextLine();
                    addressBook.searchContact(contactNameToSearch);
                    break;
                case 5:
                    System.out.println("Enter the name of the contact to show: ");
                    String contactNameToShow=scanner.nextLine();
                    addressBook.showContact(contactNameToShow);
                case 6:
                    System.out.println("Existing Address Book.Goodbye!");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid Choice!. Please enter a valid option.");


            }

        }
    }
}