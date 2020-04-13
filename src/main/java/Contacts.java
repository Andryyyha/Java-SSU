import java.util.ArrayList;
import java.util.Scanner;

public class Contacts {

    private ArrayList<Person> contacts = new ArrayList<Person>();

//    public Contacts(ArrayList<Person> contacts) {
//        this.contacts = contacts;
//    }

    public Contacts() {
        Scanner sc = new Scanner(System.in);

        while (true) {
            String input = sc.next();

            if (input.equals("add")) {
                System.out.println("Input phone number");
                String phoneNumber = sc.next();
                System.out.println("Input contact name");
                String info = sc.next();
                if (!isValidPhoneNumber(phoneNumber)) {
                    System.out.println("Incorrect phoneNumber");
                    break;
                }
                if (info.length() == 0) {
                    System.out.println("Name is empty");
                    break;
                }
                if (containsPersonWithName(info)) {
                    System.out.println("Person already exists");
                    break;
                }
                else {
                    Person p = new Person(phoneNumber, info);
                    contacts.add(p);
                }
            }
            else if (input.equals("rm")) {
                System.out.println("Input contact name");
                String contactName = sc.next();
                if (contactName.length() == 0) {
                    System.out.println("Name is empty");
                    break;
                }
                else {
                    removePerson(contactName);
                }
            }
            else if (input.equals("rename")) {

            }
        }
    }

    public boolean containsPersonWithName(String name) {
        for (Person p: contacts) {
            if (p.getInfo().equals(name))
                return true;
        }
        return false;
    }

    public boolean removePerson(String name) {
        for (Person p: contacts) {
            if (p.getInfo().equals(name)) {
                contacts.remove(p);
                return true;
            }
        }
        return false;
    }

    public void renamePerson(String oldName, String newName) {
        for (Person p: contacts) {
            if (p.getInfo().equals(oldName)) {
                p.setInfo(newName);
                return;
            }
        }
    }

    public void modifyPerson(String value, String name) {
        if (isValidPhoneNumber(value)) {
            for (Person p: contacts) {
                if (p.getInfo().equals(name)) {
                    p.setPhoneNumber(value);
                }
            }
        }
    }

    private boolean isValidPhoneNumber(String value) {
        return (value.charAt(0) == '+' && value.charAt(1) == '7' && value.length() == 12) ||
                (value.charAt(0) == '8' && value.length() == 11);
    }
}
