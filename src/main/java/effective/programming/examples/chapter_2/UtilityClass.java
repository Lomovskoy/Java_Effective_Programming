package effective.programming.examples.chapter_2;

/**
 * Обеспечивайте неинстанцируемость
 * с помощью закрытого конструктора
 */
public class UtilityClass {

    // Подавление создания конструктора по умолчанию
    // для достижения неинстанцируемости
    private UtilityClass() {
        throw new AssertionError();
    }
    // Остальной код опущен
}
