package Ejercicio7;

import java.util.function.Consumer;
import java.util.function.Function;

public class Main {
    public static void main(String[] args) {
        Function<Double,String>resultado=n->{
            return "Resultado " + n;
        };
        Consumer<String>imprimir=a-> System.out.println(a);
        imprimir.accept(resultado.apply(5.0));
    }
}
