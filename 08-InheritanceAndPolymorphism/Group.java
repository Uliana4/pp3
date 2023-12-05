public class Group {
    public static void main(String[] args) {
        Person p = new Person("John", "May");
        Student s = new Student("Anna", "Brown", 3);

        Person[] people = new Person[2];
        people[0] = p;
        people[1] = s;

        for (Person i: people){
            i.display();
        }
    }
}
