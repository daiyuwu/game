package strategy.cenes;

import strategy.model.CliUserInterface;
import strategy.trait.UserInterface;

public abstract class BaseScenes {
    public UserInterface userInterface = new CliUserInterface();

    public BaseScenes nextScenes = null;

    public abstract void run();

    public BaseScenes getNextScenes() {
        return nextScenes;
    }

    public void setNextScenes(BaseScenes nextScenes) {
        this.nextScenes = nextScenes;
    }
}
