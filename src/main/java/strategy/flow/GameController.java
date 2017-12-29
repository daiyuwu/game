package strategy.flow;

import strategy.cenes.choose.MainChoose;
import strategy.model.CliUserInterface;
import strategy.trait.UserInterface;

public class GameController {

//    UserInterface ui = new CliUserInterface();

    public void start() {
        new MainChoose().readyToChoose();
    }
}
