package cursoJavaNelioAlves.exercicio1;

public class Retangulo {
    public double largura;
    public double altura;

    public double area(){
        return largura*altura;
    }

    public double perimetro(){
        return largura*2 + altura*2;
    }

    public double diagonal(){
        return Math.sqrt(Math.pow(largura, 2) + Math.pow(altura, 2));
    }

    public String toString(){
        return String.format(
                "Area: %.2f" +
                        "\nPerimetro: %.2f" +
                        "\nDiagonal: %.2f",
                area(), perimetro(), diagonal()
        );
    }
}
