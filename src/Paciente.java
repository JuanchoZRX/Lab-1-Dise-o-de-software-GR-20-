class Paciente {
    private String nombre;
    private String prioridad;
    private int ordenLlegada;

    public Paciente(String nombre, String prioridad, int ordenLlegada) {
        this.nombre = nombre;
        this.prioridad = prioridad;
        this.ordenLlegada = ordenLlegada;
    }

    public String getNombre() {
        return nombre;
    }

    public String getPrioridad() {
        return prioridad;
    }

    public int getOrdenLlegada() {
        return ordenLlegada;
    }

}
