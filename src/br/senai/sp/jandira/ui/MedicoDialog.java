package br.senai.sp.jandira.ui;

import br.senai.sp.jandira.dao.MedicoDao;
import br.senai.sp.jandira.model.Medico;
import br.senai.sp.jandira.model.OperacaoEnum;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import javax.swing.JOptionPane;

public class MedicoDialog extends javax.swing.JDialog {
    
    private Medico medico;
    private OperacaoEnum operacao;

    public MedicoDialog(
            java.awt.Frame parent, 
            boolean modal,
            OperacaoEnum operacao) {
        
        super(parent, modal);
        initComponents();
        this.operacao = operacao;
        preencherTitulo();
    }
    
    public MedicoDialog(
            java.awt.Frame parent, 
            boolean modal,
            Medico m,
            OperacaoEnum operacao) {
        
        super(parent, modal);
        initComponents();
        
        medico = m;
        this.operacao = operacao;
        
        preencherFormulario();
        preencherTitulo();

    }
    
    private void preencherFormulario() {
        textFieldCodigo.setText(medico.getCodigo().toString());
        textFieldCrm.setText(medico.getCrm());
        textFieldNomeDoMedico.setText(medico.getNome());
        textFieldTelefone.setText(medico.getTelefone());
        textFieldEmail.setText(medico.getEmail());
        textFieldDataDeNascimento.setText(medico.getDataDeNascimento().format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
    }
    
    private void preencherTitulo() {
        labelTitulo.setText("Médicos - " + operacao);
        
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
        labelCrm = new javax.swing.JLabel();
        textFieldCrm = new javax.swing.JTextField();
        labelNomeDoMedico = new javax.swing.JLabel();
        textFieldNomeDoMedico = new javax.swing.JTextField();
        labelTelefone = new javax.swing.JLabel();
        textFieldTelefone = new javax.swing.JTextField();
        labelEmail = new javax.swing.JLabel();
        textFieldEmail = new javax.swing.JTextField();
        labelDataDeNascimento = new javax.swing.JLabel();
        textFieldDataDeNascimento = new javax.swing.JFormattedTextField();
        labelEspecialidades = new javax.swing.JLabel();
        scrollEspecialidades = new javax.swing.JScrollPane();
        listEspecialidades = new javax.swing.JList<>();
        labelEspecialidadesDoMedico = new javax.swing.JLabel();
        buttonPassarPraDireita = new javax.swing.JButton();
        buttonPassarPraEsquerda = new javax.swing.JButton();
        scrollEspecialidadesDoMedico = new javax.swing.JScrollPane();
        listEspecialidadesDoMedico = new javax.swing.JList<>();
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
        jPanel1.setBounds(0, 0, 820, 70);

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Detalhes do Plano de Saúde:", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 18), new java.awt.Color(255, 0, 0))); // NOI18N
        jPanel2.setLayout(null);

        labelCodigo.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        labelCodigo.setForeground(new java.awt.Color(0, 0, 0));
        labelCodigo.setText("Código:");
        jPanel2.add(labelCodigo);
        labelCodigo.setBounds(30, 50, 65, 25);

        textFieldCodigo.setEditable(false);
        textFieldCodigo.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        textFieldCodigo.setForeground(new java.awt.Color(0, 0, 0));
        textFieldCodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textFieldCodigoActionPerformed(evt);
            }
        });
        jPanel2.add(textFieldCodigo);
        textFieldCodigo.setBounds(30, 80, 100, 35);

        labelCrm.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        labelCrm.setForeground(new java.awt.Color(0, 0, 0));
        labelCrm.setText("CRM:");
        jPanel2.add(labelCrm);
        labelCrm.setBounds(160, 50, 50, 25);

        textFieldCrm.setBackground(new java.awt.Color(255, 255, 255));
        textFieldCrm.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        textFieldCrm.setForeground(new java.awt.Color(0, 0, 0));
        textFieldCrm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textFieldCrmActionPerformed(evt);
            }
        });
        jPanel2.add(textFieldCrm);
        textFieldCrm.setBounds(160, 80, 200, 35);

        labelNomeDoMedico.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        labelNomeDoMedico.setForeground(new java.awt.Color(0, 0, 0));
        labelNomeDoMedico.setText("Nome do(a) médico(a):");
        jPanel2.add(labelNomeDoMedico);
        labelNomeDoMedico.setBounds(390, 50, 200, 25);

        textFieldNomeDoMedico.setBackground(new java.awt.Color(255, 255, 255));
        textFieldNomeDoMedico.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        textFieldNomeDoMedico.setForeground(new java.awt.Color(0, 0, 0));
        textFieldNomeDoMedico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textFieldNomeDoMedicoActionPerformed(evt);
            }
        });
        jPanel2.add(textFieldNomeDoMedico);
        textFieldNomeDoMedico.setBounds(390, 80, 370, 35);

        labelTelefone.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        labelTelefone.setForeground(new java.awt.Color(0, 0, 0));
        labelTelefone.setText("Telefone:");
        jPanel2.add(labelTelefone);
        labelTelefone.setBounds(30, 130, 90, 25);

        textFieldTelefone.setBackground(new java.awt.Color(255, 255, 255));
        textFieldTelefone.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        textFieldTelefone.setForeground(new java.awt.Color(0, 0, 0));
        textFieldTelefone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textFieldTelefoneActionPerformed(evt);
            }
        });
        jPanel2.add(textFieldTelefone);
        textFieldTelefone.setBounds(30, 160, 200, 35);

        labelEmail.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        labelEmail.setForeground(new java.awt.Color(0, 0, 0));
        labelEmail.setText("E-mail:");
        jPanel2.add(labelEmail);
        labelEmail.setBounds(260, 130, 60, 25);

        textFieldEmail.setBackground(new java.awt.Color(255, 255, 255));
        textFieldEmail.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        textFieldEmail.setForeground(new java.awt.Color(0, 0, 0));
        textFieldEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textFieldEmailActionPerformed(evt);
            }
        });
        jPanel2.add(textFieldEmail);
        textFieldEmail.setBounds(260, 160, 280, 35);

        labelDataDeNascimento.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        labelDataDeNascimento.setForeground(new java.awt.Color(0, 0, 0));
        labelDataDeNascimento.setText("Data de Nascimento:");
        jPanel2.add(labelDataDeNascimento);
        labelDataDeNascimento.setBounds(570, 130, 180, 25);

        textFieldDataDeNascimento.setBackground(new java.awt.Color(255, 255, 255));
        textFieldDataDeNascimento.setForeground(new java.awt.Color(0, 0, 0));
        textFieldDataDeNascimento.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        textFieldDataDeNascimento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textFieldDataDeNascimentoActionPerformed(evt);
            }
        });
        try {
            textFieldDataDeNascimento.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jPanel2.add(textFieldDataDeNascimento);
        textFieldDataDeNascimento.setBounds(570, 160, 190, 35);

        labelEspecialidades.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        labelEspecialidades.setForeground(new java.awt.Color(0, 0, 0));
        labelEspecialidades.setText("Lista de especialidades:");
        jPanel2.add(labelEspecialidades);
        labelEspecialidades.setBounds(30, 210, 200, 25);

        listEspecialidades.setBackground(new java.awt.Color(255, 255, 255));
        listEspecialidades.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        listEspecialidades.setForeground(new java.awt.Color(0, 0, 0));
        listEspecialidades.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        scrollEspecialidades.setViewportView(listEspecialidades);

        jPanel2.add(scrollEspecialidades);
        scrollEspecialidades.setBounds(30, 240, 200, 170);

        labelEspecialidadesDoMedico.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        labelEspecialidadesDoMedico.setForeground(new java.awt.Color(0, 0, 0));
        labelEspecialidadesDoMedico.setText("Especialidades do médico:");
        jPanel2.add(labelEspecialidadesDoMedico);
        labelEspecialidadesDoMedico.setBounds(340, 210, 230, 25);

        buttonPassarPraDireita.setBackground(new java.awt.Color(0, 153, 0));
        buttonPassarPraDireita.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/imagens/seta-direita.png"))); // NOI18N
        jPanel2.add(buttonPassarPraDireita);
        buttonPassarPraDireita.setBounds(250, 260, 70, 50);

        buttonPassarPraEsquerda.setBackground(new java.awt.Color(255, 0, 0));
        buttonPassarPraEsquerda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/imagens/seta-esquerda.png"))); // NOI18N
        jPanel2.add(buttonPassarPraEsquerda);
        buttonPassarPraEsquerda.setBounds(250, 340, 70, 50);

        listEspecialidadesDoMedico.setBackground(new java.awt.Color(255, 255, 255));
        listEspecialidadesDoMedico.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        listEspecialidadesDoMedico.setForeground(new java.awt.Color(0, 0, 0));
        listEspecialidadesDoMedico.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        scrollEspecialidadesDoMedico.setViewportView(listEspecialidadesDoMedico);

        jPanel2.add(scrollEspecialidadesDoMedico);
        scrollEspecialidadesDoMedico.setBounds(340, 240, 220, 170);

        getContentPane().add(jPanel2);
        jPanel2.setBounds(16, 88, 790, 440);

        buttonCancelar.setBackground(new java.awt.Color(153, 153, 153));
        buttonCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/imagens/cancel32.png"))); // NOI18N
        buttonCancelar.setToolTipText("Cancelar");
        buttonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonCancelarActionPerformed(evt);
            }
        });
        getContentPane().add(buttonCancelar);
        buttonCancelar.setBounds(566, 540, 100, 60);

        buttonSalvar.setBackground(new java.awt.Color(153, 153, 153));
        buttonSalvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/imagens/disquete.png"))); // NOI18N
        buttonSalvar.setToolTipText("Salvar");
        buttonSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonSalvarActionPerformed(evt);
            }
        });
        getContentPane().add(buttonSalvar);
        buttonSalvar.setBounds(690, 540, 100, 60);

        setSize(new java.awt.Dimension(836, 651));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void textFieldCodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textFieldCodigoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textFieldCodigoActionPerformed

    private void textFieldNomeDoMedicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textFieldNomeDoMedicoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textFieldNomeDoMedicoActionPerformed

    private void textFieldTelefoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textFieldTelefoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textFieldTelefoneActionPerformed

    private void textFieldEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textFieldEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textFieldEmailActionPerformed

    private void textFieldDataDeNascimentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textFieldDataDeNascimentoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textFieldDataDeNascimentoActionPerformed

    private void buttonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonCancelarActionPerformed
        dispose();
    }//GEN-LAST:event_buttonCancelarActionPerformed

    private void buttonSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSalvarActionPerformed

        CharSequence s = " ";
        
        if (textFieldCrm.getText().isEmpty() == true) {
            JOptionPane.showMessageDialog(null, "O crm do médico é obrigatório!");
            textFieldCrm.requestFocus();
        } else if (textFieldNomeDoMedico.getText().isEmpty() == true) {
            JOptionPane.showMessageDialog(null, "O nome do médico é obrigatório!");
            textFieldNomeDoMedico.requestFocus();
        } else if (textFieldTelefone.getText().isEmpty() == true) {
            JOptionPane.showMessageDialog(null, "O telefone do médico é obrigatório!");
            textFieldTelefone.requestFocus();
        } else if (textFieldEmail.getText().isEmpty() == true) {
            JOptionPane.showMessageDialog(null, "O email do médico é obrigatório!");
            textFieldEmail.requestFocus();
        } else if (textFieldDataDeNascimento.getText().contains(s) == true) {
            JOptionPane.showMessageDialog(null, "A data de nascimento do médico é obrigatória!");
            textFieldDataDeNascimento.requestFocus();
        } else if (operacao == OperacaoEnum.ADICIONAR) {
            adicionar();
        } else {
            editar();
        }
        
    }//GEN-LAST:event_buttonSalvarActionPerformed

    private void textFieldCrmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textFieldCrmActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textFieldCrmActionPerformed

    private void editar() {
        medico.setCrm(textFieldCrm.getText());
        medico.setNome(textFieldNomeDoMedico.getText());
        medico.setTelefone(textFieldTelefone.getText());
        medico.setEmail(textFieldEmail.getText());
        medico.setDataDeNascimento(LocalDate.parse(textFieldDataDeNascimento.getText(),DateTimeFormatter.ofPattern("dd/MM/yyyy")));
        
        MedicoDao.atualizar(medico);
        
        JOptionPane.showMessageDialog(
                null, 
                "Médico atualizado com sucesso!", 
                "Médicos", 
                JOptionPane.INFORMATION_MESSAGE);
        
        dispose();
   }
    
    private void adicionar() {
        // Criar um objeto especialidade
        Medico novoMedico = new Medico();
        novoMedico.setCrm(textFieldCrm.getText());
        novoMedico.setNome(textFieldNomeDoMedico.getText());
        novoMedico.setTelefone(textFieldTelefone.getText());
        novoMedico.setEmail(textFieldEmail.getText());
        novoMedico.setDataDeNascimento(LocalDate.parse(textFieldDataDeNascimento.getText(),DateTimeFormatter.ofPattern("dd/MM/yyyy")));
        
        // Gravar o objeto, através do Dao.
        MedicoDao.gravar(novoMedico);
        
        JOptionPane.showMessageDialog(
                this,
                "Médico gravado com sucesso!",
                "Médicos",
                JOptionPane.INFORMATION_MESSAGE);
        
        dispose();
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonCancelar;
    private javax.swing.JButton buttonPassarPraDireita;
    private javax.swing.JButton buttonPassarPraEsquerda;
    private javax.swing.JButton buttonSalvar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel labelCodigo;
    private javax.swing.JLabel labelCrm;
    private javax.swing.JLabel labelDataDeNascimento;
    private javax.swing.JLabel labelEmail;
    private javax.swing.JLabel labelEspecialidades;
    private javax.swing.JLabel labelEspecialidadesDoMedico;
    private javax.swing.JLabel labelNomeDoMedico;
    private javax.swing.JLabel labelTelefone;
    private javax.swing.JLabel labelTitulo;
    private javax.swing.JList<String> listEspecialidades;
    private javax.swing.JList<String> listEspecialidadesDoMedico;
    private javax.swing.JScrollPane scrollEspecialidades;
    private javax.swing.JScrollPane scrollEspecialidadesDoMedico;
    private javax.swing.JTextField textFieldCodigo;
    private javax.swing.JTextField textFieldCrm;
    private javax.swing.JFormattedTextField textFieldDataDeNascimento;
    private javax.swing.JTextField textFieldEmail;
    private javax.swing.JTextField textFieldNomeDoMedico;
    private javax.swing.JTextField textFieldTelefone;
    // End of variables declaration//GEN-END:variables
}
