import DAO.ATM.ContaDAO;
import Entity.ATM.Conta;
import Model.ATM.Depositar;
import Model.ATM.Sacar;
import Model.ATM.Transferir;
import java.util.List;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;

/**
 *
 * @author amiltonjunior
 */
public class testesATM {
    
    public Conta conta1;
    public Conta conta2;
    
    public testesATM() {}
    
    @Before
    public void before() {
        // Obtém todas as contas cadastradas
        List<Conta> contas = ContaDAO.getInstance().findAll();
        conta1 = null;
        conta2 = null;
        int contador = 0;
        
        // Obtém duas contas cadastradas
        OUTER:
        for (Conta c : contas) {
            contador++;
            switch (contador) {
                case 1:
                    conta1 = c;
                break;
                
                case 2:
                    conta2 = c;
                break;
                
                default:
                break OUTER;
            }
        }
        
        // Verifica se há duas contas
        if (conta1 == null || conta2 == null || conta1.getStatus().equals("bloqueado") || conta2.getStatus().equals("bloqueado")) {
            fail("Devem haver pelo menos duas contas cadastradas e desbloqueadas para fazer o teste!");
            System.exit(0);
        }
    }
    
    @Test
    public void teste_saldoInsuficiente() {
        // Simula um saque com saldo insuficiente
        Double saldo = conta1.getSaldo();
        
        // Envia a solicitação para o pacote Model
        assertFalse(Sacar.sacar(conta1, saldo*2));
    }
    
    @Test
    public void teste_contaInvalida() {
        // Simula uma transferência para uma conta nula
        assertFalse(Transferir.transferir(conta1, null, 2.00));
        
        // Simula uma transferência para a mesma conta
        assertFalse(Transferir.transferir(conta2, conta2, 1.00));
    }
    
    @Test
    public void teste_limiteSaque() {
        // Simula um saque em uma conta corrente com limite superior ao limite
        if (conta1 != null) {
            if (conta1.getTipo().equals("limite")) {
                Double limite = conta1.getLimite();
                assertFalse(Sacar.sacar(conta1, limite*2));
            }
        } else if (conta2 != null) {
            if (conta2.getTipo().equals("limite")) {
                Double limite = conta2.getLimite();
                assertFalse(Sacar.sacar(conta2, limite*2));
            }
        }
        
        // Se nenhuma conta é limimte, ignora esse teste
    }
    
    @Test
    public void teste_limiteDeposito() {
        // Simula o depósito de um valor menor que zero
        assertFalse(Depositar.depositar(conta1, -1.00));
    }
    
    @Test
    public void teste_limiteTransferencia() {
        // Simula a transferência de um valor maior do que o saldo em conta
        assertFalse(Transferir.transferir(conta1, conta2, conta1.getSaldo()*2));
    }
}
