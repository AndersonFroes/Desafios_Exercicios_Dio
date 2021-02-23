package DesafiosJava; // esse código você deve retirar para rodar na plataforma Dio

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Conjuntos_Bons_ou_Ruins {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        while (N != 0) {
            List<String> conjunto = new ArrayList<>();
            for (int i = 0; i < N; i++)
                conjunto.add(br.readLine());

        conjunto = conjunto.stream().sorted().collect(Collectors.toList());

        String saida = "Conjunto Bom";
        for (int i = 0; i < N - 1; i++)
            if (conjunto.get(i + 1).startsWith(conjunto.get(i)))
                saida = "Conjunto Ruim";

        System.out.println(saida);
        N = Integer.valueOf(br.readLine());
        }
    }
}