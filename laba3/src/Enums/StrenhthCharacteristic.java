package Enums;

public enum StrenhthCharacteristic {

    FAST(" со страшной силой"),
    WEAK("слабо");

    private final String title;
    StrenhthCharacteristic (String title) {
        this.title=title;
    }
    @Override
    public String toString() {
        return title;
    }
}
