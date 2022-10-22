package br.senai.sp.jandira.ui;

import br.senai.sp.jandira.dao.PlanoDeSaudeDao;
import br.senai.sp.jandira.model.OperacaoEnum;
import br.senai.sp.jandira.model.PlanoDeSaude;
import javax.swing.JOptionPane;
import javax.swing.JTable;

public class PanelPlanoDeSaude extends javax.swing.JPanel {
    
    private int linha;

    public PanelPlanoDeSaude() {
        initComponents();
        PlanoDeSaudeDao.criarListaDePlanosDeSaude();
        preencherTabela();
    }
    
    private int getLinha() {
        linha = tablePlanosDeSaude.getSelectedRow();
        return linha;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        scrollPlanosDeSaude = new javax.swing.JScrollPane();
        tablePlanosDeSaude = new javax.swing.JTable();
        buttonExcluirPlanosDeSaude = new javax.swing.JButton();
        buttonEditarPlanosDeSaude = new javax.swing.JButton();
        buttonNovoPlanoDeSaude = new javax.swing.JButton();

        setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Lista de Planos de Saúde", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 18), new java.awt.Color(255, 0, 0))); // NOI18N
        setPreferredSize(new java.awt.Dimension(780, 350));
        setLayout(null);

        tablePlanosDeSaude.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        scrollPlanosDeSaude.setViewportView(tablePlanosDeSaude);

        add(scrollPlanosDeSaude);
        scrollPlanosDeSaude.setBounds(10, 30, 760, 250);

        buttonExcluirPlanosDeSaude.setBackground(new java.awt.Color(255, 0, 0));
        buttonExcluirPlanosDeSaude.setForeground(new java.awt.Color(255, 255, 255));
        buttonExcluirPlanosDeSaude.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/imagens/lixeira.png"))); // NOI18N
        buttonExcluirPlanosDeSaude.setToolTipText("Excluir a especialidade selecionada");
        buttonExcluirPlanosDeSaude.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonExcluirPlanosDeSaudeActionPerformed(evt);
            }
        });
        add(buttonExcluirPlanosDeSaude);
        buttonExcluirPlanosDeSaude.setBounds(510, 290, 80, 50);

        buttonEditarPlanosDeSaude.setBackground(new java.awt.Color(0, 204, 255));
        buttonEditarPlanosDeSaude.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/imagens/editar.png"))); // NOI18N
        buttonEditarPlanosDeSaude.setToolTipText(" Editar a especialidade selecionada");
        buttonEditarPlanosDeSaude.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonEditarPlanosDeSaudeActionPerformed(evt);
            }
        });
        add(buttonEditarPlanosDeSaude);
        buttonEditarPlanosDeSaude.setBounds(600, 290, 80, 50);

        buttonNovoPlanoDeSaude.setBackground(new java.awt.Color(51, 255, 0));
        buttonNovoPlanoDeSaude.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/imagens/adicionar.png"))); // NOI18N
        buttonNovoPlanoDeSaude.setToolTipText("Cadastrar nova especialidade");
        buttonNovoPlanoDeSaude.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonNovoPlanoDeSaudeActionPerformed(evt);
            }
        });
        add(buttonNovoPlanoDeSaude);
        buttonNovoPlanoDeSaude.setBounds(690, 290, 80, 50);
    }// </editor-fold>//GEN-END:initComponents

    private Integer getCodigo() {
        String codigoStr = tablePlanosDeSaude.getValueAt(getLinha(), 0).toString();
        Integer codigo = Integer.valueOf(codigoStr);
        return codigo;
    }
    
    private void buttonExcluirPlanosDeSaudeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonExcluirPlanosDeSaudeActionPerformed

        if (getLinha() != -1) {
            excluirPlanoDeSaude();
        } else {
            JOptionPane.showMessageDialog(
                    this,
                    "Por favor, selecione a especialidade que você deseja excluir!",
                    "Atenção",
                    JOptionPane.WARNING_MESSAGE);
        }
        
    }//GEN-LAST:event_buttonExcluirPlanosDeSaudeActionPerformed

    private void excluirPlanoDeSaude() {

        int resposta = JOptionPane.showConfirmDialog(
                this,
                "Você confirma a exclusão?",
                "Atenção!",
                JOptionPane.YES_NO_OPTION,
                JOptionPane.QUESTION_MESSAGE);

        if (resposta == 0) {
            PlanoDeSaudeDao.excluir(getCodigo());
            preencherTabela();
        }

    }
    
    private void buttonEditarPlanosDeSaudeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonEditarPlanosDeSaudeActionPerformed
        
        if (getLinha() != -1) {
            editarPlanoDeSaude();
        } else {
            JOptionPane.showConfirmDialog(
                    this, 
                    "Por Favor, selecione o plano de saúde que você deseja editar.", 
                    "Planos de Saúde", 
                    JOptionPane.WARNING_MESSAGE);
                    
        }
        
    }//GEN-LAST:event_buttonEditarPlanosDeSaudeActionPerformed

    private void editarPlanoDeSaude() {
        
        PlanoDeSaude planoDeSaude = PlanoDeSaudeDao.getPlanoDeSaude(getCodigo());
        
        PlanosDeSaudeDialog planoDeSaudeDialog =
                new PlanosDeSaudeDialog(
                        null, 
                        true, 
                        planoDeSaude, 
                        OperacaoEnum.EDITAR);

        planoDeSaudeDialog.setVisible(true);
        preencherTabela();
    }
    
    private void buttonNovoPlanoDeSaudeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonNovoPlanoDeSaudeActionPerformed
        PlanosDeSaudeDialog planoDeSaudeDialog =
                new PlanosDeSaudeDialog (
                        null, 
                        true, 
                        OperacaoEnum.ADICIONAR);

        planoDeSaudeDialog.setVisible(true);
        preencherTabela();
    }//GEN-LAST:event_buttonNovoPlanoDeSaudeActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonEditarPlanosDeSaude;
    private javax.swing.JButton buttonExcluirPlanosDeSaude;
    private javax.swing.JButton buttonNovoPlanoDeSaude;
    private javax.swing.JScrollPane scrollPlanosDeSaude;
    private javax.swing.JTable tablePlanosDeSaude;
    // End of variables declaration//GEN-END:variables

private void preencherTabela() {

        tablePlanosDeSaude.setModel(PlanoDeSaudeDao.getTabelaPlanoDeSaude());
        ajustarTabela();
        
    }

private void ajustarTabela() {

        //Impedir que o usuário movimente as colunas
        tablePlanosDeSaude.getTableHeader().setReorderingAllowed(false);

        //Bloquear a edição das células da tabela
        tablePlanosDeSaude.setDefaultEditor(Object.class, null);

        //Definir a largura das colunas
        tablePlanosDeSaude.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        tablePlanosDeSaude.getColumnModel().getColumn(0).setPreferredWidth(150);
        tablePlanosDeSaude.getColumnModel().getColumn(1).setPreferredWidth(190);
        tablePlanosDeSaude.getColumnModel().getColumn(2).setPreferredWidth(100);
        tablePlanosDeSaude.getColumnModel().getColumn(3).setPreferredWidth(150);
        tablePlanosDeSaude.getColumnModel().getColumn(4).setPreferredWidth(150);

    }

}
