package start;

public class Operators {
    public static void main(String[] args) {
        int x = 1;
        System.out.println(x++);
        System.out.println(x);
        int y = 1;
        System.out.println(--y);
        System.out.println(y);

        int a = 1, b = 2, c =3;
        System.out.println((--a)*(b++)+(11+(c--)));
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);

    }
}
