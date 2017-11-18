package Control.ATM;
import Entity.ATM.Conta;
import Entity.ATM.Movimentacao;
import View.ATM.FrameRetirarExtrato;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Document;
import com.itextpdf.text.Font;
import com.itextpdf.text.PageSize;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTable;

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
    public static void imprimir(JTable table, Conta conta) {
        // Exibe a opção para escolher onde salvar o extrato
        JFileChooser chooser = new JFileChooser(); 
        chooser.setCurrentDirectory(new java.io.File("."));
        chooser.setDialogTitle("Salvar o Extrato");
        chooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
        chooser.setAcceptAllFileFilterUsed(false);
        
        if (chooser.showSaveDialog(null) == JFileChooser.APPROVE_OPTION) { 
            String diretorio = chooser.getSelectedFile().toString();
            
            try {

                Font negrito = new Font(Font.FontFamily.HELVETICA, 13, Font.BOLD);
                
                Document doc = new Document(PageSize.A4);
                PdfWriter.getInstance(doc, new FileOutputStream(diretorio + "/Extrato.pdf"));
                doc.open();
                
                doc.addAuthor("Banco MoneyMaker");
                doc.addCreationDate();
                doc.addTitle("Extrato - Banco MoneyMaker");
                
                doc.add(new Paragraph(new Phrase("Banco MoneyMaker", negrito)));
                doc.add(new Paragraph(""));
                doc.add(new Phrase("Cliente: " + conta.getCliente().getNome() + " - CPF: " + conta.getCpfCliente(), negrito));
                doc.add(new Paragraph(""));
                doc.add(new Phrase("Agência: " + conta.getAgencia() + " - Conta: " + conta.getNumeroConta(), negrito));
                doc.add(new Paragraph(""));
                doc.add(new Phrase("Tipo: " + conta.getTipo() + " - Data de Abertura: " + conta.getDataAbertura(), negrito));
                doc.add(new Paragraph(" "));
                doc.add(new Paragraph(new Phrase("Extrato de Movimentação Bancária", negrito)));
                doc.add(new Paragraph(" "));
                
                PdfPTable pdfTable = new PdfPTable(table.getColumnCount());

                // Adiciona os cabeçalhos
                for (int i = 0; i < table.getColumnCount(); i++) {
                    pdfTable.addCell(new Phrase(table.getColumnName(i), negrito));
                }

                // Extrai os dados das tabelas
                for (int rows = 0; rows < table.getRowCount() - 1; rows++) {
                    for (int cols = 0; cols < table.getColumnCount(); cols++) {
                        pdfTable.addCell(table.getModel().getValueAt(rows, cols).toString());

                    }
                }
                doc.add(pdfTable);
                
                doc.close();
                
                JOptionPane.showMessageDialog(new JFrame(), "Extrato impresso em arquivo PDF com sucesso!", "Extrato", JOptionPane.INFORMATION_MESSAGE);

            } catch (DocumentException ex) {
                JOptionPane.showMessageDialog(new JFrame(), "Erro ao imprimir o relatorio!", "Erro", JOptionPane.ERROR_MESSAGE);

            } catch (FileNotFoundException ex) {
                JOptionPane.showMessageDialog(new JFrame(), "Erro ao imprimir o relatorio!", "Erro", JOptionPane.ERROR_MESSAGE);
            }
        }
            
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
