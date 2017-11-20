/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control.ATM;

import Entity.ATM.Conta;
import View.ATM.FrameErroLeituraCartao;
import View.ATM.FrameLeituraCartao;
import View.ATM.FrameMenuOperacoes;

public class ControlLeituraCartao {
    
    public static void simularLeitura(FrameLeituraCartao currentFrame, FrameMenuOperacoes nextFrame, Conta conta) {
               
        // Verifica se a conta do cliente está bloqueada
        if (!conta.getStatus().equalsIgnoreCase("ativo")) {
            currentFrame.getErrorFrame().setContaBloqueada();
            simularErroLeitura(currentFrame, currentFrame.getErrorFrame());
        } else {
            nextFrame.setConta(conta); // Define a conta
            currentFrame.setVisible(false); // Oculta o FrameLeituraCartao
            nextFrame.setVisible(true); // Exibe o FrameMenuPrincipal
        }
    }
    
    public static void simularErroLeitura(FrameLeituraCartao currentFrame, FrameErroLeituraCartao errorFrame) {
        currentFrame.setVisible(false); // Oculta o FrameLeituraCartao
        errorFrame.setVisible(true); // Exibe o FrameErroLeituraCartao
        currentFrame.recarregarClientes(); // Recarrega a lista de clientes
    }
    
}
