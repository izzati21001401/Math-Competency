import java.util.Scanner;

public class Address {
    Scanner input = new Scanner(System.in);
    private String street;
    private String district;
    private String postcode;
    private String state;

    public Address() {
        System.out.println("");
    }

    // constuctor can be overloaded (repeated but with different parameters)
    public Address(String street, String district, String postcode, String state) {
        this.street = street;
        this.district = district;
        this.postcode = postcode;
        this.state = state;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet() {
        System.out.print("Enter street address : ");
        street = input.nextLine();
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict() {
        System.out.print("Enter district : ");
        district = input.nextLine();
    }

    public String getPostcode() {
        return postcode;
    }

    public void setPostcode() {
        System.out.print("Enter postcode: ");
        postcode = input.nextLine();
    }

    public String getState() {
        return state;
    }

    public void setState() {
        System.out.print("Enter state : ");
        state = input.nextLine();
    }

}
