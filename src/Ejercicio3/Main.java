package Ejercicio3;

import java.util.function.Consumer;
import java.util.function.Function;

public class Main {
    public static void main(String[] args) {
        Function<String,Integer> cadenas= s ->{
            return s.length();
        };
        Function<Integer,Double>potencia=n->{
            return Math.pow(n,2);
        };
        Consumer<Double>integerConsumer=a-> System.out.println(a);
        integerConsumer.accept(potencia.apply(cadenas.apply("Programacion")));
    }
}
