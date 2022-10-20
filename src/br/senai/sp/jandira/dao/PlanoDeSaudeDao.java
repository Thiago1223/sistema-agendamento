package br.senai.sp.jandira.dao;

import br.senai.sp.jandira.model.PlanoDeSaude;
import java.time.LocalDate;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

public class PlanoDeSaudeDao {
    
    private static ArrayList<PlanoDeSaude> planos = new ArrayList<>();
    
    public static void gravar(PlanoDeSaude p) {
        planos.add(p);
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
        PlanoDeSaude p1 = new PlanoDeSaude("Unimed", "Bronze", "9832728390 12", LocalDate.of(2023, 10, 15));
        PlanoDeSaude p2 = new PlanoDeSaude("Notredame", "Platina", "2103927860 05", LocalDate.of(2010, 12, 22));
        PlanoDeSaude p3 = new PlanoDeSaude("Bradesco", "Prata", "6727924627 22", LocalDate.of(2033, 11, 13));
        PlanoDeSaude p4 = new PlanoDeSaude("Amil", "Ouro", "2183747678 52", LocalDate.of(2013, 9, 5));
        
        planos.add(p1);
        planos.add(p2);
        planos.add(p3);
        planos.add(p4);

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
            dados[i][4] = p.getValidade().toString();
        }

        return new DefaultTableModel(dados, titulo);

    }
    
}
