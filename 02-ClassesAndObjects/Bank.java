import java.lang.Math;

public class Bank {
    public static void main(String[] args){
        double buy = 5.9543;
        double sells = 5.9659;
        double spread = (sells - buy);

        System.out.printf("Bank buy: " + buy + "\nBank sells: " + sells + "\nSpread: "+ "%,.4f", Math.abs(spread));
    }
    
}
