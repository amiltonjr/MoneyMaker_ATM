package Model.ATM;

import Entity.ATM.Conta;

public class Transferir {
    
    public static boolean transferir(Conta contaOrigem, Conta contaDestino, double valor) {
        try {
            if (valor <= 0)
                return false;
            
            if (contaDestino == null)
                return false;
            
            if (contaDestino == contaOrigem)
                return false;
            
            if (contaOrigem.getTipo().equals("limite") && valor > contaOrigem.getLimite())
                return false;
            
            if (contaDestino.getStatus().equals("bloqueado"))
                return false;
            
            return (valor <= contaOrigem.getSaldo());
        } catch (Exception e) {
            e.printStackTrace();
            
            return false;
        }
    }
    
}
