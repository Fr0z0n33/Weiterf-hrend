
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        int numberToGuess = (int)(Math.random() * 10) + 1;
        Scanner scanner = new Scanner(System.in);
        //variable that manages the games state

        int i = 0;
        while(i < 6 && !scanner.equals(numberToGuess)){
            int z = scanner.nextInt();
            if(z != numberToGuess){
                System.out.println("lose!");
                if(z < numberToGuess){
                    System.out.println("Too low");
                }
                else{
                    System.out.println("Too high");
                }
            }
            else{
                System.out.println("win!");
                break;
            }
            i++;
        }
        
    }
}
