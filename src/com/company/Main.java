package com.company;

public class Main {

    public static void main(final String[] args) {

        //Проверка copyFromBoxToBox()
        Box<String> box1 = new Box<>();
        Box<String> box2 = new Box<>();
        box1.put("123");
        BoxUtil.copyFromBoxToBox(box1, box2);
        System.out.println(box2.get());
        System.out.println("---------------");

        //Проверка copyFreshFruitFromBoxToBox
        Apple apple = new Apple();
        Box<Apple> apple1 = new Box<>();
        apple1.put(apple);
        Box<Fruit> apple2 = new Box<>();
        apple1.get().setFresh(true);
        BoxUtil.copyFreshFruitFromBoxToBox(apple1, apple2);
        System.out.println(apple2.get());
        System.out.println("---------------");

        //Проверка printElementFromTwoBoxes
        Box<Box<String>> boxOutside = new Box<>();
        Box<String> boxInside = new Box<>();
        boxInside.put("элемент в коробке, которая лежит в коробке");
        boxOutside.put(boxInside);
        BoxUtil.printElementFromTwoBoxes(boxOutside);
        System.out.println("---------------");

        //Проверка printElementFromBoxes
        Box<Box<Box<String>>> boxOutside1 = new Box<>();
        Box<Box<String>> boxInside2 = new Box<>();
        Box<String> boxInside1 = new Box<>();
        boxInside1.put("1234");
        boxInside2.put(boxInside1);
        boxOutside1.put(boxInside2);
        BoxUtil.printElementFromBoxes(boxOutside1);
    }
}
