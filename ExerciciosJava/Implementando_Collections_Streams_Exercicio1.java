package ExerciciosJava; // esse código você deve alterar conforme sua pasta

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

// troque essa classe para public class
class ExemploList { 
    public static void main(String[] args) {
        
    List<String> nomes = new ArrayList<>();

    nomes.add("Juliana");
    nomes.add("Pedro");
    nomes.add("Carlos");
    nomes.add("Larissa");
    nomes.add("João");
    System.out.println(nomes);
    
    nomes.set(2, "Roberto");
    System.out.println(nomes);
    
    String nome = nomes.get(0);
    System.out.println(nome);
    
    nomes.remove(3);
    System.out.println(nomes);
    
    nomes.remove("João");
    System.out.println(nomes);
    
    int tamanho = nomes.size();
    System.out.println(tamanho);
    
    boolean temJuliano = nomes.contains("Juliano");
    System.out.println(temJuliano);
    
    nomes.add("Ismael");
    nomes.add("Rodrigo");
    System.out.println(nomes);
    
    Collections.sort(nomes);
    System.out.println(nomes);
    
    boolean listaEstaVazia = nomes.isEmpty();
    System.out.println(listaEstaVazia);
  }
}
