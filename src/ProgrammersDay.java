import java.util.Scanner;

public class ProgrammersDay {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите год:");
        int year = scanner.nextInt();
        System.out.println(isLeapYear(year) ? "12.09." + year : "13.09." + year);
    }

    public static boolean isLeapYear(int year) {
        // здесь нужно определить, является ли переданный год високосным
        return year % 400 == 0 || (year % 100 != 0 && year % 4 == 0);
    }
}
