package pt2;

public class Pt2 {
    public static void main(String[] args) {
        int[] numbers = { 3, 5, 6, 2, 7, 8, 1, 9};
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
        for (int i = numbers.length - 1; i >=0; i--) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println();
        for(int element : numbers){
            System.out.println(element);
        }
        System.out.println();
        for (int i = 0; i < numbers.length; i += 2) {
            System.out.print(numbers[i]+" ");
        }

    }
}
