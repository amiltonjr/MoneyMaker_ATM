package Control.ATM;

import DAO.ATM.ContaDAO;
import DAO.ATM.MovimentacaoDAO;
import Entity.ATM.Movimentacao;
import Model.ATM.Depositar;
import Util.ATM.GerarNumero;
import View.ATM.FrameEfetuarDeposito;
import View.ATM.FrameErroTransacao;
import View.ATM.FrameSucessoTransacao;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class ControlEfetuarDeposito {

    // Método que efetua um depósito
    public static void efetuarDeposito(FrameEfetuarDeposito currentFrame, FrameSucessoTransacao sucessFrame, FrameErroTransacao errorFrame, String valor) {
        // Valida os dados
        if (!isNumeric(valor)) {
            msgErro("Erro", "Valor inválido!");
            currentFrame.focoValor();
        } else {
            // Converte os dados em variáveis numéricas
            double _valor = Double.parseDouble(valor);

            // Envia a solicitação para o pacote Model
            if (Depositar.depositar(currentFrame.getConta(), _valor)) {

                double saldo = currentFrame.getConta().getSaldo() + _valor;
                currentFrame.getConta().setSaldo(saldo);

                Movimentacao movimentacao = new Movimentacao();

                DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
                Date date = new Date();

                movimentacao.setDatamov(dateFormat.format(date));
                movimentacao.setNumero(GerarNumero.get());

                movimentacao.setOperacao("DEPOSITO");
                movimentacao.setCpf(currentFrame.getConta().getCliente().getCpf());
                movimentacao.setValor(String.format("%.2f", _valor));
                movimentacao.setSaldo(String.format("%.2f", saldo));

                currentFrame.getConta().setSaldo(saldo);
                currentFrame.getConta().addMovimentacao(movimentacao);

                System.out.println(currentFrame.getConta().getNumeroConta() + " numero ");

                // Atualiza no arquivo de dados
                boolean status = false;
                
                movimentacao.setConta(currentFrame.getConta());

                try {
                    MovimentacaoDAO.getInstance().persist(movimentacao);
                    status = ContaDAO.getInstance().merge(currentFrame.getConta());
                    
                    if (status) {
                        sucesso(currentFrame, sucessFrame);
                    } else {
                        erro(currentFrame, errorFrame);
                    }
                } catch (Exception e) {
                    erro(currentFrame, errorFrame);
                }
                
            } else {
                erro(currentFrame, errorFrame);
            }
        }
    }

    // Método que exibe o frame de sucesso
    public static void sucesso(FrameEfetuarDeposito currentFrame, FrameSucessoTransacao nextFrame) {
        currentFrame.setVisible(false); // Oculta o FrameEfetuarDeposito
        nextFrame.setVisible(true); // Exibe o FrameSucessoTransacao
    }

    // Método que exibe o frame de erro
    public static void erro(FrameEfetuarDeposito currentFrame, FrameErroTransacao nextFrame) {
        currentFrame.setVisible(false); // Oculta o FrameEfetuarDeposito
        nextFrame.setVisible(true); // Exibe o FrameErroTransacao
    }

    // Método que verifica se uma string possui valor numérico
    public static boolean isNumeric(String str) {
        try {
            double d = Double.parseDouble(str);
        } catch (NumberFormatException nfe) {
            return false;
        }

        return true;
    }

    // Método que exibe um alerta (mensagem) de erro
    public static void msgErro(String titulo, String msg) {
        JOptionPane.showMessageDialog(new JFrame(), msg, titulo, JOptionPane.ERROR_MESSAGE);
    }
}
