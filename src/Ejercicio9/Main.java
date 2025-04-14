package Ejercicio9;

import java.util.function.BiFunction;
import java.util.function.Consumer;

public class Main {
    public static void main(String[] args) {
        BiFunction<Integer,Integer,String>cadenas=(a,b)->{
            return "resultado " + Math.pow(a,b);
        };
        System.out.println(cadenas.apply(2,4));
        Consumer<String>imprimir=a-> System.out.println(a);
        imprimir.accept(cadenas.apply(2,4));
    }
}
