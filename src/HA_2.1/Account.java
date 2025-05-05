
import java.util.Scanner;

public class Account {

    public String owner;
    private double balance;
    protected int pin;
    String internalNote;

    public double getBalance(){
        return this.balance;
    }

    public void changePin(){
        Scanner scanner = new Scanner(System.in);
        if(scanner.nextInt() == this.pin){
            this.pin = scanner.nextInt();
        }
    }
}   
