package pessoa;

public class TesteDePessoa {

    public static void main(String[] args) {
        
        Professor  professor= new Professor();
        professor.setCpf("3332221111");
        professor.setNome("Carlos");
        professor.setIdade(23);
        professor.setSalario(50000);

        System.out.println(professor.importarDadosDapessoa());


        Aluno aluno = new Aluno();
        aluno.setCpf("13102784402");
        aluno.setIdade(22);
        aluno.setNome("Katlyn");
        aluno.setMatricula("23523231");

        System.out.println(aluno.importarDadosDapessoa());
}
}
