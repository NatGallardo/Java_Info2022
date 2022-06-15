//Dada una lista que contiene números enteros, genere otra lista que contenga el resultado de aplicar la operación potencia de 2.

import java.util.List;
import java.util.stream.Collectors;

public class Ejercicio2 {

  public static void main(String[] args) {
    List<Integer> números = List.of(1, 2, 3, 4, 5);

    List<Integer> list = números.stream()
        .map(base -> (int) Math.pow(base, 2))
        .collect(Collectors.toList());

    System.out.println("\n👇 list.forEach usando lambda: ");
    list.forEach(n -> System.out.println(n));
  }

  public static int powerRecursiveFunction(int base, int exponente) {
    if (exponente == 0) {
      return 1;
    } else {
      return (base * powerRecursiveFunction(base, (exponente - 1)));
    }
  }

}