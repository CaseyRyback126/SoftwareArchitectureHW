import java.util.ArrayList;
import java.util.List;

public class TicketManager {
    private List<Ticket> availableTickets;

    public TicketManager() {
        availableTickets = new ArrayList<>();
    }

    public void addTicket(Ticket ticket) {
        availableTickets.add(ticket);
    }

    public void updateTicket(Ticket ticket) {
        // Получить уникальный идентификатор билета из параметра ticket
        int ticketId = ticket.getId();

        // Поиск билета с указанным идентификатором в базе данных или списке билетов
        Ticket existingTicket = findTicketById(ticketId);

        // Проверка наличия билета
        if (existingTicket != null) {
            // Обновление информации о билете
            existingTicket.setSeat(ticket.getSeat());
            existingTicket.setTime(ticket.getTime());
            existingTicket.setPrice(ticket.getPrice());

            // Сохранение обновленной информации о билете в базе данных или списке билетов
            saveTicket(existingTicket);
        } else {
            throw new IllegalArgumentException("Билет с указанным идентификатором не найден.");
        }

    }

    private void saveTicket(Ticket existingTicket) {
    }

    private Ticket findTicketById(int ticketId) {
        return null;
    }

    public void deleteTicket(Ticket ticket) {
        availableTickets.remove(ticket);
    }

    public List<Ticket> searchTickets(String criteria) {
        List<Ticket> matchingTickets = new ArrayList<>();
        for (Ticket ticket : availableTickets) {
            if (ticket.matchesCriteria(criteria)) {
                matchingTickets.add(ticket);
            }
        }
        return matchingTickets;
    }
}

