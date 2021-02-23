package DesafiosJava; // esse código você deve retirar para rodar na plataforma Dio

import java.util.Scanner;

public class Encontre_a_Maior_Substring {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        String palavra1;
        String palavra2;
        
        while(scr.hasNextLine()) {
            palavra1 = scr.nextLine();
            palavra2 = scr.nextLine();
            int tamanhoMax = 0;
    
            if (palavra2.length() > palavra1.length()) {
                String maiorPalavra = palavra2;
                palavra2 = palavra1;
                palavra1 = maiorPalavra;
            }
    
            for (int i = 0; i < palavra2.length(); i++) {
                for (int j = 0; j < i + 1; j++) {
                    if (palavra1.contains(palavra2.substring(j, palavra2.length() - i + j))) {
                        tamanhoMax = Math.max(tamanhoMax, palavra2.length() - i);
                    }
                }
            }
    
            System.out.println(tamanhoMax);
        }
    }
}
