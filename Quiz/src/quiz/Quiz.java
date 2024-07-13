package quiz;

import java.util.Scanner;

public class Quiz {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double score = 0;
        double Percentage;

        // Define quiz questions, options, and correct answers
        String[] questions = {
            "1. What is the capital of France?",
            "2. Which planet is known as the Red Planet?",
            "3. What is the largest mammal in the world?"
        };

        String[][] options = {
            {"A. London", "B. Berlin", "C. Paris", "D. Madrid"},
            {"A. Earth", "B. Mars", "C. Jupiter", "D. Venus"},
            {"A. Elephant", "B. Giraffe", "C. Blue Whale", "D. Lion"}
        };

        int[] correctAnswers = {2, 1, 2}; // Index of correct option (0-based)

        // Display and grade the quiz
        for (int i = 0; i < questions.length; i++) {
            System.out.println(questions[i]);
            for (String option : options[i]) {
                System.out.println(option);
            }

            System.out.print("Your answer (A/B/C/D): ");
            String userAnswer = scanner.next().toUpperCase();

            if (userAnswer.equals("A") || userAnswer.equals("B") || userAnswer.equals("C") || userAnswer.equals("D")) {
                int userChoice = userAnswer.charAt(0) - 'A';
                if (userChoice == correctAnswers[i]) {
                    System.out.println("Correct!\n");
                    score++;
                } else {
                    System.out.println("Incorrect. The correct answer is " + options[i][correctAnswers[i]] + "\n");
                }
            } else {
                System.out.println("Invalid choice. Skipping to the next question.\n");
            }
        }

        // Display the final score
        Percentage = (score / questions.length) * 100;
        System.out.println("Quiz completed! Your score: " + score + "/" + questions.length);
        System.out.println("Your percentage is: " + Percentage + "%" );
    }
}

