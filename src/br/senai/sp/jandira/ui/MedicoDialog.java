package br.senai.sp.jandira.ui;

public class MedicoDialog extends javax.swing.JDialog {

    public MedicoDialog(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        labelTitulo = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        labelCodigo = new javax.swing.JLabel();
        textFieldCodigo = new javax.swing.JTextField();
        labelOperadoraDoPlanoDeSaude = new javax.swing.JLabel();
        textFieldOperadoraDoPlanoDeSaude = new javax.swing.JTextField();
        labelCategoriaDoPlanoDeSaude = new javax.swing.JLabel();
        textFieldCategoriaDoPlanoDeSaude = new javax.swing.JTextField();
        labelNumeroDoPlanoDeSaude = new javax.swing.JLabel();
        textFieldNumeroDoPlanoDeSaude = new javax.swing.JTextField();
        labelValidadeDoPlanoDeSaude = new javax.swing.JLabel();
        textFieldValidadeDoPlanoDeSaude = new javax.swing.JFormattedTextField();
        buttonCancelar = new javax.swing.JButton();
        buttonSalvar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
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
        jPanel1.setBounds(0, 0, 770, 70);

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Detalhes do Plano de Saúde:", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 18), new java.awt.Color(255, 0, 0))); // NOI18N
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

        labelOperadoraDoPlanoDeSaude.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        labelOperadoraDoPlanoDeSaude.setForeground(new java.awt.Color(0, 0, 0));
        labelOperadoraDoPlanoDeSaude.setText("CRM:");
        jPanel2.add(labelOperadoraDoPlanoDeSaude);
        labelOperadoraDoPlanoDeSaude.setBounds(160, 50, 50, 25);

        textFieldOperadoraDoPlanoDeSaude.setBackground(new java.awt.Color(255, 255, 255));
        textFieldOperadoraDoPlanoDeSaude.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        textFieldOperadoraDoPlanoDeSaude.setForeground(new java.awt.Color(0, 0, 0));
        textFieldOperadoraDoPlanoDeSaude.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textFieldOperadoraDoPlanoDeSaudeActionPerformed(evt);
            }
        });
        jPanel2.add(textFieldOperadoraDoPlanoDeSaude);
        textFieldOperadoraDoPlanoDeSaude.setBounds(160, 80, 200, 35);

        labelCategoriaDoPlanoDeSaude.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        labelCategoriaDoPlanoDeSaude.setForeground(new java.awt.Color(0, 0, 0));
        labelCategoriaDoPlanoDeSaude.setText("Categoria do plano:");
        jPanel2.add(labelCategoriaDoPlanoDeSaude);
        labelCategoriaDoPlanoDeSaude.setBounds(31, 197, 167, 25);

        textFieldCategoriaDoPlanoDeSaude.setBackground(new java.awt.Color(255, 255, 255));
        textFieldCategoriaDoPlanoDeSaude.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        textFieldCategoriaDoPlanoDeSaude.setForeground(new java.awt.Color(0, 0, 0));
        textFieldCategoriaDoPlanoDeSaude.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textFieldCategoriaDoPlanoDeSaudeActionPerformed(evt);
            }
        });
        jPanel2.add(textFieldCategoriaDoPlanoDeSaude);
        textFieldCategoriaDoPlanoDeSaude.setBounds(31, 228, 200, 35);

        labelNumeroDoPlanoDeSaude.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        labelNumeroDoPlanoDeSaude.setForeground(new java.awt.Color(0, 0, 0));
        labelNumeroDoPlanoDeSaude.setText("Número do plano:");
        jPanel2.add(labelNumeroDoPlanoDeSaude);
        labelNumeroDoPlanoDeSaude.setBounds(31, 268, 154, 25);

        textFieldNumeroDoPlanoDeSaude.setBackground(new java.awt.Color(255, 255, 255));
        textFieldNumeroDoPlanoDeSaude.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        textFieldNumeroDoPlanoDeSaude.setForeground(new java.awt.Color(0, 0, 0));
        textFieldNumeroDoPlanoDeSaude.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textFieldNumeroDoPlanoDeSaudeActionPerformed(evt);
            }
        });
        jPanel2.add(textFieldNumeroDoPlanoDeSaude);
        textFieldNumeroDoPlanoDeSaude.setBounds(31, 299, 200, 35);

        labelValidadeDoPlanoDeSaude.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        labelValidadeDoPlanoDeSaude.setForeground(new java.awt.Color(0, 0, 0));
        labelValidadeDoPlanoDeSaude.setText("Validade do plano:");
        jPanel2.add(labelValidadeDoPlanoDeSaude);
        labelValidadeDoPlanoDeSaude.setBounds(304, 125, 159, 25);

        textFieldValidadeDoPlanoDeSaude.setBackground(new java.awt.Color(255, 255, 255));
        textFieldValidadeDoPlanoDeSaude.setForeground(new java.awt.Color(0, 0, 0));
        textFieldValidadeDoPlanoDeSaude.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        textFieldValidadeDoPlanoDeSaude.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textFieldValidadeDoPlanoDeSaudeActionPerformed(evt);
            }
        });
        try {
            textFieldValidadeDoPlanoDeSaude.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jPanel2.add(textFieldValidadeDoPlanoDeSaude);
        textFieldValidadeDoPlanoDeSaude.setBounds(304, 156, 200, 35);

        buttonCancelar.setBackground(new java.awt.Color(153, 153, 153));
        buttonCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/imagens/cancel32.png"))); // NOI18N
        buttonCancelar.setToolTipText("Cancelar");
        buttonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonCancelarActionPerformed(evt);
            }
        });
        jPanel2.add(buttonCancelar);
        buttonCancelar.setBounds(438, 299, 66, 60);

        buttonSalvar.setBackground(new java.awt.Color(153, 153, 153));
        buttonSalvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/imagens/disquete.png"))); // NOI18N
        buttonSalvar.setToolTipText("Salvar");
        buttonSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonSalvarActionPerformed(evt);
            }
        });
        jPanel2.add(buttonSalvar);
        buttonSalvar.setBounds(510, 299, 66, 60);

        getContentPane().add(jPanel2);
        jPanel2.setBounds(6, 88, 600, 380);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void textFieldCodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textFieldCodigoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textFieldCodigoActionPerformed

    private void textFieldOperadoraDoPlanoDeSaudeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textFieldOperadoraDoPlanoDeSaudeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textFieldOperadoraDoPlanoDeSaudeActionPerformed

    private void textFieldCategoriaDoPlanoDeSaudeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textFieldCategoriaDoPlanoDeSaudeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textFieldCategoriaDoPlanoDeSaudeActionPerformed

    private void textFieldNumeroDoPlanoDeSaudeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textFieldNumeroDoPlanoDeSaudeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textFieldNumeroDoPlanoDeSaudeActionPerformed

    private void textFieldValidadeDoPlanoDeSaudeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textFieldValidadeDoPlanoDeSaudeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textFieldValidadeDoPlanoDeSaudeActionPerformed

    private void buttonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonCancelarActionPerformed
        dispose();
    }//GEN-LAST:event_buttonCancelarActionPerformed

    private void buttonSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSalvarActionPerformed

    }//GEN-LAST:event_buttonSalvarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonCancelar;
    private javax.swing.JButton buttonSalvar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel labelCategoriaDoPlanoDeSaude;
    private javax.swing.JLabel labelCodigo;
    private javax.swing.JLabel labelNumeroDoPlanoDeSaude;
    private javax.swing.JLabel labelOperadoraDoPlanoDeSaude;
    private javax.swing.JLabel labelTitulo;
    private javax.swing.JLabel labelValidadeDoPlanoDeSaude;
    private javax.swing.JTextField textFieldCategoriaDoPlanoDeSaude;
    private javax.swing.JTextField textFieldCodigo;
    private javax.swing.JTextField textFieldNumeroDoPlanoDeSaude;
    private javax.swing.JTextField textFieldOperadoraDoPlanoDeSaude;
    private javax.swing.JFormattedTextField textFieldValidadeDoPlanoDeSaude;
    // End of variables declaration//GEN-END:variables
}
