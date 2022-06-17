package main;

public class MyTicket {
    public static void main(String[] args) {

        int a = 8;
        int b = 0;
        int[] numbers = new int[5];
        String s = "12akrt";

        try {
            int c = a / b;
            numbers[7] = 18;
            int f = Integer.parseInt(s);
        } catch (ArithmeticException e1) {
            System.out.println("На ноль делить нельзя");
        } catch (IndexOutOfBoundsException e2) {
            System.out.println("Индекс выходит за пределы массива");
        } catch (NumberFormatException e3) {
            System.out.println("Ошибка преобразования");
        }
    }
}
