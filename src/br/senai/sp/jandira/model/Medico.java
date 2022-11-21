package br.senai.sp.jandira.model;

import java.time.LocalDate;
import javax.swing.JOptionPane;

public class Medico {

    private static int contador = 99;
    private Integer codigo;
    private String crm;
    private String nome;
    private String telefone;
    private String email;
    private LocalDate dataDeNascimento;
    private Especialidade[] especialidades;
    
    public Medico(String crm, String nome, String telefone, String email, LocalDate dataDeNascimento) {
        this.crm = crm;
        this.nome = nome;
        this.telefone = telefone;
        this.email = email;
        this.dataDeNascimento = dataDeNascimento;
        gerarCodigo();
    }
    
    public Medico() {
        gerarCodigo();
    }
    
    public Medico(String crm, String nome, String telefone, Integer codigo) {
        this.crm = crm;
        this.nome = nome;
        this.telefone = telefone;
        this.codigo = codigo;
        this.contador = codigo;
    }

    private void gerarCodigo() {
        this.contador++;
        this.codigo = contador;
    }
    
    public int getContador() {
        return contador;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public String getCrm() {
        return crm;
    }

    public void setCrm(String crm) {
        this.crm = crm;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {

        if (nome.length() >= 3) {
            this.nome = nome;
        } else {
            JOptionPane.showMessageDialog(null, nome + " Não é um nome válido!\nDeve conter pelo menos 3 letras!");
        }

    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public LocalDate getDataDeNascimento() {
        return dataDeNascimento;
    }

    public void setDataDeNascimento(LocalDate dataDeNascimento) {
        this.dataDeNascimento = dataDeNascimento;
    }

    public Especialidade[] getEspecialidades() {
        return especialidades;
    }

    public void setEspecialidades(Especialidade[] especialidades) {
        this.especialidades = especialidades;
    }
    
    public String getMedicoSeparadoPorPontoEVirgula() {
        return this.codigo + ";" + this.crm + ";" + this.nome + ";" + this.telefone + ";" + this.email + ";" + this.dataDeNascimento;
    }

}
