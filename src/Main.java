import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();


    }


    private static void task1() {
        List<String> task1 = Arrays.asList("Барабулька", "Собака Узумаки", "Козинак");
        try {
            swap(task1, 2, 1);
            System.out.println(task1);
        } catch (WrongPositionExeption e) {
            e.printStackTrace();
        }


    }

    private static void task2() {
        int[] integer = {1, 2, 3, 4, 5};
        arrayToList(integer);
        System.out.println(Arrays.toString(integer));

    }

    private static void task3() {
        Orange orange = new Orange();
        Apple apple = new Apple();
        Box<Orange> orangeBox1 = new Box();
        Box<Orange> orangeBox2 = new Box();
        Box<Apple> appleBox = new Box();
        orangeBox1.add(new Orange());
        orangeBox1.add(new Orange());
        orangeBox1.add(new Orange());

        for (int i = 0; i < 4; i++) {
            orangeBox2.add(new Orange());
        }
        for (int i = 0; i < 6; i++) {
            appleBox.add(new Apple());
        }


        orangeBox1.info();
        orangeBox2.info();
        appleBox.info();

        Float orange1Weigth = orangeBox1.getWeight();
        Float orange2Weigth = orangeBox2.getWeight();
        Float appleWeigth = appleBox.getWeight();
        System.out.println("Вес коробки 1 с апельсинами: " + orange1Weigth);
        System.out.println("Вес коробки 2 с апельсинами: " + orange2Weigth);
        System.out.println("Вес коробки с яблоками: " + appleWeigth);

        System.out.println("Сравнить вес orangeBox1 и appleBox: " + orangeBox1.compare(appleBox));
        System.out.println("Сравнить вес orangeBox2 и appleBox: " + orangeBox2.compare(appleBox));

        orangeBox1.moveAt(orangeBox2);

        orangeBox1.info();
        orangeBox2.info();
        appleBox.info();
    }

    public static <E> void swap(List<E> a, int i, int j) throws WrongPositionExeption {
        if (i < 0 || i > a.size() || j < 0 || j > a.size() || i == j) {
            throw new WrongPositionExeption("Неправильно указаны значения");

        }
        E tmp = a.get(i);
        a.set(i, a.get(j));
        a.set(j, tmp);
    }

    public static <E> ArrayList arrayToList(int[] array) {
        return new ArrayList<>(Arrays.asList(array));
    }

}
