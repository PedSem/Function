package Ejercicio5;

import java.util.function.BiFunction;
import java.util.function.Consumer;

public class Main {
    public static void main(String[] args) {
        BiFunction<Integer,Integer,Integer>suma=(a,b)->{
            return a+b;
        };
        Consumer<Integer>resultado=a-> System.out.println(a);
        resultado.accept(suma.apply(8,7));
    }
}
