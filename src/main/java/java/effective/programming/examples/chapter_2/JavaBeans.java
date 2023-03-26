package java.effective.programming.examples.chapter_2;

/**
 * Шаблон JavaBeans - обеспечивает изменяемость
 * JavaBean в процессе построения может оказаться в частично несогласо
 * ванном состоянии.
 */
public class JavaBeans {

    // Параметры инициализируются значениями
    // по умолчанию (если таковые имеются)
    // Необходим; значения по умолчанию нет:
    private int servingSize = -1;
    // Необходим; значения по умолчанию нет:
    private int servings = -1;
    private int calories = 0;
    private int fat = 0;
    private int sodium = 0;
    private int carbohydrate = 0;

    public JavaBeans() {
    }

    // Методы установки значений
    public void setServingSize(int val) {
        servingSize = val;
    }

    public void setServings(int val) {
        servings = val;
    }

    public void setCalories(int val) {

        calories = val;
    }

    public void setFat(int val) {

        fat = val;
    }

    public void setSodium(int val) {
        sodium = val;
    }

    public void setCarbohydrate(int val) {
        carbohydrate = val;
    }

}
