package Model.ATM;

/**
 Classe que valida se a string fornecida é um número
 */
public class ValidaNumero {
    public static boolean isNumeric(String str) {
        try {
            str = str.replace(",", ".");
            double d = Double.parseDouble(str);
            return true;
        } catch(NumberFormatException e) {
            return false;
        }
    }
}
