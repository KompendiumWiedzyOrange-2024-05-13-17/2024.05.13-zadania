import java.util.Random;

public class Zadanie3 {

    /*
    generujemy tablice losowych liczb (1000)
    program ma znaleźć i wypisać największą liczbę z tablicy
     */

    public static void main(String[] args) {
        int[] tab = new int[1000];
        Random losowacz = new Random();
        for(int i = 0; i < tab.length; i++) {
            tab[i] = losowacz.nextInt(0, 1000);
        }

        int max = tab[0];
        for(int element : tab) {
            if(element > max) {
                max = element;
            }

            if(max == 9999) {
                break;
            }
        }

        System.out.println("Max: " + max);
    }
}
