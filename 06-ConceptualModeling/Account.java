public class Account {
    
    private String number;
    private String owner;
    private double balance;
    private String type;


    public void logIn(){
        System.out.println("U r loged in");
    }

    public void logOut(){
        System.out.println("U r loged out");
    }

    public void deposit(double sum){
        balance = balance+sum;
    }

    public String withdraw(double sum){
        if (sum>=balance){
            balance=balance-sum;
        }  else {
            return "Not enough money";
        }  
    }

    public double checkBalance(){
        return balance;
    }

    public void sendTransfer(double sum, String num){
        System.out.println("U r loged in");
    }

}
