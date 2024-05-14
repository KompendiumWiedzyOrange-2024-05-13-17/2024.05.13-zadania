public class Zadanie6 {
    /*
    wypisz kolejne liczby startując od 1 (każda w nowym wierszu) do 100
    jeśli liczba jest podzielna przez 3 to dopisz Fizz
    jeśli liczba jest podzielna przez 5 to dopisz Buzz
    jeśli jest podzielna przez 3 i 5 jednocześnie to Fizz Buzz
     */

    public static void main(String[] args) {
        for(int liczba = 1; liczba <= 100; liczba++) {
            System.out.print(liczba + "\t");
            if(liczba % 3 == 0) {
                System.out.print("Fizz\t");
            }
            if(liczba % 5 == 0) {
                System.out.print("Buzz");
            }
            System.out.println();
            /*if(liczba % 3 == 0 && liczba % 5 == 0) {
                System.out.println(liczba + " Fizz Buzz");
            } else if(liczba % 3 == 0) {
                System.out.println(liczba + " Fizz");
            } else if(liczba % 5 == 0) {
                System.out.println(liczba + " Buzz");
            } else {
                System.out.println(liczba);
            }*/
        }
    }
}
