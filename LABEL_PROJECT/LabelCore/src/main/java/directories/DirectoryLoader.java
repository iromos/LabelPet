package directories;

import directories.config.ConfigLoader;
import directories.config.DirectoryConfig;
import directories.config.DirectoryConfigItem;

import java.util.concurrent.ConcurrentHashMap;

/**
 * Created by Jackson on 21.05.2015.
 */
public class DirectoryLoader {

    private static ConcurrentHashMap<String, Directory> dirictories = new ConcurrentHashMap<String, Directory>();

    static {
        DirectoryConfig directoryConfig = ConfigLoader.getInstance().getDirectoryConfig();
        for (DirectoryConfigItem configItem : directoryConfig.getDirectoryConfigItems()) {
            try {
                Thread thread = new Thread(new LoaderRunnable(configItem), configItem.getThreadName());
                thread.start();
            } catch (Exception e) {
                //TODO work with loggers
                e.printStackTrace();
            }
        }
    }

    public static Directory getDirectory(String name) {
        return dirictories.get(name);
    }

    private static class LoaderRunnable implements Runnable {

        private Directory directory;
        private DirectoryConfigItem configItem;

        public LoaderRunnable(DirectoryConfigItem configItem) throws Exception {
            this.configItem = configItem;
            Class   currentClass =  Class.forName(configItem.getClazz());
            directory = (Directory) currentClass.newInstance();
            dirictories.put(currentClass.getSimpleName(), directory);
        }

        @Override
        public void run() {
            while (true) {
                try {
                    directory.load();
                } catch (Exception e) {
                    //TODO work with loggers
                    e.printStackTrace();
                    try {
                        Thread.sleep(2000);
                    } catch (InterruptedException e1) {
                        e1.printStackTrace();
                    }
                }
                try {
                    Thread.sleep(configItem.getReloadTime());
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
