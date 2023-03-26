package effective.programming.examples.chapter_2.pizza;

import static effective.programming.examples.chapter_2.pizza.NyPizza.Size.*;
import static effective.programming.examples.chapter_2.pizza.Pizza.Topping.*;

/**
 * Шаблон проектирования Строитель является хорошим выбором
 * при проектировании классов, конструкторы или статические фабрики ко
 * торых будут иметь большое количество параметров
 */
public class Main {

    public static void main(String[] args) {
        NyPizza pizza = new NyPizza.Builder(SMALL).addTopping(SAUSAGE).addTopping(ONION).build();
        Calzone calzone = new Calzone.Builder().addTopping(HAM).sauceInside().build();

        System.out.println(pizza);
        System.out.println(calzone);
    }
}