import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Введите первое число: ");
            int a = readNumber(scanner);

            System.out.print("Введите второе число: ");
            int b = readNumber(scanner);

            System.out.print("Введите третье число (если необходимо): ");
            int c = readNumber(scanner);

            System.out.print("Введите операцию (+, -, *, /): ");
            String operation = scanner.next();

            int result;
            switch (operation) {
                case "+":
                    result = add(a, b, c);
                    break;
                case "-":
                    result = subtract(a, b, c);
                    break;
                case "*":
                    result = multiply(a, b, c);
                    break;
                case "/":
                    result = divide(a, b, c);
                    break;
                default:
                    throw new IllegalArgumentException("Недопустимая операция: " + operation);
            }

            System.out.println("Результат: " + result);
        } catch (Exception e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
    }

    private static int readNumber(Scanner scanner) throws Exception {
        int number = scanner.nextInt();
        if (number < 1 || number > 10) {
            throw new IllegalArgumentException("Число должно быть от 1 до 10");
        }
        return number;
    }

    private static int add(int a, int b, int c) {
        return a + b - c;
    }

    private static int subtract(int a, int b, int c) {
        return a - b + c;
    }

    private static int multiply(int a, int b, int c) {
        return a * b - c;
    }

    private static int divide(int a, int b, int c) {
        return a / b * c;
    }
}
