import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String operation = scanner.nextLine();

        int a = scanner.nextInt();
        int b = scanner.nextInt();

        if(operation.equals("sum")) {
            System.out.println(a + b);
        } else if(operation.equals("subtraction")) {
            System.out.println(a - b);
        } else if(operation.equals("division")) {
            System.out.println("integer division");
            System.out.println(a / b);
        } else if(operation.equals("multiplication")) {
            System.out.println(a * b);
        }

    }
}
