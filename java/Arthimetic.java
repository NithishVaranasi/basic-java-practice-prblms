import java.util.Scanner;

class Arithmetic {
    public static void main(String[] args) {
        int n1, n2;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n1: ");
        n1 = sc.nextInt();
        System.out.println("Enter n2: ");
        n2 = sc.nextInt();
        int result;

        System.out.println("Enter an operation (+, -, *, /): ");
        char operation = sc.next().charAt(0);

        switch (operation) {
            case '+':
                result = n1 + n2;
                System.out.println("Sum: " + result);
                break;
            case '-':
                result = n1 - n2;
                System.out.println("Difference: " + result);
                break;
            case '*':
                result = n1 * n2;
                System.out.println("Product: " + result);
                break;
            case '/':
                    result = n1 / n2;
                    System.out.println("Quotient: " + result);
              
                break;
            default:
                System.out.println("Error: Invalid operation.");
                break;
        }

        sc.close();
    }
}