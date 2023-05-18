package zad1;

import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> listaLiczb = new ArrayList<>();


        for(int i = 1; i <= 25; i++){
            listaLiczb.add(i*2);
        }

        System.out.println(listaLiczb);

    }
}