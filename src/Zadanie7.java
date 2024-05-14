import java.util.Random;

public class Zadanie7 {
    /*
    napisz program generujący tablice 10 losowych liczb (0-99)
    każda liczba w tablicy jest nie mniejsz niż poprzednia
    4 6 10 15 20 50 70 80 90 95

    niepoprawny wynik: 5 3 10 2 20 30 40 50 60 70

    na końcu wypisz tablicę
     */
    public static void main(String[] args) {
        Random losowacz = new Random();
        int[] tab = new int[10];
        tab[0] = losowacz.nextInt(0, 100);
        System.out.print(tab[0] + " ");
        for(int i = 1; i < tab.length; i++) {
            tab[i] = losowacz.nextInt(tab[i-1], 100);
            System.out.print(tab[i] + " ");
        }
        /*tab[0] = losowacz.nextInt(0, 100);
        System.out.print(tab[0] + " ");
        int counter = 1;
        for(int i = 1; i < tab.length; i++) {
            int wylosowana = losowacz.nextInt(0, 100);
            counter++;
            while(wylosowana < tab[i-1]) {
                wylosowana = losowacz.nextInt(0, 100);
                counter++;
            }
            tab[i] = wylosowana;
            System.out.print(tab[i] + " ");
        }
        System.out.println();
        System.out.println(counter);*/
    }
}
