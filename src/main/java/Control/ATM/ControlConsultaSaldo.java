package Control.ATM;

import View.ATM.FrameConsultaSaldo;

public class ControlConsultaSaldo {
    
    // Método que preenche os dados no frame
    public static void iniciar(FrameConsultaSaldo frame) {
        frame.setNomeCliente(getNomeCliente(frame));
        frame.setNumeroConta(getNumeroConta(frame));
        frame.setLimite(getLimite(frame));
        frame.setTipo(getTipo(frame));
        frame.setAniversario(getAniversario(frame));
        frame.setSaldo(getSaldo(frame));
    }
    
    // Método que obtém o nome do cliente
    public static String getNomeCliente(FrameConsultaSaldo frame) {
        try {
            return frame.getConta().getCliente().getNome();
        } catch (Exception e) {
            return "";
        }
    }
    
    // Método que obtém o número da conta
    public static String getNumeroConta(FrameConsultaSaldo frame) {
        try {
            return frame.getConta().getNumeroConta();
        } catch (Exception e) {
            return "";
        }
    }
    
    // Método que obtém o limite
    public static String getLimite(FrameConsultaSaldo frame) {
        try {
            return String.valueOf(frame.getConta().getLimite());
        } catch (Exception e) {
            return "";
        }
    }
    
    // Método que obtém o tipo
    public static String getTipo(FrameConsultaSaldo frame) {
        try {
            return frame.getConta().getTipo();
        } catch (Exception e) {
            return "";
        }
    }
    
    // Método que obtém o aniversário
    public static String getAniversario(FrameConsultaSaldo frame) {
        try {
            return frame.getConta().getDataAbertura();
        } catch (Exception e) {
            return "";
        }
    }
    
    // Método que obtém o saldo
    public static String getSaldo(FrameConsultaSaldo frame) {
        try {
            return String.valueOf(frame.getConta().getSaldo());
        } catch (Exception e) {
            return "";
        }
    }
    
}
