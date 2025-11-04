package vetor.dadosPessoais;

public class Pessoa {
    private double height;
    private String gender;

    public Pessoa(double height, String gender){
        this.height = height;
        this.gender = gender;
    }

    public double getHeight() {
        return height;
    }
    public void setName(double height) {
        this.height = height;
    }

    public String getGender() {
        return gender;
    }
    public void setGender(String gender) {
        this.gender = gender;
    }
}
