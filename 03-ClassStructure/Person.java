public class Person {
    String name;
    int weight;
    int height;
    double BMI;

    public Person(String name) {
        this.name = name;
    }

    public Person(String name, int weight, int height) {
        this.name = name;
        this.weight = weight;
        this.height = height;
    }

    public void setWeightAndHeight(int weight, int height){
        this.weight = weight;
        this.height = height;
    }

    public double calculateBMI(){
        double heightInCM = height/100;
        double BMI = weight/Math.pow(heightInCM, 2);
        return BMI;
    }

    public void displayRecord(){
        if (calculateBMI() > 18.5 && calculateBMI()<24.9){
            System.out.printf("Person [name=" + name + ", weight=" + weight + ", height=" + height + ", BMI=" + BMI + "]");
        } else if (BMI < 18.5){
            System.out.printf("Person [name=" + name + ", weight=" + weight + ", height=" + height + ", BMI=" + BMI + ", BMI is too low]");
        } else {
            System.out.printf("Person [name=" + name + ", weight=" + weight + ", height=" + height + ", BMI=" + BMI + ", BMI is too high]");
        }
    }

    public static void main (String[] args){
        Person p1 = new Person("ULiana");
        p1.setWeightAndHeight(59, 164);
        p1.calculateBMI();
        p1.displayRecord();
        newLine();
        Person p2 = new Person("Sofi");
        p2.setWeightAndHeight(64, 170);
        p2.calculateBMI();
        p2.displayRecord();

    }

    private static void newLine() {
        System.out.println("\n");
    }

}