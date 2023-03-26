package java.effective.programming.examples.chapter_2;

public class Sum {

    // Ужасно медленно! Вы можете найти создание объекта?
    public static long sumSlow() {
        Long sum = 0L;
        for (long i = 0; i <= Integer.MAX_VALUE; i++)
            sum += i;
        return sum;
    }

    public static long sumFast() {
        long sum = 0L;
        for (long i = 0; i <= Integer.MAX_VALUE; i++)
            sum += i;
        return sum;
    }
}
