package strategy.cenes.choose;

import strategy.cenes.story.BaseStory;
import strategy.cenes.story.MainStory;

public class MainChoose extends BaseChoose {

    @Override
    public void init() {
        userInterface.showTip("歡迎來到這個虛擬世界。");
    }

    @Override
    public void showTip() {
        userInterface.showTip("按下 ENTER 開始/下一步 ! 或 ESC 離開這個世界。");
    }

    @Override
    public void options(String inputData) {

    }

    @Override
    public void nextScenes() {
        new MainStory().readyToPlay(BaseStory.SLOW);
//        new CreateCharacterChoose().readyToChoose();
    }

    @Override
    public void preScenes() {

    }


}
