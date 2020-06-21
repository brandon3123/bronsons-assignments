package assignments.calculator;

import java.util.Scanner;

public class Calculator {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String args[]) {
        System.out.println("################################");
        System.out.println("# Calculator....on two numbers #");
        System.out.println("################################");

        char goAgain;

        do {
             int firstNumber = getNumberFromUser();
             char operation = getOperationFromUser();
             int secondNumber = getNumberFromUser();
             int result = performOperationOnNumbers(firstNumber, secondNumber, operation);
             System.out.println("Your result is: " + result);
             goAgain = getContinueFromUser();
        } while (goAgain == 'Y' || goAgain == 'y');

        System.out.println("Goodbye....");
    }

    public static int getNumberFromUser() {
        System.out.println("Please enter a number.");
        return scanner.nextInt();
    }

    public static char getContinueFromUser() {
        System.out.println("Would you like to perform another calculation? (Y/N)");
        return scanner.next().charAt(0);
    }

    public static char getOperationFromUser() {
        System.out.println("Please enter an operation to perform ('x', '/', '+', '-')");
        return scanner.next().charAt(0);
    }

    public static int performOperationOnNumbers(int first, int second, char operation) {
        int result = 0;
        switch (operation) {
            case '+':
                result = first + second;
                break;
            case 'x':
                result = first * second;
                break;
            case '-':
                result = first - second;
                break;
            case '/':
                result = first / second;
        }
        return result;
    }
}
