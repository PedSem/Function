package Ejercicio1;

import java.util.function.Consumer;
import java.util.function.Function;

public class Main {
    public static void main(String[] args) {
        Function<String,Integer>cadenas=s ->{
            return s.length();
        };
        Consumer<Integer>imprimir=a-> System.out.println(a);
        imprimir.accept(cadenas.apply("Programador"));
    }
}
