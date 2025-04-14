package Ejercicio4;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;
import java.util.function.Function;

public class Main {
    public static void main(String[] args) {
        List<String>list= Arrays.asList("Tomate","Lechuga","Queso","Pan","Hola");
        Main main=new Main();
        Map<String,Integer>mapa=main.convertirlistaenmap(list,String::length);
        Consumer<Map<String,Integer>>imprimir=a->System.out.println(a);
        imprimir.accept(mapa);

    }
    public Map<String,Integer>convertirlistaenmap(List<String>lista,Function<String,Integer>cadenas){
        Map<String,Integer>recorrermapa=new HashMap<>();
        for(String s:lista){
            recorrermapa.put(s,cadenas.apply(s));
        }
        return recorrermapa;
    }
}
