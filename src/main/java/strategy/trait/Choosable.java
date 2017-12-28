package strategy.trait;

public interface Choosable extends Transitional {
    void init();
    void readyToChoose();
    String choose();
}
