import java.util.Scanner;

public class DataTypesInfo {
    public static void main(String[] args) {

        System.out.println("Інформація про примітивні типи даних:");


        System.out.println("byte:");
        System.out.println("Розмір: " + Byte.BYTES + " байт");
        System.out.println("Мінімальне значення: " + Byte.MIN_VALUE);
        System.out.println("Максимальне значення: " + Byte.MAX_VALUE);


        System.out.println("\nshort:");
        System.out.println("Розмір: " + Short.BYTES + " байт");
        System.out.println("Мінімальне значення: " + Short.MIN_VALUE);
        System.out.println("Максимальне значення: " + Short.MAX_VALUE);


        System.out.println("\nint:");
        System.out.println("Розмір: " + Integer.BYTES + " байт");
        System.out.println("Мінімальне значення: " + Integer.MIN_VALUE);
        System.out.println("Максимальне значення: " + Integer.MAX_VALUE);

        System.out.println("\nlong:");
        System.out.println("Розмір: " + Long.BYTES + " байт");
        System.out.println("Мінімальне значення: " + Long.MIN_VALUE);
        System.out.println("Максимальне значення: " + Long.MAX_VALUE);


        System.out.println("\nfloat:");
        System.out.println("Розмір: " + Float.BYTES + " байт");
        System.out.println("Мінімальне значення: " + Float.MIN_VALUE);
        System.out.println("Максимальне значення: " + Float.MAX_VALUE);


        System.out.println("\ndouble:");
        System.out.println("Розмір: " + Double.BYTES + " байт");
        System.out.println("Мінімальне значення: " + Double.MIN_VALUE);
        System.out.println("Максимальне значення: " + Double.MAX_VALUE);


        System.out.println("\nboolean:");
        System.out.println("Має два значення: true або false");


        System.out.println("\nchar:");
        System.out.println("Розмір: " + Character.BYTES + " байт");
        System.out.println("Мінімальне значення: " + (int) Character.MIN_VALUE);
        System.out.println("Максимальне значення: " + (int) Character.MAX_VALUE);

        Scanner scanner = new Scanner(System.in);


        System.out.println("\nВведіть ціле число (int):");
        String intInput = scanner.nextLine();
        try {
            int intValue = Integer.parseInt(intInput);
            System.out.println("Введене ціле число: " + intValue);
        } catch (NumberFormatException e) {
            System.out.println("Помилка: некоректне введення для типу int.");
        }


        System.out.println("\nВведіть дробове число (double):");
        String doubleInput = scanner.nextLine();
        try {
            double doubleValue = Double.parseDouble(doubleInput);
            System.out.println("Введене дробове число: " + doubleValue);
        } catch (NumberFormatException e) {
            System.out.println("Помилка: некоректне введення для типу double.");
        }


        System.out.println("\nВведіть логічне значення (boolean, true/false):");
        String booleanInput = scanner.nextLine();
        try {
            boolean booleanValue = Boolean.parseBoolean(booleanInput);
            System.out.println("Введене логічне значення: " + booleanValue);
        } catch (Exception e) {
            System.out.println("Помилка: некоректне введення для типу boolean.");
        }


        System.out.println("\nВведіть символ (char):");
        String charInput = scanner.nextLine();
        if (charInput.length() == 1) {
            char charValue = charInput.charAt(0);
            System.out.println("Введений символ: " + charValue);
        } else {
            System.out.println("Помилка: введено більше ніж один символ.");
        }


        scanner.close();
    }
}
