package strategy.cenes.story;

import strategy.cenes.BaseScenes;
import strategy.model.GameConfig;
import strategy.trait.Stories;

public abstract class BaseStory extends BaseScenes implements Stories {

    static final public String NORMAL = "1", SLOW = "2";

    public void run() {
        readyToPlay(GameConfig.storyPlayMode);
    }

    public void readyToPlay(String mode) {
        switch (mode) {
            case BaseStory.NORMAL:
                play();
                break;
            case BaseStory.SLOW:
                playSlowly();
                break;
        }
        gotoNextScenes();
    }
}
