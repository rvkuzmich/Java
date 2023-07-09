package hw3;
/**
Пусть дан произвольный список целых чисел.

1) Нужно удалить из него чётные числа
2) Найти минимальное значение
3) Найти максимальное значение
4) Найти среднее значение
 */
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.Collections;

public class task1 {
    public static List<Integer> getRandomList() {
        Random random = new Random();
        int size = 20;
        List<Integer> list = new ArrayList<>(size);
        for (int i = 0; i < size; i++) {
            list.add(random.nextInt(100));
        }
        System.out.println(list.toString());
        return list;
    }

    public static List<Integer> delEvenNum(List<Integer> list) {

        for (Iterator<Integer> iterator = list.iterator(); iterator.hasNext();) {
            Integer number = iterator.next();
                        if (number % 2 == 0) {
                iterator.remove();
            }
        }
        System.out.println(list.toString());
        return list;
    }
    public static void findMax(List<Integer> list) {
        int max = Collections.max(list);
        System.out.printf("Максимальное значение в списке чисел: %d", max);
        System.out.println();
    }
    public static void findMin(List<Integer> list) {
        int min = Collections.min(list);
        System.out.printf("Минимальное значение в списке чисел: %d", min);
        System.out.println();
    }
    public static void findMean(List<Integer> list) {
        int sum = 0;
        for (Integer i : list) {
            sum += i;
        }
        double mean = sum / list.size();
        System.out.printf("Среднее значение в списке чисел: %f", mean);
    }

    public static void main(String[] args) {
        List<Integer> list = delEvenNum(getRandomList());
        findMax(list);
        findMin(list);
        findMean(list);

    }
}
