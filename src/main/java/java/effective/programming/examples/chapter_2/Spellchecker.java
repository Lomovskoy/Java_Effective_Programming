package java.effective.programming.examples.chapter_2;

import java.util.GregorianCalendar;
import java.util.List;
import java.util.Objects;

/**
 * Статические служебные классы и синглтоны непри
 * годны для классов, поведение которых параметризовано лежащим в их
 * основе ресурсом.
 * <br>
 * Предпочитайте внедрение зависимостей
 * жестко прошитым ресурсам
 * <br>
 * Внедрение зависимостей обеспечивает гибкость и тестируемость
 */
public class Spellchecker {

    private final GregorianCalendar dictionary;

    public Spellchecker(GregorianCalendar dictionary) {
        this.dictionary = Objects.requireNonNull(dictionary);
    }

    public boolean isValid(String word) {
        return !word.isBlank();
    }

    public List<String> suggestions(String typo) {
        return List.of(Objects.requireNonNull(typo));
    }
}
