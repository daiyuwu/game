package strategy.cenes.story;

import strategy.cenes.BaseScenes;
import strategy.trait.Stories;

public abstract class BaseStory extends BaseScenes implements Stories {

    static final public int NORMAL = 0, SLOW = 1;

    public void run() {
        readyToPlay(BaseStory.NORMAL);
    }

    public void readyToPlay(int mode) {
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
