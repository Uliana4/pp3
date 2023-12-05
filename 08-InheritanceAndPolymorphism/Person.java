public class Person {
    String name;
    String surname;

    public Person(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }
    
    public void display(){
        System.out.println("Name: " + name + ", Surname: " + surname);
    }
}
