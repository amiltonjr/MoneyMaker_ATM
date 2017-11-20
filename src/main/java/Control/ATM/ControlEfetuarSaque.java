package Control.ATM;

import DAO.ATM.ContaDAO;
import DAO.ATM.MovimentacaoDAO;
import Entity.ATM.Movimentacao;
import Model.ATM.Sacar;
import Model.ATM.ValidaNumero;
import Util.ATM.GerarNumero;
import View.ATM.FrameEfetuarSaque;
import View.ATM.FrameErroTransacao;
import View.ATM.FrameSucessoTransacao;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class ControlEfetuarSaque {

    public static void efetuarSaque(FrameEfetuarSaque currentFrame, FrameSucessoTransacao sucessFrame, FrameErroTransacao errorFrame, String valor) {
        // Valida os dados
        valor = valor.replace(",", ".");
        if (!ValidaNumero.isNumeric(valor)) {
            msgErro("Erro", "Valor inválido!");
            currentFrame.focoValor();
        } else {
            // Converte para variável numérica
            double _valor = Double.parseDouble(valor);

            // Envia a solicitação para o pacote Model
            if (Sacar.sacar(currentFrame.getParentFrame().getConta(), _valor)) {

                double saldo = currentFrame.getParentFrame().getConta().getSaldo() - _valor;
                currentFrame.getParentFrame().getConta().setSaldo(saldo);

                Movimentacao movimentacao = new Movimentacao();

                DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
                Date date = new Date();
                movimentacao.setDatamov(dateFormat.format(date));

                movimentacao.setNumero(GerarNumero.get());
                movimentacao.setOperacao("SAQUE");
                movimentacao.setCpf(currentFrame.getParentFrame().getConta().getCliente().getCpf());
                movimentacao.setValor(String.format("%.2f", _valor));
                movimentacao.setSaldo(String.format("%.2f", saldo));

                currentFrame.getParentFrame().getConta().setSaldo(saldo);
                currentFrame.getParentFrame().getConta().addMovimentacao(movimentacao);

                // Atualiza no arquivo de dados
                boolean status = false;

                movimentacao.setConta(currentFrame.getParentFrame().getConta());

                try {
                    MovimentacaoDAO.getInstance().persist(movimentacao);
                    status = ContaDAO.getInstance().merge(currentFrame.getParentFrame().getConta());

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

    public static void sucesso(FrameEfetuarSaque currentFrame, FrameSucessoTransacao nextFrame) {
        currentFrame.setVisible(false); // Oculta o FrameEfetuarDeposito
        nextFrame.setVisible(true); // Exibe o FrameSucessoTransacao
    }

    public static void erro(FrameEfetuarSaque currentFrame, FrameErroTransacao nextFrame) {
        currentFrame.setVisible(false); // Oculta o FrameEfetuarDeposito
        nextFrame.setVisible(true); // Exibe o FrameErroTransacao
    }

    // Método que exibe um alerta (mensagem) de erro
    public static void msgErro(String titulo, String msg) {
        JOptionPane.showMessageDialog(new JFrame(), msg, titulo, JOptionPane.ERROR_MESSAGE);
    }

}
