package Control.ATM;

import DAO.ATM.ContaDAO;
import DAO.ATM.MovimentacaoDAO;
import Entity.ATM.Conta;
import Entity.ATM.Movimentacao;
import Model.ATM.Transferir;
import Model.ATM.ValidaNumero;
import Util.ATM.GerarNumero;
import View.ATM.FrameEfetuarTransferencia;
import View.ATM.FrameErroTransacao;
import View.ATM.FrameSucessoTransacao;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class ControlEfetuarTransferencia {

    public static void efetuarTransferencia(FrameEfetuarTransferencia currentFrame, FrameSucessoTransacao sucessFrame, FrameErroTransacao errorFrame, String valor, String agencia, String conta) {
        // Valida os dados
        valor = valor.replace(",", ".");
        if (!ValidaNumero.isNumeric(valor)) {
            msgErro("Erro", "Valor inválido!");
            currentFrame.focoValor();
        } else if (!ValidaNumero.isNumeric(agencia)) {
            msgErro("Erro", "Agência inválida!");
            currentFrame.focoAgencia();
        } else if (!ValidaNumero.isNumeric(conta)) {
            msgErro("Erro", "Conta inválida!");
            currentFrame.focoConta();
        } else {
            // Converte para variável numérica
            double _valor = Double.parseDouble(valor);
            
            // Obtém a conta destino
            Conta destino = null;
            
            List<Conta> todasContas = ContaDAO.getInstance().findAll();
            for (int i=0; i<todasContas.size(); i++) {
                if (todasContas.get(i).getAgencia().equals(agencia) && todasContas.get(i).getNumeroConta().equals(conta)) {
                    destino = todasContas.get(i);
                    break;
                }
            }

            // Envia a solicitação para o pacote Model
            if (Transferir.transferir(currentFrame.getParentFrame().getConta(), destino, _valor)) {
                
                // Debita na conta de origem
                double saldoOrigem = currentFrame.getParentFrame().getConta().getSaldo() - _valor;
                currentFrame.getParentFrame().getConta().setSaldo(saldoOrigem);
                
                // Credita na conta de destino
                double saldoDestino = destino.getSaldo() + _valor;
                destino.setSaldo(saldoDestino);

                DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
                Date date = new Date();
                
                // Na conta de origem
                Movimentacao movimentacao1 = new Movimentacao();
                movimentacao1.setDatamov(dateFormat.format(date));
                movimentacao1.setNumero(GerarNumero.get());
                movimentacao1.setOperacao("TRANSF-DEB");
                movimentacao1.setCpf(currentFrame.getParentFrame().getConta().getCliente().getCpf());
                movimentacao1.setValor(String.format("%.2f", _valor));
                movimentacao1.setSaldo(String.format("%.2f", saldoOrigem));
                currentFrame.getParentFrame().getConta().addMovimentacao(movimentacao1);
                
                // Na conta de destino
                Movimentacao movimentacao2 = new Movimentacao();
                movimentacao2.setDatamov(dateFormat.format(date));
                movimentacao2.setNumero(GerarNumero.get());
                movimentacao2.setOperacao("TRANSF-CRED");
                movimentacao2.setCpf(destino.getCliente().getCpf());
                movimentacao2.setValor(String.format("%.2f", _valor));
                movimentacao2.setSaldo(String.format("%.2f", saldoDestino));
                destino.addMovimentacao(movimentacao2);

                // Atualiza no banco de dados
                boolean status1 = false;
                boolean status2 = false;

                movimentacao1.setConta(currentFrame.getParentFrame().getConta());
                movimentacao2.setConta(destino);

                try {
                    MovimentacaoDAO.getInstance().persist(movimentacao1);
                    MovimentacaoDAO.getInstance().persist(movimentacao2);
                    status1 = ContaDAO.getInstance().merge(currentFrame.getParentFrame().getConta());
                    status2 = ContaDAO.getInstance().merge(destino);
                    
                    if (status1 && status2) {
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

    public static void sucesso(FrameEfetuarTransferencia currentFrame, FrameSucessoTransacao nextFrame) {
        currentFrame.setVisible(false); // Oculta o FrameEfetuarDeposito
        nextFrame.setVisible(true); // Exibe o FrameSucessoTransacao
    }

    public static void erro(FrameEfetuarTransferencia currentFrame, FrameErroTransacao nextFrame) {
        currentFrame.setVisible(false); // Oculta o FrameEfetuarDeposito
        nextFrame.setVisible(true); // Exibe o FrameErroTransacao
    }

    // Método que exibe um alerta (mensagem) de erro
    public static void msgErro(String titulo, String msg) {
        JOptionPane.showMessageDialog(new JFrame(), msg, titulo, JOptionPane.ERROR_MESSAGE);
    }

}
