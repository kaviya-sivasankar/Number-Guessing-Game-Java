import java.util.Scanner;
import java.util.Random;


public class GuessNumber {

public static void main(String args[]){

Scanner scanner = new Scanner(System.in);
Random random = new Random();
int guess;

int randomNumber = random.nextInt(100)+1;

// Fixed the number of maximum Attempts 
int maxAttempts = 5;

System.out.println("Guess number between 1 to 100");
int attempts = 0;
 do{
   System.out.println("Guess the Number, Attempts left:" + (maxAttempts - attempts));
   guess = scanner.nextInt();
   attempts++;
if(guess > randomNumber){

System.out.println("Your guess is higher than the Number.Try Again!");
}
else if(guess < randomNumber){
    System.out.println("Your guess is lower than the Number.Try Again");
}
else{
    System.out.println("Congratulations,You Guessed It in :"+ attempts +"attempts");
    break;
} 

// Condition to stop the game when no of attempts exceeds

if(attempts >= maxAttempts){
    System.out.println("Game Over!You Missed the attempts to Guess,Play Again");
    System.out.println("The Answer is: " + randomNumber);
    break;
}

} while(guess != randomNumber);

scanner.close();
}
}
