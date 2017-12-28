package strategy.util;

import java.io.*;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class FileUtil {

    static public File loadFile(String path) {
        File file = null;
        file = new File(path);
        if (!file.exists()) {
            System.out.println("file not exists !");
            return null;
        }
        return file;
    }

    static public String[] readFileAsArray(File file) {
        List<String> contentSectionsTemp = new ArrayList<>();
        String[] contentSections = new String[contentSectionsTemp.size()];
        contentSections = contentSectionsTemp.toArray(contentSections);

        if (file == null) return contentSections;
        if (!file.exists()) return contentSections;

//        StringBuffer content = new StringBuffer();
        BufferedReader br = null;
        FileReader fr = null;

        if (file == null) return contentSections;

        try {
            fr = new FileReader(file);
            br = new BufferedReader(fr);
            String line = "";
            while ((line = br.readLine()) != null) {
//                content.append(line);
                contentSectionsTemp.add(line);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            return contentSections;
        } catch (IOException e) {
            e.printStackTrace();
            return contentSections;
        } finally {
            try {
                if (br != null) br.close();
                if (fr != null) fr.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
//        return content.toString();
        contentSections = contentSectionsTemp.toArray(contentSections);
        return contentSections;
    }

    static public String readFile(File file) {
        if (file == null) return "";
        if (!file.exists()) return "";

        StringBuffer content = new StringBuffer();
        BufferedReader br = null;
        FileReader fr = null;

        if (file == null) return "";

        try {
            fr = new FileReader(file);
            br = new BufferedReader(fr);
            String line = "";
            while ((line = br.readLine()) != null) {
                content.append(line);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            return "";
        } catch (IOException e) {
            e.printStackTrace();
            return "";
        } finally {
            try {
                if (br != null) br.close();
                if (fr != null) fr.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return content.toString();
    }
}
