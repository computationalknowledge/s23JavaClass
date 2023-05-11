public class Calculator {
    public static void main(String[] args) {
        if (args.length != 3) {
            System.out.println("Usage: java Calculator <number1> <operation> <number2>");
            System.exit(1);
        }

        float num1 = Float.parseFloat(args[0]);
        float num2 = Float.parseFloat(args[2]);
        char operation = args[1].charAt(0);

        float result = 0;

        switch (operation) {
            case '+':
                result = add(num1, num2);
                break;
            case '-':
                result = subtract(num1, num2);
                break;
            case '*':
                result = multiply(num1, num2);
                break;
            case '/':
                if (num2 == 0) {
                    System.out.println("Division by zero is not allowed.");
                    System.exit(1);
                }
                result = divide(num1, num2);
                break;
            default:
                System.out.println("Invalid operation. Supported operations are +, -, *, /");
                System.exit(1);
        }

        System.out.println("Result: " + result);
    }

    public static float add(float a, float b) {
        return a + b;
    }

    public static float subtract(float a, float b) {
        return a - b;
    }

    public static float multiply(float a, float b) {
        return a * b;
    }

    public static float divide(float a, float b) {
        return a / b;
    }
}
