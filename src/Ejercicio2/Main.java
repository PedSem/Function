package Ejercicio2;

import java.util.function.Consumer;
import java.util.function.Function;

public class Main {
    public static void main(String[] args) {
        Function<Integer,Double>potencia=n->{
            return Math.pow(n,2);
        };
        Consumer<Double>imprimir=a-> System.out.println(a);
        imprimir.accept(potencia.apply(2));
    }
}
