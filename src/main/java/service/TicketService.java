package service;

import model.Ticket;

import java.util.ArrayList;
import java.util.List;

public class TicketService {

    // TODO 1 : resolved = true 인 티켓 개수를 반환하세요.
    public int countResolved(List<Ticket> tickets) {
        int count = 0;
        for (Ticket t : tickets) {
            if (t.isResolved()) count++;
        }
        return count;
    }

    // TODO 2 : 티켓 목록에서 title 만 추출하여 List<String> 으로 반환하세요.
    public List<String> extractTitles(List<Ticket> tickets) {
        List<String> result = new ArrayList<>();
        for (Ticket t : tickets) {
            result.add(t.getTitle());
        }
        return result;
    }

    // TODO 3 : severity 기준으로 CRITICAL → NORMAL → LOW 순으로 정렬된 목록을 반환하세요.
    public List<Ticket> sortBySeverity(List<Ticket> tickets) {
        return tickets.stream()
                .sorted((a, b) -> b.getSeverity().ordinal() - a.getSeverity().ordinal())
                .toList();
    }
}
