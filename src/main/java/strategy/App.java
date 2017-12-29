package strategy;

import strategy.cenes.story.MainStory;
import strategy.flow.GameController;

/**
 * Created by TY on 2017/11/27.
 */
public class App {
    public static void main(String args[]){
        new GameController().start();
//        new MainStory().loadStoryContent();
    }
}
