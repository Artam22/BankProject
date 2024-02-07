

public class Customer {

    // FIELDS
    // TODO Filedslari olusuturun
    /*
    TÜM FIELD LAR PRIVATE OLMALIDIR. FINAL OLMAYACAK.
     customerId Integer,
     firstName, lastName, city String OLACAK
     */
    private final int customerId;
    private String firstName;
    private String lastName;
    private String city;

    private static int idC = 1;


    ///////////////////////////////////////////////////////////////////////////////////

    // CONSTRUCTORS
    // TODO BOŞ CONSTRUCTOR OLUŞTURUN
    // PARAMTRELERİ int customerId, String firstName, String lastName, String city OLAN CONSTRUCTOR OLUŞTURUN

    public Customer(String firstName, String lastName, String city) {
        this.customerId = idC++;
        setFirstName(firstName);
        setLastName(lastName);
        setCity(city);
    }

    ////////////////////////////////////////////////////////////////////////////////////

    // GETTER SETTER METHODS
    // TODO  GETTER VE SETTER METODLARI OLUŞTURUN

    public int getCustomerId() {
        return customerId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }


    ////////////////////////////////////////////////////////////////////////////////

    //  TODO TO STRING METODU OLUŞTURUN

    @Override
    public String toString() {
        return "Customer{" +
                "customerId=" + customerId +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", city='" + city + '\'' +
                '}';
    }


    /////////////////////////////////////////////////////////////////////////////////
}
