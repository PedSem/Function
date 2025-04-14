package Ejercicio12;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Consumer;

public class Main {
    public static void main(String[] args) {
        List<String> cadenas= Arrays.asList("Queso","tomate","Jamon","Lechuga");
        BiFunction<String,String,String>resultado=(a,b)->{
            if(a.startsWith(b)){
                return a;
            }
            return null;
        };
        Consumer<String>resul=a-> System.out.println(a);
        for(int i=0;i<cadenas.size();i++){
            resul.accept(resultado.apply(cadenas.get(i),"t"));
        }


    }
}
