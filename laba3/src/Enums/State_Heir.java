package Enums;

public enum State_Heir {
    ON_THE_HEAD("на голове"),
    IN_HAND("в руках");

    private final String title;
    State_Heir(String title) {
        this.title=title;
    }
    @Override
    public String toString() {
        return title;
    }
}