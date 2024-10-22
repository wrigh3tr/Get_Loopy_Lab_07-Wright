import java.util.Scanner;
import java.util.Random;

public class TripleTest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Random num = new Random();
        boolean done = false;
        boolean validInput = false;
        String playAgain = "";
        int diceCount = 0;
        int dice1 = 0;
        int dice2 = 0;
        int dice3 = 0;

        do {

            System.out.println("\tRoll\tDie1\tDie2\tDie3\tSum");
            do {
                dice1 = num.nextInt(6) + 1;
                dice2 = num.nextInt(6) + 1;
                dice3 = num.nextInt(6) + 1;
                int sum = 0;
                sum = dice1 + dice2 + dice3;
                diceCount++;
                System.out.printf("%6d\t%4d\t%4d\t%4d\n", dice1,dice2,dice3,sum);
            }while (!(dice1 == dice2 && dice2 == dice3));
            done = true;
            do {
                System.out.println("Do you Want to Play again?:[y or n] ");
                playAgain = in.nextLine();
                if (playAgain.equalsIgnoreCase("y")) {
                    done = false;
                    validInput = true;
                } else if (playAgain.equalsIgnoreCase("n")) {
                    done = true;
                    validInput = true;
                } else {
                    System.out.println("Please enter a Valid input");
                }
            } while (!validInput);
        } while (!done);

    }
}