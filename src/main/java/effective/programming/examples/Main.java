package effective.programming.examples;

import effective.programming.examples.chapter_2.Room;
import effective.programming.examples.chapter_2.Sum;
import effective.programming.examples.chapter_3.CaseInsensitiveString;
import effective.programming.examples.chapter_3.ColorPoint;
import effective.programming.examples.chapter_3.Point;

import java.awt.*;

public class Main {
    public static void main(String[] args) {

        var time = System.currentTimeMillis();
//        System.out.println(Sum.sumSlow());
//
//        System.out.println("time sumSlow: " + (System.currentTimeMillis() - time));
//
//        time = System.currentTimeMillis();
//        System.out.println(Sum.sumFast());
//
//        System.out.println("time sumFast: " + (System.currentTimeMillis() - time));
//
//        try (Room myRoom = new Room(7)) {
//            System.out.println("End");
//        }
//
//        new Room(99);
//        System.out.println("End");
//
//        CaseInsensitiveString cis = new CaseInsensitiveString("Polish");
//        String s = "polish";
//
//        System.out.println(cis.equals(s));
//        System.out.println(s.equals(cis));

        ColorPoint p1 = new ColorPoint(1, 2, Color.RED);
        Point p2 = new Point(1, 2);
        ColorPoint p3 = new ColorPoint(1, 2, Color.BLUE);

        System.out.println(p1.equals(p2));
        System.out.println(p2.equals(p3));
        System.out.println(p1.equals(p3));
    }
}