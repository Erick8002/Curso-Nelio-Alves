package cursoJavaNelioAlves.enumeracoes.exemplo;

import java.util.Date;

public class OrderExemplo {
    private int id;
    private Date moment;
    private OrderStatusExemplo status;

    public OrderExemplo(){ }

    public OrderExemplo(int id, Date moment, OrderStatusExemplo status) {
        this.id = id;
        this.moment = moment;
        this.status = status;
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    public Date getMoment() {
        return moment;
    }
    public void setMoment(Date moment) {
        this.moment = moment;
    }

    public OrderStatusExemplo getStatus() {
        return status;
    }
    public void setStatus(OrderStatusExemplo status) {
        this.status = status;
    }

    public String toString(){
        return String.format(
                "ID: %d%n" +
                        "Moment: %s%n" +
                        "Status: %s%n",
                getId(), getMoment(), getStatus()
        );
    }
}
