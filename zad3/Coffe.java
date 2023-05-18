package zad3;

import java.util.Iterator;
import java.util.List;
import java.util.ArrayList;
public class Coffe {
    public static void main(String[] args) {
        List<String> Lista = new ArrayList<>();

        Lista.add("espresso");
        Lista.add("latte");
        Lista.add("cappuccino");
        Lista.add("mocha");
        Lista.add("auLait");
        Lista.add("macchiato ");

        System.out.println(Lista);

        Iterator<String> iterator = Lista.iterator();

        while (iterator.hasNext()) {
            String str = iterator.next();
            System.out.println(str);
        }

        for (String str : Lista) {
            String duzeLitery = str.toUpperCase();
            System.out.println(duzeLitery);
        }

        for (String wyraz : Lista) {
            if (wyraz.length() >= 4) {
                String pierwszeCzteryLitery = wyraz.substring(0, 4);
                System.out.println(pierwszeCzteryLitery);
            }


        }
    }

}
