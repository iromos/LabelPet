package directories.config;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Created by Jackson on 22.05.2015.
 */
@XmlRootElement(name = "Directory")
public class DirectoryConfigItem {

    private String clazz;
    private int reloadTime;
    private String description;
    private String threadName;

    @XmlAttribute(name = "class")
    public String getClazz() {
        return clazz;
    }

    public void setClazz(String clazz) {
        this.clazz = clazz;
    }

    @XmlAttribute(name = "descr")
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @XmlAttribute(name = "reloadTime")
    public int getReloadTime() {
        return reloadTime;
    }

    public void setReloadTime(int reloadTime) {
        this.reloadTime = reloadTime;
    }

    @XmlAttribute(name = "reloadTime")
    public String getThreadName() {
        return threadName;
    }

    @XmlAttribute(name = "threadName")
    public void setThreadName(String threadName) {
        this.threadName = threadName;
    }
}
