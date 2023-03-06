import java.util.Scanner;

public class School {
    Scanner input = new Scanner(System.in);
    // attributes
    private String schoolname;
    private Address address;
    private String principal;
    private String pfname;
    private String plname;
    private Marks marks;

    // setter and getter
    public void setName() {
        System.out.print("\nEnter School Name : ");
        schoolname = input.nextLine();
    }

    public String getName( ) {
        return schoolname;
    }

    public void setAddress(Address address) {
        System.out.println("Address is "+ address.getStreet() + ", " + address.getDistrict() + ", " + address.getPostcode() + ", " +address.getState());
    }

    public Address getAddress() {
        return address;
    }

    public String getPrincipal() {
        return principal;
    }

    public void setPrincipal() {
        pfName();
        plName();
        principal = pfname + " " + plname;
    }

    public String pfName(){
        System.out.print("Enter principal's first name : ");
        pfname = input.nextLine();
        return pfname;
    }

    public String plName(){
        System.out.print("Enter principal's last name : ");
        plname = input.nextLine();
        return plname;
    }
}
