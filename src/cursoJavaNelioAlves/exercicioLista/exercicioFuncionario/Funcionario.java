package cursoJavaNelioAlves.exercicioLista.exercicioFuncionario;

public class Funcionario {
    private String name;
    private int id;
    private double salary;

    public Funcionario(String name, int id, double salary){
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    public double getSalary() {
        return salary;
    }
    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String toString(){
        return String.format(
                "%d, %s, %.2f",
                getId(), getName(), getSalary()
        );
    }
}
