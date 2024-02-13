public class Example {
    public static void main(String[] args) {
        int result1 = calculateSum(5, 3);
        System.out.println("Sum of two numbers: " + result1);

        boolean result2 = isEven(7);
        System.out.println("Is the number even? " + result2);

        String result3 = reverseString("hello");
        System.out.println("Reversed string: " + result3);

        int result4 = calculateFactorial(5);
        System.out.println("Factorial of 5: " + result4);

        boolean result5 = isPrime(11);
        System.out.println("Is the number prime? " + result5);

        String result6 = capitalizeFirstLetter("example");
        System.out.println("String with first letter capitalized: " + result6);
    }

    private static int calculateSum(int a, int b) {
        return a + b;
    }

    private static boolean isEven(int num) {
        return num % 2 == 0;
    }

    private static String reverseString(String str) {
        StringBuilder reversed = new StringBuilder();
        for (int i = str.length() - 1; i >= 0; i--) {
            reversed.append(str.charAt(i));
        }
        return reversed.toString();
    }

    private static int calculateFactorial(int n) {
        int factorial = 1;
        for (int i = 1; i <= n; i++) {
            factorial *= i;
        }
        return factorial;
    }

    private static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    private static String capitalizeFirstLetter(String str) {
        if (str == null || str.isEmpty()) {
            return str;
        }
        return Character.toUpperCase(str.charAt(0)) + str.substring(1);
    }
}
