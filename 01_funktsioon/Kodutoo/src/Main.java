public class Main {
    public static void main(String[] args) {

        int vastus1 = calculateStringLength("Hello");
        System.out.println("Length of 'Hello': " + vastus1);

        boolean vastus2 = isEven(7);
        System.out.println("Is 7 even? " + vastus2);

        boolean vastus3 = isPrime(11);
        System.out.println("Is 11 prime? " + vastus3);

        printPattern(5, '#');
        printPattern(3, '*');
    }

    //stringi pikkus
    private static int calculateStringLength(String str) {
        return str.length();
    }

    //paarisarv või mitte
    private static boolean isEven(int num) {
        return num % 2 == 0;
    }

    //algarv või mitte
    private static boolean isPrime(int num) {
        if (num <= 1) return false;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) return false;
        }
        return true;
    }

    //muster
    private static void printPattern(int length, char symbol) {
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < length; j++) {
                System.out.print(symbol + " ");
            }
            System.out.println();
        }
    }
}
