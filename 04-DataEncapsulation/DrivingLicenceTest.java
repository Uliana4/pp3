public class DrivingLicenceTest {
    public static void main(String[] args) {
        DrivingLicence dl = new DrivingLicence();
        dl.setName("Jack");
        dl.setSurname ("Black");
        dl.setAddress ("Rakowicla, 9, 21A");
        dl.setCity ("Krakow");
        dl.setPostal_code (211-212-122);
        dl.setDriving_licence_number(123456788);
        dl.setDriving_licence_category ("A");
        dl.setYear_of_issue (2025);

        System.out.println(dl);
    }

}

