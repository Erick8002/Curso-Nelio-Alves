package cursoJavaNelioAlves.exercicio2;

public class Funcionario {
    public String nome;
    public double salarioBruto;
    public double taxa;

    public double salarioLiquido(){
        return salarioBruto - taxa;
    }

    public void aumentarSalario(double porcentagemAumento){
        salarioBruto += (salarioBruto*(porcentagemAumento/100));
    }

    public String toString(){
        return String.format(
                "%s, R$%.2f",
                nome, salarioLiquido()
        );
    }
}
