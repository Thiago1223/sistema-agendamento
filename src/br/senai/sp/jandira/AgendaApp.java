package br.senai.sp.jandira;

import java.time.LocalDate;
import java.time.LocalTime;

import javax.swing.JOptionPane;

import br.senai.sp.jandira.model.Agenda;
import br.senai.sp.jandira.model.Endereco;
import br.senai.sp.jandira.model.Especialidade;
import br.senai.sp.jandira.model.Estados;
import br.senai.sp.jandira.model.Medico;
import br.senai.sp.jandira.model.Paciente;
import br.senai.sp.jandira.model.PlanoDeSaude;

public class AgendaApp {

    public static void main(String[] args) {

        // Criar um objeto plano de saúde
        PlanoDeSaude planoDeSaude = new PlanoDeSaude();
        planoDeSaude.setOperadora("Unimed");
        planoDeSaude.setCategoria("Bronze");
        planoDeSaude.setNumero("6541-6522-222-33");
        planoDeSaude.setValidade(LocalDate.of(2023, 8, 20));

        // Criar um objeto endereço
        Endereco endereco = new Endereco();
        endereco.setLogradouro("Rua Odilon Henrique de Macedo");
        endereco.setNumero("120");
        endereco.setBairro("Vila Gustavo Correia");
        endereco.setCidade("Carapicuíba");
        endereco.setCep("06310-410");
        endereco.setEstado(Estados.SAO_PAULO);
        endereco.setComplemento("Casa");

        // Criar um objeto paciente
        Paciente paciente1 = new Paciente();
        paciente1.setNome("Carlos Pereira");
        paciente1.setCpf("876.650.218-01");
        paciente1.setRg("54.679.123-7");
        paciente1.setTelefone("(11) 98400-7320");
        paciente1.setDataDeNascimento(LocalDate.of(2006, 6, 14));
        paciente1.setEndereco(endereco);
        paciente1.setPlanoDeSaude(planoDeSaude);

        Paciente paciente2 = new Paciente();
        paciente2.setNome("Patricia");
        paciente2.setCpf("832.000.218-08");
        paciente2.setRg("54.329.113-3");
        paciente2.setTelefone("(11) 98290-7150");
        paciente2.setDataDeNascimento(LocalDate.of(1998, 4, 10));
        paciente2.setEndereco(endereco);
        paciente2.setPlanoDeSaude(planoDeSaude);

        // *** Exibir os dados do Paciente
        // Nome do Paciente: ??
        // Telefone do Paciente: ??????
        // Operadora do plano de Saúde: ?????
        // Categoria do plano de saúde: ?????
        // Cidade do paciente: ??????
        // Estado do paciente: ????????
        System.out.println("Nome do Paciente: " + paciente1.getNome());
        System.out.println("Telefone do Paciente: " + paciente1.getTelefone());
        System.out.println("Operadora do plano de Saúde: " + paciente1.getPlanoDeSaude().getOperadora());
        System.out.println("Categoria do plano de saúde: " + paciente1.getPlanoDeSaude().getCategoria());
        System.out.println("Cidade do paciente: " + paciente1.getEndereco().getCidade());
        System.out.println("Estado do paciente: " + paciente1.getEndereco().getEstado());

        // Criar especialidades
        Especialidade especialidade1 = new Especialidade();
        especialidade1.setNome("Cardiologia");
        especialidade1.setDescricao("Cuida do coração.");

        Especialidade especialidade2 = new Especialidade();
        especialidade2.setNome("Otorrinolaringologia");
        especialidade2.setDescricao("Cuida da garganta, ouvido, etc...");

        Especialidade especialidade3 = new Especialidade();
        especialidade3.setNome("Clinica Geral");
        especialidade3.setDescricao("Sabe de tudo um pouquinho.");

        Especialidade especialidade4 = new Especialidade();
        especialidade4.setNome("Fisioterapia");
        especialidade4.setDescricao("Cuida dos ossos e dos músculos.");

        // Criar um objeto médico
        Medico medico1 = new Medico();
        medico1.setNome("Thiago Freitas");
        medico1.setEmail("thiago@gmail.com");
        medico1.setTelefone("(11) 95685-9723");
        medico1.setCrm("63210-8");
        Especialidade[] especialidades1 = {especialidade1, especialidade3};
        medico1.setEspecialidades(especialidades1);

        Medico medico2 = new Medico();
        medico2.setNome("Roberto da Silva");
        medico2.setEmail("roberto@gmail.com");
        medico2.setTelefone("(11) 923245-9653");
        medico2.setCrm("62480-4");
        Especialidade[] especialidades2 = {especialidade1, especialidade2, especialidade3, especialidade4};
        medico2.setEspecialidades(especialidades2);

        // Exibir as especialidades de cada médico
        // Nome do médico: ???
        // Especialidade 1: ??
        // Especialidade 2: ??
        // Especialidade 3: ??
        System.out.println("Nome do médico: " + medico1.getNome());
        int contador = 0;
        while (contador < medico1.getEspecialidades().length) {
            System.out.println("Especialidade " + (contador + 1) + " - " + medico1.getEspecialidades()[contador].getNome());
            contador++;
        }

        System.out.println("==========================================");

        System.out.println("Nome do médico: " + medico2.getNome());
        int i = 0;
        while (i < medico2.getEspecialidades().length) {
            System.out.println("Especialidade " + (i + 1) + " - " + medico2.getEspecialidades()[i].getNome());
            i++;
        }

        // Fazer o agendamento do paciente Carlos Pereira
        // com um cardiologista para o dia 27/09/2022
        // as 14h15
        // Fazer o agendamento da paciente Patricia
        // com um Fisioterapeuta para o dia 12/10/2022
        // as 09:30
        // Exbir os dados de agenda, com o nome do paciente,
        // nome do médico, nome da especialidade, data e hora
        // do agendamento e plano de saúde utilizado
        Agenda agenda1 = new Agenda();
        agenda1.setDataDaConsulta(LocalDate.of(2022, 9, 27));
        agenda1.setHoraDaConsulta(LocalTime.of(14, 15));
        agenda1.setEspecialidade(especialidade1);
        agenda1.setMedico(medico1);
        agenda1.setPaciente(paciente1);

        System.out.println("Agenda do(a) paciente: " + agenda1.getPaciente().getNome());
        System.out.println("Médico: " + agenda1.getMedico().getNome());
        System.out.println("Especialidade: " + agenda1.getEspecialidade().getNome());
        System.out.println("Data: " + agenda1.getDataDaConsulta());
        System.out.println("Hora: " + agenda1.getHoraDaConsulta());

        Agenda agenda2 = new Agenda();
        agenda2.setDataDaConsulta(LocalDate.of(2022, 10, 12));
        agenda2.setHoraDaConsulta(LocalTime.of(9, 30));
        agenda2.setEspecialidade(especialidade4);
        agenda2.setMedico(medico2);
        agenda2.setPaciente(paciente2);

        System.out.println("=================================================");

        System.out.println("Agenda do(a) paciente: " + agenda2.getPaciente().getNome());
        System.out.println("Médico: " + agenda2.getMedico().getNome());
        System.out.println("Especialidade: " + agenda2.getEspecialidade().getNome());
        System.out.println("Data: " + agenda2.getDataDaConsulta());
        System.out.println("Hora: " + agenda2.getHoraDaConsulta());

    }

}
