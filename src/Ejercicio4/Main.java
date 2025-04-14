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
        Function<String,Integer>cadenas=null;
        System.out.println(main.convertirlistaenmap(list,cadenas));

    }
    public Map<String,Integer>convertirlistaenmap(List<String>lista,Function<String,Integer>cadenas){
        Map<String,Integer>recorrermapa=new HashMap<>();
        Consumer<Integer>prueba=a-> System.out.print(a + " ");
        cadenas=a->{
          return recorrermapa.put(a,a.length());
        };
        for(int i=0;i<lista.size();i++){
            prueba.accept(cadenas.apply(lista.get(i)));
        }
        return recorrermapa;
    }
}
