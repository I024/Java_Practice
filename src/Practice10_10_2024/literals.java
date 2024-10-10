package Practice10_10_2024;
public class literals {
    public static void main(String[] args) {
        // Integer Literals
        int decimalNumber = 100;
        int binaryNumber = 0b1010;
        int octalNumber = 0123;
        int hexNumber = 0x1A;

        // Floating-Point Literals
        float floatNumber = 3.14f;
        double doubleNumber = 1.23e2;

        // Boolean Literals
        boolean isActive = true;
        boolean isComplete = false;

        // Character Literals
        char letterA = 'A';
        char newline = '\n';

        // String Literal
        String greeting = "Hello, World!";

        // Null Literal
        String noValue = null;

        // Numeric Literal with Underscore
        int largeNumber = 1_000_000;

        // Output the literals
        System.out.println("Decimal Number: " + decimalNumber);
        System.out.println("Binary Number: " + binaryNumber);
        System.out.println("Octal Number: " + octalNumber);
        System.out.println("Hexadecimal Number: " + hexNumber);
        System.out.println("Float Number: " + floatNumber);
        System.out.println("Double Number: " + doubleNumber);
        System.out.println("Boolean isActive: " + isActive);
        System.out.println("Boolean isComplete: " + isComplete);
        System.out.println("Character A: " + letterA);
        System.out.println("Newline Character: " + newline);
        System.out.println("String Greeting: " + greeting);
        System.out.println("Null Value: " + noValue);
        System.out.println("Large Number with Underscore: " + largeNumber);
    }
}

