package effective.programming.examples.chapter_2;

/**
 * Шаблон телескопического конструктора - не масштабируется!
 * <br>
 * шаблон телескопического конструктора работает, но
 * очень трудно написать код клиента, у которого есть много параметров,
 * и еще труднее его читать.
 */
public class TelescopicConstructor {

    private final int servingSize;
    private final int servings;
    private final int calories;
    private final int fat;
    private final int sodium;
    private final int carbohydrate;

    public TelescopicConstructor(int servingSize, int servings) {
        this(servingSize, servings, 0);
    }

    public TelescopicConstructor(int servingSize, int servings,
                                 int calories) {
        this(servingSize, servings, calories, 0);
    }

    public TelescopicConstructor(int servingSize, int servings,
                                 int calories, int fat) {
        this(servingSize, servings, calories, fat, 0);
    }

    public TelescopicConstructor(int servingSize, int servings,
                                 int calories, int fat, int sodium) {

        this(servingSize, servings, calories, fat, sodium, 0);
    }

    public TelescopicConstructor(int servingSize, int servings,
                                 int calories, int fat, int sodium,
                                 int carbohydrate) {
        this.servingSize = servingSize;
        this.servings = servings;
        this.calories = calories;
        this.fat = fat;
        this.sodium = sodium;
        this.carbohydrate = carbohydrate;
    }
}