package main;

public class MyTicket {
    public static void main(String[] args) {

        int a = 8;
        int b = 2;
        int[] numbers = new int[5];
        String s = "12akrt";

        try {
            int c = a / b;
            numbers[2] = 18;
            int f = Integer.parseInt(s);
        } catch (ArithmeticException | IndexOutOfBoundsException | NumberFormatException e1) {
            System.out.println(e1);
        }
    }
}
