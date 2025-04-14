package Ejercicio8;

import java.util.ResourceBundle;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;

public class Main {
    public static void main(String[] args) {
        BiFunction<Integer,Integer,Double> Potencias=(a, b)->{
            return Math.pow(a,b);
        };
        Function<Double,String> resultado= n->{
            return "Resultado " + n;
        };
        System.out.println(resultado.apply(Potencias.apply(2,4)));
        Consumer<String>consumer=a-> System.out.println(a);
        consumer.accept(resultado.apply(Potencias.apply(2,4)));
    }
}
