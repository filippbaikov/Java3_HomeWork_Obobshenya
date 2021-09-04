import java.util.ArrayList;
import java.util.Arrays;

public class HomeWork {
    public static void main(String[] args) {
        System.out.println("Домашнее задание 1");
        String[] arr = {"a", "b", "c", "d"};
        System.out.println(Arrays.toString(arr));
        changeElements(arr, 0, 1);
        System.out.println(Arrays.toString(arr));
        System.out.println("\n домашнее задание 2");
        toArrayList(arr);

        System.out.println("\n \n домашнее задание 3");


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



    private static <T> void toArrayList(T[] arr) {
        ArrayList<T> arrayList = new ArrayList<>(Arrays.asList(arr));
        arrayList.add((T) "проверка, что всё работает верно");
        for (T a : arrayList)
            System.out.print(a + " ");


    }

    private static <T> void changeElements(T[] array, int a, int b) {
        T x = array[a];
        array[a] = array[b];
        array[b] = x;
    }



}
