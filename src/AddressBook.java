import java.util.Scanner;

public class AddressBook {
    static Contact[] contacts=new Contact[3];
    static Scanner sc =new Scanner(System.in);
    int getNextLocation() {
        for (int i=0;i<contacts.length;i++) {
            if (null==contacts[i]) {
                return 1;
            }}
        return 0;
    }
    public int createContact(Contact contact) {
        System.out.println(contact);
        int location=getNextLocation();
        System.out.println("location  ::" +location);
        contacts[location]=contact;
        return location;
    }
    public void showContacts() {
        System.out.println(" Showing Contact details");
        for(int i=0;i<contacts.length;i++)
            showContactsDetails(contacts[i]);
    }
    void showContactsDetails(Contact contacts) {
        if(contacts!=null) {
            System.out.println("Details of contacts");
            System.out.println("Name= "+contacts.getName());
            System.out.println("age= "+contacts.getAge());
            System.out.println("Name= "+contacts.getPhoneNo());
            System.out.println("Name= "+contacts.getState());
            System.out.println("Name= "+contacts.getCity());

        }
    }
    static Contact getContacts() {
        Contact contact=new Contact();
        System.out.println("Enter the Name");
        String name=sc.next();
        contact.setName(name);
        System.out.println("Enter the Phone Number");
        long phoneNumber=sc.nextLong();
        contact.setPhoneNo(phoneNo);
        System.out.println("Enter the Age");
        int age=sc.nextInt();
        contact.setAge(age);
        System.out.println("Enter the City");
        String city=sc.next();
        contact.setCity(city);
        System.out.println("Enter the State");
        String state=sc.next();
        contact.setState(state);

        return contact;

    }
