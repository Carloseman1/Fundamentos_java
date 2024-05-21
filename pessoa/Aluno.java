package pessoa;

public class Aluno extends Pessoa {
    
    private String matricula ;

    public String getMatricula() {
        return matricula;
    }
    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
    String importarDadosDapessoa() {
        System.out.println(super.importarDadosDapessoa());
        return "Você é aluno!";

   }

}
