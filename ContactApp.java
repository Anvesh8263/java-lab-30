package contactApp;

import contactList.ContactList;
import contactNumber.ContactNumber;
import myLinkedList.MyLinkedList;
import node.Node;
import person.Person;
import validInputs.ValidInputs;

import java.util.regex.Pattern;

public class ContactApp {
    private static ValidInputs validInputs;

    static {
        validInputs = new ValidInputs();
    }

    private MyLinkedList<Person> personMyLinkedList;

    public ContactApp() {
        personMyLinkedList = new MyLinkedList<>();
    }

    public String enterName() {
        while (true) {
            System.out.println("Please enter the name of the Person");
            System.out.println("First Name: ");
            String firstName = validInputs.inputValidName();
            if (firstName == null) {
                return null;
            }
            System.out.println("Last Name: ");
            String lastName = validInputs.inputValidName();
            if (lastName == null) {
                return null;
            }
            if (personMyLinkedList.matchFound(firstName + " " + lastName)) {
                System.out.println("Contact with this name already exists!");
                System.out.println("To try again with a different name, enter 't' or to return to menu, enter 'q'");
                char choice = validInputs.inputValidChoice('q', 't');
                if (choice == 'q') {
                    return null;
                } else {
                    continue;
                }
            }
            return firstName + " " + lastName;
        }
    }

    public ContactList enterContactList() {
        ContactList contactList = new ContactList();
        char choice = 'y';
        int flag = 0;
        while (choice != 'n') {
            if (contactList.addContactNumber() == -1) {
                if (flag == 0) {
                    return null;
                }
                return contactList;
            }
            flag = 1;
            System.out.println("Would you like to add another contact number? (y/n):");
            choice = validInputs.inputValidChoice('y', 'n');
        }
        return contactList;
    }

    public String enterEmail() {
        String emailAddress;
        System.out.println("Email Address: ");
        emailAddress = validInputs.inputValidString();
        String regex = "(?:[a-zA-Z0-9]+[._-])*[a-zA-Z0-9]+@(?:[a-zA-Z0-9]+[._-])*[a-zA-Z0-9]+\\.[a-zA-Z]{2,4}";
        boolean matches = Pattern.matches(regex, emailAddress);
        while (!matches) {
            System.out.println("Enter a valid email address or 'q' to skip email address entry");
            emailAddress = validInputs.inputValidString();
            if (emailAddress.equals("q")) {
                return null;
            }
            matches = Pattern.matches(regex, emailAddress);
        }
        return emailAddress;
    }

    public void addContact() {
        System.out.println("You have chosen to add a new contact: ");

        String nameEntry = enterName();
        if (nameEntry == null) {
            return;
        }
        String firstName = nameEntry.split(" ")[0];
        String lastName = nameEntry.split(" ")[1];
        ContactList contactList = enterContactList();
        if (contactList == null) {
            return;
        }
        String emailEntry = "";
        System.out.println("Would you like to add email address? (y/n):");
        int choice = validInputs.inputValidChoice('y', 'n');
        if (choice == 'y') {
            emailEntry = enterEmail();
            if (emailEntry == null) {
                emailEntry = "";
            }
        }
        Person person = new Person(firstName, lastName, contactList, emailEntry.toLowerCase());
        personMyLinkedList.insertInAlphabeticOrder(new Node<>(person));
        System.out.println("Contact added!");
    }

    public void displayAContact(Node<Person> personNode) {
        System.out.println("-------- * -------- * -------- * --------");
        System.out.println("First Name: " + personNode.getData().getFirstName());
        System.out.println("Last Name: " + personNode.getData().getLastName());

        ContactList contactList = personNode.getData().getContactList();
        Node<ContactNumber> contactNumber = contactList.getHead();
        if (contactNumber.getNext() == null) {
            System.out.print("Contact Number: ");
        } else {
            System.out.print("Contact Number(s): ");
        }
        while (contactNumber.getNext() != null) {
            System.out.print(contactNumber.toString() + ", ");
            contactNumber = contactNumber.getNext();
        }
        System.out.println(contactNumber.toString());
        System.out.println("Email address: " + personNode.getData().getEmailAddress());
        System.out.println("-------- * -------- * -------- * --------");
    }

    public void displayAllContacts() {
        if (personMyLinkedList.getHead() == null) {
            System.out.println("No contacts!");
        } else {
            System.out.println("---Here are all your contacts---");
            Node<Person> temp = personMyLinkedList.getHead();
            while (temp != null) {
                displayAContact(temp);
                temp = temp.getNext();
            }
        }
    }

