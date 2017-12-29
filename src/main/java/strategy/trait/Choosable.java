package strategy.trait;

public interface Choosable extends Transitional {
    void init();
    void readyToChoose();

    String showTipAndInput();
    void choose(String inputData);
}
