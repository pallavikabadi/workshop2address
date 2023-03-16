import java.util.Scanner;

public class AddressBookMain {
    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {

        AddressBook addressBook=new AddressBook();
        int i=0;
        do {
            System.out.println("Welcome to AddressBook");
            System.out.println("1 :: Add Contact");
            System.out.println("2 :: view Contacts");

            int Choice=sc.nextInt();
            switch(Choice) {
                case 1:
                    System.out.println(" Adding Contact");
                    Contact contact=getContacts();
                    int location1=addressBook.createContact(contact);
                    System.out.println("contact ::" +location1);
                    break;
                case 2:
                    System.out.println(" showing Contact");
                    addressBook.showContacts();
                    break;
                default :
                    System.out.println("default choice");
            }
            System.out.println("Press 1 to continue");
            Choice=sc.nextInt();
        }
        while(i==1);

    }
    static Contact getContacts() {
        Contact contact = new Contact();
        System.out.println("Enter the Name");
        String name = sc.next();
        contact.setName(name);
        System.out.println("Enter the Phone Number");
        long phoneNumber = sc.nextLong();
        contact.setPhoneNo(phoneNo);
        System.out.println("Enter the Age");
        int age = sc.nextInt();
        contact.setAge(age);
        System.out.println("Enter the City");
        String city = sc.next();
        contact.setCity(city);
        System.out.println("Enter the State");
        String state = sc.next();
        contact.setState(state);

        return contact;
    }
}
