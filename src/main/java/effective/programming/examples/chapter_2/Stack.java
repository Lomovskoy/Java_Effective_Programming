package effective.programming.examples.chapter_2;

import java.util.Arrays;
import java.util.EmptyStackException;

/**
 * Избегайте устаревших ссылок на объекты
 * <br>
 * Вы можете найти утечку памяти?
 * <br>
 * Обнуление ссылки
 * на объект должно быть скорее исключением, чем нормой
 * <br>
 * Лучший способ
 * устранить устаревшие ссылки — выход переменной, содержащей ссылку, из
 * области видимости. Это происходит естественным путем, если вы определяете
 * каждую переменную в наиболее узкой области видимости из возможных
 */
public class Stack {

    private Object[] elements;
    private int size = 0;
    private static final int DEFAULT_INITIAL_CAPACITY = 16;

    public Stack() {
        elements = new Object[DEFAULT_INITIAL_CAPACITY];
    }

    public void push(Object e) {
        ensureCapacity();
        elements[size++] = e;
    }

    public Object pop() {
        if (size == 0) throw new EmptyStackException();
        Object result = elements[--size];
        elements[size] = null; // Устранение устаревшей ссылки!!!!!!!!!!!!!!!!
        return result;
    }

    /* *
     * Убеждаемся, что в стеке есть место хотя бы для одного
     * элемента; если нет - удваиваем емкость массива.
     */
    private void ensureCapacity() {
        if (elements.length == size)
            elements = Arrays.copyOf(elements, 2 * size + 1);
    }

}
