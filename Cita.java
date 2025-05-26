import java.time.LocalDate;
import java.time.LocalTime;
class Cita {
    private String paciente;
    private LocalDate fecha;
    private LocalTime hora;

    public Cita(String paciente, LocalDate fecha, LocalTime hora) {
        this.paciente = paciente;
        this.fecha = fecha;
        this.hora = hora;
    }

    public String getPaciente() {
        return paciente;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public LocalTime getHora() {
        return hora;
    }
}
