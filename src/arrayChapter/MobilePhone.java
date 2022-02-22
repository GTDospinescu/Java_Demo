package arrayChapter;
import java.util.ArrayList;

public class MobilePhone {
    private String myNumber;
    private ArrayList<Contact> myContacts;

    public MobilePhone(String myNumber) {
        this.myNumber = myNumber;
        this.myContacts = new ArrayList<>();
    }

    public boolean addNewContact(Contact newContact) {
        for(int i = 0; i < myContacts.size(); i++) {
            if(myContacts.get(i).getName().equals(newContact.getName())){
                return false;
            }

        }
        return myContacts.add(newContact);
    }

    public boolean updateContact(Contact oldContact, Contact newContact) {
        int contactPosition = myContacts.indexOf(oldContact);
        if(contactPosition == -1) {
            return false;
        }
        myContacts.set(contactPosition,newContact);
        return true;
    }

    public boolean removeContact(Contact contact) {
        int contactPosition = myContacts.indexOf(contact);
        if(contactPosition == -1) {
            return false;
        }
        myContacts.remove(contact);
        return true;
    }

    private int findContact(Contact contact) {
        return myContacts.indexOf(contact);
    }

    private int findContact(String name) {
        for(int i = 0; i < myContacts.size(); i++) {
            if(myContacts.get(i).getName().equals(name)){
                return i;
            }
        }
        return -1;
    }

    public Contact queryContact(String name) {
        int contactPosition = findContact(name);
        if(contactPosition == -1){
            return null;
        }
        return myContacts.get(contactPosition);

    }

    public void printContacts() {
        System.out.println("Contact List:");
        for(int i = 0; i < myContacts.size(); i++) {
            Contact contact = myContacts.get(i);
            System.out.println(i + ". " + contact.getName() + " -> " + contact.getPhoneNumber());
        }

    }
}
