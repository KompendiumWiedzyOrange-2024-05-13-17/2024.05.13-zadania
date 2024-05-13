import java.util.Random;

public class Zadanie2 {

    /*
    wygenerować tablice losowych liczb (1000)
    wyświetlić z tej tablicy co drugą liczbę ale jeśli jest podzielna przez 3
     */

    public static void main(String[] args) {
        int[] tab = new int[1000];
        Random losowacz = new Random();
        for(int i = 0; i < 1000; i++) {
            tab[i] = losowacz.nextInt(0,101);
        }

        int count = 0;
        for(int i = 0; i < tab.length; i = i + 2) {
            if(tab[i] % 3 == 0) {
                System.out.println(tab[i]);
                count++;
            }
        }

        System.out.println("Ilosc znalezionych liczb: " + count);
    }
}
