public class Zadanie4 {
    /*
    Wygeneruj macierz (10x10) w której każda wartość to wymnożony wiersz i kolumna (licząć od 1)
    wypisz ją na ekranie w postaci kwadratu (macierzy)
     */
    public static void main(String[] args) {
        int[][] tab = new int[10][10];
        for(int row = 0; row < 10; row++) {
            for(int col = 0; col < 10; col++) {
                tab[row][col] = (row + 1) * (col + 1);
                System.out.print(tab[row][col] + "\t");
            }
            System.out.println();
        }
    }
}
