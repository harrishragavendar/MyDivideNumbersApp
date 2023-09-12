class DivisionByZeroException extends Exception {
    public DivisionByZeroException() {
        super("Error: Division by zero is not allowed.");
    }
}

public class DivideNumbers {
    public static double divide(int num1, int num2) throws DivisionByZeroException {
        if (num2 == 0) {
            throw new DivisionByZeroException();
        }
        return (double) num1 / num2;
    }

    public static void main(String[] args) {
        int num1 = 50;
        int num2 = 0; 

        try {
            double quotient = divide(num1, num2);
            System.out.println("Quotient: " + quotient);
        } catch (DivisionByZeroException e) {
            System.err.println(e.getMessage());
        }
    }
}
