package DesafiosJava; // esse código você deve alterar conforme sua pasta

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

// troque essa classe para public class
class MinhaPrimeiraClasse { 
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());
    int a = Integer.parseInt(st.nextToken());

    st = new StringTokenizer(br.readLine());
    int b = Integer.parseInt(st.nextToken());
    int total = a * b; // Altere o valor da variável com o cálculo esperado
    System.out.println("PROD = " + total);
  }
}
