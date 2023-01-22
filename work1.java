//Задать одномерный массив и найти в нем минимальный и максимальный элементы
package HW1;

public class work1 {
    public static void main(String[] args) {
        minmax();
    }

    private static void minmax() {
        int[] array = {1, 3, 4, 5, 6, 7, 8, 6, 5, 4, 0, 6, 7, 8, 6, 4, 3};
        int min = 10000;
        int max = 0;

        for (int item : array) {
            if (item < min) min = item;
            if (item > max) max = item;
        }
        System.out.println(max + " " + min);
    }
}
