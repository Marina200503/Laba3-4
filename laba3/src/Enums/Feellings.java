package Enums;

public enum Feellings {
    PAIN("чувствует боль"),
    WELL_BIING("хорошее самочувствие");
    private final String title;
    Feellings(String title) {
        this.title=title;
    }
    @Override
    public String toString() {
        return title;
    }
}
