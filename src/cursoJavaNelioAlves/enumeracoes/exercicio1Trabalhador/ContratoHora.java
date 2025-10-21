package cursoJavaNelioAlves.enumeracoes.exercicio1Trabalhador;

import java.util.Date;

public class ContratoHora {
    private Date data;
    private double valorPorHora;
    private int hora;

    public ContratoHora(){ }

    public ContratoHora(Date data, double valorPorHora, int hora) {
        this.data = data;
        this.valorPorHora = valorPorHora;
        this.hora = hora;
    }

    public Date getData() {
        return data;
    }
    public void setData(Date data) {
        this.data = data;
    }

    public double getValuePorHora() {
        return valorPorHora;
    }
    public void setValuePorHora(double valorPorHora) {
        this.valorPorHora = valorPorHora;
    }

    public int getHora() {
        return hora;
    }
    public void setHora(int hora) {
        this.hora = hora;
    }

    public double valorTotal(){
        return valorPorHora * hora;
    }
}
