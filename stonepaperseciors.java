package traning;
import java.util.Random;
import java.util.Scanner;
 
public class StoneScissorPaper {
 
    public static void main(String[] args) {
		
        String userInput;
        String computerInput;
		
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your choice: stone,scissor or paper");
		
        userInput = sc.next();
        Random rand = new Random();
		
        int randomNumber = rand.nextInt(3);
		
        switch (randomNumber) {
            case 0:
                computerInput = "stone";
                break;
            case 1:
                computerInput = "scissor";
                break;
            case 2:
                computerInput = "paper";
                break;
            default:
                computerInput = "Invalid";
                break;
        }
		
        if (userInput.equals(computerInput)) {
            System.out.println("It's a tie");
        } else if (userInput.equals("  stone")) {
            if (computerInput.equals("scissor")) {
                System.out.println("You won");
            } else if (computerInput.equals("paper")) {
                System.out.println("Computer won");
            }
        } else if (userInput.equals("scissor")) {
            if (computerInput.equals("stone")) {
                System.out.println("Computer won");
            } else if (computerInput.equals("paper")) {
                System.out.println("You won");
            }
        } else if (userInput.equals("paper")) {
            if (computerInput.equals("stone")) {
                System.out.println("You won");
            } else if (computerInput.equals("scissor")) {
                System.out.println("Computer won");
            }
        } else {
            System.out.println("Invalid input");
        }
    }
}