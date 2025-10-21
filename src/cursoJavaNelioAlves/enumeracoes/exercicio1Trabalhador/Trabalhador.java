package cursoJavaNelioAlves.enumeracoes.exercicio1Trabalhador;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class Trabalhador {
    private String nome;
    private LevelTrabalhador level;
    private double salarioBase;

    private Departamento departamento;
    private List<ContratoHora> contratos = new ArrayList<>();

    public Trabalhador() { }

    public Trabalhador(String nome, LevelTrabalhador level, double salarioBase, Departamento departamento) {
        this.nome = nome;
        this.level = level;
        this.salarioBase = salarioBase;
        this.departamento = departamento;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public LevelTrabalhador getLevel() {
        return level;
    }
    public void setLevel(LevelTrabalhador level) {
        this.level = level;
    }

    public double getSalarioBase() {
        return salarioBase;
    }
    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    public Departamento getDepartamento() {
        return departamento;
    }
    public void setDepartamento(Departamento departamento) {
        this.departamento = departamento;
    }

    public List<ContratoHora> getContratos() {
        return contratos;
    }

    public void addContratos(ContratoHora contrato){
        contratos.add(contrato);
    }

    public void removerContrato(ContratoHora contrato){
        contratos.remove(contrato);
    }

    public double income(int mes, int ano){
        double soma = salarioBase;
        Calendar cal = Calendar.getInstance();
        for (ContratoHora c : contratos){
            cal.setTime(c.getData());
            int c_ano = cal.get(Calendar.YEAR);
            int c_mes = 1 + cal.get(Calendar.MONTH);
            if(ano == c_ano && mes == c_mes){
               soma += c.valorTotal();
            }
        }
        return soma;
    }
}
