package br.senai.sp.jandira.ui;

import br.senai.sp.jandira.dao.MedicoDao;
import br.senai.sp.jandira.model.OperacaoEnum;
import javax.swing.JOptionPane;
import javax.swing.JTable;

public class PanelMedico extends javax.swing.JPanel {
    
    private int linha;

    public PanelMedico() {
        initComponents();
        MedicoDao.criarListaDeMedicos();
        preencherTabela();
    }
    
    private int getLinha() {
        linha = tableMedicos.getSelectedRow();
        return linha;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        scrollMedicos = new javax.swing.JScrollPane();
        tableMedicos = new javax.swing.JTable();
        buttonExcluirMedicos = new javax.swing.JButton();
        buttonEditarMedicos = new javax.swing.JButton();
        buttonNovoMedico = new javax.swing.JButton();

        setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Lista de Médicos", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 18), new java.awt.Color(255, 0, 0))); // NOI18N
        setPreferredSize(new java.awt.Dimension(780, 350));
        setLayout(null);

        tableMedicos.setModel(new javax.swing.table.DefaultTableModel(
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
        scrollMedicos.setViewportView(tableMedicos);

        add(scrollMedicos);
        scrollMedicos.setBounds(10, 30, 760, 250);

        buttonExcluirMedicos.setBackground(new java.awt.Color(255, 0, 0));
        buttonExcluirMedicos.setForeground(new java.awt.Color(255, 255, 255));
        buttonExcluirMedicos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/imagens/lixeira.png"))); // NOI18N
        buttonExcluirMedicos.setToolTipText("Excluir a especialidade selecionada");
        buttonExcluirMedicos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonExcluirMedicosActionPerformed(evt);
            }
        });
        add(buttonExcluirMedicos);
        buttonExcluirMedicos.setBounds(510, 290, 80, 50);

        buttonEditarMedicos.setBackground(new java.awt.Color(0, 204, 255));
        buttonEditarMedicos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/imagens/editar.png"))); // NOI18N
        buttonEditarMedicos.setToolTipText(" Editar a especialidade selecionada");
        buttonEditarMedicos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonEditarMedicosActionPerformed(evt);
            }
        });
        add(buttonEditarMedicos);
        buttonEditarMedicos.setBounds(600, 290, 80, 50);

        buttonNovoMedico.setBackground(new java.awt.Color(51, 255, 0));
        buttonNovoMedico.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/imagens/adicionar.png"))); // NOI18N
        buttonNovoMedico.setToolTipText("Cadastrar nova especialidade");
        buttonNovoMedico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonNovoMedicoActionPerformed(evt);
            }
        });
        add(buttonNovoMedico);
        buttonNovoMedico.setBounds(690, 290, 80, 50);
    }// </editor-fold>//GEN-END:initComponents

    private void buttonExcluirMedicosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonExcluirMedicosActionPerformed

        if (getLinha() != -1) {
            excluirMedico();
        } else {
            JOptionPane.showMessageDialog(
                this,
                "Por favor, selecione o médico que você deseja excluir!",
                "Atenção",
                JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_buttonExcluirMedicosActionPerformed

    private void excluirMedico() {

        int resposta = JOptionPane.showConfirmDialog(
                this,
                "Você confirma a exclusão?",
                "Atenção!",
                JOptionPane.YES_NO_OPTION,
                JOptionPane.QUESTION_MESSAGE);

        if (resposta == 0) {
            MedicoDao.excluir(getCodigo());
            preencherTabela();
        }

    }
    
    private Integer getCodigo() {
        String codigoStr = tableMedicos.getValueAt(getLinha(), 0).toString();
        Integer codigo = Integer.valueOf(codigoStr);
        return codigo;
    }
    
    private void buttonEditarMedicosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonEditarMedicosActionPerformed

        if (getLinha() != -1) {
//            editarMedico();
        } else {
            JOptionPane.showMessageDialog(
                this,
                "Por Favor, selecione o médico que você deseja editar.",
                "Especialidades",
                JOptionPane.WARNING_MESSAGE);

        }

    }//GEN-LAST:event_buttonEditarMedicosActionPerformed

    private void buttonNovoMedicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonNovoMedicoActionPerformed

    }//GEN-LAST:event_buttonNovoMedicoActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonEditarMedicos;
    private javax.swing.JButton buttonExcluirMedicos;
    private javax.swing.JButton buttonNovoMedico;
    private javax.swing.JScrollPane scrollMedicos;
    private javax.swing.JTable tableMedicos;
    // End of variables declaration//GEN-END:variables

private void preencherTabela() {

        tableMedicos.setModel(MedicoDao.getTabelaMedico());
        ajustarTabela();

    }

private void ajustarTabela() {

        //Impedir que o usuário movimente as colunas
        tableMedicos.getTableHeader().setReorderingAllowed(false);

        //Bloquear a edição das células da tabela
        tableMedicos.setDefaultEditor(Object.class, null);

        //Definir a largura das colunas
        tableMedicos.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        tableMedicos.getColumnModel().getColumn(0).setPreferredWidth(180);
        tableMedicos.getColumnModel().getColumn(1).setPreferredWidth(160);
        tableMedicos.getColumnModel().getColumn(2).setPreferredWidth(200);
        tableMedicos.getColumnModel().getColumn(3).setPreferredWidth(200);

    }
    
}
