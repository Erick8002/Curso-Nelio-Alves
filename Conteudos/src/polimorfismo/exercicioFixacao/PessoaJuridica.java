package polimorfismo.exercicioFixacao;

public class PessoaJuridica extends ImpostoPessoa{
    private int numeroFuncionario;

    public PessoaJuridica(String nome, double rendaAnual, int numeroFuncionario) {
        super(nome, rendaAnual);
        this.numeroFuncionario = numeroFuncionario;
    }

    @Override
    public double imposto() {
//        double valorAPagar = 0;
//        if(numeroFuncionario  > 10){
//            valorAPagar
//        }
        return 0;
    }
}
