package strategy.cenes.story;

import strategy.cenes.BaseCenes;
import strategy.trait.Stories;

public abstract class BaseStory extends BaseCenes implements Stories {

    public void readyToPlay() {
        play();
        nextScenes();
    }
}
