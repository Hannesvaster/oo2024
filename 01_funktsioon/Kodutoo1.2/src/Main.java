public class Main {
    public static void main(String[] args) {
        // Test
        boolean boolValue = true;
        int intValue = 42;
        String strValue = "Maailm";

        System.out.println("intFromBoolean(true): " + intFromBoolean(true));
        System.out.println("intFromBoolean(false): " + intFromBoolean(false));

        voidFromBooleanOrInt(boolValue, intValue);
        voidFromBooleanOrInt(false, 99);

        System.out.println(stringFromString(strValue));
        System.out.println(stringFromString("Hannes"));
    }

    // int to bool
    public static int intFromBoolean(boolean value) {
        if (value) {
            return 1;
        } else {
            return 0;
        }
    }

    // void bool voi int
    public static void voidFromBooleanOrInt(boolean condition, int number) {
        if (condition) {
            System.out.println("Tingimus on tõene!");
        } else {
            System.out.println("Tingimus on väär!");
            System.out.println("Number: " + number);
        }
    }

    // string to string
    public static String stringFromString(String input) {
        return "Tere, " + input + "!";
    }
}
