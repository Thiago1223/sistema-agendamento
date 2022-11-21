package br.senai.sp.jandira.ui;

import br.senai.sp.jandira.dao.EspecialidadeDao;
import br.senai.sp.jandira.model.Especialidade;
import br.senai.sp.jandira.model.OperacaoEnum;
import javax.swing.JOptionPane;

public class EspecialidadesDialog extends javax.swing.JDialog {
    
    private Especialidade especialidade;
    private OperacaoEnum operacao;

    public EspecialidadesDialog(
            java.awt.Frame parent,
            boolean modal,
            OperacaoEnum operacao) {
        
        super(parent, modal);
        initComponents();
        this.operacao = operacao;
        preencherTitulo();
    }
    
    public EspecialidadesDialog(
            java.awt.Frame parent,
            boolean modal,
            Especialidade e,
            OperacaoEnum operacao) {
        
        super(parent, modal);
        initComponents();
        
        especialidade = e;
        this.operacao = operacao;
        
        preencherFormulario();
        preencherTitulo();
        
    }
    
    private void preencherFormulario() {
        
        textFieldCodigo.setText(especialidade.getCodigo().toString());
        textFieldNomeDaEspecialidade.setText(especialidade.getNome());
        textFieldDescricaoDaEspecialidade.setText(especialidade.getDescricao());
        
    }
    
