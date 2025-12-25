import model.Ticket;
import model.Ticket.Severity;
import service.TicketService;

import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Ticket> tickets = Arrays.asList(
                new Ticket(1L, "로그인 장애", true, Severity.NORMAL),
                new Ticket(2L, "결제 오류", false, Severity.CRITICAL),
                new Ticket(3L, "UI 깨짐", true, Severity.LOW),
                new Ticket(4L, "서버 다운", false, Severity.CRITICAL)
        );

        TicketService service = new TicketService();

        // TODO 1 검증
        System.out.println(service.countResolved(tickets));
        // 예상 출력: 2

        // TODO 2 검증
        System.out.println(service.extractTitles(tickets));
        // 예상 출력: [로그인 장애, 결제 오류, UI 깨짐, 서버 다운]

        // TODO 3 검증
        List<Ticket> sorted = service.sortBySeverity(tickets);
        for (Ticket t : sorted) {
            System.out.println(t.getTitle() + " - " + t.getSeverity());
        }
        /*
         예상 출력:
         결제 오류 - CRITICAL
         서버 다운 - CRITICAL
         로그인 장애 - NORMAL
         UI 깨짐 - LOW
        */
    }
}