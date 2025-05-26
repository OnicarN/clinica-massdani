import java.util.ArrayList;

class ClinicaFisioterapia {
    private ArrayList<Cita> listaCitas = new ArrayList<>();
    
    public void agregarCita(Cita cita) {
        listaCitas.add(cita);
    }

    public void mostrarCitas() {
        System.out.println("Citas programadas:");        
        for (Cita cita : listaCitas) {
            System.out.println("Paciente: " + cita.getPaciente() +
                    ", Fecha: " + cita.getFecha() +
                    ", Hora: " + cita.getHora());
        }
    }

    public void eliminarCita(String paciente) {
        for (Cita cita : listaCitas) {
            if (cita.getPaciente().equals(paciente)) {
                listaCitas.remove(cita);
                System.out.println("Cita eliminada para " + paciente);
                return;
            }
        }
        System.out.println("No se encontró ninguna cita para " + paciente);
    }
}