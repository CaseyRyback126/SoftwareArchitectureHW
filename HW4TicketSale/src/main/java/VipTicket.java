import java.time.LocalDateTime;

public class VipTicket extends Ticket {

    private String additionalServices;

    public VipTicket(int id, String ticketType, double price, int seat, LocalDateTime time, String additionalServices) {
        super(id, ticketType, price, seat, time);
        this.additionalServices = additionalServices;
    }

    public String getAdditionalServices() {
        return additionalServices;
    }

    public void setAdditionalServices(String additionalServices) {
        this.additionalServices = additionalServices;
    }
}