    public void searchAContact() {
        if (personMyLinkedList.getHead() == null) {
            System.out.println("No Contacts!");
            return;
        }
        System.out.println("You could search for a contact from their first names:");
        String name = validInputs.inputValidName();
        if (name == null) {
            return;
        }
        MyLinkedList<Person> searchedPersons = personMyLinkedList.search(name);
        if (searchedPersons == null) {
            System.out.println("NO RESULTS FOUND!");
        } else {
            int count = searchedPersons.countNodes();
            if (count == 1) {
                System.out.println(count + " match found!");
            } else {
                System.out.println(count + " matches found!");
            }
            Node<Person> temp = searchedPersons.getHead();
            while (temp != null) {
                displayAContact(temp);
                temp = temp.getNext();
            }
        }
    }

    public int displayNames() {
        if (personMyLinkedList.getHead() == null) {
            System.out.println("No contacts!");
            return -1;
        }
        System.out.println("Here are all your contacts: ");
        return personMyLinkedList.display();
    }

    public boolean deleteVerified(Node<Person> person) {
        System.out.println("Do you really want to delete " + person.toString() + "'s contact? (y/n) :");
        char choice = validInputs.inputValidChoice('y', 'n');
        return choice == 'y';
    }

    public void deleteAContact() {
        int count = displayNames();
        if (count == -1) {
            return;
        }
        System.out.println("Press the number against the contact to delete it:");

        int toDelete = validInputs.inputValidInteger(count);
        if (toDelete == -1) {
            return;
        }
        if (deleteVerified(personMyLinkedList.getNode(toDelete))) {
            Node<Person> deleted = personMyLinkedList.delete(toDelete);
            System.out.println(deleted.toString() + "'s contact deleted from list!");
        }
    }

    public void printEditMenu() {
        System.out.println("Enter:\n" +
                "1 - to edit name\n" +
                "2 - to edit contact numbers\n" +
                "3 - to edit email address\n" +
                "4 - to return to main menu");
    }

    public void editPersonContact() {
        int count = displayNames();
        if (count == -1) {
            return;
        }
        System.out.println("Press the number against the contact to edit it : ");
        int toEdit = validInputs.inputValidInteger(count);
        if (toEdit == -1) {
            return;
        }
        Node<Person> contactToEdit = personMyLinkedList.getNode(toEdit);

        char loop = 'y';
        while (loop == 'y') {
            displayAContact(contactToEdit);
            printEditMenu();
            int choice = validInputs.inputValidInteger(4);
            if (choice == -1) {
                return;
            }
            switch (choice) {
                case 1:
                    String nameEntry = enterName();
                    if (nameEntry == null) {
                        continue;
                    }
                    Node<Person> editedContact = new Node<>(new Person(nameEntry.split(" ")[0], nameEntry.split(" ")[1], contactToEdit.getData().getContactList(), contactToEdit.getData().getEmailAddress()));
                    personMyLinkedList.delete(toEdit);
                    toEdit = personMyLinkedList.insertInAlphabeticOrder(editedContact);
                    contactToEdit = editedContact;
                    System.out.println("Name edited!");
                    break;
                case 2:
                    int result = contactToEdit.getData().getContactList().editMenu();
                    if (result == -1) {
                        continue;
                    }
                    break;
                case 3:
                    String emailEntry = enterEmail();
                    if (emailEntry == null) {
                        continue;
                    }
                    contactToEdit.getData().setEmailAddress(emailEntry.toLowerCase());
                    System.out.println("Email edited!");
                    break;
                case 4:
                    return;
            }
            System.out.println("Would you like to edit anything else? (y/n):");
            loop = validInputs.inputValidChoice('y', 'n');
        }
    }

    public void printMenu() {
        System.out.println("Welcome to my Contact List App\n" +
                "Press 1 to add a new contact\n" +
                "Press 2 to view all contacts\n" +
                "Press 3 to search for a contact\n" +
                "Press 4 to delete a contact\n" +
                "Press 5 to edit a contact\n" +
                "Press 6 to exit program");
    }

    public void contactAppMenu() {
        int choice = -1;
        while (choice != 6) {
            printMenu();
            System.out.println("Enter choice");
            choice = validInputs.inputValidInteger(6);
            switch (choice) {
                case 1:
                    addContact();
                    break;
                case 2:
                    displayAllContacts();
                    break;
                case 3:
                    searchAContact();
                    break;
                case 4:
                    deleteAContact();
                    break;
                case 5:
                    editPersonContact();
                    break;
                case 6:
                    System.out.println("Closing the App...");
                    System.out.println("Have a nice day!");
                    break;

            }
        }
    }


}