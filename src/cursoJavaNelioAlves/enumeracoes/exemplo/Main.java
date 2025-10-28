package cursoJavaNelioAlves.enumeracoes.exemplo;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        OrderExemplo order = new OrderExemplo(1080, new Date(), OrderStatusExemplo.PENDING_PAYMENT);

        System.out.println(order);

        OrderStatusExemplo os1 = OrderStatusExemplo.DELIVERED;

        OrderStatusExemplo os2 = OrderStatusExemplo.valueOf("DELIVERED");

        System.out.println(os1);
        System.out.println(os2);
    }
}
