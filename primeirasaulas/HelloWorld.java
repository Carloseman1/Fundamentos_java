package primeirasaulas;

/*
 * HelloWorld = Nome da minha classe
 * public = Tipo de acesso da classe
 * class =  Tipo da classe (tipo do objeto/estrutura)
 */

public class HelloWorld {

    //todo conteúdo deverá ser inserido aqui dentro 
    public static void main(String[] args){

        /*  Alguns tipos de dados do Jaava que podemos definir :
         * Valores  (int (Número inteiro), double, float(tem uma pecisão um pouco mais simples diferente do double), long (numeros inteiros grandes que não cabem no int)) OBS: Dependendo da qquantidade de dados que vc vai colocar, tem que escolher uma dessas variaveis
         * Texto (String)
         * Booleano (True or False) (boolean)
        */
        int dadoDoTipoInt = 10;
        double dadoDoTipoDouble = 3.14;
        float dadoDoTipoFloat = 3.14f; //Como o double é o valor padrão, precisa colocar o f para identificar que a variável é do tipo float
        long dadoDoTipoLong = 2411329703912381L;  
        // Dado de texto
        // String usa a própria classe para definir o texto
        String   dadoDoTipoString = "Colocar o meu texto";
        boolean dadoDoTipoBoolean= false; // true or false

        // if (se) - else (se não)
        
        if (dadoDoTipoInt == 10) {
            //sysout - pedir para uma informação ser printada no nosso console
            System.out.println("Entrou no if do 10");
        } 
            else if (dadoDoTipoInt < 12){
                System.out.println("Entrou no if do 12");
            }
        
        else{
            System.out.println("Entrou no if do else");
        }
        
        //quando quero comparar dado do tipo númérico, eu coloco o == 
    
        //While (Enquanto algo for verdadeiro, faça alguma coisa)
        /*int valorInicial= 0;
        while (valorInicial < 3 ) {
            System.out.println("O valor Inicial é menor que 3");
            System.out.println(valorInicial);
            valorInicial++; 
        }
        System.out.println("Saiu do while");
 */
        // For 
       /*  System.out.println("Iniciando o FOR");
        for(int i =5; i < 4; i++) {
            System.out.println("O valor do i é:" + i);
        }
        System.out.println("Finalizando o FOR");*/
    }
}

//Fora da classe