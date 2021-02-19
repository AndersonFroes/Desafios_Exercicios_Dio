package ExerciciosJava; // esse código você deve alterar conforme sua pasta

import java.util.TreeMap;

// troque essa classe para public class
class ExemploTreeMap { 

    public static void main(String[] args) {

        TreeMap<String, String> nomeEstados = new TreeMap<>();

        nomeEstados.put("AC","Acre");
        nomeEstados.put("AL","Alagoas");
        nomeEstados.put("AP","Amapá");
        nomeEstados.put("AM","Amazonas");
        nomeEstados.put("BA","Bahia");
        nomeEstados.put("CE","Ceará");
        nomeEstados.put("ES","Espírito Santo");
        nomeEstados.put("GO","Goiás");
        nomeEstados.put("MA","Maranhão");
        nomeEstados.put("MT","Mato Grosso");
        nomeEstados.put("MS","Mato Grosso do Sul");
        nomeEstados.put("MG","Minas Gerais");
        nomeEstados.put("PA","Pará");
        nomeEstados.put("PB","Paraíba");
        nomeEstados.put("PR","Paraná");
        nomeEstados.put("PE","Pernambuco");
        nomeEstados.put("PI","Piauí");
        nomeEstados.put("RJ","Rio de Janeiro");
        nomeEstados.put("RN","Rio Grande do Norte");
        nomeEstados.put("RS","Rio Grande do Sul");
        nomeEstados.put("RO","Rondônia");
        nomeEstados.put("RR","Roraima");
        nomeEstados.put("SC","Santa Catarina");
        nomeEstados.put("SP","São Paulo");
        nomeEstados.put("SE","Sergipe");
        nomeEstados.put("TO","Tocantins");
        System.out.println(nomeEstados);
        
        nomeEstados.remove("MG");
        System.out.println(nomeEstados);
        
        nomeEstados.put("DS","Distrito Federal");
        System.out.println(nomeEstados);
        
        System.out.println(nomeEstados.size());

        //nomeEstados.remove("Mato Grosso do Sul");
        //System.out.println(nomeEstados);
        
         for (String key : nomeEstados.keySet()) {
            System.out.println(nomeEstados.get(key) + "-" + key );
        }
        
       System.out.println(nomeEstados.containsKey("SC"));
       
       System.out.println(nomeEstados.containsValue("Maranhão"));
    }
}