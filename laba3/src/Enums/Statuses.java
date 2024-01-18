package Enums;

public enum Statuses {
    HOLD("держат"),
    FREE("свободен");

    private final String title;
    Statuses(String title) {
        this.title=title;
    }
    @Override
    public String toString() {
        return title;
    }
}
