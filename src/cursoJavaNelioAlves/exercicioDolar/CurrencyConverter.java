package cursoJavaNelioAlves.exercicioDolar;

public class CurrencyConverter {
    public static double dolarPrice;
    public static double qtdReal;
    public static final double iof = 1.06;

    public static double totalValueToPay(double dolarPrice, double qtdReal, double iof){
        return qtdReal*(dolarPrice*iof);
    }
}
