package ifpb.edu.br.entidades;

public class Reserva {
    private Laboratorio laboratorio;
    private Disciplina disciplina;
    private Professor professor;
    private int horario;
    private int dia;

    public Reserva (Laboratorio laboratorio, Disciplina disciplina, Professor professor, int horario, int dia) {
        this.laboratorio = laboratorio;
        this.disciplina = disciplina;
        this.professor = professor;
        this.horario = horario;
        this.dia = dia;
    }

    public Laboratorio getLaboratorio() {
        return laboratorio;
    }

    public Disciplina getDisciplina() {
        return disciplina;
    }

    public Professor getProfessor() {
        return professor;
    }

    public int getHorario() {
        return horario;
    }

    public int getDia() {
        return dia;
    }
}

