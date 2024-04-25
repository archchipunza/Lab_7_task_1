import java.util.Scanner;

public class Staff extends Person {
    private String education;
    private String position;

    public void initialize1() {
        // Calling the initialize method of the Person class*
        initialize();

        // Code to enter data for education and position
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter education: ");
        education = scanner.nextLine();
        System.out.print("Enter position: ");
        position = scanner.nextLine();
    }

    public void print1() {
        // Calling the print method of the Person class*
        print();

        System.out.println("Education: " + education);
        System.out.println("Position: " + position);
    }
}
