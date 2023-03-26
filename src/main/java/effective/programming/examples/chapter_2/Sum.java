package effective.programming.examples.chapter_2;

/**
 * sumSlow медленнее sumFast в 7,6 раз.
 * <br>
 * предпочитайте прими
 * тивы упакованным примитивам и следите за непреднамеренной автома
 * тической упаковкой.
 */
public class Sum {

    // Ужасно медленно! Вы можете найти создание объекта?
    // Время выполнения 5159ms
    public static long sumSlow() {
        Long sum = 0L;
        for (long i = 0; i <= Integer.MAX_VALUE; i++)
            sum += i;
        return sum;
    }

    // Время выполнения 678ms
    public static long sumFast() {
        long sum = 0L;
        for (long i = 0; i <= Integer.MAX_VALUE; i++)
            sum += i;
        return sum;
    }
}
