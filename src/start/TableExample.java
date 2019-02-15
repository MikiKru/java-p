package start;

public class TableExample {
    public static void main(String[] args) {
        double signal [] = {0.5, 0.11, 0.43, 0.67, 0.01, 0.11};
        // wypisanie
        // (inicjalizacja zmiennej pomocniczej; warunek zatrzymania pętli; krok)
        for(int i =0; i < signal.length; i++){
            System.out.println(signal[i]);
        }
        // komórka w tablicy : tablica
        for(double s : signal){
            System.out.println(s);
        }
        for (int i = 0; i < 1000000; i++){
            System.out.print(i + " ");
        }

//        // modyfikacja
//        signal[4] = 0;
//        System.out.println(signal[0]);
//        System.out.println(signal[1]);
//        System.out.println(signal[2]);
//        System.out.println(signal[3]);
//        System.out.println(signal[4]);
//        System.out.println(signal[5]);
//        // długość tablicy
//        System.out.println("Długość sygnału: " + signal.length);
//        String names [] = new String[150];
//        int values [] = new int[10];
//        char flags [] = new char[5];
//        System.out.println("Długość imiona: " + names.length);
//        names[5] = "Michał";
//        System.out.println(names[0]);
//        System.out.println(values[5]);
//        System.out.println((int)flags[1]);

    }
}
