package strategy.cenes.story;

import strategy.cenes.choose.CreateCharacterChoose;
import strategy.util.FileUtil;

import java.io.File;

public class MainStory extends BaseStory {

//    final String filePath = "D:/workspace_idea/game/out/production/"
//        + "resources/story/chapter1/";
    final String filePath = System.getProperty("user.dir").toString() + "/src/main/resources/story/chapter1/";
    final String fileName = "1.txt";

//    public void loadStoryContent() {
//        File file = FileUtil.loadFile(filePath + fileName);
//        String[] contentSections = FileUtil.readFileAsArray(file);
//        System.out.println("contentSections: ");
//        System.out.println(contentSections);
//        for(String s : contentSections) {
//            System.out.println(s);
//        }
////        String content = FileUtil.readFile(file);
////        System.out.println("content: " + content);
////        System.out.println("8: ");
////        System.out.println(this.getClass().getResource(filePath + fileName));
////        System.out.println(filePath + fileName);
////        System.out.println(System.getProperty("user.dir").toString() + filePath + fileName);
//    }

    public void play() {
        File file = FileUtil.loadFile(filePath + fileName);
        String content = FileUtil.readFile(file, true);

        userInterface.output(content);
    }

    @Override
    public void nextScenes() {
        System.out.println("MainStory.nextScenes()");
        new CreateCharacterChoose().readyToChoose();
    }

    @Override
    public void preScenes() {

    }
}
