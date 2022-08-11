import java.util.Scanner;

public class CalculatorSWITCH {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double numberOne = scanner.nextDouble();

        char symbol = scanner.next().charAt(0);

        double numberTwo = scanner.nextDouble();

        CalculatorSWITCH calc = new CalculatorSWITCH();
        calc.calculate(numberOne, numberTwo, symbol);


    }

    private void calculate(double numberOne, double numberTwo, char symbol) {
        double result = 0;

        switch (symbol) {
            case '-':
                result = numberOne - numberTwo;
                break;
            case '+':
                result = numberOne + numberTwo;
                break;
            case '*':
                result = numberOne * numberTwo;
                break;
            case '/':
                result = numberOne / numberTwo;
                break;
        }
        System.out.println("Result = " + result);
    }
}
