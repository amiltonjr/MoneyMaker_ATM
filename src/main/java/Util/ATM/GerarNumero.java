package Util.ATM;

public class GerarNumero {

    public static String get() {
        return String.valueOf(1111 + (int)(Math.random() * ((9999 - 1111) + 1)));
    }
}
