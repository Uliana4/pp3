public class Student extends Person {
    int semestr;

    public Student(String name, String surname, int semestr) {
        super(name, surname);
        this.semestr = semestr;
    }
    
    public void display(){
        System.out.println("Name: " + name + ", Surname: " + surname + " , Semestr: " + semestr);
    }
}
