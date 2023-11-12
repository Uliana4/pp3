import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class StudentGrades {

    String studentName;
    double[] grades;

    StudentGrades(String name, double[] grades){
        this.studentName=name;
        this.grades=grades;
    }
    
    public double lowest(){
        double low = Arrays.stream(grades).min().getAsDouble();
        return low;


    }

    public double highest(){
        double max = grades[0];
        for(int i = 0; i<grades.length;i++){
            if(grades[i]>max){
                max=grades[i];
            }
        }
        return max;
    }

    public int number(){
        int number = 0;
        for(int i = 0; i<grades.length; i++){
            number++;
        }

        return number;
    }

    public double avarage(){
        double avg;
        double sum=0;
        double count=0;
        for(int i = 0; i<grades.length; i++){
            sum+=grades[i];
            count++;

        }
        return sum/count;

    }

    public void record(){
        System.out.println(studentName);
        System.out.println(Arrays.toString(grades));
        System.out.println(lowest());
        System.out.println(highest());
        System.out.println(avarage());
        System.out.println(number());
    }

    StudentGrades(String name, int numberOfGrades){
        this.studentName=name;
        this.grades = new double[numberOfGrades];
        Random random = new Random();
        for(int i=0; i<grades.length; i++){
            int randomIndex=random.nextInt(11);
            double gradeGen=1.0+0.5*randomIndex;
            grades[i]= gradeGen;

        }
    }

    StudentGrades(String name){
        this.studentName=name;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Liczba ocen: ");
        int numberOfGrades = scanner.nextInt();
        this.grades=new double[numberOfGrades];
        
        System.out.println("Enter grades: ");
        for(int i =0;i<numberOfGrades; i++){
            System.out.println("Grade no. " + (i+1)+": ");
            grades[i]=scanner.nextDouble();
        }
    }

    public static void main(String[] args){
        double[] amanda = {3.5, 4.5, 4.0, 2.0, 5.0, 3.5, 3.5};
        StudentGrades student1 = new StudentGrades("Amanda", amanda);
        System.out.println(student1.lowest());
        System.out.println(student1.highest());
        System.out.println(student1.number());
        System.out.println(student1.avarage());
        student1.record();
        StudentGrades student2 = new StudentGrades("Jan", 5);
        student2.record();
        StudentGrades student3 = new StudentGrades("Pablo");
        student3.record();
    }
}

// public class StudentGrades {
//     String studentName;
//     double[] grades;
//     double lowest;
//     double highest;
//     int number;
//     double cp;


//     StudentGrades(String name, double[] grades) {
//         this.studentName = name;
//         this.grades = grades;
//     }

//     public double calculateLowest(){
//         double lowest = Arrays.stream(grades).min().getAsDouble();
//         return lowest;
//     }

//     public double calculateHighest(){
//         double highest = grades[0];
//         for(int i = 0; i<grades.length;i++){
//             if(grades[i]>highest){
//                 highest=grades[i];
//             }
//         }
//         return highest;
//     }

//     public int calcNumbers(){
//         int number = 0;
//         for (int i=0; i<grades.length; i++){
//             number++;
//         }
//         return number;
//     }

//     public double calcPoint(){
//         double sum=0;
//         double count=0;
//         double cp = sum/count;
//         for(int i=0; i<grades.length; i++){
//             sum+=grades[i];
//             count++;
//         }
//         return cp;
//     }

//     @Override
//     public String toString() {
//         return "StudentGrades [studentName=" + studentName + ", grades=" + Arrays.toString(grades) + " lowest: " + lowest + " highest: " + highest + " the number of grades:" + number + " the grade point average: "+ cp +"]";
//     }
    
//     StudentGrades(String name, int numberOfGrades){
//         this.studentName=name;
//         this.grades = new double[numberOfGrades];
//         Random random = new Random();
//         for(int i=0; i<grades.length; i++){
//             int randomIndex=random.nextInt(11);
//             double gradeGen=1.0+0.5*randomIndex;
//             grades[i]= gradeGen;

//         }
//     }

//     StudentGrades(String name){
//         this.studentName=name;
//         Scanner scanner = new Scanner(System.in);
//         System.out.println("Liczba ocen: ");
//         int numberOfGrades = scanner.nextInt();
//         this.grades=new double[numberOfGrades];
        
//         System.out.println("Enter grades: ");
//         for(int i =0;i<numberOfGrades; i++){
//             System.out.println("Grade no. " + (i+1)+": ");
//             grades[i]=scanner.nextDouble();
//         }
//     }

//     public static void main(String[] args){
//         double[] james = {2.0, 3.0, 2.0, 4.5, 4.5};
//         double[] amanda = {3.5, 4.5, 4.0, 2.0, 5.0, 3.5, 3.5};

//         StudentGrades student1 = new StudentGrades("Amanda", amanda);
//         StudentGrades student2 = new StudentGrades("James", james);

//         System.out.println(student1);
//         System.out.println(student2);

//         System.out.println(student1.calculateLowest());
//         System.out.println(student1.calculateHighest());
//         System.out.println(student2.calculateLowest());
//         System.out.println(student2.calculateHighest());
//         System.out.println(student1.calcNumbers());
//         System.out.println(student2.calcNumbers());
//         System.out.println(student1.calcPoint());
//         System.out.println(student2.calcPoint());
//     }

// }