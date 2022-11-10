package br.senai.sp.jandira.dao;

import br.senai.sp.jandira.model.Especialidade;
import br.senai.sp.jandira.model.PlanoDeSaude;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class PlanoDeSaudeDao {
    
    private final static String URL = "C:\\Users\\22282213\\gravar\\PlanoDeSaude.txt";
    private final static Path PATH = Paths.get(URL);
    
    private static ArrayList<PlanoDeSaude> planos = new ArrayList<>();
    
    public static void gravar(PlanoDeSaude p) {
        planos.add(p);
        
        try {
            BufferedWriter escritor = Files.newBufferedWriter(
                    PATH,
                    StandardOpenOption.APPEND, 
                    StandardOpenOption.WRITE);
            
            escritor.write(p.getPlanoDeSaudeSeparadoPorPontoEVirgula());
            escritor.newLine();
            escritor.close();
        } catch (Exception erro) {
            JOptionPane.showMessageDialog(null, "Ocorreu um erro");
        }
        
    }
    
    public static ArrayList<PlanoDeSaude> getPlanosDeSaude() {
        return planos;
    }
    
    public static PlanoDeSaude getPlanoDeSaude(Integer codigo) {

        for (PlanoDeSaude p : planos) {
            if (p.getCodigo() == codigo) {
                return p;
            }
        }

        return null;

    }
    
    public static void atualizar(PlanoDeSaude planoDeSaudeAtualizado) {
        for (PlanoDeSaude p : planos) {
            if (p.getCodigo() == planoDeSaudeAtualizado.getCodigo()) {
                planos.set(planos.indexOf(p), planoDeSaudeAtualizado);
                break;
            }
        }
    }
    
    public static void excluir(Integer codigo) {

        for (PlanoDeSaude p : planos) {
            if (p.getCodigo() == codigo) {
                planos.remove(p);
                break;
            }
        }

    }
    
    public static void criarListaDePlanosDeSaude() {
        
        try {
            BufferedReader leitor = Files.newBufferedReader(PATH);
            
            String linha = leitor.readLine();
            
            while (linha != null) {
                
                // Transformar os dados da linha em uma especialidade
                String[] vetor = linha.split(";");
                
                PlanoDeSaude p = new PlanoDeSaude(
                        vetor[1], 
                        vetor[2],
                        vetor[3],
                        LocalDate.parse(vetor[4]),
                        Integer.valueOf(vetor[0]));
                
                // Guardar a especialidade na lista
                planos.add(p);
                
                // Ler a próxima linha
                linha = leitor.readLine();
                
            }
            
            leitor.close();
            
        } catch (IOException e) {
            JOptionPane.showMessageDialog(
                    null, 
                    "Ocorreu um erro ao ler o arquivo.");
        }

    }
    
    public static DefaultTableModel getTabelaPlanoDeSaude() {

        String[] titulo = {"CÓDIGO","OPERADORA", "CATEGORIA", "NÚMERO", "VALIDADE"};

        String[][] dados = new String[planos.size()][5];

        for (PlanoDeSaude p : planos) {
            int i = planos.indexOf(p);
            dados[i][0] = p.getCodigo().toString();
            dados[i][1] = p.getOperadora();
            dados[i][2] = p.getCategoria();
            dados[i][3] = p.getNumero();
            
            DateTimeFormatter barra = DateTimeFormatter.ofPattern("dd/MM/yyyy");
            
            dados[i][4] = p.getValidade().format(barra);
        }

        return new DefaultTableModel(dados, titulo);

    }
    
}
