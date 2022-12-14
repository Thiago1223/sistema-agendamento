package br.senai.sp.jandira.dao;

import br.senai.sp.jandira.model.Especialidade;
import br.senai.sp.jandira.model.Medico;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class MedicoDao {
    
    private final static String URL = "C:\\Users\\22282213\\gravar\\Medico.txt";
    private final static String URL_TEMP = "C:\\Users\\22282213\\gravar\\Medico-temp.txt";
    private final static Path PATH = Paths.get(URL);
    private final static Path PATH_TEMP = Paths.get(URL_TEMP);
    
    private static ArrayList<Medico> medicos = new ArrayList<>();
    
    public static void gravar(Medico m) {
        medicos.add(m);

        try {
            BufferedWriter escritor = Files.newBufferedWriter(
                    PATH,
                    StandardOpenOption.APPEND,
                    StandardOpenOption.WRITE);

            escritor.write(m.getMedicoSeparadoPorPontoEVirgula());
            escritor.newLine();
            escritor.close();

        } catch (Exception erro) {
            JOptionPane.showMessageDialog(null, "Ocorreu um erro");
        }

    }
    
    public static ArrayList<Medico> getMedicos() {
        return medicos;
    }
    
    public static Medico getMedico(Integer codigo) {

        for (Medico m : medicos) {
            if (m.getCodigo() == codigo) {
                return m;
            }
        }

        return null;

    }
    
    public static void atualizar(Medico medicoAtualizado) {
        for (Medico m : medicos) {
            if (m.getCodigo().equals(medicoAtualizado.getCodigo())) {
                medicos.set(medicos.indexOf(m), medicoAtualizado);
                break;
            }
        }

        atualizarArquivo();

    }
    
    public static void excluir(Integer codigo) {

        for (Medico m : medicos) {
            if (m.getCodigo() == codigo) {
                medicos.remove(m);
                break;
            }
        }

        atualizarArquivo();

    }
    
    private static void atualizarArquivo() {
        // PASSO 01 - Criar uma representa????o dos arquivos que ser??o manipulados
        File arquivoAtual = new File(URL);
        File arquivoTemp = new File(URL_TEMP);

        try {
            // Criar o arquivo temporario
            arquivoTemp.createNewFile();

            // Abrir o arquivo tempor??rio para escrita
            BufferedWriter bwTemp = Files.newBufferedWriter(
                    PATH_TEMP,
                    StandardOpenOption.APPEND,
                    StandardOpenOption.WRITE);

            // Iterar na lista para adicionar as especialidades
            // no arquivo tempor??rio, exceto o registro que
            // n??o queremos mais
            for (Medico m : medicos) {
                bwTemp.write(m.getMedicoSeparadoPorPontoEVirgula());
                bwTemp.newLine();
            }

            bwTemp.close();

            // Excluir o arquivo atual
            arquivoAtual.delete();

            // Renomear o arquivo tempor??rio
            arquivoTemp.renameTo(arquivoAtual);

        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
    
    public static ArrayList<Especialidade> separarEspecialidades(String linha) {
        String[] vetor = linha.split(";");
        int codigoEsp = 6;
        
        ArrayList<Especialidade> especialidades = new ArrayList<>();
        
        while (vetor.length > codigoEsp) {
            especialidades.add(EspecialidadeDao.getEspecialidade(Integer.valueOf(vetor[codigoEsp])));
            codigoEsp++;
        }
        return especialidades;
    }
    
    public static void criarListaDeMedicos() {

        try {
            BufferedReader leitor = Files.newBufferedReader(PATH);

            String linha = leitor.readLine();

            while (linha != null) {

                // Transformar os dados da linha em uma especialidade
                String[] vetor = linha.split(";");

                Medico m = new Medico(
                        vetor[1],
                        vetor[2],
                        vetor[3],
                        vetor[4],
                        LocalDate.parse(vetor[5]),
                        Integer.valueOf(vetor[0]),
                        separarEspecialidades(linha));

                // Guardar a especialidade na lista
                medicos.add(m);

                // Ler a pr??xima linha
                linha = leitor.readLine();

            }

            leitor.close();

        } catch (IOException e) {
            JOptionPane.showMessageDialog(
                    null,
                    "Ocorreu um erro ao ler o arquivo.");
        }

    }
    
    public static DefaultListModel<Especialidade> getEspModel() {
        
        DefaultListModel<Especialidade> especialidadeLista = new DefaultListModel<Especialidade>();
        
        try {
            BufferedReader leitor = Files.newBufferedReader(PATH);
            
            String linha = leitor.readLine();
            
            for (Especialidade e : separarEspecialidades(linha)) {
                especialidadeLista.addElement(e);
            }
            
            leitor.close();
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Ocorreu um erro!");
        }
        
        return especialidadeLista;
        
    }
    
    public static DefaultTableModel getTabelaMedico() {

        String[] titulo = {"C??DIGO", "CRM", "NOME", "TELEFONE"};

        String[][] dados = new String[medicos.size()][6];

        for (Medico m : medicos) {
            int i = medicos.indexOf(m);
            dados[i][0] = m.getCodigo().toString();
            dados[i][1] = m.getCrm();
            dados[i][2] = m.getNome();
            dados[i][3] = m.getTelefone();
            dados[i][4] = m.getEmail();
            
            DateTimeFormatter barra = DateTimeFormatter.ofPattern("dd/MM/yyyy");
            
            dados[i][5] = m.getDataDeNascimento().format(barra);

        }

        return new DefaultTableModel(dados, titulo);

    }
    
}
