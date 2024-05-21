package pessoa;

public class Pessoa  {
    // Nome, idade, cpf
    //tipo nomeDaVariavel

    private String nome;
    private int idade;
    private String cpf;

    public String getCpf() {
        return cpf;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public int getIdade() {
        return idade;
    }
    
    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    String importarDadosDapessoa(){

        return "O nome da pessoa é " + nome + " a idade é " + idade +
        " e o documento é " + cpf;
    }
    
}