    private void preencherTitulo() {
        labelTitulo.setText("Especialidades - " + operacao);
        
        if (operacao == OperacaoEnum.EDITAR) {
            labelTitulo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/imagens/editar.png")));
        } else {
            labelTitulo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/imagens/adicionar.png")));
        }
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        labelTitulo = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        labelCodigo = new javax.swing.JLabel();
        textFieldCodigo = new javax.swing.JTextField();
        labelNomeDaEspecialidade = new javax.swing.JLabel();
        textFieldNomeDaEspecialidade = new javax.swing.JTextField();
        labelDescricaoDaEspecialidade = new javax.swing.JLabel();
        textFieldDescricaoDaEspecialidade = new javax.swing.JTextField();
        buttonCancelar = new javax.swing.JButton();
        buttonSalvar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(614, 506));
        setResizable(false);
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(51, 102, 255));
        jPanel1.setLayout(null);

        labelTitulo.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        labelTitulo.setForeground(new java.awt.Color(255, 255, 0));
        labelTitulo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/imagens/adicionar.png"))); // NOI18N
        labelTitulo.setText("Especialidades - ADICIONAR");
        jPanel1.add(labelTitulo);
        labelTitulo.setBounds(10, 20, 370, 32);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 614, 70);

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Detalhes da Especialidade:", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 18), new java.awt.Color(255, 0, 0))); // NOI18N
        jPanel2.setLayout(null);

        labelCodigo.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        labelCodigo.setForeground(new java.awt.Color(0, 0, 0));
        labelCodigo.setText("Código:");
        jPanel2.add(labelCodigo);
        labelCodigo.setBounds(31, 53, 65, 25);

        textFieldCodigo.setEditable(false);
        textFieldCodigo.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        textFieldCodigo.setForeground(new java.awt.Color(0, 0, 0));
        textFieldCodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textFieldCodigoActionPerformed(evt);
            }
        });
        jPanel2.add(textFieldCodigo);
        textFieldCodigo.setBounds(31, 84, 100, 35);

        labelNomeDaEspecialidade.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        labelNomeDaEspecialidade.setForeground(new java.awt.Color(0, 0, 0));
        labelNomeDaEspecialidade.setText("Nome da especialidade:");
        jPanel2.add(labelNomeDaEspecialidade);
        labelNomeDaEspecialidade.setBounds(31, 131, 202, 25);

        textFieldNomeDaEspecialidade.setBackground(new java.awt.Color(255, 255, 255));
        textFieldNomeDaEspecialidade.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        textFieldNomeDaEspecialidade.setForeground(new java.awt.Color(0, 0, 0));
        textFieldNomeDaEspecialidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textFieldNomeDaEspecialidadeActionPerformed(evt);
            }
        });
        jPanel2.add(textFieldNomeDaEspecialidade);
        textFieldNomeDaEspecialidade.setBounds(31, 162, 300, 35);

        labelDescricaoDaEspecialidade.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        labelDescricaoDaEspecialidade.setForeground(new java.awt.Color(0, 0, 0));
        labelDescricaoDaEspecialidade.setText("Descrição da especialidade:");
        jPanel2.add(labelDescricaoDaEspecialidade);
        labelDescricaoDaEspecialidade.setBounds(31, 209, 233, 25);

        textFieldDescricaoDaEspecialidade.setBackground(new java.awt.Color(255, 255, 255));
        textFieldDescricaoDaEspecialidade.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        textFieldDescricaoDaEspecialidade.setForeground(new java.awt.Color(0, 0, 0));
        textFieldDescricaoDaEspecialidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textFieldDescricaoDaEspecialidadeActionPerformed(evt);
            }
        });
        jPanel2.add(textFieldDescricaoDaEspecialidade);
        textFieldDescricaoDaEspecialidade.setBounds(31, 240, 450, 35);

        buttonCancelar.setBackground(new java.awt.Color(153, 153, 153));
        buttonCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/imagens/cancel32.png"))); // NOI18N
        buttonCancelar.setToolTipText("Cancelar");
        buttonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonCancelarActionPerformed(evt);
            }
        });
        jPanel2.add(buttonCancelar);
        buttonCancelar.setBounds(430, 293, 66, 60);

        buttonSalvar.setBackground(new java.awt.Color(153, 153, 153));
        buttonSalvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/imagens/disquete.png"))); // NOI18N
        buttonSalvar.setToolTipText("Salvar");
        buttonSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonSalvarActionPerformed(evt);
            }
        });
        jPanel2.add(buttonSalvar);
        buttonSalvar.setBounds(508, 293, 66, 60);

        getContentPane().add(jPanel2);
        jPanel2.setBounds(6, 88, 602, 380);

        setSize(new java.awt.Dimension(630, 514));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void textFieldDescricaoDaEspecialidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textFieldDescricaoDaEspecialidadeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textFieldDescricaoDaEspecialidadeActionPerformed

    private void textFieldCodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textFieldCodigoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textFieldCodigoActionPerformed

    private void textFieldNomeDaEspecialidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textFieldNomeDaEspecialidadeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textFieldNomeDaEspecialidadeActionPerformed

    private void buttonSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSalvarActionPerformed
        
        if (textFieldNomeDaEspecialidade.getText().isEmpty() == true) {
            JOptionPane.showMessageDialog(null, "O nome da especialidade é obrigatório!");
            textFieldNomeDaEspecialidade.requestFocus();
        } else if (textFieldDescricaoDaEspecialidade.getText().isEmpty() == true) {
            JOptionPane.showMessageDialog(null, "A descrição da especialidade é obrigatória!");
            textFieldDescricaoDaEspecialidade.requestFocus();
        } else if (operacao == OperacaoEnum.ADICIONAR) {
            adicionar();
        } else {
            editar();
        }
        
    }//GEN-LAST:event_buttonSalvarActionPerformed

    private void buttonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonCancelarActionPerformed
        dispose();
    }//GEN-LAST:event_buttonCancelarActionPerformed

    private void editar() {
        especialidade.setNome(textFieldNomeDaEspecialidade.getText());
        especialidade.setDescricao(textFieldDescricaoDaEspecialidade.getText());
        
        EspecialidadeDao.atualizar(especialidade);
        
        JOptionPane.showMessageDialog(
                null, 
                "Especialidade atualizada com sucesso!", 
                "Especialidades", 
                JOptionPane.INFORMATION_MESSAGE);
        
        dispose();
   }
    
    private void adicionar() {
        // Criar um objeto especialidade
        Especialidade novaEspecialidade = new Especialidade();
        novaEspecialidade.setNome(textFieldNomeDaEspecialidade.getText());
        novaEspecialidade.setDescricao(textFieldDescricaoDaEspecialidade.getText());
        
        // Gravar o objeto, através do Dao.
        EspecialidadeDao.gravar(novaEspecialidade);
        
        JOptionPane.showMessageDialog(
                this,
                "Especialidade gravada com sucesso!",
                "Especialidades",
                JOptionPane.INFORMATION_MESSAGE);
        
        dispose();
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonCancelar;
    private javax.swing.JButton buttonSalvar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel labelCodigo;
    private javax.swing.JLabel labelDescricaoDaEspecialidade;
    private javax.swing.JLabel labelNomeDaEspecialidade;
    private javax.swing.JLabel labelTitulo;
    private javax.swing.JTextField textFieldCodigo;
    private javax.swing.JTextField textFieldDescricaoDaEspecialidade;
    private javax.swing.JTextField textFieldNomeDaEspecialidade;
    // End of variables declaration//GEN-END:variables
}
