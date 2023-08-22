import java.time.LocalDateTime;

public class Ticket {
    private int id;
    private String ticketType;
    private double price;
    private int seat;
    private LocalDateTime time;

    public Ticket(int id, String ticketType, double price, int seat, LocalDateTime time) {
        id = id;
        this.ticketType = ticketType;
        this.price = price;
        this.seat = seat;
        this.time = time;
    }

    public int getId() {
        return id;
    }

    public String getTicketType() {
        return ticketType;
    }

    public void setTicketType(String ticketType) {
        this.ticketType = ticketType;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getSeat() {
        return seat;
    }

    public void setSeat(int seat) {
        this.seat = seat;
    }

    public LocalDateTime getTime() {
        return time;
    }

    public void setTime(LocalDateTime time) {
        this.time = time;
    }

    public boolean matchesCriteria(String criteria) {
        return true;
    }
}
