package strategy.cenes.story;

import strategy.cenes.BaseCenes;
import strategy.trait.Stories;

public abstract class BaseStory extends BaseCenes implements Stories {

    static final public int NORMAL = 0, SLOW = 1;

    public void run() {
        readyToPlay(0);
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
        nextScenes();
    }
}
