/**
 * Exercises:
 * ----------------------------------------------------------------
 * 1. Create a short variable with any value and assign it to an int (implicit).
 * 2. Create an int variable with a large value and assign it to a long (implicit).
 * 3. Create a long variable and assign it to a float (implicit).
 *
 * 4. Create a double variable and cast it to a float (explicit).
 * 5. Create an int variable and cast it to a short (explicit).
 * 6. Create a long variable and cast it to a byte (explicit).
 *
 * Bonus:
 * 7. Try converting a large int (e.g., 1000) to a byte and observe what happens (overflow).
 * 8. Convert a char (e.g., 'Z') into an int and print its ASCII value.
 * 9. Convert an int into a char and print the resulting character.
 * 10. Create a double with decimals, convert it to int, and explain what happens.
 * ----------------------------------------------------------------
 */

public class ConversionE
{
    public static void main(String[] args)
    {
        // --- Implicit Conversions (Widening) ---
        int intValue = 100;
        double widenedDouble = intValue; // int to double
        char letter = 'A';
        int widenedInt = letter;         // char to int (ASCII/Unicode value)

        System.out.println("=== Implicit (Widening) Conversions ===");
        System.out.println("int (" + intValue + ") → double: " + widenedDouble);
        System.out.println("char ('" + letter + "') → int: " + widenedInt);

        // --- Explicit Conversions (Narrowing) ---
        double doubleValue = 9.78;
        int narrowedInt = (int) doubleValue; // double to int (fraction lost)
        float floatValue = 130.75f;
        byte narrowedByte = (byte) floatValue; // float to byte (overflow possible)

        System.out.println("\n=== Explicit (Narrowing) Conversions ===");
        System.out.println("double (" + doubleValue + ") → int: " + narrowedInt);
        System.out.println("float (" + floatValue + ") → byte: " + narrowedByte);

        // -------------------- Student Exercises --------------------
        // 1. Create a short variable with any value and assign it to an int (implicit)
        short shortVal = 10;
        int shortToInt = shortVal;
        System.out.println("\nShort to Int: " + shortToInt);
        // 2. Create an int variable with a large value and assign it to a long (implicit)
        int intBigVal = 9999999;
        long intToLong = intBigVal;
        System.out.println("\nint to long: " + intToLong);
        // 3. Create a long variable and assign it to a float (implicit)
        long longVar = 1728;
        float longToFloat = longVar;
        System.out.println("\nlong to float: " + longToFloat);
        // 4. Create a double variable and cast it to a float (explicit)
        double doubleVar = 92.23;
        float doubleToFloat = (float) doubleVar;
        System.out.println("\ndouble to float: " + doubleToFloat);

        // 5. Create an int variable and cast it to a short (explicit)
        int intVar2 = 28;
        short intToShort = (short) intVar2; 
        System.out.println("\nint to short: " + longToFloat);

        // 6. Create a long variable and cast it to a byte (explicit)
        long longVar2 = 23;
        byte longToByte = (byte) longVar2;
        System.out.println("\nlong to byte: " + longToByte);

        // 7. Try converting a large int (e.g., 1000) to a byte and print the result
        long largeInt = 1000;
        byte largeIntToByte = (byte) largeInt;
        System.out.println("\nlargeInt to byte: " + largeIntToByte);
        // 8. Convert a char (e.g., 'Z') into an int and print its ASCII value
        char charZ = 'Z';
        int asciiZ = charZ;
        System.out.println("\nchar to int: " + asciiZ);

        // 9. Convert an int into a char and print the resulting character
        int varInt3 = 23;
        char intToChar = (char) varInt3;
        System.out.println("\nint to char: " + varInt3);


        // 10. Create a double with decimals, convert it to int, and print the result
        double doubleDec = 29.23;
        int doubleToInt = (int) doubleDec;
        System.out.println("\ndouble to int: " + doubleToInt);

    }
}
