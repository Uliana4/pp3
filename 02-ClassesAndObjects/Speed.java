import java.util.Scanner;
public class Speed {
    public static void main(String[] args){
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("Vehicle speed: ");
        int speed = scanner.nextInt();
        boolean correct = true;

        if (speed > 40 && speed < 140){
            System.out.print("Speed is valid: " + correct);  
        } else {
            System.out.println("Speed is valid: " + !correct);
        }
    }

}