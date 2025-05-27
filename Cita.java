import java.time.LocalTime; 
import java.time.LocalDate; 
import java.time.format.DateTimeFormatter;
class Cita {
    private String paciente;
    private LocalDate fecha;
    private LocalTime hora;

    public Cita(String paciente, String fecha, String hora) {
        this.paciente = paciente;
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        this.fecha = LocalDate.parse(fecha,formatter);
        this.hora = LocalTime.parse(hora);
    }

    public String getPaciente() {
        return paciente;
    }

    public String getFecha() {
        return fecha.format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));
    }

    public String getHora() {
        return hora.format(DateTimeFormatter.ofPattern("HH:mm"));
    }
}
