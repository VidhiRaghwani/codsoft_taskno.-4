import java.util.Scanner;

public class QuizApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int score = 0;
        String[] questions = {
            "1. Which one of following is not a java feature?\n(a) Use of pointers\n(b) Object-oriented\n(c) Portable",
            "2. What is the extension of java code files?\n(a) .java\n(b) .txt\n(c) .js ",
            "3. State true or false: Java is platform-independent programming language.\n(a) True\n(b) False\n(c) None"
        };
        String[] answers = {"a", "a", "a"};
        int timeLimitInSeconds = 10;
        
        System.out.println("Welcome to the Quiz Application!\n");

        
        for (int i = 0; i < questions.length; i++) {
            System.out.println(questions[i]);
            System.out.print("Your answer: ");
            String userAnswer = scanner.nextLine();
            
            // Check if the user's answer is correct
            if (userAnswer.equalsIgnoreCase(answers[i])) {
                System.out.println("Correct!");
                score++;
            } else {
                System.out.println("Incorrect!");
            }
            
            System.out.println();
        }
        
        System.out.println("Quiz completed!");
        System.out.println("Your score: " + score + "/" + questions.length);
    }
}
    

