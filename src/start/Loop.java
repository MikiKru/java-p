package start;

import java.util.Scanner;

public class Loop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int key = -1;
        while(key != 0) {
            System.out.println("Co chcesz zrobić: \n(1) Zadanie1 \n(2) Zadanie2 \n(0) Wyjście");
            key = scanner.nextInt();
            switch (key) {
                case 1:
                    System.out.println("Rozwiązanie zadania 1");
                    break;
                case 2:
                    System.out.println("Rozwiązanie zadania 2");
                    break;
                case 0:
                    System.out.println("Wyjście");
                    break;
                default:
                    System.out.println("Błędny wybór!");
            }
        }
        System.out.println("END");
    }

}
