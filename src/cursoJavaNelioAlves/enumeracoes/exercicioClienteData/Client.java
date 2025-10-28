package cursoJavaNelioAlves.enumeracoes.exercicioClienteData;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Client {
    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

    private String name;
    private String email;
    private Date birthDate;

    public Client(String name, String email, String birthDate) throws ParseException {
        this.name = name;
        this.email = email;
        this.birthDate = sdf.parse(String.valueOf(birthDate));
    }

    public String toString(){
        return String.format(
          "%s (%s) - %s",
                name, birthDate, email
        );
    }
}
