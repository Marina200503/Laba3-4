package Enums;

public enum State {
    LOUD("громко"),
    QUIT("тихо");
    private final String title;
    State(String title) {
        this.title=title;
    }
    @Override
    public String toString() {
        return title;
    }
}


