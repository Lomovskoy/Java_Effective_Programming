package effective.programming.examples.chapter_3;

public class Point {

    private final int x;
    private final int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Point)) return false;
        Point p = (Point) o;
        return p.x == x && p.y == y;
    }


    // Нарушение принципа подстановки Лисков
//    @Override
//    public boolean equals(Object o) {
//        if (o == null || o.getClass() !=getClass()) return false;
//        Point p = (Point) o;
//        return p.x == x && p.y == y;
//    }
}