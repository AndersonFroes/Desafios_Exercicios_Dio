package ExerciciosJava; // esse código você deve alterar conforme sua pasta

import java.util.LinkedList;
import java.util.Queue;

// troque essa classe para public class
class ExemploLinkedList { 

    public static void main(String[] args) {

        Queue<String> filaDoRango = new LinkedList<>();

        filaDoRango.add("Juliana");
        filaDoRango.add("Pedro");
        filaDoRango.add("Carlos");
        filaDoRango.add("Larissa");
        filaDoRango.add("João");
        System.out.println(filaDoRango);
        
        String primeiraPessoaDaFila = filaDoRango.peek();
        System.out.println(primeiraPessoaDaFila);
    
        String primeiraPessoaAComer = filaDoRango.poll();
        System.out.println(primeiraPessoaAComer);
        
        System.out.println(filaDoRango);
        
        filaDoRango.add("Daniel");
        System.out.println(filaDoRango);

        System.out.println(filaDoRango.size());
        
        System.out.println(filaDoRango.isEmpty());
        
        boolean temCarlos = filaDoRango.contains("Carlos");
        System.out.println(temCarlos);
    }
}
