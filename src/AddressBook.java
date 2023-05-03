import java.util.Hashtable;
import java.util.Map;
import java.util.Scanner;

class Contact{
    Scanner sc=new Scanner(System.in);
    Hashtable<String,String> contact = new Hashtable<String,String>();

     public void addContact(){
         System.out.println("Add contact ");
         System.out.print("Enter name: ");
         String name = sc.nextLine();
         System.out.print("Enter address: ");
         String address = sc.nextLine();
         contact.put(name, address);
         System.out.println(name + " added to address book.");
     }
    public void removeContact() {
        System.out.println("Remove contact");
        System.out.print("Enter name: ");
        String name = sc.nextLine();
        if (contact.containsKey(name)) {
            contact.remove(name);
            System.out.println(name + " removed from address book.");
        } else {
            System.out.println(name + " not found in address book.");
        }
    }
    public void printContacts() {
        System.out.println("Address Book:");
        for(Map.Entry m : contact.entrySet()){
            System.out.println(m.getKey() + " Address: "+ m.getValue());
        }
        System.out.println();
    }

}
public class AddressBook {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Contact contact=new Contact();
        System.out.println("Enter number of contacts:");
        int n=sc.nextInt();
        for (int i=0;i<n;i++) {
            contact.addContact();
        }
        contact.printContacts();
        contact.removeContact();
        contact.printContacts();

    }
}
