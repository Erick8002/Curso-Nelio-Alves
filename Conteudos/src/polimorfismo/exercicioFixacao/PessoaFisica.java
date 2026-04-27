package polimorfismo.exercicioFixacao;

public class PessoaFisica extends ImpostoPessoa{
    private double gastosSaude;

    public PessoaFisica(String nome, double rendaAnual, double gastosSaude) {
        super(nome, rendaAnual);
        this.gastosSaude = gastosSaude;
    }

    @Override
    public double imposto() {
        double valorAPagar = 0;
        if(rendaAnual < 20000.00){ //Se a renda for menor que 20000
            valorAPagar = rendaAnual * 1.15;
            if(gastosSaude > 0){
                valorAPagar -= gastosSaude * 0.5;
            }else return valorAPagar;
        }else { // Se a renda for maior que 20000
            valorAPagar = rendaAnual * 1.25;
            if(gastosSaude > 0){
                valorAPagar -= gastosSaude * 0.5;
            }else return valorAPagar;
        }
        return valorAPagar;
    }
}
