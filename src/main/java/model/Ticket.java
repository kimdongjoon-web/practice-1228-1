package model;

public class Ticket {

    private Long id;
    private String title;
    private boolean resolved;
    private Severity severity;

    public Ticket(Long id, String title, boolean resolved, Severity severity) {
        this.id = id;
        this.title = title;
        this.resolved = resolved;
        this.severity = severity;
    }

    public Long getId() { return id; }
    public String getTitle() { return title; }
    public boolean isResolved() { return resolved; }
    public Severity getSeverity() { return severity; }

    public enum Severity {
        LOW, NORMAL, CRITICAL
    }
}