import java.util.ArrayList;
import java.util.List;

class PacienteIterator implements IteratorPaciente {
    private List<Paciente> pacientesOrdenados;
    private int posicion = 0;

    public PacienteIterator(List<Paciente> pacientes) {
        pacientesOrdenados = new ArrayList<>(pacientes);
        pacientesOrdenados.sort((a, b) -> {

            int prioridadA = valorPrioridad(a.getPrioridad());
            int prioridadB = valorPrioridad(b.getPrioridad());

            if (prioridadA != prioridadB) return prioridadA - prioridadB;   //por prioridad

            return a.getOrdenLlegada() - b.getOrdenLlegada();   //por orden de llegada
        });
    }

    private int valorPrioridad(String prioridad) {
        switch (prioridad) {
            case "Rojo": return 1;
            case "Amarillo": return 2;
            case "Verde": return 3;
            default: return -1;
        }
    }

    @Override
    public boolean hayPaciente() {
        return posicion<pacientesOrdenados.size();
    }

    @Override
    public Paciente siguiente() {
        return pacientesOrdenados.get(posicion++);
    }
}