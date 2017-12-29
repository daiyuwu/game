package strategy.trait;

public interface Choosable extends Transitional {
    void init();
    void readyToChoose();
    void showTip();
    String choose();
    void options(String inputData);
}
