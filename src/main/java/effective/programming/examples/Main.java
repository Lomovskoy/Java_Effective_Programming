package effective.programming.examples;

import effective.programming.examples.chapter_2.Sum;

public class Main {
    public static void main(String[] args) {

        var time = System.currentTimeMillis();
        System.out.println(Sum.sumSlow());

        System.out.println("time sumSlow: " + (System.currentTimeMillis() - time));

        time = System.currentTimeMillis();
        System.out.println(Sum.sumFast());

        System.out.println("time sumFast: " + (System.currentTimeMillis() - time));
    }
}