package Enums;

public enum Phrase {
    SHOUT("АААААА"),
    NONE("ничего");

    private final String title;
    Phrase(String title) {
        this.title=title;
    }
    @Override
    public String toString() {
        return title;
    }
}
