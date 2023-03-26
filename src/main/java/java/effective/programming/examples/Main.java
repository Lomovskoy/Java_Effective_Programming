package java.effective.programming.examples;

import java.effective.programming.examples.chapter_2.Sum;

public class Main {
    public static void main(String[] args) {

        var time = System.currentTimeMillis();
        System.out.println(Sum.sumSlow());

        System.out.println("time sumSlow: " + (System.currentTimeMillis() - time));

        time = System.currentTimeMillis();
        System.out.println(Sum.sumSlow());

        System.out.println("time sumSlow: " + (System.currentTimeMillis() - time));
    }
}