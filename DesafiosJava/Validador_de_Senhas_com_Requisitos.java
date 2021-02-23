package DesafiosJava; // esse código você deve retirar para rodar na plataforma Dio

import java.util.Scanner;

public class Validador_de_Senhas_com_Requisitos {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        String senha;
        final String requeridos = "^(?:(?=.*\\d)(?=.*[a-z])(?=.*[A-Z]).*)$";
        final String permitidos = "[a-zA-Z0-9]+";
        
        while(scr.hasNextLine()) {
            senha = scr.nextLine();
            
            if(senha.length() >=6 && senha.length() <= 32 && senha.matches(permitidos) && senha.matches(requeridos)){
                System.out.println("Senha valida.");
            } else {
                System.out.println("Senha invalida.");
            }
        }
    }
}