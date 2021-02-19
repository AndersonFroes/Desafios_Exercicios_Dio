package ExerciciosJava; // esse código você deve alterar conforme sua pasta

import java.util.HashSet;
import java.util.Set;

// troque essa classe para public class
class ExemploHashSet { 
    public static void main(String[] args) {

        Set<Double> numerosInteiros = new HashSet<>();

        numerosInteiros.add(3.0);
        numerosInteiros.add(88.0);
        numerosInteiros.add(20.0);
        numerosInteiros.add(44.0);
        numerosInteiros.add(30.0);
        
        System.out.println(numerosInteiros);
        
        numerosInteiros.remove(3.0);
        System.out.println(numerosInteiros);
        
        numerosInteiros.add(23.0);
        System.out.println(numerosInteiros);
        
        System.out.println(numerosInteiros.size());
        
        System.out.println(numerosInteiros.isEmpty());
  
    }
}