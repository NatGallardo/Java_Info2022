//Dada una lista que contiene valores de cadena, 
//todos los valores que NO son nulos o vacíos ("") deben filtrarse.

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Ejercicio1 {

  public static void main(String[] args) {
    List<String> palabras = new ArrayList<>();
    palabras.add("Hola");
    palabras.add(null);
    palabras.add("Informativo");
    palabras.add("");

    List<String> list = palabras.stream()

        .filter(cadena -> cadena != null)

        .filter(str -> !str.equals(""))
        .filter(str -> !str.isBlank())

        .collect(Collectors.toList());

    list.forEach(System.out::println);

    System.out.println(list);
  }

}