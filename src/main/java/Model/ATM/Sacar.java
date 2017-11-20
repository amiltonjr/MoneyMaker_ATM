package Model.ATM;

import Entity.ATM.Conta;

public class Sacar {
    
    public static boolean sacar(Conta conta, double valor) {
        try {
            if (valor <= 0)
                return false;
            
            if (conta.getTipo().equals("limite") && valor > conta.getLimite())
                return false;

            return (valor <= conta.getSaldo());
        } catch (Exception e) {
            return false;
        }
    }
    
}
