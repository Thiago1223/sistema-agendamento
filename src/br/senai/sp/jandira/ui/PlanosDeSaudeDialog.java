package br.senai.sp.jandira.ui;

import br.senai.sp.jandira.dao.PlanoDeSaudeDao;
import br.senai.sp.jandira.model.OperacaoEnum;
import br.senai.sp.jandira.model.PlanoDeSaude;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import javax.swing.JOptionPane;

public class PlanosDeSaudeDialog extends javax.swing.JDialog {
    
    private PlanoDeSaude planoDeSaude;
    private OperacaoEnum operacao;

    public PlanosDeSaudeDialog(
            java.awt.Frame parent, 
            boolean modal,
            OperacaoEnum operacao) {
        
        super(parent, modal);
        initComponents();
        this.operacao = operacao;
        preencherTitulo();
    }
    
    public PlanosDeSaudeDialog(
            java.awt.Frame parent, 
            boolean modal,
            PlanoDeSaude p,
            OperacaoEnum operacao) {
        
        super(parent, modal);
        initComponents();
        
        planoDeSaude = p;
        this.operacao = operacao;
        
        preencherFormulario();
        preencherTitulo();
        
    }
    
    private void preencherFormulario() {
        
        textFieldCodigo.setText(planoDeSaude.getCodigo().toString());
        textFieldOperadoraDoPlanoDeSaude.setText(planoDeSaude.getOperadora());
        textFieldCategoriaDoPlanoDeSaude.setText(planoDeSaude.getCategoria());
        textFieldNumeroDoPlanoDeSaude.setText(planoDeSaude.getNumero());
        textFieldValidadeDoPlanoDeSaude.setText(planoDeSaude.getValidade().format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
          
    }
    
    private void preencherTitulo() {
        labelTitulo.setText("Planos de Saúde - " + operacao);
        
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

        jPanel1.setBackground(new java.awt.Color(51, 102, 255));
        jPanel1.setLayout(null);

        labelTitulo.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        labelTitulo.setForeground(new java.awt.Color(255, 255, 0));
        labelTitulo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/imagens/adicionar.png"))); // NOI18N
        labelTitulo.setText("Especialidades - ADICIONAR");
        jPanel1.add(labelTitulo);
        labelTitulo.setBounds(10, 20, 400, 32);

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Detalhes do Plano de Saúde:", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 18), new java.awt.Color(255, 0, 0))); // NOI18N

        labelCodigo.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        labelCodigo.setForeground(new java.awt.Color(0, 0, 0));
        labelCodigo.setText("Código:");

        textFieldCodigo.setEditable(false);
        textFieldCodigo.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        textFieldCodigo.setForeground(new java.awt.Color(0, 0, 0));
        textFieldCodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textFieldCodigoActionPerformed(evt);
            }
        });

        labelOperadoraDoPlanoDeSaude.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        labelOperadoraDoPlanoDeSaude.setForeground(new java.awt.Color(0, 0, 0));
        labelOperadoraDoPlanoDeSaude.setText("Operadora do plano:");

        textFieldOperadoraDoPlanoDeSaude.setBackground(new java.awt.Color(255, 255, 255));
        textFieldOperadoraDoPlanoDeSaude.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        textFieldOperadoraDoPlanoDeSaude.setForeground(new java.awt.Color(0, 0, 0));
        textFieldOperadoraDoPlanoDeSaude.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textFieldOperadoraDoPlanoDeSaudeActionPerformed(evt);
            }
        });

        labelCategoriaDoPlanoDeSaude.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        labelCategoriaDoPlanoDeSaude.setForeground(new java.awt.Color(0, 0, 0));
        labelCategoriaDoPlanoDeSaude.setText("Categoria do plano:");

        textFieldCategoriaDoPlanoDeSaude.setBackground(new java.awt.Color(255, 255, 255));
        textFieldCategoriaDoPlanoDeSaude.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        textFieldCategoriaDoPlanoDeSaude.setForeground(new java.awt.Color(0, 0, 0));
        textFieldCategoriaDoPlanoDeSaude.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textFieldCategoriaDoPlanoDeSaudeActionPerformed(evt);
            }
        });

        labelNumeroDoPlanoDeSaude.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        labelNumeroDoPlanoDeSaude.setForeground(new java.awt.Color(0, 0, 0));
        labelNumeroDoPlanoDeSaude.setText("Número do plano:");

        textFieldNumeroDoPlanoDeSaude.setBackground(new java.awt.Color(255, 255, 255));
        textFieldNumeroDoPlanoDeSaude.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        textFieldNumeroDoPlanoDeSaude.setForeground(new java.awt.Color(0, 0, 0));
        textFieldNumeroDoPlanoDeSaude.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textFieldNumeroDoPlanoDeSaudeActionPerformed(evt);
            }
        });

        labelValidadeDoPlanoDeSaude.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        labelValidadeDoPlanoDeSaude.setForeground(new java.awt.Color(0, 0, 0));
        labelValidadeDoPlanoDeSaude.setText("Validade do plano:");

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

        buttonCancelar.setBackground(new java.awt.Color(153, 153, 153));
        buttonCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/imagens/cancel32.png"))); // NOI18N
        buttonCancelar.setToolTipText("Cancelar");
        buttonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonCancelarActionPerformed(evt);
            }
        });

        buttonSalvar.setBackground(new java.awt.Color(153, 153, 153));
        buttonSalvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/imagens/disquete.png"))); // NOI18N
        buttonSalvar.setToolTipText("Salvar");
        buttonSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonSalvarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(labelOperadoraDoPlanoDeSaude)
                            .addComponent(textFieldCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelCategoriaDoPlanoDeSaude)
                            .addComponent(labelCodigo)
                            .addComponent(textFieldCategoriaDoPlanoDeSaude, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                            .addComponent(textFieldOperadoraDoPlanoDeSaude)
                            .addComponent(textFieldNumeroDoPlanoDeSaude))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(73, 73, 73)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(textFieldValidadeDoPlanoDeSaude, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(labelValidadeDoPlanoDeSaude)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addGap(84, 84, 84)
                                .addComponent(buttonCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(buttonSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(labelNumeroDoPlanoDeSaude))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(labelCodigo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(textFieldCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelOperadoraDoPlanoDeSaude)
                    .addComponent(labelValidadeDoPlanoDeSaude))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(textFieldOperadoraDoPlanoDeSaude, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textFieldValidadeDoPlanoDeSaude, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelCategoriaDoPlanoDeSaude)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(textFieldCategoriaDoPlanoDeSaude, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(labelNumeroDoPlanoDeSaude)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(textFieldNumeroDoPlanoDeSaude, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 614, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 48, Short.MAX_VALUE))
        );

        setSize(new java.awt.Dimension(630, 514));
        setLocationRelativeTo(null);
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

    private void buttonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonCancelarActionPerformed
        dispose();
    }//GEN-LAST:event_buttonCancelarActionPerformed

    private void buttonSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSalvarActionPerformed
        
        CharSequence s = " ";
        
        if (textFieldOperadoraDoPlanoDeSaude.getText().isEmpty() == true) {
            JOptionPane.showMessageDialog(null, "A operadora do plano de saúde é obrigatória!");
            textFieldOperadoraDoPlanoDeSaude.requestFocus();
        } else if (textFieldCategoriaDoPlanoDeSaude.getText().isEmpty() == true) {
            JOptionPane.showMessageDialog(null, "A categoria do plano de saúde é obrigatória!");
            textFieldCategoriaDoPlanoDeSaude.requestFocus();
        } else if (textFieldNumeroDoPlanoDeSaude.getText().isEmpty() == true) {
            JOptionPane.showMessageDialog(null, "O número do plano de saúde é obrigatório!");
            textFieldNumeroDoPlanoDeSaude.requestFocus();
        } else if (textFieldValidadeDoPlanoDeSaude.getText().contains(s) == true) {
            JOptionPane.showMessageDialog(null, "A validade do plano de saúde é obrigatória!");
            textFieldValidadeDoPlanoDeSaude.requestFocus();
        } else if (operacao == OperacaoEnum.ADICIONAR) {
            adicionar();
        } else {
            editar();
        }     
    }//GEN-LAST:event_buttonSalvarActionPerformed

    private void textFieldNumeroDoPlanoDeSaudeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textFieldNumeroDoPlanoDeSaudeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textFieldNumeroDoPlanoDeSaudeActionPerformed

    private void textFieldValidadeDoPlanoDeSaudeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textFieldValidadeDoPlanoDeSaudeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textFieldValidadeDoPlanoDeSaudeActionPerformed

    private void editar() {
        planoDeSaude.setOperadora(textFieldOperadoraDoPlanoDeSaude.getText());
        planoDeSaude.setCategoria(textFieldCategoriaDoPlanoDeSaude.getText());
        planoDeSaude.setNumero(textFieldNumeroDoPlanoDeSaude.getText());
        planoDeSaude.setValidade(LocalDate.parse(textFieldValidadeDoPlanoDeSaude.getText(),DateTimeFormatter.ofPattern("dd/MM/yyyy")));
        
        PlanoDeSaudeDao.atualizar(planoDeSaude);
        
        JOptionPane.showMessageDialog(
                null, 
                "Plano de Saúde atualizado com sucesso!", 
                "Planos de Saúde", 
                JOptionPane.INFORMATION_MESSAGE);
        
        dispose();
   }
    
    private void adicionar() {
        // Criar um objeto especialidade
        PlanoDeSaude novoPlanoDeSaude = new PlanoDeSaude();
        novoPlanoDeSaude.setOperadora(textFieldOperadoraDoPlanoDeSaude.getText());
        novoPlanoDeSaude.setCategoria(textFieldCategoriaDoPlanoDeSaude.getText());
        novoPlanoDeSaude.setNumero(textFieldNumeroDoPlanoDeSaude.getText());
        novoPlanoDeSaude.setValidade(LocalDate.parse(textFieldValidadeDoPlanoDeSaude.getText(),DateTimeFormatter.ofPattern("dd/MM/yyyy")));
        
        // Gravar o objeto, através do Dao.
        PlanoDeSaudeDao.gravar(novoPlanoDeSaude);
        
        JOptionPane.showMessageDialog(
                this,
                "Plano de Saúde gravado com sucesso!",
                "Planos de Saúde",
                JOptionPane.INFORMATION_MESSAGE);
        
        dispose();
    }
    
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
