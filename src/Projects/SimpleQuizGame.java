package Projects;

import java.util.Scanner;

public class SimpleQuizGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Question bank for each category
        String[] historyQuestions = {"Who was the first president of the United States?",
                "What year did World War II end?",
                "Who wrote the book 'The Communist Manifesto'?",
                "What city was the first to be attacked with an atomic bomb?",
                "What year did the Korean War begin?"};


        String[] historyAnswers = {"A", "D", "B", "C", "B"};

        String[] geographyQuestions = {"What is the capital of France?",
                "What is the largest desert in the world?",
                "What is the capital of Australia?",
                "What is the largest planet in the solar system?",
                "What is the highest mountain in the world?"};

        String[] geographyAnswers = {"A", "A", "C", "C", "D"};

        String[] scienceQuestions = {"What is the chemical symbol for water?",
                "What is the chemical symbol for gold?",
                "What is the largest organ in the human body?",
                "What is the smallest unit of measurement in the metric system?",
                "What gas makes up the majority of the Earth's atmosphere?"};

        String[] scienceAnswers = {"B", "B", "C", "A", "D"};

        System.out.println("Welcome to the Simple Quiz Game!");
        System.out.print("Please enter your name: ");
        String name = scanner.nextLine();

        boolean playAgain = true;
        while (playAgain) {
            System.out.println("\nPlease select a category:\n1. History\n2. Geography\n3. Science");
            System.out.print("Enter your choice: ");
            int categoryChoice = scanner.nextInt();
            scanner.nextLine();

            String[] questions;
            String[] answers;
            switch (categoryChoice) {
                case 1:
                    questions = historyQuestions;
                    answers = historyAnswers;
                    break;
                case 2:
                    questions = geographyQuestions;
                    answers = geographyAnswers;
                    break;
                case 3:
                    questions = scienceQuestions;
                    answers = scienceAnswers;
                    break;
                default:
                    System.out.println("Invalid choice. Please select again.");
                    continue;
            }

            int score = 0;
            for (int i = 0; i < questions.length; i++) {
                System.out.println("\nQuestion " + (i + 1) + ":");
                System.out.println(questions[i]);
                System.out.println("A. ");
                System.out.println("B. ");
                System.out.println("C. ");
                System.out.println("D. ");
                System.out.print("Enter your answer: ");
                String answer = scanner.nextLine().toUpperCase();

                if (answer.equals(answers[i])) {
                    score++;
                }
            }

            System.out.println("\nThank you for taking the quiz, " + name + "!");
            System.out.println("Your score is " + score + " out of 5.");

            System.out.print("Do you want to play again? (Y/N) ");
            String playAgainInput = scanner.nextLine().toUpperCase();
            if (!playAgainInput.equals("Y")) {
                playAgain = false;
            }
        }

        System.out.println("\nThank you for playing the Simple Quiz Game!");
    }
    }

