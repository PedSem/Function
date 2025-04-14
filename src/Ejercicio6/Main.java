package Ejercicio6;

import java.util.function.BiFunction;
import java.util.function.Consumer;

public class Main {
    public static void main(String[] args) {
        BiFunction<Integer,Integer,Double>Potencias=(a,b)->{
            return Math.pow(a,b);
        };
        Consumer<Double>consumer=a-> System.out.println(a);
        consumer.accept(Potencias.apply(5,6));
    }
}
