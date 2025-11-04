package enumeracoes.exercicioClienteData;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Order {
    private static final SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

    private Date moment;
    private OrderStatus status;
    private Client client;
    private List<OrderItem>  items = new ArrayList<>();

    public Order(Date moment, OrderStatus status, Client client){
        this.moment = moment;
        this.status = status;
        this.client = client;
    }

    public void addItem(OrderItem item){
        items.add(item);
    }

    public void removeItem(OrderItem item){
        items.remove(item);
    }

    public double total(){
        double sum = 0;
        for(OrderItem item : items){
            sum += item.subTotal();
        }
        return sum;
    }

    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("Order Moment: ").append(moment).append("\n");
        sb.append("Order Status: ").append(status).append("\n");
        sb.append("Client: ").append(client).append("\n");
        sb.append("Order Items: ").append("\n");
        for(OrderItem item : items){
            sb.append(item).append("\n");
        }
        sb.append("Total price: R$").append(String.format("%.2f", total()));
        return sb.toString();
    }
}
