import java.util.Scanner;
import java.util.Random;

public class Task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        int score = 0;

        while (true) {
            int num = rand.nextInt(100) + 1;
            int attempts = 0;
            boolean correct = false;

            System.out.println("Guess the number between 1 to 100:");
            while (attempts < 10 && !correct) {
                System.out.print("Guess karo: ");
                int guess = sc.nextInt();
                attempts++;

                if (guess == num) {
                    System.out.println("Kya baat hai! " + attempts + " attempts me guess kar kiya.");
                    score++;
                    correct = true;
                } else if (guess < num) {
                    System.out.println("Thoda high socho!");
                } else {
                    System.out.println("Thoda low karna padega!");
                }
            }

            if (!correct) {
                System.out.println("Oh ho! Sahi number ye tha: " + num);
            }

            System.out.println("Score: " + score);
            System.out.print("Aur khelna hai? (yes/no): ");
            String playAgain = sc.next();
            if (!playAgain.equalsIgnoreCase("yes")) {
                break;
            }
        }

        sc.close();
    }
}
