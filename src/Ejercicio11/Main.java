package Ejercicio11;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Consumer;

public class Main {
    public static void main(String[] args) {
        List<String>cadenas= Arrays.asList("Queso","tomate","Jamon","Lechuga");
        BiFunction<String,Integer,String>resultado=(a,b)->{
            if(a.length()>b){
                return a;
            }
            return null;
        };
       for(int i=0;i<cadenas.size();i++){
           Consumer<String>imprimir=a-> System.out.println(a);
           imprimir.accept(resultado.apply(cadenas.get(i),4));
           System.out.println(resultado.apply(cadenas.get(i),4));
       }


    }
}
