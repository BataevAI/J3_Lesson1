package Generics;

import java.util.ArrayList;

public class Box{

 Box amount;

    public <T> ArrayList<T> putfruit(T t1, int t2) {
        ArrayList<T> Arr;

        Arr = new ArrayList<>();
        for (int i = 1; i < t2; i++) {
            Arr.add(t1);
        }

        return Arr;
    }
    public <T> void printBox (ArrayList<T> A) {

            for (T a: A) {
                System.out.print(a + " ");
            }
            System.out.println();
        }
    }


