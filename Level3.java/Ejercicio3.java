
//Tenemos una lista de Strings, de la cual SABER el número de valores que
// comenzar con la letra B (ya sea mayúscula o minúscula, en ese caso decimos
//que será ignoreCase).
// Aporte:
//List<String> palabras = List.of("Batman", "Aquaman", "Flash", "Batgirl", "Wonder Woman", "brainiac",);

import java.util.List;

public class Ejercicio3 {

  public static void main(String[] args) {
    List<String> palabras = List.of("Batman", "Aquaman", "Flash", "Batgirl", "Wonder Woman", "cerebrito");
    int cuenta = (int) palabras.stream()
        .filter(w -> w.startsWith("b") || w.startsWith("B"))
        .count();
    System.out.println(cuenta);
  }

}