package effective.programming.examples.chapter_3;

import java.awt.*;

public class ColorPoint extends Point {

    private final Color color;

    public ColorPoint(int x, int y, Color color) {
        super(x, y);
        this.color = color;
    }

    // Нарушение транзитивности!
    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Point)) return false;
        // Если о — обычная точка, сравнение не учитывает цвет
        if (!(o instanceof ColorPoint)) return o.equals(this);
        //о — объект ColorPoint; выполняется полное сравнение
        return super.equals(o) && ((ColorPoint) o).color == color;
    }

}
