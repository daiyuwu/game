package strategy.cenes.choose;

import strategy.cenes.story.BaseStory;
import strategy.model.GameConfig;

public class ConfigStoryPlayChoose extends BaseChoose {
    @Override
    public void init() {
        allowInputs.add(BaseStory.NORMAL);
        allowInputs.add(BaseStory.SLOW);
        userInterface.showTip("故事播放模式");
    }

    @Override
    public void showTip() {
        userInterface.showTip("(1)一般模式 (2)慢速模式");
    }

    @Override
    public void options(String inputData) {
        switch (inputData) {
            case BaseStory.NORMAL:
                GameConfig.storyPlayMode = BaseStory.NORMAL;
                break;
            case BaseStory.SLOW:
                GameConfig.storyPlayMode = BaseStory.SLOW;
                break;
        }
    }

    @Override
    public void gotoNextScenes() {
//        setNextScenes(new ConfigChoose());
    }

    @Override
    public void gotoPreScenes() {

    }
}
