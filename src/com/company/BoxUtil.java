package com.company;


public class BoxUtil {

    public static <T> void copyFromBoxToBox(final Box<T> src, final Box<? super T> dest) {
        dest.put(src.get());
    }

    public static void copyFreshFruitFromBoxToBox(final Box<? extends Fruit> src, final Box<? super Fruit> dest) {
        if (src.get().isFresh()) {
            dest.put(src.get());
        }
    }

    public static <T> void printElementFromTwoBoxes(final Box<Box<T>> box) {
        System.out.println(box.get().get());
    }

    public static <T> void printElementFromBoxes(final Box<T> box) {
        T b = box.get();
        if (b instanceof Box) {
            printElementFromBoxes((Box<?>) b);
        } else {
            System.out.println(b);
        }

    }
}




