/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control.ATM;

import View.ATM.FrameConsultaSaldo;
import View.ATM.FrameEfetuarDeposito;
import View.ATM.FrameEfetuarSaque;
import View.ATM.FrameEfetuarTransferencia;
import View.ATM.FrameErroLeituraCartao;
import View.ATM.FrameErroTransacao;
import View.ATM.FrameLeituraCartao;
import View.ATM.FrameMenuOperacoes;
import View.ATM.FramePaginaConstruindo;
import View.ATM.FrameRetirarExtrato;
import View.ATM.FrameSucessoTransacao;

/**
 *
 * @author amiltonjunior
 */
public class ControlMenuPrincipal {
    
    public static void efetuarDeposito(FrameMenuOperacoes currentFrame, FrameEfetuarDeposito nextFrame) {
        currentFrame.setVisible(false); // Oculta o FrameMenuOperacoes
        nextFrame.setVisible(true); // Exibe o FrameEfetuarDeposito
        nextFrame.clearValor(); // Limpa o campo valor
        
        // Envia os dados da conta
        nextFrame.setConta(currentFrame.getConta());
    }
    
    public static void efetuarSaque(FrameMenuOperacoes currentFrame, FrameEfetuarSaque nextFrame) {
        currentFrame.setVisible(false); // Oculta o FrameMenuOperacoes
        nextFrame.setVisible(true); // Exibe o FrameEfetuarSaque
        nextFrame.clearValor(); // Limpa o campo valor
        
        // Envia os dados do cliente e da conta
        nextFrame.setConta(currentFrame.getConta());
    }
    
    public static void retirarExtrato(FrameMenuOperacoes currentFrame, FrameRetirarExtrato nextFrame) {
        currentFrame.setVisible(false); // Oculta o FrameMenuOperacoes
        nextFrame.setVisible(true); // Exibe o FrameRetirarExtrato
        
        // Envia os dados do cliente e da conta
        nextFrame.setConta(currentFrame.getConta());
        
        // Preenche com os dados
        nextFrame.iniciar();
    }
    
    public static void Transferir(FrameMenuOperacoes currentFrame, FrameEfetuarTransferencia nextFrame) {
        currentFrame.setVisible(false); // Oculta o FrameMenuOperacoes
        nextFrame.setVisible(true); // Exibe o FrameEfetuarTransferencia
    }
    
    public static void verSaldo(FrameMenuOperacoes currentFrame, FrameConsultaSaldo nextFrame) {
        currentFrame.setVisible(false); // Oculta o FrameMenuOperacoes
        nextFrame.setVisible(true); // Exibe o FrameConsultaSaldo
        
        // Envia os dados do cliente e da conta
        nextFrame.setConta(currentFrame.getConta());
        
        // Preenche com os dados
        nextFrame.iniciar();
    }
    
    public static void menuOutros(FrameMenuOperacoes currentFrame, FramePaginaConstruindo nextFrame) {
        currentFrame.setVisible(false); // Oculta o FrameMenuOperacoes
        nextFrame.setVisible(true); // Exibe o FramePaginaConstruindo
    }
    
    public static void cancelar(FrameMenuOperacoes currentFrame, FrameLeituraCartao parentFrame) {
        currentFrame.setVisible(false); // Oculta o FrameMenuPrincipal
        parentFrame.setVisible(true); // Exibe o FrameLeituraCartao
        parentFrame.recarregarClientes(); // Recarrega a lista de clientes
        //parentFrame.resetCliente(); // Desmarca a seleção prévia
    }
    
    public static void cancelar(FrameErroLeituraCartao currentFrame, FrameLeituraCartao parentFrame) {
        currentFrame.setVisible(false); // Oculta o FrameErroLeituraCartao
        parentFrame.setVisible(true); // Exibe o FrameLeituraCartao
        parentFrame.recarregarClientes(); // Recarrega a lista de clientes
//        parentFrame.resetCliente(); // Desmarca a seleção prévia
    }
    
    public static void cancelar(FrameConsultaSaldo currentFrame, FrameMenuOperacoes parentFrame) {
        currentFrame.setVisible(false); // Oculta o FrameConsultaSaldo
        parentFrame.setVisible(true); // Exibe o FrameMenuOperacoes
        parentFrame.getParentFrame().clearInstance();
        parentFrame.setConta(parentFrame.getParentFrame().getConta(0));
    }
    
    public static void cancelar(FrameEfetuarDeposito currentFrame, FrameMenuOperacoes parentFrame) {
        currentFrame.setVisible(false); // Oculta o FrameEfetuarDeposito
        parentFrame.setVisible(true); // Exibe o FrameMenuOperacoes
        parentFrame.getParentFrame().clearInstance();
        parentFrame.setConta(parentFrame.getParentFrame().getConta(0));
    }
    
    public static void cancelar(FrameEfetuarSaque currentFrame, FrameMenuOperacoes parentFrame) {
        currentFrame.setVisible(false); // Oculta o FrameEfetuarSaque
        parentFrame.setVisible(true); // Exibe o FrameMenuOperacoes
        parentFrame.getParentFrame().clearInstance();
        parentFrame.setConta(parentFrame.getParentFrame().getConta(0));
    }
    
    public static void cancelar(FrameEfetuarTransferencia currentFrame, FrameMenuOperacoes parentFrame) {
        currentFrame.setVisible(false); // Oculta o FrameEfetuarTransferencia
        parentFrame.setVisible(true); // Exibe o FrameMenuOperacoes
        parentFrame.getParentFrame().clearInstance();
        parentFrame.setConta(parentFrame.getParentFrame().getConta(0));
    }
    
    public static void cancelar(FrameRetirarExtrato currentFrame, FrameMenuOperacoes parentFrame) {
        currentFrame.setVisible(false); // Oculta o FrameRetirarExtrato
        parentFrame.setVisible(true); // Exibe o FrameMenuOperacoes
        parentFrame.getParentFrame().clearInstance();
        parentFrame.setConta(parentFrame.getParentFrame().getConta(0));
    }
    
    public static void cancelar(FramePaginaConstruindo currentFrame, FrameMenuOperacoes parentFrame) {
        currentFrame.setVisible(false); // Oculta o FramePaginaConstruindo
        parentFrame.setVisible(true); // Exibe o FrameMenuOperacoes
        parentFrame.getParentFrame().clearInstance();
        parentFrame.setConta(parentFrame.getParentFrame().getConta(0));
    }
    
    public static void cancelar(FrameSucessoTransacao currentFrame, FrameMenuOperacoes parentFrame) {
        currentFrame.setVisible(false); // Oculta o FrameSucessoTransacao
        parentFrame.setVisible(true); // Exibe o FrameMenuOperacoes
        parentFrame.getParentFrame().clearInstance();
        parentFrame.setConta(parentFrame.getParentFrame().getConta(0));
    }
    
    public static void cancelar(FrameErroTransacao currentFrame, FrameMenuOperacoes parentFrame) {
        currentFrame.setVisible(false); // Oculta o FrameErroTransacao
        parentFrame.setVisible(true); // Exibe o FrameMenuOperacoes
        parentFrame.getParentFrame().clearInstance();
        parentFrame.setConta(parentFrame.getParentFrame().getConta(0));
    }
    
}
