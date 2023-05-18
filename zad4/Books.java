package zad4;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Books {
    public static void main(String[] args) {
        List<Ksiazka> listaKsiazek = new ArrayList<>();
        listaKsiazek.add(new Ksiazka("Zamek", "Franz Kafka", 250));
        listaKsiazek.add(new Ksiazka("Ogniem i Mieczem", "Henryk Sienkiewicz", 800));
        listaKsiazek.add(new Ksiazka("Mały Książę", "Antoine de Saint-Exupéry", 100));
        listaKsiazek.add(new Ksiazka("Pan Tadeusz", "Adam Mickiewicz", 400));


        listaKsiazek.sort(Comparator.comparing(Ksiazka::getTytul));


        for (Ksiazka ksiazka : listaKsiazek) {
            System.out.println(ksiazka.getTytul() + " - " + ksiazka.getAutor());
        }
    }
}


    class Ksiazka {
        private String tytul;
        private String autor;
        private int liczbaStron;

        public Ksiazka(String tytul, String autor, int liczbaStron) {
            this.tytul = tytul;
            this.autor = autor;
            this.liczbaStron = liczbaStron;
        }

        public String getTytul() {
            return tytul;
        }

        public void setTytul(String tytul) {
            this.tytul = tytul;
        }

        public String getAutor() {
            return autor;
        }

        public void setAutor(String autor) {
            this.autor = autor;
        }

        public int getLiczbaStron() {
            return liczbaStron;
        }

        public void setLiczbaStron(int liczbaStron) {
            this.liczbaStron = liczbaStron;
        }
    }