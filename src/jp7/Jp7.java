package jp7;

public class Jp7 {
    public static void main(String[] args) {
        String name = "Jowita";
        name = name.toUpperCase();

        System.out.println("Kim jesteś?");
        System.out.println(name.charAt(name.length()-1) == 'A' && !name.equals("KUBA") && !name.equals("BARNABA")
                ? "kobieta" : "mężczyzna");
    }
}
