package Control.ATM;
;
import Entity.ATM.Movimentacao;
import View.ATM.FrameRetirarExtrato;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class ControlRetirarExtrato {
    
    // Método que preenche os dados no frame
    public static void iniciar(FrameRetirarExtrato frame) {
        frame.setNomeCliente(getNomeCliente(frame));
        frame.setNumeroConta(getNumeroConta(frame));
        frame.setLimite(getLimite(frame));
        frame.setTipo(getTipo(frame));
        frame.setAniversario(getAniversario(frame));
        
        List<Movimentacao> extrato = getExtrato(frame);
        int registros = extrato.size();
        ArrayList<String> registro = new ArrayList<>();
        
        for (int i=0; i<registros; i++) {
            registro.clear();
            
            try {
                registro.add(extrato.get(i).getDatamov());
                registro.add(extrato.get(i).getNumero());
                registro.add(extrato.get(i).getOperacao());
                registro.add(extrato.get(i).getValor());
                registro.add(extrato.get(i).getSaldo());

                frame.addExtrato(registro);
            } catch (Exception e) {}
            
        }
    }
    
    // Método que chama a impressão
    public static void imprimir() {
        // Exibe um alerta
        JOptionPane.showMessageDialog(new JFrame(), "Imprimindo extrato...", "Imprimindo", JOptionPane.INFORMATION_MESSAGE);
    }
    
    // Método que obtém o nome do cliente
    public static String getNomeCliente(FrameRetirarExtrato frame) {
        try {
            return frame.getConta().getCliente().getNome();
        } catch (Exception e) {
            return "";
        }
    }
    
    // Método que obtém o número da conta
    public static String getNumeroConta(FrameRetirarExtrato frame) {
        try {
            return frame.getConta().getNumeroConta();
        } catch (Exception e) {
            return "";
        }
    }
    
    // Método que obtém o limite
    public static String getLimite(FrameRetirarExtrato frame) {
        try {
            return String.valueOf(frame.getConta().getLimite());
        } catch (Exception e) {
            return "";
        }
    }
    
    // Método que obtém o tipo de conta
    public static String getTipo(FrameRetirarExtrato frame) {
        try {
            return frame.getConta().getTipo();
        } catch (Exception e) {
            return "";
        }
    }
    
    // Metodo que obtém o aniversário da conta
    public static String getAniversario(FrameRetirarExtrato frame) {
        try {
            return frame.getConta().getDataAbertura();
        } catch (Exception e) {
            return "";
        }
    }
    
    // Método que obtém a lista de movimentações (extrato)
    public static List<Movimentacao> getExtrato(FrameRetirarExtrato frame) {
        try {
            return frame.getConta().getMovimentacoes();
        } catch (Exception e) {
            return new ArrayList<>();
        }
    }
    
}
