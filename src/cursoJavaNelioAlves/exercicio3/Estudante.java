package cursoJavaNelioAlves.exercicio3;

public class Estudante {
    public String name;
    public double grade1, grade2, grade3;

    public double finalGrade(){
        return grade1 + grade2 + grade3;
    }

    public String aprovationResult(double g1, double g2, double f3){
        if(finalGrade() >= 60){
            return "Pass";
        }
        else return String.format("Failed\n" +
                "Missing %.2f points",
                60-finalGrade()
                );
    }

    public String toString(){
        return String.format(
                "Final Grade: %.2f" +
                        "\n%s",
                finalGrade(), aprovationResult(grade1, grade2, grade3)
        );
    }
}
