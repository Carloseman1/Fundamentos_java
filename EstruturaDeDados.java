
import java.util.ArrayList;
import java.util.List;

public class EstruturaDeDados {
    
    public static void main(String[] args) {
        //Lista
        List<String> nomes = new ArrayList<>();
        nomes.add("Carlos");
        nomes.add("Katlyn");
        nomes.add("Marcos");
        nomes.add("André");
    
        // 0 - 
        // 1 -
        // 2 -
        //System.out.println(nomes.get(2));
        
    // Usado para mostrar a posição da nossa lista e qual nome é 

    // #Primeiro metodo  

    //for (String nome : nomes){
           // System.out.println("O nome é "+ nome);
       // }
        // o For mostra o nome de cada um sem eu escolher 

        // #Segundo Metodo
    nomes.forEach(nome ->System.out.println("O nome que apareceu foi "+ nome) );
}
}