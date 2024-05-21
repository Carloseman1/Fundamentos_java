package pessoa;

public class Professor extends Pessoa {
    
    private double salario;

    public double getSalario() {
        return salario;
    }

    public void setSalario( double salario) {
        this.salario = salario;
    }

    //sobrescreveu 
  String importarDadosDapessoa(){
    System.out.println(super.importarDadosDapessoa());
     return "Você é professor";
  }
}

