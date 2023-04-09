package effective.programming.examples.chapter_3;

import java.awt.*;
import java.util.Objects;

/**
 * Добавление компонента-значения без нарушения контракта equals
 */
public class ColorPointComposition {

    private final Point point;
    private final Color color;

    public ColorPointComposition(int x, int y, Color color) {
        this.point = new Point(x, y);
        this.color = Objects.requireNonNull(color);
    }

    // Возвращает представление цветной точки в виде обычной.
    public Point asPoint() {
        return point;
    }

    @Override
    public boolean equals(Object o) {
        if(!(o instanceof ColorPointComposition)) return false;
        ColorPointComposition cp = (ColorPointComposition) o;
        return cp.point.equals(point)&&cp.color.equals(color);
    }

}
