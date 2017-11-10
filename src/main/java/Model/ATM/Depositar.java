package Model.ATM;

import Entity.ATM.Conta;

public class Depositar {
    
    public static boolean depositar(Conta conta, double valor) {
        
        try {
            if (conta.getTipo().equals("limite") && valor > conta.getLimite())
                return false;

            return true;
        } catch (Exception e) {
            return false;
        }
    }
    
}
