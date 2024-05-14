import java.util.Random;

public class Zadanie5 {
    /*
    wygeneruj tablice losowych liczb (10x10)
    wylicz średnią każdego wiersza i wypisz na ekranie największą średnią
     */
    public static void main(String[] args) {
        int[][] tab = new int[10][10];
        Random losowacz = new Random();
        for(int row = 0; row < 10; row++) {
            for(int col = 0; col < 10; col++) {
                tab[row][col] = losowacz.nextInt(0, 1000);
                System.out.print(tab[row][col] + "\t");
            }
            System.out.println();
        }

        double maxAvg = 0;
        for(int[] row : tab) {
            int rowSum = 0;
            for(int element : row) {
                rowSum += element;
            }
            double avg = rowSum/10.0;
            if(avg > maxAvg) {
                maxAvg = avg;
            }
        }

        System.out.println("Najwieksza srednia: " + maxAvg);
    }
}
