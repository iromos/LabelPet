package directories.config;

import parser.LabelParser;
import parser.ParsersPool;

import java.io.File;
import java.io.InputStream;

/**
 * Created by Jackson on 22.05.2015.
 */
public class ConfigLoader {
    private static ConfigLoader ourInstance = new ConfigLoader();
    private DirectoryConfig directoryConfig;
    private static final String DIRECTORY_PATH = "src\\main\\resources\\dirictories.xml";

    public static ConfigLoader getInstance() {
        return ourInstance;
    }

    private ConfigLoader() {
        load();
    }

    private void load() {
        InputStream inputStream = ConfigLoader.class.getResourceAsStream(DIRECTORY_PATH);
        LabelParser xmlParser = ParsersPool.getXMLParser();
        try {
            directoryConfig = (DirectoryConfig) xmlParser.getObject(inputStream, DirectoryConfig.class);
        } catch (Exception e) {
            //TODO work with loggers
            e.printStackTrace();
        } finally {
            xmlParser.close();
        }
    }

    public DirectoryConfig getDirectoryConfig() {
        return directoryConfig;
    }
}
