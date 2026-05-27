import java.util.ArrayList;
import java.util.List;

class SalaEmergencias {
    private List<Paciente> pacientes = new ArrayList<>();

    public void agregarPaciente(Paciente p) {
        pacientes.add(p);
    }

    public IteratorPaciente crearIterator() {
        return new PacienteIterator(pacientes);
    }
}