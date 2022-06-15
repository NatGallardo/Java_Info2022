
import java.util.List;
import java.util.stream.Collectors;

public class Ejercicio4 {

  public static void main(String[] args) {
    List<Integer> números = List.of(1, 2, 4, 4, 4);

    List<Integer> lista = números.stream()
        .map(número -> factorial(número))
        .distinct()
        .collect(Collectors.toList());

    System.out.println(lista);
  }

  public static int factorial(int number) {
    if (number == 0)
      return 1;
    else
      return (number * factorial(number - 1));
  }

}