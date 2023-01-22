//Написать метод, который определяет, является ли год високосным,
// и возвращает boolean (високосный - true, не високосный - false).
// Каждый 4-й год является високосным, кроме каждого 100-го, при этом каждый 400-й – високосный.
package HW1;

import java.util.Scanner;
import java.util.Scanner;

public class work2 {

    public static void main(String[] args) {
        int year = Enter();

        boolean result = LeapYear(year);
        System.out.println(result);
    }

    public static boolean LeapYear(int year) {
        if (year % 400 == 0) {
            return true;
        } else if (year % 100 == 0) {
            return false;
        } else {
            return year % 4 == 0;
        }

    }

    private static int Enter() {
        Scanner console = new Scanner(System.in);
        System.out.print("Введите год: ");
        int year = console.nextInt();
        //Scanner.close();
        return year;
    }
}