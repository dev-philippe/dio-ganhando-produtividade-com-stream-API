import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerExample {

    public static void main(String[] args) {

        // criar uma lista de números inteiros
        List<Integer> numeros = Arrays.asList(1,2,3,4,5);

        // Usar o consumer com expressão lambda para imprimir números pares

        Consumer<Integer> imprimirNumeroPar = numero ->{
            if(numero % 2 == 0){
                System.out.println(numero);
            }

        };

        // Usar o Consumer par imprimir números pares no stream
        numeros.stream().forEach(imprimirNumeroPar);

    }

}
