package DSA_mqt.Functions.FunctionsProblems.GoodProblems;

import java.util.Scanner;

public class num_Guess_Game {
    static void playGame(){
        Scanner sc = new Scanner(System.in);
        int target = 67;
        System.out.println("Enter your guess betwwn 1-100 : ");
        int guess = sc.nextInt();
        if(guess>target+10){
            System.out.println("Too High");
        } else if (guess>target && guess<=target+10) {
            System.out.println("Little high");
        } else if (guess<target && guess>=target-10) {
            System.out.println("Little Low");
        } else if (guess<target-10) {
            System.out.println("Too Low");
        }else {
            System.out.println("Congrats! You guessed the number.");
        }

    }

    public static void main(String[] args) {
        playGame();
    }
}