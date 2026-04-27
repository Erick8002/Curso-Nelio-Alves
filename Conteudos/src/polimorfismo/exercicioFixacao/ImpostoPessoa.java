package polimorfismo.exercicioFixacao;

public abstract class ImpostoPessoa {
    private String nome;
    protected double rendaAnual;

    public ImpostoPessoa(String nome, double rendaAnual) {
        this.nome = nome;
        this.rendaAnual = rendaAnual;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }

    public abstract double imposto();
}
