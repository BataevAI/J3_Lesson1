package Generics;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Generics {


    public <T> void printmass(T[] st) { // метод печати массива
        for (T t : st) {
            System.out.print(t + " ");
        }
        System.out.println();
    }

    public <T> ArrayList<T> massToList(T[] st) {
        ArrayList<T> Arr = new ArrayList<>();
        Collections.addAll(Arr, st);
        return Arr;
    }

    public <T> void changeMethod(T[] mass, int a, int b) { // метод перемены 2-х элементов

        try {

            T ch = mass[a];
            mass[a] = mass[b];
            mass[b] = ch;


        } catch (IndexOutOfBoundsException e) {
            System.out.println("a, b должны быть в пределах от 0 и до " + mass.length);
            e.printStackTrace();
        }

    }

    public static void main(String[] args) {
        Generics gen = new Generics();

        System.out.println("Начальный массив:");    // демонстрация перемены двух элементов местами
        String[] str = {"ПН", "ВТ", "СР", "ЧТ", "ПТ", "СБ", "ВС"};
        gen.printmass(str);
        gen.changeMethod(str, 0, 6);
        System.out.println("Конечный массив:");
        gen.printmass(str);
       ArrayList<Object> Ar =  gen.massToList(str); // демонстрация преобразования массива в список
        System.out.println(Ar);

        Box box = new Box();
        ArrayList<Apple> apple = new ArrayList<>();
        box.putfruit(new Apple(2), 2);
        box.putfruit(new Apple(1), 3);
        box.putfruit(new Apple(3), 1);

    }


}

