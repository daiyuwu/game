package strategy.cenes.choose;

import strategy.cenes.story.MainStory;

public class MainChoose extends BaseChoose {

    @Override
    public void init() {
        userInterface.showTip("歡迎來到這個虛擬世界。");
    }

    @Override
    public String showTipAndInput() {
        userInterface.showTip("按下 ENTER 開始/下一步 ! 或 ESC 離開這個世界。");
        String inputData = userInterface.input().toUpperCase();
        baseChoose(inputData);
        return inputData;
    }

    @Override
    public void choose(String inputData) {

    }

    @Override
    public void nextScenes() {
        System.out.println("MainChoose.nextScenes()");
        new MainStory().readyToPlay();
//        new CreateCharacterChoose().readyToChoose();
    }

    @Override
    public void preScenes() {

    }


}
