package Enums;

public enum Places {

    ARMPIT("лежит за пахухой"),
    FALLEN_IN_THE_ERTH("лежит на земле"),
    ON_THE_PRRSON("нахидится на персонаже"),

    HANDS(" в руках");
    private final String title;
    Places(String title) {
        this.title=title;
    }
    @Override
    public String toString() {
        return title;
    }
}
