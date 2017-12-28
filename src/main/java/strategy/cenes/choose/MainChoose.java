package strategy.cenes.choose;

public class MainChoose extends BaseChoose {

    @Override
    public void init() {
        userInterface.showTip("歡迎來到這個虛擬世界。");
    }

    @Override
    public String choose() {
        userInterface.showTip("按下 ENTER 開始/下一步 ! 或 ESC 離開這個世界。");
        String inputData = userInterface.input().toUpperCase();
        baseChoose(inputData);
        return inputData;
    }

    @Override
    public void nextScenes() {
        new CreateCharacterChoose().readyToChoose();
    }

    @Override
    public void preScenes() {

    }


}
