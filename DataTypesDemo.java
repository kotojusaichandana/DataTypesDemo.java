public class DataTypesDemo {
    public static void main(String[] args) {
        // 1. byte: 8-bit signed integer
        byte byteValue = 127; // Maximum value
        System.out.println("byte value: " + byteValue);

        // 2. short: 16-bit signed integer
        short shortValue = 32000;
        System.out.println("short value: " + shortValue);

        // 3. int: 32-bit signed integer
        int intValue = 2147483647; // Maximum value
        System.out.println("int value: " + intValue);

        // 4. long: 64-bit signed integer
        long longValue = 9223372036854775807L; // Add 'L' for long literals
        System.out.println("long value: " + longValue);

        // 5. float: 32-bit floating point
        float floatValue = 3.14f; // Add 'f' for float literals
        System.out.println("float value: " + floatValue);

        // 6. double: 64-bit floating point
        double doubleValue = 3.141592653589793;
        System.out.println("double value: " + doubleValue);

        // 7. char: 16-bit Unicode character
        char charValue = 'A'; // Intentional error: Too many characters
        System.out.println("char value: " + charValue);

        // 8. boolean: true or false
        boolean booleanValue = true;
        System.out.println("boolean value: " + booleanValue);
    }
}

    

