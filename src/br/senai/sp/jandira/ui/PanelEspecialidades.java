package br.senai.sp.jandira.ui;

import br.senai.sp.jandira.dao.EspecialidadeDao;
import br.senai.sp.jandira.model.Especialidade;
import br.senai.sp.jandira.model.OperacaoEnum;
import javax.swing.JOptionPane;
import javax.swing.JTable;

public class PanelEspecialidades extends javax.swing.JPanel {

    private int linha;

    public PanelEspecialidades() {
        initComponents();
        EspecialidadeDao.criarListaDeEspecialidades();
        preencherTabela();
    }

    private int getLinha() {
        linha = tableEspecialidades.getSelectedRow();
        return linha;
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        scrollEspecialidades = new javax.swing.JScrollPane();
        tableEspecialidades = new javax.swing.JTable();
        buttonExcluirEspecialidades = new javax.swing.JButton();
        buttonEditarEspecialidades = new javax.swing.JButton();
        buttonNovaEspecialidade = new javax.swing.JButton();

        setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Lista de Especialidades", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 18), new java.awt.Color(255, 0, 0))); // NOI18N
        setPreferredSize(new java.awt.Dimension(780, 350));
        setLayout(null);

        tableEspecialidades.setModel(new javax.swing.table.DefaultTableModel(
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
        scrollEspecialidades.setViewportView(tableEspecialidades);

        add(scrollEspecialidades);
        scrollEspecialidades.setBounds(10, 30, 760, 250);

        buttonExcluirEspecialidades.setBackground(new java.awt.Color(255, 0, 0));
        buttonExcluirEspecialidades.setForeground(new java.awt.Color(255, 255, 255));
        buttonExcluirEspecialidades.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/imagens/lixeira.png"))); // NOI18N
        buttonExcluirEspecialidades.setToolTipText("Excluir a especialidade selecionada");
        buttonExcluirEspecialidades.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonExcluirEspecialidadesActionPerformed(evt);
            }
        });
        add(buttonExcluirEspecialidades);
        buttonExcluirEspecialidades.setBounds(510, 290, 80, 50);

        buttonEditarEspecialidades.setBackground(new java.awt.Color(0, 204, 255));
        buttonEditarEspecialidades.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/imagens/editar.png"))); // NOI18N
        buttonEditarEspecialidades.setToolTipText(" Editar a especialidade selecionada");
        buttonEditarEspecialidades.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonEditarEspecialidadesActionPerformed(evt);
            }
        });
        add(buttonEditarEspecialidades);
        buttonEditarEspecialidades.setBounds(600, 290, 80, 50);

        buttonNovaEspecialidade.setBackground(new java.awt.Color(51, 255, 0));
        buttonNovaEspecialidade.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/imagens/adicionar.png"))); // NOI18N
        buttonNovaEspecialidade.setToolTipText("Cadastrar nova especialidade");
        buttonNovaEspecialidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonNovaEspecialidadeActionPerformed(evt);
            }
        });
        add(buttonNovaEspecialidade);
        buttonNovaEspecialidade.setBounds(690, 290, 80, 50);
    }// </editor-fold>//GEN-END:initComponents

    private void buttonExcluirEspecialidadesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonExcluirEspecialidadesActionPerformed

        if (getLinha() != -1) {
            excluirEspecialidade();
        } else {
            JOptionPane.showMessageDialog(
                    this,
                    "Por favor, selecione a especialidade que você deseja excluir!",
                    "Atenção",
                    JOptionPane.WARNING_MESSAGE);
        }

    }//GEN-LAST:event_buttonExcluirEspecialidadesActionPerformed

    private void excluirEspecialidade() {

        int resposta = JOptionPane.showConfirmDialog(
                this,
                "Você confirma a exclusão?",
                "Atenção!",
                JOptionPane.YES_NO_OPTION,
                JOptionPane.QUESTION_MESSAGE);

        if (resposta == 0) {
            EspecialidadeDao.excluir(getCodigo());
            preencherTabela();
        }

    }
    
    private Integer getCodigo() {
        String codigoStr = tableEspecialidades.getValueAt(getLinha(), 0).toString();
        Integer codigo = Integer.valueOf(codigoStr);
        return codigo;
    }

    private void buttonNovaEspecialidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonNovaEspecialidadeActionPerformed
        EspecialidadesDialog especialidadeDialog =
                new EspecialidadesDialog(
                        null, 
                        true, 
                        OperacaoEnum.ADICIONAR);

        especialidadeDialog.setVisible(true);
        preencherTabela();

    }//GEN-LAST:event_buttonNovaEspecialidadeActionPerformed

    private void buttonEditarEspecialidadesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonEditarEspecialidadesActionPerformed

        if (getLinha() != -1) {
            editarEspecialidade();
        } else {
            JOptionPane.showConfirmDialog(
                    this, 
                    "Por Favor, selecione a especialidade que você deseja editar.", 
                    "Especialidades", 
                    JOptionPane.WARNING_MESSAGE);
                    
        }
        
    }//GEN-LAST:event_buttonEditarEspecialidadesActionPerformed

    private void editarEspecialidade() {
        
        Especialidade especialidade = EspecialidadeDao.getEspecialidade(getCodigo());
        
        EspecialidadesDialog especialidadeDialog =
                new EspecialidadesDialog(
                        null, 
                        true, 
                        especialidade, 
                        OperacaoEnum.EDITAR);

        especialidadeDialog.setVisible(true);
        preencherTabela();
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonEditarEspecialidades;
    private javax.swing.JButton buttonExcluirEspecialidades;
    private javax.swing.JButton buttonNovaEspecialidade;
    private javax.swing.JScrollPane scrollEspecialidades;
    private javax.swing.JTable tableEspecialidades;
    // End of variables declaration//GEN-END:variables

    private void preencherTabela() {

        tableEspecialidades.setModel(EspecialidadeDao.getTabelaEspecialidades());
        ajustarTabela();

    }

    private void ajustarTabela() {

        //Impedir que o usuário movimente as colunas
        tableEspecialidades.getTableHeader().setReorderingAllowed(false);

        //Bloquear a edição das células da tabela
        tableEspecialidades.setDefaultEditor(Object.class, null);

        //Definir a largura das colunas
        tableEspecialidades.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        tableEspecialidades.getColumnModel().getColumn(0).setPreferredWidth(100);
        tableEspecialidades.getColumnModel().getColumn(1).setPreferredWidth(190);
        tableEspecialidades.getColumnModel().getColumn(2).setPreferredWidth(450);

    }

}
