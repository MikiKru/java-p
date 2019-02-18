package repetition;

import java.util.Scanner;

public class Repetition {
    public static void main(String[] args) {
        // 1. Instrukcje warunkowe
            // if()
            // switch-case
        // 2. Pętle
            // for()
            // foreach()
            // while()
            // do while()
        // 3. Tablica

        // deklaracja tablicy liczb całkowitych o wymatrze 10 elementów
        int numTab [] = new int[10];
        // użytkownik w pętli przypisał wartości do wszystkich komórek tablicy
        Scanner sc = new Scanner(System.in);
        for(int i = 0; i < numTab.length; i++){
            System.out.println("Podaj " + i + " element tablicy");
            numTab[i] = sc.nextInt();
        }
        // wypisanie elementów tablicy
        for(int element : numTab){
            System.out.print(element + " ");
        }

    }
}
