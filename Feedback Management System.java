import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Feedback {
    String patientName;
    String feedbackMessage;

    public Feedback(String patientName, String feedbackMessage) {
        this.patientName = patientName;
        this.feedbackMessage = feedbackMessage;
    }
}

public class EHealthcareFeedbackSystem {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Feedback> feedbackList = new ArrayList<>();

        System.out.println("Welcome to the e-Healthcare Feedback Management System!");

        while (true) {
            System.out.println("\nChoose an option:");
            System.out.println("1. Submit feedback");
            System.out.println("2. View all feedback");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine();  // Consume the newline character

            switch (choice) {
                case 1:
                    // Submitting feedback
                    System.out.print("Enter your name: ");
                    String patientName = scanner.nextLine();

                    System.out.print("Enter your feedback: ");
                    String feedbackMessage = scanner.nextLine();

                    Feedback newFeedback = new Feedback(patientName, feedbackMessage);
                    feedbackList.add(newFeedback);

                    System.out.println("Feedback submitted successfully!");
                    break;

                case 2:
                    // Viewing all feedback
                    System.out.println("\nList of all feedback:");

                    for (Feedback feedback : feedbackList) {
                        System.out.println("Patient Name: " + feedback.patientName + "\nFeedback: " + feedback.feedbackMessage + "\n");
                    }
                    break;

                case 3:
                    // Exiting the program
                    System.out.println("Exiting the e-Healthcare Feedback Management System. Goodbye!");
                    scanner.close();
                    System.exit(0);

                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
            }
        }
    }
}
