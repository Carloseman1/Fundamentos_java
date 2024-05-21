package primeirasaulas;
import java.util.HashMap;
import java.util.Map;

public class Colecoes {
    
    public static void main(String[] args) {
        //Podemos adicionar chave e valor, mas precisamos colocar qual que é o tipo da chave e qual o tipo do valor 
        Map<String, Integer> notas = new HashMap<>(); // Vamos usar a biblioteca do HashMap -- String
        notas.put("Daniel", 9);
        notas.put("Vinicius", 10);
        notas.put("Carlos", 10);

        for( Map.Entry<String,Integer> entry : notas.entrySet() ) {
            String key =  entry.getKey();
            Integer value = entry.getValue();

            System.out.println("A chave é " + key + " e o valor é " + value);
        }
    }
}
