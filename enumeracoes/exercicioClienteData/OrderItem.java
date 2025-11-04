package enumeracoes.exercicioClienteData;

public class OrderItem {
    private Integer quantity;
    private double price;
    private Product product;

    public OrderItem(Integer quantity, double price, Product product) {
        this.quantity = quantity;
        this.price = price;
        this.product = product;
    }

    public double subTotal(){
        return price * quantity;
    }

    public String toString(){
        return String.format(
          "%s" +
                  ", R$%.2f" +
                  ", Quantity: %d" +
                  ", Subtotal: R$%.2f",
                product.getName(), price, quantity, subTotal()
        );
    }
}
