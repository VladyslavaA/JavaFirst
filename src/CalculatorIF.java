import java.util.Scanner;

public class CalculatorIF {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double numberOne = scanner.nextDouble();

        char symbol = scanner.next().charAt(0);

        double numberTwo = scanner.nextDouble();

        CalculatorIF calc = new CalculatorIF();
        calc.calculate(numberOne, numberTwo, symbol);


    }

    private void calculate(double numberOne, double numberTwo, char symbol) {
        double result;

        if (symbol == '-') {
            result = numberOne - numberTwo;
            showResult(result);
        } else if (symbol == '+') {
            result = numberOne + numberTwo;
            showResult(result);

        } else if (symbol == '*') {
            result = numberOne * numberTwo;
            showResult(result);

        } else if (symbol == '/') {
            if (numberTwo == 0) {
                System.out.println("Divide by zero");
                return;
            }
            result = numberOne / numberTwo;
            showResult(result);
        } else {
            System.out.println("Error");
        }

    }

    private void showResult(double result) {
        System.out.println("Result = " + result);

    }
    Sjhfiahfiojuwhwaoif
}