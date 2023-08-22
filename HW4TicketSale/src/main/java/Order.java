import java.util.List;

public class Order {
    private int orderId;
    private Customer customer;
    private List<Ticket> tickets;
    private double totalAmount;

    public Order(int orderId, Customer customer) {
        this.orderId = orderId;
        this.customer = customer;
        this.totalAmount = calculateTotalAmount();
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public List<Ticket> getTickets() {
        return tickets;
    }

    public void setTickets(List<Ticket> tickets) {
        this.tickets = tickets;
    }

    public double getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(double totalAmount) {
        this.totalAmount = totalAmount;
    }

    private double calculateTotalAmount() {
        double totalAmount = 0.0;

        // Проход по каждому билету в заказе
        for (Ticket ticket : tickets) {
            // Получение цены билета
            double ticketPrice = ticket.getPrice();

            // Добавление цены билета к общей сумме
            totalAmount += ticketPrice;
        }

        return totalAmount;
    }
}
