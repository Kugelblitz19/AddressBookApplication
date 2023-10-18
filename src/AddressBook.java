import java.util.ArrayList;
import java.util.List;

public class AddressBook {
    private List<Contact> contactList;

    public AddressBook() {
       contactList = new ArrayList<>();

    }
    public void addContact(Contact contact){
        contactList.add(contact);

    }
    public void updateContact(String name,Contact updatedContact) {
        for (Contact contact : contactList) {
            if (contact.getName().equals(name)) ;
            {
                contact.setName(updatedContact.getName());
                contact.setPhoneNumber(updatedContact.getPhoneNumber());
                contact.setEmail(updatedContact.getEmail());
                return;
            }

        }
        System.out.println("Contact Not Found.");
    }
    public void deleteContact(String contactName){
        Contact contactToRemove=null;
        for (Contact contact:contactList){
            if (contact.getName().equals(contactName)){
                contactToRemove=contact;
                break;
            }
        }
        if (contactToRemove!=null){
            contactList.remove(contactToRemove);
        }else {
            System.out.println("Contacts Not Found: ");
        }
    }
    public void searchContact(String contactName){
        for (Contact contact:contactList){
            if (contact.getName().equals(contactName)){
                System.out.println(contact);
                return;
            }
        }
        System.out.println("Contacts Not Found:");
    }
    public void showContact(String contactName) {
        boolean contactFound = false;
        for (Contact contact : contactList) {
            if (contact.getName().equalsIgnoreCase(contactName)) {
                System.out.println("Contact Details: ");
                System.out.println("Name: " + contact.getName());

                System.out.println("Phone Number: " + contact.getPhoneNumber());
                System.out.println("Email: " + contact.getEmail());
                contactFound = true;
                break;


            }
        }
        if (!contactFound)
        {
            System.out.println("Contact Not Found: ");
        }
    }
}
