package iw3;

import java.util.Scanner;

import static java.lang.StrictMath.pow;

public class Iw3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Dozwolone operacje: (+),(-),(*),(/),(%),(^)");
        double var1 = scanner.nextDouble();
        scanner.nextLine();
        char key = scanner.nextLine().charAt(0);
        double var2 = scanner.nextDouble();
        switch (key){
            case '+':
                System.out.printf("%f %c %f = %f",var1 , key, var2, var1 + var2);
                break;
            case '-':
                System.out.printf("%f %c %f = %f",var1 , key, var2, var1 - var2);
                break;
            case '*':
                System.out.printf("%f %c %f = %f",var1 , key, var2, var1 * var2);
                break;
            case '/':
                System.out.printf("%f %c %f = %f",var1 , key, var2, var1 / var2);
                break;
            case '%':
                System.out.printf("%f %c %f = %f",var1 , key, var2, var1 % var2);
                break;
            case '^':
                System.out.printf("%f %c %f = %f",var1 , key, var2, Math.pow(var1, var2));
                break;
        }
        scanner.close();
    }
}
