package StonePaperScissor;

import java.util.Random;

public class RPS {
    public static void main(String[] args) {
        Random random = new Random();

        String[] choices = {"Rock", "Paper", "Scissors"};
        int randomIndex = random.nextInt(choices.length);


        String coumputerChoice = choices[randomIndex];
        System.out.println("Computer chose: " + coumputerChoice);

    }
}
