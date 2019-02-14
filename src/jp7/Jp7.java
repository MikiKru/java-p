package jp7;

public class Jp7 {
    public static void main(String[] args) {
        String name = "Barnabaaa";
        name = name.toUpperCase();

        System.out.println("Kim jesteś?");
        System.out.println(name.charAt(name.length()-1) == 'A' && !name.equals("KUBA") && !name.equals("BARNABA")
                ? "kobieta" : "mężczyzna");

        System.out.println(name.substring(name.length()-2).equals("BA") ? "zawiera BA na końcu" : "nie zawiera");
    }
}
