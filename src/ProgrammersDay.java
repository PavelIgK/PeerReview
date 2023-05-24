import java.util.Scanner;

public class ProgrammersDay {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите год:");
        int year = scanner.nextInt();
        System.out.println(isLeapYear(year) ? "13.09.2000" : "12.09.2000");
    }

    public static boolean isLeapYear(int year) {
        // здесь нужно определить, является ли переданный год високосным
        return year % 400 == 0 || (year % 100 != 0 && year % 4 == 0);
    }
}
