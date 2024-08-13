package ifpb.edu.br.entidades;

import java.util.ArrayList;
import java.util.List;

public class SistemaReserva {
    List<Laboratorio> laboratorios;
    List<Professor> professores;

    public SistemaReserva() {
        this.laboratorios = new ArrayList<>();
        this.professores = new ArrayList<>();
        todosLaboratorios();
    }

    private void todosLaboratorios() {
        laboratorios.add(new Laboratorio());
        laboratorios.add(new Laboratorio());
        laboratorios.add(new Laboratorio());
        laboratorios.add(new Laboratorio());
    }

    public void cadastrarProfessor(Professor professor) {
        professores.add(professor);
    }

    public Professor login(String login, String senha) {
        for (Professor professor : professores) {
            if (professor.getLogin().equals(login) && professor.getSenha().equals(senha)) {
                return professor;
            }
        }
        return null;
    }
    public boolean reservarLaboratorio(Professor professor, Disciplina disciplina, Laboratorio laboratorio, int horario, int dia) {
        if (laboratorio.horarioDisponivel(horario, dia)) {
            laboratorio.reservarHorario(horario, dia);
            return true;
        }
        return false;
    }
    public List<Laboratorio> getLaboratorios() {
        return laboratorios;
    }
    public void adicionarLaboratorio(Laboratorio laboratorio) {
        laboratorios.add(laboratorio);
    }
}
