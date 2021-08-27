package lotto.game;

import lotto.number.RandomNumbers;
import lotto.ticket.LottoTicket;
import lotto.ticket.LottoTickets;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class LottoGame {
    private final Payments payments;
    private final LottoTickets tickets;

    public LottoGame(int totalPayments) {
        this.payments = new Payments(totalPayments);
        int ticketsCount = calculateTicketsCount(payments.getValue());
        List<LottoTicket> tickets = createLottoTickets(ticketsCount);
        this.tickets = new LottoTickets(tickets);
    }

    private List<LottoTicket> createLottoTickets(int totalNumberOfTickets) {
        return IntStream.range(0, totalNumberOfTickets)
                .mapToObj(i -> new LottoTicket(RandomNumbers.generate()))
                .collect(Collectors.toList());
    }

    private int calculateTicketsCount(int payments) {
        return payments / LottoTicket.PRICE;
    }

    public List<LottoTicket> getLottoTickets() {
        return this.tickets.getValue();
    }

    public Payments getPayment() {
        return this.payments;
    }
}