package primeirasaulas;
import java.util.ArrayList;
import java.util.List;

public class Notas {
    
    public static void main(String[] args) {
        int Nota1 = 10;
        int Nota2 = 8;
        int Nota3 = 10;
        int NotaFinal = (Nota1 + Nota2 + Nota3) / 3 ;


        List <String> notas = new  ArrayList<>();

        notas.add("Primeira nota: " + Nota1);
        notas.add("Segunda nota: " + Nota2);
        notas.add("Terceira nota: " + Nota3);
        notas.add("Nota Final: " + NotaFinal);
        
        notas.forEach(nota -> System.out.println(""+ nota ));

        if (NotaFinal >= 7){

            System.out.println("Você foi aprovado!"); 
        }
        else {
            System.out.println("Você foi reprovado!");
        }
        }
    }

