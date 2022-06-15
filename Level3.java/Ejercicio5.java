import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Ejercicio5 {

  public static class estudiante {
    protected String apellido;
    protected String nombre;
    private java.time.LocalDate cumpleaños;

    public estudiante(String lastName, String name, LocalDate cumpleaños) {
      this.apellido = lastName;
      this.nombre = name;
      this.cumpleaños = cumpleaños;
    }

    public String getLastName() {
      return apellido;
    }

    public String getName() {
      return nombre;
    }

    public LocalDate getcumpleaños() {
      return cumpleaños;
    }

    public String nombreCompleto() {
      return this.getLastName() + " " + this.getName();
    }

    int getEdad() {
      return Period(LocalDate.cumpleaños, LocalDateTime.now()).getAños();
    }
  }

  public static void main(String[] args) {
    List<estudiante> estudiantes = List.of(
        new estudiante("Gómez", "Mariela", LocalDate.of(2001, 05, 16)),
        new estudiante("Perez", "Martina", LocalDate.of(1997, 01, 13)),
        new estudiante("Sánchez", "Juliana", LocalDate.of(2008, 02, 28)),
        new estudiante("López", "Carlos", LocalDate.of(1975, 07, 30)),
        new estudiante("Fernandez", "Darío", LocalDate.of(1988, 10, 02)));

    Map<String, Integer> edades = new HashMap<>();

    estudiantes
        .stream()
        .forEach(s -> edades.put(
            s.nombreCompleto(), s.getEdad()));

    System.out.println(edades);
  }
}