package strategy.flow;

import strategy.cenes.BaseScenes;
import strategy.cenes.choose.MainChoose;

public class GameController {

//    UserInterface ui = new CliUserInterface();

    public void start() {
//        BaseScenes keepCurrentScenes = null;
        BaseScenes scenes = new MainChoose();
        do {
//            if (scenes.getCurrentScenes() != null) {
//                keepCurrentScenes = scenes.getCurrentScenes();
//            }
            if (scenes.getNextScenes() != null) {
                scenes = scenes.getNextScenes();
//                System.out.println(scenes);
            }
            scenes.run();
        } while (true);
    }


}
