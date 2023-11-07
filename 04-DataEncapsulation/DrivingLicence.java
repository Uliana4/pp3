import java.time.Year;

public class DrivingLicence {
    private String name;
    private String surname;
    private String address;
    private String postal_code;
    private String city;
    private int driving_licence_number; 
    private int year_of_issue;
    private String driving_licence_category;

    final int CURRENT_YEAR = Year.now().getValue();
    
    public DrivingLicence(String name, String surname, String address, String postal_code, String city, int driving_licence_number,int year_of_issue, String driving_licence_category) {
        this.name = name;
        this.surname = surname;
        this.address = address;
        this.postal_code = postal_code;
        this.city = city;
        this.driving_licence_number = driving_licence_number;
        this.year_of_issue = year_of_issue;
        this.driving_licence_category = driving_licence_category;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public void setName(String name) {
        this.name = name.substring(0,1).toUperCase();
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPostal_code() {
        return postal_code;
    }

    public void setPostal_code(String postal_code) {
        this.postal_code = postal_code;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getDriving_licence_number() {
        return driving_licence_number;
    }

    public void setDriving_licence_number(int driving_licence_number) {
        this.driving_licence_number = driving_licence_number;
    }

    public int getYear_of_issue() {
        return year_of_issue;
    }

    public void setYear_of_issue(int year_of_issue) {
        this.year_of_issue = year_of_issue;
    }

    public String getDriving_licence_category() {
        return driving_licence_category;
    }

    public void setDriving_licence_category(String driving_licence_category) {
        this.driving_licence_category = driving_licence_category;
    }

    
    public void display(){
        System.out.println("Name:"+ getName() + "\nSurname:"+getSurname() + "\nAddress:" +getAddress() + ":"+  "," + postal_code + "," + city + "," +driving_licence_number + "," + year_of_issue + "," + driving_licence_category);
        System.out.println();
    }

    @Override
    public String toString() {
        return "DrivingLicence [name=" + name + ", surname=" + surname + ", address=" + address + ", postal_code="
                + postal_code + ", city=" + city + ", driving_licence_number=" + driving_licence_number
                + ", year_of_issue=" + year_of_issue + ", driving_licence_category=" + driving_licence_category
                +  "]";
    }
}
